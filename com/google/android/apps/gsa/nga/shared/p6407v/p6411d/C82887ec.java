package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ec */
/* compiled from: PG */
public enum C82887ec implements C62957cd {
    UNKNOWN(0),
    QUERY_SENSITIVE(1),
    FULFILLMENT_RESULT_SENSITIVE(2),
    FULFILLMENT_ABORT(37),
    FULFILLMENT_ABORT_SENSITIVE(65),
    HARDWARE_SENSOR(3),
    DELIBERATE_INPUT_DETECTOR_SENSITIVE(4),
    MEMORY_STATS(45),
    ACTIVE_STATE(5),
    APPLICATION_CHANGE(6),
    SPEECH_RECOGNITION_CONTEXT(9),
    GENIE_REWRITE_SENSITIVE(10),
    GENIE_REWRITE(74),
    FUZZY_MATCHER(11),
    SPEECH_EVENT(12),
    CONFIRMATION_CARD(13),
    JINN(14),
    GESTURE_RECOGNIZER(15),
    SCREEN_CONTEXT(16),
    SETTING_SLICE_ACTION(18),
    FULFILLMENT_CANDIDATES_SENSITIVE(19),
    FULFILLMENT_CANDIDATES(76),
    SCREEN_STATE(20),
    TRIGGERING(105),
    ATTENTION_HANDLER(22),
    REWRITERS(23),
    INTENT_GENERATORS_SENSITIVE(24),
    INTENT_GENERATORS(75),
    EXCEPTION(26),
    EXECUTION_SENSITIVE(27),
    EXECUTION(77),
    EXECUTION_FAILED(38),
    EXECUTION_REJECTED(51),
    IMMEDIATE_ACTION_FIRED(72),
    UNDERSTANDING_INTENT_GENERATOR_TIMEOUT(66),
    DISAMBIGUATION_DISABLED(39),
    UI_STATE(28),
    START_OF_USER_SPEECH(79),
    END_OF_USER_SPEECH(49),
    SPEECH_RECOGNITION_CONTEXT_AT_BIND(29),
    SPEECH_RECOGNITION_CONTEXT_UPDATE(30),
    SPEECH_RECOGNITION_CONTEXT_SEND_FEEDBACK(33),
    SPEECH_RECOGNITION_CONTEXT_AGSA_FEEDBACK(43),
    EXECUTION_DONE(32),
    GELLER_CACHE_LOOKUP_FOR_QUERY(31),
    ACCESS_DENIED(34),
    LOGGING_PARAMS_UPDATE(40),
    FILTERED_UNDERSTANDING_SENSITIVE(35),
    OPA_EVENT(41),
    SYNC_MANAGER_FILES_LOOKUP(36),
    SPEECH_RECOGNITION_INITIALIZATION(42),
    PERFORMANCE_TIMING(1000000),
    JINN_TIMING(1000001),
    JINN_INTENT_MATCHING_TIMING(1000002),
    APPLICATION_INFO(44),
    MESSAGING_NOTIFICATIONS_PERMISSIONS(62),
    CLOCK_INFO_RETRIEVAL(46),
    ANNOTATION_SENSITIVE(47),
    CONTACT_SELECTION(48),
    SESSION_ID(50),
    UTTERANCE_FINISHED(52),
    SCREEN_ANNOTATOR(53),
    DIRECT_ACTIONS_LOOKUP_SENSITIVE(54),
    SUFFIX_DETECTION(55),
    DIRECT_ACTION_CALL_SENSITIVE(56),
    SYSTEM_HEALTH(57),
    PATTERNS_INTENT_GENERATOR(58),
    PATTERNS_INTERPRETATION_GENERATOR(59),
    SPEECH_RECOGNITION_SWITCH(60),
    SURVEY_RESULT(61),
    OPA_FAILURE_DETECTED(63),
    OPA_STATE_CHANGED(64),
    DICTATION_FORMATTING(67),
    DARK_LAUNCH_EVENT(68),
    BLACKLIST_RULE_MATCHES_QUERY(69),
    BLACKLIST_RULE_CAUSED_QUERY_HANDOVER(70),
    MULTI_DEVICE_ARBITRATION_REQUIREMENT(71),
    ON_DEVICE_ARBITRATION_RESPONSE_TIMING(78),
    FULFILLMENT_POST_PROCESSING(80),
    LOCKSCREEN_ARBITRATION(94),
    AOL_LOCKSCREEN_ARBITRATION(107),
    ENTITY_ANNOTATIONS_SENSITIVE(81),
    SODA_SESSION_EVENT(82),
    AUDIO_LIBRARY_MIC_EVENT(83),
    HOTWORD_RESTART_EVENT(84),
    KEYBOARD_SERVICE_EVENT(85),
    KEYBOARD_SERVICE_CONFIGURATION_EVENT(86),
    KEYBOARD_SERVICE_MESSAGE_RECEIVED_EVENT(87),
    KEYBOARD_SERVICE_MESSAGE_SENT_EVENT(88),
    OPA_CONVERSATION_DELTA_PROCESSED(89),
    QUERY_STATE_COMMITTED(90),
    SEARCH_SESSION_LIFECYCLE(91),
    CLIENT_CONVERSATION_DONE(92),
    POP_PROCESSING(93),
    MONITORING_EVENT(95),
    ACTIVE_SEARCH_CLIENT(96),
    MIC_CONCURRENCY_STATUS(97),
    ASSIST_LAYER_EVENT(98),
    UTTERANCE_REPORT(99),
    CLIENT_CONFIGURATION(100),
    SODA_RECOGNITION_EVENT(101),
    SEARCH_SERVICE_CLIENT_MANAGER(102),
    SEARCH_SERVICE_CLIENT_USER(103),
    CLOUD_FULFILLMENT_NGA_CLIENT_EVENT(104),
    MULTI_DEVICE_ARBITRATION(106),
    VIS_DELEGATION_EVENT(111),
    APP_DATA_ACCESSOR_EVENT(112),
    ONDEVICE_FULFILLMENT_ERROR_EVENT(113),
    SURVEY_TRIGGERING_LOG(114);
    

    /* renamed from: bf */
    public final int f226093bf;

    private C82887ec(int i) {
        this.f226093bf = i;
    }

    /* renamed from: a */
    public static C82887ec m132416a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return QUERY_SENSITIVE;
            case 2:
                return FULFILLMENT_RESULT_SENSITIVE;
            case 3:
                return HARDWARE_SENSOR;
            case 4:
                return DELIBERATE_INPUT_DETECTOR_SENSITIVE;
            case 5:
                return ACTIVE_STATE;
            case 6:
                return APPLICATION_CHANGE;
            default:
                switch (i) {
                    case 9:
                        return SPEECH_RECOGNITION_CONTEXT;
                    case 10:
                        return GENIE_REWRITE_SENSITIVE;
                    case 11:
                        return FUZZY_MATCHER;
                    case 12:
                        return SPEECH_EVENT;
                    case 13:
                        return CONFIRMATION_CARD;
                    case 14:
                        return JINN;
                    case 15:
                        return GESTURE_RECOGNIZER;
                    case 16:
                        return SCREEN_CONTEXT;
                    default:
                        switch (i) {
                            case 18:
                                return SETTING_SLICE_ACTION;
                            case 19:
                                return FULFILLMENT_CANDIDATES_SENSITIVE;
                            case 20:
                                return SCREEN_STATE;
                            default:
                                switch (i) {
                                    case 22:
                                        return ATTENTION_HANDLER;
                                    case 23:
                                        return REWRITERS;
                                    case 24:
                                        return INTENT_GENERATORS_SENSITIVE;
                                    default:
                                        switch (i) {
                                            case 26:
                                                return EXCEPTION;
                                            case 27:
                                                return EXECUTION_SENSITIVE;
                                            case 28:
                                                return UI_STATE;
                                            case 29:
                                                return SPEECH_RECOGNITION_CONTEXT_AT_BIND;
                                            case 30:
                                                return SPEECH_RECOGNITION_CONTEXT_UPDATE;
                                            case 31:
                                                return GELLER_CACHE_LOOKUP_FOR_QUERY;
                                            case 32:
                                                return EXECUTION_DONE;
                                            case 33:
                                                return SPEECH_RECOGNITION_CONTEXT_SEND_FEEDBACK;
                                            case 34:
                                                return ACCESS_DENIED;
                                            case 35:
                                                return FILTERED_UNDERSTANDING_SENSITIVE;
                                            case 36:
                                                return SYNC_MANAGER_FILES_LOOKUP;
                                            case 37:
                                                return FULFILLMENT_ABORT;
                                            case 38:
                                                return EXECUTION_FAILED;
                                            case 39:
                                                return DISAMBIGUATION_DISABLED;
                                            case 40:
                                                return LOGGING_PARAMS_UPDATE;
                                            case 41:
                                                return OPA_EVENT;
                                            case 42:
                                                return SPEECH_RECOGNITION_INITIALIZATION;
                                            case 43:
                                                return SPEECH_RECOGNITION_CONTEXT_AGSA_FEEDBACK;
                                            case 44:
                                                return APPLICATION_INFO;
                                            case 45:
                                                return MEMORY_STATS;
                                            case 46:
                                                return CLOCK_INFO_RETRIEVAL;
                                            case 47:
                                                return ANNOTATION_SENSITIVE;
                                            case 48:
                                                return CONTACT_SELECTION;
                                            case 49:
                                                return END_OF_USER_SPEECH;
                                            case 50:
                                                return SESSION_ID;
                                            case 51:
                                                return EXECUTION_REJECTED;
                                            case 52:
                                                return UTTERANCE_FINISHED;
                                            case 53:
                                                return SCREEN_ANNOTATOR;
                                            case 54:
                                                return DIRECT_ACTIONS_LOOKUP_SENSITIVE;
                                            case 55:
                                                return SUFFIX_DETECTION;
                                            case 56:
                                                return DIRECT_ACTION_CALL_SENSITIVE;
                                            case 57:
                                                return SYSTEM_HEALTH;
                                            case 58:
                                                return PATTERNS_INTENT_GENERATOR;
                                            case 59:
                                                return PATTERNS_INTERPRETATION_GENERATOR;
                                            case 60:
                                                return SPEECH_RECOGNITION_SWITCH;
                                            case 61:
                                                return SURVEY_RESULT;
                                            case 62:
                                                return MESSAGING_NOTIFICATIONS_PERMISSIONS;
                                            case 63:
                                                return OPA_FAILURE_DETECTED;
                                            case 64:
                                                return OPA_STATE_CHANGED;
                                            case 65:
                                                return FULFILLMENT_ABORT_SENSITIVE;
                                            case 66:
                                                return UNDERSTANDING_INTENT_GENERATOR_TIMEOUT;
                                            case 67:
                                                return DICTATION_FORMATTING;
                                            case 68:
                                                return DARK_LAUNCH_EVENT;
                                            case 69:
                                                return BLACKLIST_RULE_MATCHES_QUERY;
                                            case 70:
                                                return BLACKLIST_RULE_CAUSED_QUERY_HANDOVER;
                                            case 71:
                                                return MULTI_DEVICE_ARBITRATION_REQUIREMENT;
                                            case 72:
                                                return IMMEDIATE_ACTION_FIRED;
                                            default:
                                                switch (i) {
                                                    case 74:
                                                        return GENIE_REWRITE;
                                                    case 75:
                                                        return INTENT_GENERATORS;
                                                    case 76:
                                                        return FULFILLMENT_CANDIDATES;
                                                    case 77:
                                                        return EXECUTION;
                                                    case 78:
                                                        return ON_DEVICE_ARBITRATION_RESPONSE_TIMING;
                                                    case 79:
                                                        return START_OF_USER_SPEECH;
                                                    case 80:
                                                        return FULFILLMENT_POST_PROCESSING;
                                                    case 81:
                                                        return ENTITY_ANNOTATIONS_SENSITIVE;
                                                    case 82:
                                                        return SODA_SESSION_EVENT;
                                                    case 83:
                                                        return AUDIO_LIBRARY_MIC_EVENT;
                                                    case 84:
                                                        return HOTWORD_RESTART_EVENT;
                                                    case 85:
                                                        return KEYBOARD_SERVICE_EVENT;
                                                    case 86:
                                                        return KEYBOARD_SERVICE_CONFIGURATION_EVENT;
                                                    case 87:
                                                        return KEYBOARD_SERVICE_MESSAGE_RECEIVED_EVENT;
                                                    case 88:
                                                        return KEYBOARD_SERVICE_MESSAGE_SENT_EVENT;
                                                    case 89:
                                                        return OPA_CONVERSATION_DELTA_PROCESSED;
                                                    case 90:
                                                        return QUERY_STATE_COMMITTED;
                                                    case 91:
                                                        return SEARCH_SESSION_LIFECYCLE;
                                                    case 92:
                                                        return CLIENT_CONVERSATION_DONE;
                                                    case 93:
                                                        return POP_PROCESSING;
                                                    case 94:
                                                        return LOCKSCREEN_ARBITRATION;
                                                    case 95:
                                                        return MONITORING_EVENT;
                                                    case 96:
                                                        return ACTIVE_SEARCH_CLIENT;
                                                    case 97:
                                                        return MIC_CONCURRENCY_STATUS;
                                                    case 98:
                                                        return ASSIST_LAYER_EVENT;
                                                    case 99:
                                                        return UTTERANCE_REPORT;
                                                    case 100:
                                                        return CLIENT_CONFIGURATION;
                                                    case 101:
                                                        return SODA_RECOGNITION_EVENT;
                                                    case 102:
                                                        return SEARCH_SERVICE_CLIENT_MANAGER;
                                                    case 103:
                                                        return SEARCH_SERVICE_CLIENT_USER;
                                                    case 104:
                                                        return CLOUD_FULFILLMENT_NGA_CLIENT_EVENT;
                                                    case 105:
                                                        return TRIGGERING;
                                                    case 106:
                                                        return MULTI_DEVICE_ARBITRATION;
                                                    case 107:
                                                        return AOL_LOCKSCREEN_ARBITRATION;
                                                    default:
                                                        switch (i) {
                                                            case 111:
                                                                return VIS_DELEGATION_EVENT;
                                                            case 112:
                                                                return APP_DATA_ACCESSOR_EVENT;
                                                            case 113:
                                                                return ONDEVICE_FULFILLMENT_ERROR_EVENT;
                                                            case 114:
                                                                return SURVEY_TRIGGERING_LOG;
                                                            default:
                                                                switch (i) {
                                                                    case 1000000:
                                                                        return PERFORMANCE_TIMING;
                                                                    case 1000001:
                                                                        return JINN_TIMING;
                                                                    case 1000002:
                                                                        return JINN_INTENT_MATCHING_TIMING;
                                                                    default:
                                                                        return null;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m132417b() {
        return C82886eb.f225982a;
    }

    public final int getNumber() {
        return this.f226093bf;
    }

    public final String toString() {
        return Integer.toString(this.f226093bf);
    }
}
