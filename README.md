# aws-book-room

## Prepare AWS

1. Create a bucket in your AWS account
`aws s3 mb s3://aws-book-room --region eu-west-1`
   
2. Build an archive with your Lambda function
`./gradlew buildArchive`
   
3. Upload it to s3:
`aws s3 cp build/distributions/aws-book-room-0.0.1.zip s3://aws-book-room/v0.0.1/aws-book-room.zip`
   
4. Provision your AWS infrastructure
`terraform apply`
   
5. After the function is created successfully, invoke it using the AWS CLI
`aws lambda invoke --region=eu-west-1 --function-name=AwsBookRoom output.txt`
