pipeline{
    agent any

    stages{
        STAGE ('Compile Stage'){
            steps{
                withMaven(maven : 'maven_3_8_6'){
                sh 'mvn clean compile'
                }
            }
        }
        stage('Testing Stage'){
            steps{
                 withMaven(maven : 'maven_3_8_6'){
                 sh 'mvn test'
                 }
            }
        }
        stage('Deployment Stage'){
            steps{
                  withMaven(maven : 'maven_3_8_6'){
                  sh 'mvn deploy'
                  }
            }
        }
    }
}