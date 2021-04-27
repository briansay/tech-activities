# IBM Technology Garage Interviews - Cloud Engineers

# Quick Intro

This repository contains the pairing challenges we use for the UKI IBM Technology Garage interviews, tailored for our prospective Cloud Engineers.

This isn't a 'pass/fail' set of exercises. We are looking to see how applicants tackle a new challenge. How do they deal with a stack they aren't used to? How well can they look up documentation when stuck? There is no pass\fail. There is no 'right' answer.

# Table of Contents

- tbc

# Technical Activities

| Number | Description                | Examples       | What we're looking for?             | Link |
| ------ | -------------------------- | -------------- | ----------------------------------- | ---- |
| 1.     | Programming Exercise       | FizzBuzz       | Work through a programming problem  | tbd  |
| 2.     | Containerisation Exercise  | Dockerfile     | How to containerise an application  | tbd  |
| 3.     | K8s / OpenShift Deployment | S2I / YAML     | How to deploy an application to K8s | tbd  |
| 4.     | Alternative Deployments    | Jobs YAML      | Different deployment options        | tbd  |
| 5.     | Advanced Deployments       | HA deployments | Using labels / taints               | tbd  |

# Applicant Pre-requisites

- Share their preferred programming language e.g. JavaScript, Java, Python, Go, etc.
- Share their preferred unit testing framework e.g. Jest, JUnit, etc.
- Create an IBM ID by signing up for a free (no credit card required) IBM Cloud account
  - [Sign up here](https://cloud.ibm.com/registration)
- Either:
  - Download the [OpenShift CLI](https://cloud.ibm.com/docs/openshift?topic=openshift-openshift-cli) and [Docker CLI](https://docs.docker.com/get-docker/) and [IBM Cloud CLI](https://cloud.ibm.com/docs/cli?topic=cli-getting-started), or;
  - Download SSH capabilities onto their local machine and setup a [public/private key pair](https://www.digitalocean.com/community/tutorials/how-to-set-up-ssh-keys-2)

# Interviewer Pre-requisites

- Ensure you have access to the cloud account [1733587 - tech-garage-interviews](https://cloud.ibm.com/)
- Follow the [Interview Setup steps](tbd)

# Interviewer Setup Steps

1. Log into the IBM cloud account [1733587 - tech-garage-interviews](https://cloud.ibm.com/)
2. [*Optional - If using the jump host*] Power on the jump-host VM:

   - Navigate to [Virtual Server Instances](https://cloud.ibm.com/vpc-ext/compute/vs) - ensuring you are on the `1733587 - tech-garage-interviews` Cloud account
   - Select the 3 dots on the right hand side of the VM named `interview-jump-host`
   - Select `Start`
   - Copy the applicant's public key onto the VM, either by:
     - Running `ssh-copy-id -f -i <public_key_path> root@<jump_host_ip>`
     - Logging onto the VM, copying the public key to `~./ssh/authorized_keys`

3. Add the applicant's IBMiD to the account under the resource group `APPLICANT - Cloud Engineer`
   - Navigate to [IBM Cloud Users](https://cloud.ibm.com/iam/users) - ensuring you are on the `1733587 - tech-garage-interviews` Cloud account
   - Select `Invite Users`
   - Enter the applicant's IBMiD and select `add` next to the `APPLICANT - Cloud Engineer` option
   - Click `Invite` on the far right hand side
4. [*Optional - If applicant doesn't have a dockerhub account*] Login to IBM Container Registry (ICR)
   - SSH into the VM e.g. `ssh root@<floating_up_address>`
   - Login to the IBM Cloud CLI `ibmcloud login -sso` & follow instructions
   - Login to the IBM Cloud Container Registry `ibmcloud cr login`

# Authors

- [Brian Say - Solution Architect | IBM Technology Garage](https://github.com/briansay)
- [Carsten Börnert - Cloud Engineer | IBM Technology Garage](tbd)
- [Emma Dawson - Cloud Engineer | IBM Technology Garage](tbd)
