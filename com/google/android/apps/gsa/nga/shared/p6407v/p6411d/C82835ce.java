package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ce */
/* compiled from: PG */
public enum C82835ce implements C62957cd {
    FULFILLMENT_ABORT_TYPE_UNKNOWN(0),
    APPLICATION_NOT_SUPPORTED(1),
    MESSENGER_CANT_CONTACT_CONTACT_ID(2),
    ASSIST_CONTENT_NOT_AVAILABLE(3),
    MULTIPLE_RECIPIENTS(4),
    APPLICATION_SUPPORTED_SERVER_ONLY(5),
    RECIPIENT_WITH_AMBIGUOUS_MEANING_NAME(6),
    EMPTY_PAYLOAD(7),
    MULTIPLE_NOTIFICATIONS(8),
    AUM_CONTACT_NOT_RESOLVED(9),
    CONTACT_WITH_NO_PHONE_NUMBER(10),
    AUM_PHONE_LABEL_NOT_RESOLVED(11),
    AUM_PHONE_NUMBER_NOT_RESOLVED(12),
    NO_CONVERSATION_ID(13),
    MULTIPLE_CONVERSATION_IDS(14),
    NO_POSSIBLE_CLIENT(15),
    AUM_PROVIDER_NOT_RESOLVED(16),
    MULTIPLE_PHONE_NUMBERS(17),
    NO_CONTACT(18),
    MULTIPLE_OPTIONS(19),
    OPTION_NOT_SUPPORTED(20),
    NO_CONTACT_ID(21),
    NO_CONTACT_CAN_BE_CALLED(22),
    EMPTY_PHONE_NUMBER(24),
    NO_FOREGROUND_APP(25),
    NO_CONVERSATION_ID_FOR_FOREGROUND_APP(26),
    NO_NOTIFICATIONS(27),
    ACCESS_TO_COMMUNICATIONS_NOT_ALLOWED(28),
    SHARE_IMPLICIT_SCREENSHOT_DISABLED(29),
    SHARE_LOCATION_NOT_AVAILABLE(30),
    BACK_ACTION_NOT_AVAILABLE(33),
    ALARM_NOT_RESOLVED(34),
    TIMER_NOT_RESOLVED(35),
    SUPPORTED_APPLICATION_NOT_FOUND(36),
    TIME_TO_ADD_NOT_PROVIDED(37),
    QUANTIFIERS_NOT_IMPLEMENTED(38),
    ALARM_RINGING(39),
    TRIGGER_TIME_NOT_PROVIDED(40),
    TIME_ZONE_NOT_SUPPORTED(41),
    TRIGGER_TIME_TIME_OF_DAY_NOT_PROVIDED(42),
    TRIGGER_TIME_OUT_OF_BOUNDS(43),
    TIMER_DURATION_NOT_PROVIDED(44),
    PERSONAL_DATA_ACCESS_DENIED(45),
    FAILURE_DELETE_AND_DISABLE_ALARM_BOTH_ENABLED(46),
    MULTIPLE_ALARMS_RINGING(47),
    INTENT_NOT_ALLOWED(48),
    APPLICATION_BY_MID_NOT_SUPPORTED(49),
    EMERGENCY_PHONE_NUMBER(50),
    NOT_EMERGENCY_PHONE_NUMBER(51),
    NO_PHONE_NUMBER(52),
    REPLY_TO_FOREGROUND_CHAT_DISABLED(53),
    REPLY_TO_NOTIFICATION_DISABLED(54),
    INVALID_PROVIDER_ARGUMENT(55),
    POP_STATUS_MISSING_CONTEXT(56),
    POP_STATUS_POST_PROCESSING_FAILURE(57),
    POP_STATUS_NO_FULFILLER(58),
    POP_STATUS_FULFILLER_FAILED(59),
    POP_STATUS_OTHER_FAILED(60),
    POP_NO_INTENT(61),
    POP_LOW_CONFIDENCE_RESPONSE(62),
    POP_FORCED_CLOUD_FALLBACK(63);
    

    /* renamed from: aj */
    public final int f225873aj;

    private C82835ce(int i) {
        this.f225873aj = i;
    }

    /* renamed from: a */
    public static C82835ce m132409a(int i) {
        switch (i) {
            case 0:
                return FULFILLMENT_ABORT_TYPE_UNKNOWN;
            case 1:
                return APPLICATION_NOT_SUPPORTED;
            case 2:
                return MESSENGER_CANT_CONTACT_CONTACT_ID;
            case 3:
                return ASSIST_CONTENT_NOT_AVAILABLE;
            case 4:
                return MULTIPLE_RECIPIENTS;
            case 5:
                return APPLICATION_SUPPORTED_SERVER_ONLY;
            case 6:
                return RECIPIENT_WITH_AMBIGUOUS_MEANING_NAME;
            case 7:
                return EMPTY_PAYLOAD;
            case 8:
                return MULTIPLE_NOTIFICATIONS;
            case 9:
                return AUM_CONTACT_NOT_RESOLVED;
            case 10:
                return CONTACT_WITH_NO_PHONE_NUMBER;
            case 11:
                return AUM_PHONE_LABEL_NOT_RESOLVED;
            case 12:
                return AUM_PHONE_NUMBER_NOT_RESOLVED;
            case 13:
                return NO_CONVERSATION_ID;
            case 14:
                return MULTIPLE_CONVERSATION_IDS;
            case 15:
                return NO_POSSIBLE_CLIENT;
            case 16:
                return AUM_PROVIDER_NOT_RESOLVED;
            case 17:
                return MULTIPLE_PHONE_NUMBERS;
            case 18:
                return NO_CONTACT;
            case 19:
                return MULTIPLE_OPTIONS;
            case 20:
                return OPTION_NOT_SUPPORTED;
            case 21:
                return NO_CONTACT_ID;
            case 22:
                return NO_CONTACT_CAN_BE_CALLED;
            case 24:
                return EMPTY_PHONE_NUMBER;
            case 25:
                return NO_FOREGROUND_APP;
            case 26:
                return NO_CONVERSATION_ID_FOR_FOREGROUND_APP;
            case 27:
                return NO_NOTIFICATIONS;
            case 28:
                return ACCESS_TO_COMMUNICATIONS_NOT_ALLOWED;
            case 29:
                return SHARE_IMPLICIT_SCREENSHOT_DISABLED;
            case 30:
                return SHARE_LOCATION_NOT_AVAILABLE;
            case 33:
                return BACK_ACTION_NOT_AVAILABLE;
            case 34:
                return ALARM_NOT_RESOLVED;
            case 35:
                return TIMER_NOT_RESOLVED;
            case 36:
                return SUPPORTED_APPLICATION_NOT_FOUND;
            case 37:
                return TIME_TO_ADD_NOT_PROVIDED;
            case 38:
                return QUANTIFIERS_NOT_IMPLEMENTED;
            case 39:
                return ALARM_RINGING;
            case 40:
                return TRIGGER_TIME_NOT_PROVIDED;
            case 41:
                return TIME_ZONE_NOT_SUPPORTED;
            case 42:
                return TRIGGER_TIME_TIME_OF_DAY_NOT_PROVIDED;
            case 43:
                return TRIGGER_TIME_OUT_OF_BOUNDS;
            case 44:
                return TIMER_DURATION_NOT_PROVIDED;
            case 45:
                return PERSONAL_DATA_ACCESS_DENIED;
            case 46:
                return FAILURE_DELETE_AND_DISABLE_ALARM_BOTH_ENABLED;
            case 47:
                return MULTIPLE_ALARMS_RINGING;
            case 48:
                return INTENT_NOT_ALLOWED;
            case 49:
                return APPLICATION_BY_MID_NOT_SUPPORTED;
            case 50:
                return EMERGENCY_PHONE_NUMBER;
            case 51:
                return NOT_EMERGENCY_PHONE_NUMBER;
            case 52:
                return NO_PHONE_NUMBER;
            case 53:
                return REPLY_TO_FOREGROUND_CHAT_DISABLED;
            case 54:
                return REPLY_TO_NOTIFICATION_DISABLED;
            case 55:
                return INVALID_PROVIDER_ARGUMENT;
            case 56:
                return POP_STATUS_MISSING_CONTEXT;
            case 57:
                return POP_STATUS_POST_PROCESSING_FAILURE;
            case 58:
                return POP_STATUS_NO_FULFILLER;
            case 59:
                return POP_STATUS_FULFILLER_FAILED;
            case 60:
                return POP_STATUS_OTHER_FAILED;
            case 61:
                return POP_NO_INTENT;
            case 62:
                return POP_LOW_CONFIDENCE_RESPONSE;
            case 63:
                return POP_FORCED_CLOUD_FALLBACK;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m132410b() {
        return C82834cd.f225810a;
    }

    public final int getNumber() {
        return this.f225873aj;
    }

    public final String toString() {
        return Integer.toString(this.f225873aj);
    }
}
