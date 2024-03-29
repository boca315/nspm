package com.nspm.antlr4.exceptions;

/**
 * @author luwei
 * @date 2019/9/9
 */
public enum ZeeErrorName {

    SYSTEM_DEFAULT("ZEE-01001"),
    VALIDATION_EXCEPTION("ZEE-01002"),
    JSON_READ_EXCEPTION("ZEE-01003"),
    JSON_WRITE_EXCEPTION("ZEE-01004"),
    INTERRUPTED_EXCEPTION("ZEE-01005"),
    TIMEOUT_EXCEPTION("ZEE-01006"),
    CANCELLED_EXCEPTION("ZEE-01007"),
    RESOURCE_OUT_OF_SYNC("ZEE-01008"),
    HEARTBEAT_FAIL("ZEE-01009"),

    CANNOT_DELETE_SYSTEM_USER("ZEE-01100"),
    INVALID_USER_NAME("ZEE-01101"),

    RESOURCE_NOT_FOUND("ZEE-02001"),

    ACCESS_ANALYSIS_NOT_RUN("ZEE-03001"),
    ACCESS_ANALYSIS_NOT_RUNNING("ZEE-03002"),
    DETAILED_PATH_INVALID_CUSTOM_PATH("ZEE-03003"),
    ANALYSIS_WARNING("ZEE-03004"),

    RULECHECK_NOT_RUN("ZEE-11001"),
    RULECHECK_ERROR("ZEE-11002"),
    RULECHECK_STILL_RUNNING("ZEE-11003"),

    TASK_PRE_CHECK_EXCEPTION("ZEE-12001"),

    IMPORT_NO_PLUGIN_DETECTED("ZEE-13001"),
    IMPORT_MORE_THAN_ONE_PLUGIN_MATCHED("ZEE-13002"),
    IMPORT_NO_DEVICE_RETURNED_BY_PLUGIN("ZEE-13003"),
    IMPORT_EXCEPTION("ZEE-13004"),
    IMPORT_TOO_MANY_VALIDATION_ERROR("ZEE-13005"),
    IMPORT_PLUGIN_NOT_FOUND("ZEE-13006"),
    IMPORT_WARNING("ZEE-13007"),

    VALIDATION_DEFAULT("ZEE-14001"),
    VALIDATION_ROUTING_TABLE_INTERFACE_NOT_UNIQUE("ZEE-14002"),
    VALIDATION_NAME_EMPTY("ZEE-14003"),
    VALIDATION_ROUTING_TABLE_KEY_NOT_MATCH_NAME("ZEE-14004"),
    VALIDATION_FILTER_LIST_KEY_NOT_MATCH_NAME("ZEE-14005"),
    VALIDATION_OBJECT_NOT_FOUND("ZEE-14006"),
    VALIDATION_MORE_THAN_ONE_DEFAULT_ROUTING_TABLE("ZEE-14007"),
    VALIDATION_IP_PREFIX_WITHOUT_LENGTH("ZEE-14008"),
    VALIDATION_IP_MASK_LENGTH_OUT_OF_RANGE("ZEE-14009"),
    VALIDATION_IP_BASE_WITHOUT_MASK("ZEE-14010"),
    VALIDATION_MAP_KEY_NOT_MATCH_NAME("ZEE-14011"),
    VALIDATION_INTERFACE_IP_WITHOUT_MASK("ZEE-14012"),
    VALIDATION_IP_TYPE_AND_ADDRESS_MISMATCH("ZEE-14013"),
    VALIDATION_FILTER_RULE_EMPTY("ZEE-14014"),
    VALIDATION_ROUTING_TABLE_TYPE_MISSING("ZEE-14015"),
    VALIDATION_ROUTE_MISSING_PREFIX("ZEE-14016"),
    VALIDATION_ROUTE_MISSING_MASK_LENGTH("ZEE-14017"),
    VALIDATION_ROUTE_MORE_THAN_ONE_PREFIX_IP("ZEE-14018"),
    VALIDATION_ROUTE_IP_TYPE_MISMATCH("ZEE-14019"),
    VALIDATION_CIRCULAR_REFERENCE("ZEE-14020"),
    VALIDATION_DEVICE_INTERFACE_NOT_UNIQUE_NAME("ZEE-14021"),

    VALIDATION_DUPLICATE_NAME("ZEE-15001"),
    VALIDATION_UNSUPPORTED_ACCESS_QUERY("ZEE-15002"),
    VALIDATION_BUNDLE_DEFAULT("ZEE-15003"),
    VALIDATION_OBJECT_IN_USE("ZEE-15004"),

    PLUGIN_DEFAULT("ZEE-16001"),
    PLUGIN_COMM_LOGIN_FAILED("ZEE-16002"),
    PLUGIN_COMM_SSH_WRONG_VERSION("ZEE-16003"),
    PLUGIN_DEVICE_PARSER_WARNING("ZEE-16004"),
    PLUGIN_DEVICE_PARSER_ERROR("ZEE-16005"),
    PLUGIN_RUNTIME_DEFAULT("ZEE-16006"),
    PLUGIN_CONFIG_PARSE_FAIL("ZEE-16007"),

    CLI_OP_DEFAULT("ZEE-17001"),
    CLI_OP_TIMED_OUT("ZEE-17002"),

    DC_DEFAULT("ZEE-18001");

    private String errorCode;

    private ZeeErrorName(String errorCode)
    {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getPropertyName()
    {
        return this.errorCode + "." + name();
    }

    @Override
    public String toString()
    {
        return this.errorCode + ":" + name();
    }


}
