1. build jar from source `mvn clean package`
2. build *docker image* with `docker build . -t java-api`
3. start *docker container* from *docker image* with `docker run -dp 3997:8081 --name java-api-ctnr java-api`

`docker build` will create image which is "snapshot" of the system    
tags: -t tag allows us to run it with human-readable name  
`docker run` will create instance from that snapshot and start it    
tags: -d detached (runs in background), -p map port [LOCAL|CONTAINER], --name set name of container
