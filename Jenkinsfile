pipeline{
    agent any
    stages{
        stage ('Compile Stage'){
            steps{
                echo 'building the application'
                withMaven(maven:'apache-maven-3.6.1'){
                 bat 'mvn clean compile'
                }
            }
        }
        stage('Testing Stage'){
            steps{
                 echo 'testing the application'
                 withMaven(maven:'apache-maven-3.6.1'){
                 bat 'mvn test'
                 }
            }
        }
        stage('Deploy Stage'){
            steps{
                  echo 'deploying the application'
                  withMaven(maven:'apache-maven-3.6.1'){
                  bat 'mvn test'
                  }
            }
        }
    }
}