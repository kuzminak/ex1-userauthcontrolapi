# User Auth Control Api

Shared library for User Control Service and SprintBootLogin microservices for Hessian transport

- Service video presentation on youtube https://youtu.be/ADu8bzpAqMI
- User Control Service https://github.com/kuzminak/ex1-usercontrolservice
- SprintBoot Login via customAuthProvider example https://github.com/kuzminak/ex1-sprintbootlogin   

#### Links
- Service video presentation on youtube https://youtu.be/ADu8bzpAqMI
- User Control Service https://github.com/kuzminak/ex1-usercontrolservice
- SprintBoot Login via customAuthProvider example https://github.com/kuzminak/ex1-sprintbootlogin 

1. run "mvn install" to publish jar library to local maven repository
2. add to maven dependencies at target project

        <dependency>
            <groupId>tv.kuzmin</groupId>
            <artifactId>userauthcontrolapi</artifactId>
            <version>${last-version}</version>
        </dependency>

