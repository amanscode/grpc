# GRPC



## Create a .proto file

Use "GRPCSimulator.proto" file for refernce. (You can find this file inside this repository)


## Generate classes using proto java plugin


Use the "protoc-gen-grpc-java-1.36.0-linux-x86_64.exe" java plugin for proto to generate your classes. (You can find this plugin inside this repository)


Run below command after downloading the above plugin

```bash
protoc/bin/protoc --plugin=protoc-gen-grpc-java=/root/aman/grpc/protoc-gen-grpc-java-1.36.0-linux-x86_64.exe -I=/root/aman/grpc/protos --java_out=/root/aman/grpc/java --grpc-java_out=/root/aman/grpc/java /root/aman/grpc/protos/GRPCSimulator.proto
```

## Implement your request handling/serving class

Create a class which extends your generated service class.
Then override the functionality (write your own business logic) of all the service methods that you have provided in the proto file.
