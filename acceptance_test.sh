#!/bin/bash
test $(curl localhost:8765/add?nmb1=1\&nmb2=2) -eq "3"
