package com.example;

import org.cassandraunit.spring.CassandraDataSet;
import org.cassandraunit.spring.EmbeddedCassandra;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.TestExecutionListeners.MergeMode;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@TestExecutionListeners(mergeMode = MergeMode.MERGE_WITH_DEFAULTS, listeners = {
        OrderedCassandraTestExecutionListener.class })
@SpringBootTest
@CassandraDataSet(value="setup.cql", keyspace = "mykeyspace")
@EmbeddedCassandra
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
