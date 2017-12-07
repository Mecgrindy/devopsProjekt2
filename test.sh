#!/bin/bash
test $(curl localhost:8765/add?nmb1=1\&nmb2=2) -eq 3 && echo "Addition OK" || echo "Addition failed"
test $(curl localhost:8765/minus?nmb1=5\&nmb2=2) -eq 3 && echo "Minus OK" || echo "Minus failed"
test $(curl localhost:8765/divide?nmb1=4\&nmb2=2) -eq 2 && echo "Divide OK" || echo "Divide failed"
test $(curl localhost:8765/multiply?nmb1=2\&nmb2=6) -eq 12 && echo "Multiply OK" || echo "Multiply failed"

if [ $(curl localhost:8765/upper?word=gracian) == "GRACIAN" ]; then
  echo "Upper matched, OK"
else
  echo "Upper failed"
fi

if [ $(curl localhost:8765/lower?word=RoLi) == "roli" ]; then
  echo "Lower matched, OK"
else
  echo "Lower failed"
fi

if [ $(curl localhost:8765/reverse?word=iloz) == "zoli" ]; then
  echo "Reverse matched, OK"
else
  echo "Reverse failed"
fi

if [ $(curl localhost:8765/hex?colorName=black) == "#000000" ]; then
  echo "HEX Color works, OK"
else
  echo "HEX Color failed"
fi

a=$(curl localhost:8765/rgb?colorName=white)

if [ "$a" == "rgb(255, 255, 255)" ]; then
  echo "RGB Color works, OK"
else
  echo "RGB Color failed"
fi


