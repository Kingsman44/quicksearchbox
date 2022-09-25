package com.google.android.libraries.web.profile.p3431a.p3434b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.web.profile.a.b.g */
/* compiled from: PG */
public enum C44044g implements C62957cd {
    UNSPECIFIED_REFRESH_COOKIES_RESULT(0),
    SUCCESS(1),
    ERROR_INVALID_ACCOUNT_TYPE(2),
    ERROR_RETRY(3),
    ERROR_INVALID_COOKIES(5),
    ERROR_GENERIC_AUTH_ERROR(6),
    ERROR_UNCAUGHT_THROWABLE(7),
    ERROR_INCOGNITO(8),
    ERROR_AUTH_RECOVERABLE_WITH_URL(9),
    ERROR_AUTH_RECOVERABLE_WITHOUT_URL(10),
    ERROR_AUTH_USER_RECOVERABLE_WITH_INTENT(11),
    ERROR_AUTH_USER_RECOVERABLE_WITHOUT_INTENT(12);
    

    /* renamed from: m */
    public final int f114684m;

    private C44044g(int i) {
        this.f114684m = i;
    }

    /* renamed from: a */
    public static C44044g m77768a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED_REFRESH_COOKIES_RESULT;
            case 1:
                return SUCCESS;
            case 2:
                return ERROR_INVALID_ACCOUNT_TYPE;
            case 3:
                return ERROR_RETRY;
            case 5:
                return ERROR_INVALID_COOKIES;
            case 6:
                return ERROR_GENERIC_AUTH_ERROR;
            case 7:
                return ERROR_UNCAUGHT_THROWABLE;
            case 8:
                return ERROR_INCOGNITO;
            case 9:
                return ERROR_AUTH_RECOVERABLE_WITH_URL;
            case 10:
                return ERROR_AUTH_RECOVERABLE_WITHOUT_URL;
            case 11:
                return ERROR_AUTH_USER_RECOVERABLE_WITH_INTENT;
            case 12:
                return ERROR_AUTH_USER_RECOVERABLE_WITHOUT_INTENT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m77769b() {
        return C44043f.f114670a;
    }

    public final int getNumber() {
        return this.f114684m;
    }

    public final String toString() {
        return Integer.toString(this.f114684m);
    }
}
