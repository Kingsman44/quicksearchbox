package com.google.p4242bp.p4267h;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bp.h.z */
/* compiled from: PG */
public enum C56419z implements C62957cd {
    UNSPECIFIED(0),
    ACTION_BAILOUT(18),
    ACTION_CANCELED(16),
    ACTION_CONFIRM(1),
    ACTION_CONFIRM_FOLLOW_ON(45),
    ACTION_CONFIRM_WITHOUT_DIALOG(57),
    ACTION_ERROR(38),
    ACTION_ERROR_INVALID_DEVICE_LOCATION(34),
    ACTION_ERROR_LOCATION_SETTINGS_IS_OFF(44),
    ACTION_ERROR_NO_APP(3),
    ACTION_ERROR_UNSUPPORTED_PROVIDER(58),
    ACTION_PERFORM(2),
    ANSWER_NOT_APPLICABLE(31),
    ANSWER_SUCCESS(32),
    DATE_GET(35),
    FIELD_GET(23),
    GENERIC_TIMEOUT(30),
    LIST_DISAMBIGUATE_CATEGORY(56),
    LIST_GET(24),
    LIST_UPDATE(25),
    LOCATION_GET(41),
    MEDIA_TYPE_UNAVAILABLE(59),
    MEDIA_UNKNOWN_ERROR(60),
    MEDIA_INSUFFICIENT_ACCOUNT_TYPE(61),
    MEDIA_UNSUPPORTED_CAST(62),
    MEDIA_REGION_UNAVAILABILITY(63),
    MEDIA_ENTITY_UNAVAILABLE_ON_PROVIDER(64),
    MEDIA_ENTITY_UNAVAILABLE(65),
    MESSAGE_GET(6),
    MESSAGE_APPEND(43),
    NOTE_GET(33),
    RECIPIENT_DISAMBIGUATE_ENDPOINT_INSTANCE(7),
    RECIPIENT_DISAMBIGUATE_ENDPOINT_TYPE(8),
    RECIPIENT_DISAMBIGUATE_NAME(9),
    RECIPIENT_ERROR_NO_ENDPOINT(10),
    RECIPIENT_GET(11),
    RECIPIENT_CONFIRM(66),
    REMINDER_TRIGGER_GET(39),
    RECURRENCE_ERROR_TYPE_UNSUPPORTED(14),
    RECURRENCE_ERROR_UNSUPPORTED_ON_DEVICE(15),
    RECURRENCE_GET(19),
    RELATIONSHIP_CONFIRM(26),
    RELATIONSHIP_CONFIRM_CANONICAL(27),
    RELATIONSHIP_GET(28),
    RELATIONSHIP_GET_CANONICAL(29),
    SUBJECT_GET(20),
    SUBJECT_UPDATE(42),
    TIME_ERROR_BEYOND_24_HOURS(12),
    TIME_ERROR_IN_PAST(13),
    TIME_GET(17),
    TIME_GET_END(36),
    TIME_GET_START(37),
    PODCAST_GET(40),
    PUNT_AGSA_VERSION(46),
    PUNT_ANDROID_VERSION(47),
    PUNT_COUNTRY(48),
    PUNT_DEVICE(49),
    PUNT_LANGUAGE(50),
    PUNT_MODALITY(51),
    PUNT_TEMP_FORCE_DISABLED(52),
    PUNT_UNIMPLEMENTED_ACTION(53),
    PUNT_UNIMPLEMENTED_FEATURE(54),
    PUNT_UNKNOWN_REASON(55),
    PUNT_CONNECTION_ISSUE(67),
    PUNT_MISSING_PERMISSION(68),
    PUNT_INSUFFICIENT_DATA(69);
    

    /* renamed from: ao */
    public static final C62958ce f150502ao = null;

    /* renamed from: ap */
    public final int f150529ap;

    static {
        f150502ao = new C56417x();
    }

    private C56419z(int i) {
        this.f150529ap = i;
    }

    /* renamed from: a */
    public static C56419z m87986a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return ACTION_CONFIRM;
            case 2:
                return ACTION_PERFORM;
            case 3:
                return ACTION_ERROR_NO_APP;
            case 6:
                return MESSAGE_GET;
            case 7:
                return RECIPIENT_DISAMBIGUATE_ENDPOINT_INSTANCE;
            case 8:
                return RECIPIENT_DISAMBIGUATE_ENDPOINT_TYPE;
            case 9:
                return RECIPIENT_DISAMBIGUATE_NAME;
            case 10:
                return RECIPIENT_ERROR_NO_ENDPOINT;
            case 11:
                return RECIPIENT_GET;
            case 12:
                return TIME_ERROR_BEYOND_24_HOURS;
            case 13:
                return TIME_ERROR_IN_PAST;
            case 14:
                return RECURRENCE_ERROR_TYPE_UNSUPPORTED;
            case 15:
                return RECURRENCE_ERROR_UNSUPPORTED_ON_DEVICE;
            case 16:
                return ACTION_CANCELED;
            case 17:
                return TIME_GET;
            case 18:
                return ACTION_BAILOUT;
            case 19:
                return RECURRENCE_GET;
            case 20:
                return SUBJECT_GET;
            case 23:
                return FIELD_GET;
            case 24:
                return LIST_GET;
            case 25:
                return LIST_UPDATE;
            case 26:
                return RELATIONSHIP_CONFIRM;
            case 27:
                return RELATIONSHIP_CONFIRM_CANONICAL;
            case 28:
                return RELATIONSHIP_GET;
            case 29:
                return RELATIONSHIP_GET_CANONICAL;
            case 30:
                return GENERIC_TIMEOUT;
            case 31:
                return ANSWER_NOT_APPLICABLE;
            case 32:
                return ANSWER_SUCCESS;
            case 33:
                return NOTE_GET;
            case 34:
                return ACTION_ERROR_INVALID_DEVICE_LOCATION;
            case 35:
                return DATE_GET;
            case 36:
                return TIME_GET_END;
            case 37:
                return TIME_GET_START;
            case 38:
                return ACTION_ERROR;
            case 39:
                return REMINDER_TRIGGER_GET;
            case 40:
                return PODCAST_GET;
            case 41:
                return LOCATION_GET;
            case 42:
                return SUBJECT_UPDATE;
            case 43:
                return MESSAGE_APPEND;
            case 44:
                return ACTION_ERROR_LOCATION_SETTINGS_IS_OFF;
            case 45:
                return ACTION_CONFIRM_FOLLOW_ON;
            case 46:
                return PUNT_AGSA_VERSION;
            case 47:
                return PUNT_ANDROID_VERSION;
            case 48:
                return PUNT_COUNTRY;
            case 49:
                return PUNT_DEVICE;
            case 50:
                return PUNT_LANGUAGE;
            case 51:
                return PUNT_MODALITY;
            case 52:
                return PUNT_TEMP_FORCE_DISABLED;
            case 53:
                return PUNT_UNIMPLEMENTED_ACTION;
            case 54:
                return PUNT_UNIMPLEMENTED_FEATURE;
            case 55:
                return PUNT_UNKNOWN_REASON;
            case 56:
                return LIST_DISAMBIGUATE_CATEGORY;
            case 57:
                return ACTION_CONFIRM_WITHOUT_DIALOG;
            case 58:
                return ACTION_ERROR_UNSUPPORTED_PROVIDER;
            case 59:
                return MEDIA_TYPE_UNAVAILABLE;
            case 60:
                return MEDIA_UNKNOWN_ERROR;
            case 61:
                return MEDIA_INSUFFICIENT_ACCOUNT_TYPE;
            case 62:
                return MEDIA_UNSUPPORTED_CAST;
            case 63:
                return MEDIA_REGION_UNAVAILABILITY;
            case 64:
                return MEDIA_ENTITY_UNAVAILABLE_ON_PROVIDER;
            case 65:
                return MEDIA_ENTITY_UNAVAILABLE;
            case 66:
                return RECIPIENT_CONFIRM;
            case 67:
                return PUNT_CONNECTION_ISSUE;
            case 68:
                return PUNT_MISSING_PERMISSION;
            case 69:
                return PUNT_INSUFFICIENT_DATA;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87987b() {
        return C56418y.f150460a;
    }

    public final int getNumber() {
        return this.f150529ap;
    }

    public final String toString() {
        return Integer.toString(this.f150529ap);
    }
}
