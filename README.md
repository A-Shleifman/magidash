# MagiDash Corp Dashboard

### How to run

**The backend is deployed to the cloud and can be accessed at `https://magidash.optimisedsoftware.co.uk`. Feel free to use it instead of spinning up your own server.**

`docker-compose up -d`

### How to use

You can use a curl command to request data from the server (use `localhost:8080` instead of `magidash.optimisedsoftware.co.uk` for the local server)

Get all dashboards:

```bash
curl 'https://magidash.optimisedsoftware.co.uk/dashboards'
```

Get dashboard with id `1`:

```bash
curl 'https://magidash.optimisedsoftware.co.uk/dashboards/1'
```

# Testing

The code is tested with JUnit.

# Things to improve

With the limited time for this project there are obviously some things that are left out and there's always room for improvement:

- more tests
- use liquibase to run migrations instead of an sql script 
- add e2e test inside the app instead of relying on a bash script
