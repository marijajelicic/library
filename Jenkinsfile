pipeline {
    agent any
    environment {
        DOCKER_IMAGE_NAME = "library:latest"
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/marijajelicic/library'
            }
        }
        stage ('Docker') {
            when {
                branch 'master'
            }
            steps{
                script{
                    sh '''
                            docker image build -t library:latest .
                        '''
                  // def app=docker.build(DOCKER_IMAGE_NAME)
                }
            }
            post {
                failure {
                    emailext (
                        subject: "Job '${env.JOB_NAME} ${env.BUILD_NUMBER} - ${params.PARAMETAR}'",
                        body: """CI/CD pipeline greska u "Docker" fazi. Log fajl se moze videti na: href=${env.BUILD_URL} """,
                        to: "marija.jelicic@netcast.rs",
                        from: "jenkins@jenkins.netcast.rs"
                    )
                }
            }
        }

        stage ('StopPrevious') {
            when {
                branch 'master'
            }
            steps{
                script{
                    sh '''
                            docker container stop library
                            docker container rm library
                        '''
                }
            }
            post {
                failure {
                    emailext (
                        subject: "Job '${env.JOB_NAME} ${env.BUILD_NUMBER} ",
                        body: """CI/CD pipeline greska u "Build" fazi. Log fajl se moze videti na: href=${env.BUILD_URL} """,
                        to: "marija.jelicic@netcast.rs",
                        from: "jenkins@jenkins.netcast.rs"
                    )
                }
            }
        }



        stage ('Deploy') {
            when {
                branch 'master'
            }
            steps{
                script{
                    sh '''
                            docker run -d --name library -p 8081:8081 library:latest
                        '''
                }
            }
            post {
                failure {
                    emailext (
                        subject: "Job '${env.JOB_NAME} ${env.BUILD_NUMBER} ",
                        body: """CI/CD pipeline greska u "Build" fazi. Log fajl se moze videti na: href=${env.BUILD_URL} """,
                        to: "marija.jelicic@netcast.rs",
                        from: "jenkins@jenkins.netcast.rs"
                    )
                }
            }
        }
    }
}

