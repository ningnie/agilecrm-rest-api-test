
This project is only for interview.

## Requirement
Please design a test framework for REST API testing by **yourself**, according to API ref:               
https://github.com/agilecrm/rest-api (P.S. there are lots of apis, please finish "deals" test at least.)

The key of this exam is to implement enterprise test framework and make the "deals" test cases as sample, **No** need to implement many test cases(but at least test CRUD on **deal**). We are looking forward to your ability on **creating a test framework and coding skill**, including but not limited to following points:
* Ease of use and extend
* Troubleshoot friendly
* Reusability
* Scalability
* Multiple threads support

This project is a semi-finished project, based on mvn + junit + java.
You can either enhance it, or build a brand new project using your favorite language and tools.

**Caution:** If you want to use public code repository, please do not use any "zuora" word in package or class name.

## Test Environment
There is a test env for you, the login credential are as below:

* Test endpoint:     https://interview.agilecrm.com/dev/api/
* Username:          wynet321@163.com
* Password:          4ebpehvr1a4n1vjljnf0qr7n3m

There is a sample test case --
com.zuora.test.exam.testcases.ContactTest.testCreateContacts();
