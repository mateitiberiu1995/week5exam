echo "do you want to delete the existing file? yes/no"
read answer
if [ ! -f "details.txt" ]
then
	touch details.txt
fi
if [ "$answer" == "yes" ]
then
	if [ -f "details.txt" ]
	then
		rm details.txt
		touch details.txt
	fi
	echo "$(w)" >> details.txt
	echo "$(ip addr show)" >> details.txt
else
	echo "$(w)" >> details.txt
        echo "$(ip addr show)" >> details.txt 
fi
