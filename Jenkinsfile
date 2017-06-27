pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                env.PATH = "${tool 'Ant'}/bin:${env.PATH}"
                checkout scm
                sh 'ant build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
