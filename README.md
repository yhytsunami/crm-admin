# crm-admin
user mange query operation
use stable manage tool build simple then migrate to using a last version tool to build a sharp project

1.project manage fist maven spring boot then change to gradle

crm-admin
    src
        main
            java
            resources
        test
            java
            resources
    pom.xml
2.config packing jar war and tomat lib

2.1packing jar artifact and use dev application

command mvn clean compile package -P war [,dev],

2.1packing war artifact and use prod application

command mvn clean compile package -P war ,prod,
