

[RemoteTestNG] detected TestNG version 6.14.2
----Create Deals APIs:the first case: valid parameters are input----

{"name": "Deal-Tomato","expected_value": "500",    "probability": "75",    "close_date": 1455042600,    "milestone": "Proposal",    "contact_ids": [        "5694691248963584"    ],    "custom_data": [        {            "name": "Group Size",            "value": "10"       }    ]}
Actual Response:{"colorName":"WHITE","id":5763337560260608,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"owner_id":"6230524873670656","created_time":1528118653,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"won_date":0,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1528118653,"isCurrencyUpdateRequired":false,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}}
----Create Deals APIs:the second case: invalid password is input----

{"name": "Deal-Tomato","expected_value": "500",    "probability": "75",    "close_date": 1455042600,    "milestone": "Proposal",    "contact_ids": [        "5694691248963584"    ],    "custom_data": [        {            "name": "Group Size",            "value": "10"       }    ]}
Actual Response:<html><head>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<title>401 UNAUTHORIZED</title>
</head>
<body text=#000000 bgcolor=#ffffff>
<h1>Error: UNAUTHORIZED</h1>
</body></html>

----Create Deals APIs:the third case: wrong format data is input----

{"name": "Deal-Tomato","expected_value": "ww","probability": "75","close_date": "1455042600","milestone": "Proposal","contact_ids": ["5758948741218304"],"custom_data": [{"name": "Group Size","value": "10"}]}
Actual Response:Can not construct instance of java.lang.Double from String value 'ww': not a valid Double value
 at [Source: com.google.apphosting.runtime.jetty.RpcConnection$RpcRequestInput@27f74fa1; line: 1, column: 23] (through reference chain: com.agilecrm.deals.Opportunity["expected_value"])
----listing Deals APIs:the first case: valid parameters are input----

Actual Response:[{"colorName":"WHITE","id":5181249232568320,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1527943248,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1527943248,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5662608229138432,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1527940562,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1527940562,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5664072276115456,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1527940520,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1527940520,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5695756786728960,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1528118341,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1528118341,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5696679667826688,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1527995475,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1527995475,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5697493228584960,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1528118140,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1528118140,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5698454563061760,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1527995578,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1527995578,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5712229798248448,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1527940626,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1527940626,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5720499824885760,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1528118585,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1528118585,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5727347076497408,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1527940397,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1527940397,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5730420930904064,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1527943446,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1527943446,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5745365470937088,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1527995908,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1527995908,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}},{"colorName":"WHITE","id":5763337560260608,"apply_discount":false,"discount_value":0.0,"discount_amt":0.0,"discount_type":"Value","name":"Deal-Tomato","contact_ids":["5694691248963584"],"custom_data":[{"name":"Group Size","value":"10"}],"products":[],"expected_value":500.0,"milestone":"Proposal","probability":75,"close_date":1455042600,"created_time":1528118653,"milestone_changed_time":0,"entity_type":"deal","notes":[],"note_ids":[],"note_created_time":0,"pipeline_id":5636318331666432,"archived":false,"lost_reason_id":0,"deal_source_id":0,"total_deal_value":0.0,"updated_time":1528118653,"isCurrencyUpdateRequired":true,"currency_conversion_value":500.0,"tags":[],"tagsWithTime":[],"contacts":[],"owner":{"id":6230524873670656,"domain":"interview","email":"wynet321@163.com","phone":"","name":"interview","pic":"https://d1gwclp1pmzk26.cloudfront.net/img/gravatar/48.png","schedule_id":"interview","calendar_url":"https://interview.agilecrm.com/calendar/interview","calendarURL":"https://interview.agilecrm.com/calendar/interview"}}]
----listing Deals APIs:the second case: invalid password is input----

Actual Response:<html><head>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<title>401 UNAUTHORIZED</title>
</head>
<body text=#000000 bgcolor=#ffffff>
<h1>Error: UNAUTHORIZED</h1>
</body></html>

----update Deals APIs:the first case: valid parameters are input----

{    "id": "5719121945690112",   "expected_value": "1000",    "probability": "20",    "contact_ids": [        "5629703511605248",        "5744178885558278"    ],    "custom_data": [        {            "name": "dealTester",            "value": "hello hello2"        }    ]}
Actual Response:Deal not updated properly.
----update Deals APIs:the second case: invalid password is input----

{    "id": "5719121945690112",   "expected_value": "1000",    "probability": "20",    "contact_ids": [        "5629703511605248",        "5744178885558278"    ],    "custom_data": [        {            "name": "dealTester",            "value": "hello hello2"        }    ]}
Actual Response:<html><head>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<title>401 UNAUTHORIZED</title>
</head>
<body text=#000000 bgcolor=#ffffff>
<h1>Error: UNAUTHORIZED</h1>
</body></html>

----update Deals APIs:the third case: wrong format data is input----

{   "id": "5719121945690112",    "expected_value": "1000",    "probability": "ww",    "contact_ids": [        "5629703511605248",        "5744178885558278"    ],    "custom_data": [        {            "name": "dealTester",            "value": "hello hello2"        }    ]}
Actual Response:Can not construct instance of int from String value 'ww': not a valid Integer value
 at [Source: com.google.apphosting.runtime.jetty.RpcConnection$RpcRequestInput@7c219ba6; line: 1, column: 58] (through reference chain: com.agilecrm.deals.Opportunity["probability"])
here is a bug
----delete Deals APIs:the first case: invalid password are input----

----delete Deals APIs:the first case: valid parameters are input----

PASSED: testCreateDealsValid
PASSED: testCreateDealsInvalid
PASSED: testCreateDealsWrongFormat
PASSED: testListDealsValid
PASSED: testListDealsInValid
PASSED: updateDealInValid
PASSED: updateDealWrongFormat
PASSED: deleteDealInValid
PASSED: deleteDealValid
FAILED: updateDealValid
java.lang.AssertionError: expected:<400> but was:<200>
	at org.testng.AssertJUnit.fail(AssertJUnit.java:59)
	at org.testng.AssertJUnit.failNotEquals(AssertJUnit.java:364)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:80)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:245)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:252)
	at com.zuora.test.exam.util.TestBase.executePutCommonCases(TestBase.java:52)
	at com.zuora.test.exam.testcases.DealsTest.updateDealValid(DealsTest.java:99)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)
	at org.testng.internal.Invoker.invokeMethod(Invoker.java:580)
	at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:716)
	at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:988)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)
	at org.testng.TestRunner.privateRun(TestRunner.java:648)
	at org.testng.TestRunner.run(TestRunner.java:505)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:455)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)
	at org.testng.SuiteRunner.run(SuiteRunner.java:364)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1137)
	at org.testng.TestNG.runSuites(TestNG.java:1049)
	at org.testng.TestNG.run(TestNG.java:1017)
	at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:114)
	at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)
	at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)


===============================================
    Default test
    Tests run: 10, Failures: 1, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 10, Failures: 1, Skips: 0
===============================================

