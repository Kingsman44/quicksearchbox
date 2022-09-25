package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.e.fo */
/* compiled from: PG */
public enum C51962fo implements C62957cd {
    UNKNOWN(0),
    DISPLAYED(1),
    SETTINGS_DISABLED(2),
    APP_OR_CHANNEL_DISABLED(3),
    APP_DISABLED(10),
    CHANNEL_DISABLED(11),
    CATEGORY_DISABLED(12),
    ASSISTANT_DISABLED(4),
    NOT_TARGETING_THIS_DEVICE(5),
    TRIGGERING_CONDITIONS_NOT_SATISFIED(6),
    EXPIRED(7),
    INTERNAL_ERROR(8),
    NOT_TARGETING_THIS_USER(9),
    ALREADY_ACTIONED(13),
    IGNORED_UNEXPECTED_ERROR(14),
    DUPLICATE(15),
    INVALID_NOTIFICATION_ARGS(16),
    INVALID_CONTEXT_TRIGGER_CONDITION(17),
    DELAYED_SCHEDULING_FAILED(18),
    THROTTLED(19);
    

    /* renamed from: u */
    public final int f136364u;

    private C51962fo(int i) {
        this.f136364u = i;
    }

    /* renamed from: a */
    public static C51962fo m86455a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DISPLAYED;
            case 2:
                return SETTINGS_DISABLED;
            case 3:
                return APP_OR_CHANNEL_DISABLED;
            case 4:
                return ASSISTANT_DISABLED;
            case 5:
                return NOT_TARGETING_THIS_DEVICE;
            case 6:
                return TRIGGERING_CONDITIONS_NOT_SATISFIED;
            case 7:
                return EXPIRED;
            case 8:
                return INTERNAL_ERROR;
            case 9:
                return NOT_TARGETING_THIS_USER;
            case 10:
                return APP_DISABLED;
            case 11:
                return CHANNEL_DISABLED;
            case 12:
                return CATEGORY_DISABLED;
            case 13:
                return ALREADY_ACTIONED;
            case 14:
                return IGNORED_UNEXPECTED_ERROR;
            case 15:
                return DUPLICATE;
            case 16:
                return INVALID_NOTIFICATION_ARGS;
            case 17:
                return INVALID_CONTEXT_TRIGGER_CONDITION;
            case 18:
                return DELAYED_SCHEDULING_FAILED;
            case 19:
                return THROTTLED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86456b() {
        return C51961fn.f136342a;
    }

    public final int getNumber() {
        return this.f136364u;
    }

    public final String toString() {
        return Integer.toString(this.f136364u);
    }
}
