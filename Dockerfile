FROM amazon/aws-cli:2.6.4

RUN yum update -y \
    && yum install -y jq \
    && yum clean all
