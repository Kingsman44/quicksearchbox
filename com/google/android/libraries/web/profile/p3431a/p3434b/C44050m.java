package com.google.android.libraries.web.profile.p3431a.p3434b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.web.profile.a.b.m */
/* compiled from: PG */
public enum C44050m implements C62957cd {
    UNSPECIFIED_VERIFY_COOKIES_RESULT(0),
    VALID(1),
    VALID_NON_GOOGLE_ACCOUNT_TYPE(2),
    VALID_INCOGNITO(11),
    INVALID_NO_GOOGLE_COOKIES(3),
    INVALID_NO_ACCOUNTS(4),
    INVALID_MULTIPLE_ACCOUNTS(5),
    INVALID_ACCOUNT_MISMATCH(6),
    INVALID_COOKIES(7),
    ERROR_NETWORK_ERROR(8),
    ERROR_SERVER_ERROR(9),
    ALREADY_VERIFIED_RECENTLY(10);
    

    /* renamed from: m */
    public final int f114705m;

    private C44050m(int i) {
        this.f114705m = i;
    }

    /* renamed from: a */
    public static C44050m m77773a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED_VERIFY_COOKIES_RESULT;
            case 1:
                return VALID;
            case 2:
                return VALID_NON_GOOGLE_ACCOUNT_TYPE;
            case 3:
                return INVALID_NO_GOOGLE_COOKIES;
            case 4:
                return INVALID_NO_ACCOUNTS;
            case 5:
                return INVALID_MULTIPLE_ACCOUNTS;
            case 6:
                return INVALID_ACCOUNT_MISMATCH;
            case 7:
                return INVALID_COOKIES;
            case 8:
                return ERROR_NETWORK_ERROR;
            case 9:
                return ERROR_SERVER_ERROR;
            case 10:
                return ALREADY_VERIFIED_RECENTLY;
            case 11:
                return VALID_INCOGNITO;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m77774b() {
        return C44049l.f114691a;
    }

    public final int getNumber() {
        return this.f114705m;
    }

    public final String toString() {
        return Integer.toString(this.f114705m);
    }
}
