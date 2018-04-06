# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|
	config.vm.box = "chad-thompson/ubuntu-trusty64-gui"
	config.vm.synced_folder "shared", "/tmp/shared"
	#config.vm.provision "shell", path: "script.sh"
	
	config.vm.provider "virtualbox" do |vb|
		vb.gui=false
vb.memory=1024
vb.cpus=1
	end


config.vm.define "Machine A" do |masterDG|
	masterDG.vm.hostname = "agentMachineDG.gac.local"
	masterDG.vm.network "public_network", ip: "192.168.1.29"
	masterDG.vm.provision "shell", path: "machineA.sh"
	end
config.vm.define "Machine B" do |agentDG|
	agentDG.vm.hostname = "agentMachineDG.gac.local"
	agentDG.vm.network "public_network", ip: "192.168.1.129"
	agentDG.vm.network :forwarded_port, guest: 8080,host: 8080
	agentDG.vm.provision "shell", path: "machineB.sh"
	end
end
