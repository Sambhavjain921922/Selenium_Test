pipeline{
    agent any
    	environment {
		notifyEmail ="sambhav.jain@nagarro.com"
	}
    tools{
        maven '3.9.3'
    }
    triggers {
    	cron('0 06 * * *')
  	}
    stages{
        stage("code checkout"){
            steps{
            bat "echo hello"
            }
        }   
        stage("code build"){
            steps{
            bat "mvn clean"
            }
        }
        stage("unit test"){
            steps{
            bat "mvn test"
            }
        }
    }
    post{
        success{
            bat "echo success"
            }
        }
}
