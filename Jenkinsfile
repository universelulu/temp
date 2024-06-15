pipeline{
  agent any

  tools{
    maven 'maven-3.9.7'
    jdk 'JDK-1.8'
  }
  
  stages{
    stage('Checkout'){
      steps{
        // 소스코드 체크 아웃
        checkout scm
      }
    }
    stage('Build'){
      steps{
        bat 'mvn clean package'
      }
    }
  }
  post{
      always{
        bat 'java -cp C:/ProgramData/Jenkins/.jenkins/workspace/temps/target/homework2-0.0.1-SNAPSHOT.jar homework2.PerformaceTest > output.txt'
      }
  }
}
  



  

