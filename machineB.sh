sudo apt-get update
sudo apt-get install -y default-jdk
sudo apt-get install -y maven
sudo apt-get install -y git
wget -q -O - https://pkg.jenkins-ci.org/debian/jenkins-ci.org.key | sudo apt-key add –
sudo sh -c 'echo deb http://pkg.jenkins-ci.org/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt-get update
sudo apt-get install -y jenkins
