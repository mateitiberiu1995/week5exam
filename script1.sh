#!/bin/bash
echo "write the name of the file you want to search for "
read input
if [ -f "$input" ] 
then
	mv $input $input.sh 
	chmod +x $input.sh
	./$input.sh
else
	echo "file not found"
fi
