package io.sample.batch.step.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class GapStepExecutionListener implements StepExecutionListener {

	final Logger logger = LoggerFactory.getLogger(GapStepExecutionListener.class);
	
	@Override
	public void beforeStep(StepExecution stepExecution) {
		// TODO Auto-generated method stub
		logger.info("GapStepExecutionListener - beforeStep.");
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		// TODO Auto-generated method stub
		logger.info("GapStepExecutionListener - beforeStep.");
		return null;
	}

}
