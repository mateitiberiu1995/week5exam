#!/bin/bash
read input
if [ -f "$input" ] 
then
	touch $input.sh
	chmod +x $input.sh
	./$input.sh
else
	touch $input
fi
