## GitHub Copilot Chat

- Extension Version: 0.28.5 (prod)
- VS Code: vscode/1.101.0
- OS: Windows

## Network

User Settings:
```json
  "http.proxy": "http://rb-proxy-ca1.bosch.com:8080",
  "http.proxyStrictSSL": false,
  "github.copilot.advanced.debug.useElectronFetcher": true,
  "github.copilot.advanced.debug.useNodeFetcher": false,
  "github.copilot.advanced.debug.useNodeFetchFetcher": true
```

Environment Variables:
- http_proxy=http://rb-proxy-ca1.bosch.com:8080
- https_proxy=http://rb-proxy-ca1.bosch.com:8080
- no_proxy=rb-omscloudasl4.server.bosch.com,127.0.0.*,localhost

Connecting to https://api.github.com:
- DNS ipv4 Lookup: Error (35 ms): getaddrinfo ENOTFOUND api.github.com
- DNS ipv6 Lookup: Error (1 ms): getaddrinfo ENOTFOUND api.github.com
- Proxy URL: http://rb-proxy-ca1.bosch.com:8080 (0 ms)
- Proxy Connection: 200 Connection established (418 ms)
- Electron fetch (configured): HTTP 200 (979 ms)
- Node.js https: HTTP 200 (1016 ms)
- Node.js fetch: HTTP 200 (1335 ms)
- Helix fetch: HTTP 200 (1076 ms)

Connecting to https://api.individual.githubcopilot.com/_ping:
- DNS ipv4 Lookup: Error (187 ms): getaddrinfo ENOTFOUND api.individual.githubcopilot.com
- DNS ipv6 Lookup: Error (1 ms): getaddrinfo ENOTFOUND api.individual.githubcopilot.com
- Proxy URL: http://rb-proxy-ca1.bosch.com:8080 (0 ms)
- Proxy Connection: 200 Connection established (116 ms)
- Electron fetch (configured): HTTP 403 (497 ms)
- Node.js https: HTTP 403 (506 ms)
- Node.js fetch: HTTP 403 (539 ms)
- Helix fetch: HTTP 403 (1332 ms)

## Documentation

In corporate networks: [Troubleshooting firewall settings for GitHub Copilot](https://docs.github.com/en/copilot/troubleshooting-github-copilot/troubleshooting-firewall-settings-for-github-copilot).