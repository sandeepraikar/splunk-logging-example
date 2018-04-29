package com.raikar.splunk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandLiner {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommandLiner.class);

    public static void main(String[] args) {
        LOGGER.info("testing splunk info log");
        LOGGER.debug("testing debug log");
        LOGGER.error("testing error log");
  }
}

