# Thesis Central
This is the Vireo 4 version of Thesis Central, the Princeton Electronic Thesis and Dissertations submission service. The original TDL readme for this project is available at [TDL_README.md](TDL_README.md)

## Deploying
This application is deployed via ansible, so that it can be recompiled and deployed by staff members who do not have a local java development environment. The command to deploy the latest code to the staging environment is:
`ansible-playbook playbooks/vireo_staging.yml`

### Deploying a branch to staging
1. Make your changes to a branch and push it to github
2. In `princeton_ansible` edit `group_vars/vireo/staging.yml` 
3. Set the variable `github_branch`: `github_branch: 'shibboleth_auth'`
4. Run the playboook
