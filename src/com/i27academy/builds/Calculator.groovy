package com.i27academy.builds;

class Calculator {
    def jenkins
    Calculator(jenkins) {
        this.jenkins = jenkins
    }

    def add(firstNumber, secondNumber) {
        // logial code base here 
        return firstNumber + secondNumber
    }

    // add(2,3)
    def multiply(firstNumber, secondNumber) {
        // logial code base here 
        return firstNumber * secondNumber
    }   

    // def buildApp(appName) {
    //     jenkins.sh """
    //     echo "Building the Maven for $appName project using shared lib"
    //     # mvn package -DskipTests=true
    //     """
    // }
        def buildApp() {
        jenkins.sh """
        echo "Building the Maven for  project using shared lib"
        # mvn package -DskipTests=true
        """
    }
    def mavenBuild() {
       return mvn package -DskipTests=true
    }
}




// methods 
