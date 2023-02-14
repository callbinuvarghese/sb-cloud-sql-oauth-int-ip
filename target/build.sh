#!/bin/bash
set -x
export CLOUD_RUN_SERVICE_NAME="sb-postgres-ex"
export CLOUD_RUN_IMAGE_TAG="us-east4-docker.pkg.dev/acn-highmark-health-odh/quickstart-docker-repo/${CLOUD_RUN_SERVICE_NAME}:latest"
export REGION=us-east4
export PROJECT_ID=$(gcloud config get project)
### build
gcloud builds submit --region=us-east4 --tag us-east4-docker.pkg.dev/acn-highmark-health-odh/quickstart-docker-repo/sb-postgres-ex:latest
