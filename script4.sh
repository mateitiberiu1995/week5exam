echo "write a number to test if he is prime"
read number
counter=0
for (( j=2;j<$number;j++ ))
	do
		if [ $((number%j)) -eq 0 ]
		then
			((counter++))
		fi
	done
if [ $counter -eq 0 ]
then
	echo "Your number $number is prime "
else
	echo "your number $number is not prime"
fi
