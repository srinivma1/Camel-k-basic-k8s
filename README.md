# Camel-k-basic-k8s

This repo talks about how to create a basic route in Apache camel and deploy them to kubernetes using camel-k.

Prerequisites:
1. kind kubernetes cluster
2. Access to docker hub registry

```
 wget https://github.com/apache/camel-k/releases/download/1.11.0-nightly/camel-k-client-1.11.0-nightly-linux-64bit.tar.gz
 tar -xf camel-k-client-1.11.0-nightly-linux-64bit.tar.gz
 ls -la
 chmod +x kamel
 sudo mv kamel /usr/local/bin
 kamel install --registry docker.io --organization srinivma --registry-auth-username srinivma --registry-auth-password Suvimani@1940 --force
 
 Run following command:
 
 kamel run CamelBasic.java
 
 If you want to run it in dev mode, then run following command:
 
 kamel run CamelBasic.java --dev
 
 To delete integration, run following command
 
 kamel delete camel-basic
 
 ```
