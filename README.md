# Grails and Micronaut Integration Bug

To run the sample Grails app

````
docker-compose up -d
cd mnlib
./gradlew publishToMavenLocal
cd ..
cd grailsapp
./gradlew bootRun
cd ..
````