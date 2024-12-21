module issueRepro.main {
		requires spring.boot;
		requires spring.boot.autoconfigure;

		requires spring.web;
		requires spring.core;
		requires spring.context;
		requires spring.beans;
		requires spring.webmvc;
		requires java.desktop;
		// these two cause issue
		requires org.xerial.sqlitejdbc;
		requires com.fasterxml.jackson.databind;

		opens org.blck.issuerepro;
		exports org.blck.issuerepro;
}
