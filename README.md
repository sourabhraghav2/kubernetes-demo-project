# kubernetes-demo-project
Kubernetes implementation with Minikube, Spring boot & Docker

# Steps : 
### Start minikube
1. minikube start
2. minikube dashboard

### Maven build to generate jar
1. mvn clean install

### Docker build,run & push to generate image to docker hub
1. docker build --no-cache -t sourabhraghav/kubernetes-demo-project ##.
2. docker run -p 9004:9004 sourabhraghav/kubernetes-demo-project
3. docker push sourabhraghav/kubernetes-demo-project


### Create deployment (There are 2 ways)
* Using command
* Using yaml file

### Using command 
1. kubectl create deployment kubernetes-demo-project --image=sourabhraghav/kubernetes-demo-project
2. kubectl expose deployment kubernetes-demo-project --target-port=9004 --type=NodePort --port=9004 

### Using yaml file
1. kubectl create -f deployment-k8s.yaml (create)
2. kubectl apply -f deployment-k8s.yaml (modify)

## Verify whether app is running or not
- minikube service kubernetes-demo-project --url


## Some important comands 
### Get list of deployments & delete
- kubectl get deployment
- kubectl delete deploy `<deployment name>`

### Get list of services & delete
- kubectl get services
- kubectl delete service `<service name>`

### Get list of pods & delete
- kubectl get pods
- kubectl delete pod `<pod name>`
