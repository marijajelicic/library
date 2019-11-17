# library

Aplikacija koja implemetira skromnu logiku biblioteke tj. procesa iznajmljivanja knjiga. 
Za skladištenje poataka koristi se mysql baza čija se šema nalazi u direktorijumu /library/db/library_dbdump.sql.
Upotrebom JPA demonstriran je rad sa repozitorijumima i lako manipulisanje relacionim podacima.
Cilj aplikacije je implementacija CRUD funkcionalnosti nad entitetima i raslojavanje koda:

- DAO (data access object) - definisanje entiteta (POJO klasa) i @Repository interfejsa
- implementacija biznis logije u servisnom sloju aplikacije - @Service
- definisanje API endpoint-a u @RestController sloju

Neki primeri pokazuju dobre prakse upotrebe DTO (data transfer object) i njihovo "prepakivanje" u servisnom sloju aplikacije.

Za komunikaciju sa drugim mikroservisom koristi se deklarativni HTTP klijent (Feign) koji nam olakšava integraciju sa drugim Rest API serverima.
Obezbeđuje apstrakciju, tako da je komunikacija moguća preko deklarativnog klijenta (koji nema implementaciju). 
Da bi se Feign klijent koristio neophodno je:

1. dodati spring-cloud-starter-openfeign dependecy u pom.xml fajl
2. dodati anotaciju @EnableFeignClients u @SpringBootApplication klasu
3. kreirati intervejs koji treba anotirati sa @FeignClient i u njemu definisati metode koje želimo da pozivamo iz mikroservisa za koji pravimo deklarativni http klijent. Drugim rečima, metoda mora da se "poklapa" tj. da ima mapiranje i parametre kao metoda u drugom ms koju pozivamo.

Uz to ova aplikacija je i Eureka klijent pa je potrebno dodati i:

4. dodati spring-cloud-starter-netflix-eureka-client dependecy u pom.xml fajl
5. dodati anotaciju @EnableEurekaClient u @SpringBootApplication klasu
6. dodati dodatne properties u application.properties fajl

Napomena: Biblioteke koje smo u kod dodali kroz dependecy injection dodaju se na classpath naše aplikacije i taj kod nam je dostupan u folderu Maven Dependecies. 
To znači da žeti opis klase i njenih metoda možete videti iz koda kada je otvoren iz STS-a (Spring Tool Suite) - CTRL+klik na klasu koju želite da otvorite.
