package com.mocircle.flume.source;

import com.mocircle.flume.source.config.AuthMethodConfig;
import com.mocircle.flume.source.config.CheckpointModeConfig;
import com.mocircle.flume.source.config.RetrieveModeConfig;

public interface WinlogSourceConstants {

	//
	// Configuration keys
	//

	/**
	 * Indicate the windows event log is from remote computer or local computer
	 */
	String REMOTE = "remote";
	boolean DEFAULT_REMOTE = false;

	/**
	 * Remote computer name
	 */
	String SERVER = "server";

	/**
	 * User name for remote computer
	 */
	String USERNAME = "username";

	/**
	 * Domain of remote computer
	 */
	String DOMAIN = "domain";

	/**
	 * User password for remote computer
	 */
	String PASSWORD = "password";

	/**
	 * Authentication method for log in remote computer. Options are "default",
	 * "negotiate", "kerberos", "ntlm".
	 */
	String AUTH_METHOD = "authMethod";
	String DEFAULT_AUTH_METHOD = AuthMethodConfig.DEFAULT.name();

	/**
	 * Indicate which event channels need to be consumed, separate by comma.
	 * e.g. "application, security"
	 */
	String EVENT_CHANNELS = "eventChannels";

	/**
	 * Indicate how to retrieve the event log. Options are "oldest", "record",
	 * "future".
	 */
	String RETRIEVE_MODE = "retrieveMode";
	String DEFAULT_RETRIEVE_MODE = RetrieveModeConfig.OLDEST.name();

	/**
	 * Only applies if retrieveMode is record.
	 */
	String START_RECORD_IDS = "startRecordIds";
	long DEFAULT_START_RECORD_ID = 0;

	/**
	 * The file path which records the event status/position.
	 */
	String RECORD_STATUS_FILE = "recordStatusFile";
	String DEFAULT_RECORD_STATUS_FILE = "records.status";

	/**
	 * 
	 */
	String BATCH_SIZE = "batchSize";
	int DEFAULT_BATCH_SIZE = 100;

	/**
	 * 
	 */
	String EVENT_INTERVAL = "eventInterval";
	long DEFAULT_EVENT_INTERVAL = 2000;

	String CHECKPOINT_MODE = "checkpointMode";
	String DEFAULT_CHECKPOINT_MODE = CheckpointModeConfig.SCHEDULED.name();

	/**
	 * 
	 */
	String CHECKPOINT_INIT_DELAY = "checkpointInitDelay";
	long DEFAULT_CHECKPOINT_INIT_DELAY = 2000;

	/**
	 * 
	 */
	String CHECKPOINT_INTERVAL = "checkpointInterval";
	long DEFAULT_CHECKPOINT_INTERVAL = 2000;

}
