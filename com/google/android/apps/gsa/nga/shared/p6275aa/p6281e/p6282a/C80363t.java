package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.t */
/* compiled from: PG */
public enum C80363t implements C62957cd {
    UNKNOWN(0),
    NO_ON_DEVICE_FULFILLMENT(1),
    ON_DEVICE_DISABLED(2),
    BLACKLISTED(3),
    GELLER_EVAL(4),
    GELLER_REFRESH(5),
    NGA_SUGGESTION(6),
    FULFILLMENT_EXCEPTION(7),
    FULFILLMENT_TIMEOUT(8),
    ARBITRATION(9),
    ON_DEVICE_FULFILLMENT_HOLD_BACK(10),
    OPA_CONVERSATION(11),
    LOCKED_SCREEN(12),
    RETAIL_MODE(13),
    POP_LOW_CONFIDENCE_RESPONSE(14),
    POP_FORCED_CLOUD_FALLBACK(19),
    HOTWORD_ON_DEVICE_FEATURE_EXCLUDED(15),
    CLIENT_CONFIGURATION(16),
    RESOURCE_GROUPS_INCOMPATIBLE(17),
    READ_MY_EMAILS(18),
    ABLATION(20),
    UNRECOGNIZED(-1);
    

    /* renamed from: w */
    private final int f220515w;

    private C80363t(int i) {
        this.f220515w = i;
    }

    /* renamed from: a */
    public static C80363t m128122a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return NO_ON_DEVICE_FULFILLMENT;
            case 2:
                return ON_DEVICE_DISABLED;
            case 3:
                return BLACKLISTED;
            case 4:
                return GELLER_EVAL;
            case 5:
                return GELLER_REFRESH;
            case 6:
                return NGA_SUGGESTION;
            case 7:
                return FULFILLMENT_EXCEPTION;
            case 8:
                return FULFILLMENT_TIMEOUT;
            case 9:
                return ARBITRATION;
            case 10:
                return ON_DEVICE_FULFILLMENT_HOLD_BACK;
            case 11:
                return OPA_CONVERSATION;
            case 12:
                return LOCKED_SCREEN;
            case 13:
                return RETAIL_MODE;
            case 14:
                return POP_LOW_CONFIDENCE_RESPONSE;
            case 15:
                return HOTWORD_ON_DEVICE_FEATURE_EXCLUDED;
            case 16:
                return CLIENT_CONFIGURATION;
            case 17:
                return RESOURCE_GROUPS_INCOMPATIBLE;
            case 18:
                return READ_MY_EMAILS;
            case 19:
                return POP_FORCED_CLOUD_FALLBACK;
            case 20:
                return ABLATION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m128123b() {
        return C80362s.f220491a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f220515w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
