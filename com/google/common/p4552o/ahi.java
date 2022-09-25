package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.ahi */
/* compiled from: PG */
public enum ahi implements C62957cd {
    UNKNOWN(0),
    ELIGIBLE(1),
    NON_ELIGIBLE_ANDROID_VERSION_TOO_OLD(2),
    NON_ELIGIBLE_NGA_DISABLED(3),
    NON_ELIGIBLE_NGA_FLAG_DISABLED(4),
    NON_ELIGIBLE_WORK_PROFILE(5),
    NON_ELIGIBLE_ACCESSIBILITY_ENABLED(6),
    NON_ELIGIBLE_DEMO_MODE_WITHOUT_DEMO_USER(7),
    NON_ELIGIBLE_UNSUPPORTED_DEVICE_MODEL(8),
    NON_ELIGIBLE_WRONG_ASSISTANT_LANGUAGE(9),
    NON_ELIGIBLE_TWO_AND_THREE_BUTTON_MODE(10),
    NON_ELIGIBLE_DASHER_ACCOUNT_PRESENT(11),
    NON_ELIGIBLE_ASSISTANT_DISABLED(12),
    NON_ELIGIBLE_ACCOUNT_WITH_INVALID_OAUTH_TOKEN_PRESENT(13),
    NON_ELIGIBLE_MULTIPLE_ASSISTANT_LANGUAGES(14),
    NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_EN_GB(15),
    NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_EN_CA(16),
    NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_EN_AU(17),
    NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_JA_JP(18),
    NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_OTHER(19),
    NON_ELIGIBLE_DASHER_SAA_DISABLED(20),
    NON_ELIGIBLE_IN_RETAIL_MODE_DISCLAIMER_MISSING(21),
    NON_ELIGIBLE_LOCALE_NOT_SUPPORTED_BY_OPA(22),
    NON_ELIGIBLE_UNSUPPORTED_LANGUAGE_PARTNER(23);
    

    /* renamed from: y */
    public final int f158764y;

    private ahi(int i) {
        this.f158764y = i;
    }

    /* renamed from: a */
    public static ahi m92401a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ELIGIBLE;
            case 2:
                return NON_ELIGIBLE_ANDROID_VERSION_TOO_OLD;
            case 3:
                return NON_ELIGIBLE_NGA_DISABLED;
            case 4:
                return NON_ELIGIBLE_NGA_FLAG_DISABLED;
            case 5:
                return NON_ELIGIBLE_WORK_PROFILE;
            case 6:
                return NON_ELIGIBLE_ACCESSIBILITY_ENABLED;
            case 7:
                return NON_ELIGIBLE_DEMO_MODE_WITHOUT_DEMO_USER;
            case 8:
                return NON_ELIGIBLE_UNSUPPORTED_DEVICE_MODEL;
            case 9:
                return NON_ELIGIBLE_WRONG_ASSISTANT_LANGUAGE;
            case 10:
                return NON_ELIGIBLE_TWO_AND_THREE_BUTTON_MODE;
            case 11:
                return NON_ELIGIBLE_DASHER_ACCOUNT_PRESENT;
            case 12:
                return NON_ELIGIBLE_ASSISTANT_DISABLED;
            case 13:
                return NON_ELIGIBLE_ACCOUNT_WITH_INVALID_OAUTH_TOKEN_PRESENT;
            case 14:
                return NON_ELIGIBLE_MULTIPLE_ASSISTANT_LANGUAGES;
            case 15:
                return NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_EN_GB;
            case 16:
                return NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_EN_CA;
            case 17:
                return NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_EN_AU;
            case 18:
                return NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_JA_JP;
            case 19:
                return NON_ELIGIBLE_UNSUPPORTED_ASSISTANT_LANGUAGE_OTHER;
            case 20:
                return NON_ELIGIBLE_DASHER_SAA_DISABLED;
            case 21:
                return NON_ELIGIBLE_IN_RETAIL_MODE_DISCLAIMER_MISSING;
            case 22:
                return NON_ELIGIBLE_LOCALE_NOT_SUPPORTED_BY_OPA;
            case 23:
                return NON_ELIGIBLE_UNSUPPORTED_LANGUAGE_PARTNER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92402b() {
        return ahh.f158738a;
    }

    public final int getNumber() {
        return this.f158764y;
    }

    public final String toString() {
        return Integer.toString(this.f158764y);
    }
}
