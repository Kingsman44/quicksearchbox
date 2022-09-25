package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.s */
/* compiled from: PG */
final class C42358s extends C42264aq {

    /* renamed from: a */
    private final int f111093a;

    /* renamed from: b */
    private final int f111094b;

    public C42358s(int i, int i2) {
        if (i != 0) {
            this.f111093a = i;
            this.f111094b = i2;
            return;
        }
        throw new NullPointerException("Null dataSource");
    }

    /* renamed from: a */
    public final int mo45217a() {
        return this.f111093a;
    }

    /* renamed from: b */
    public final int mo45218b() {
        return this.f111094b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42264aq) {
            C42264aq aqVar = (C42264aq) obj;
            return this.f111093a == aqVar.mo45217a() && this.f111094b == aqVar.mo45218b();
        }
    }

    public final int hashCode() {
        return ((this.f111093a ^ 1000003) * 1000003) ^ this.f111094b;
    }

    public final String toString() {
        String str;
        String str2;
        switch (this.f111093a) {
            case 1:
                str = "PEOPLE_API_TOP_N";
                break;
            case 2:
                str = "PEOPLE_API_AUTOCOMPLETE";
                break;
            case 3:
                str = "GMSCORE_AUTOCOMPLETE";
                break;
            case 4:
                str = "DEVICE_CONTACTS";
                break;
            case 5:
                str = "DIRECTORY";
                break;
            case 6:
                str = "PEOPLE_API_LIST_PEOPLE_BY_KNOWN_ID";
                break;
            case 7:
                str = "PEOPLE_API_GET_PEOPLE";
                break;
            case 8:
                str = "PEOPLE_STACK_CONTEXTUAL_SUGGESTIONS";
                break;
            case 9:
                str = "PEOPLE_STACK_LOOKUP_DATABASE";
                break;
            case 10:
                str = "PEOPLE_STACK_LOOKUP_RPC";
                break;
            case 11:
                str = "PEOPLE_STACK_TOPN_DATABASE";
                break;
            case 12:
                str = "PEOPLE_STACK_REMOTE_AUTOCOMPLETE";
                break;
            case 13:
                str = "TOPN_DEVICE_MIXED";
                break;
            default:
                str = "CUSTOM_RESULT_PROVIDER";
                break;
        }
        switch (this.f111094b) {
            case 1:
                str2 = "NONE";
                break;
            case 2:
                str2 = "SUCCESS";
                break;
            case 3:
                str2 = "FAILED_UNKNOWN";
                break;
            case 4:
                str2 = "FAILED_ACCOUNT_NOT_LOGGED_IN";
                break;
            case 5:
                str2 = "FAILED_CORRUPT_CACHE";
                break;
            case 6:
                str2 = "FAILED_DATA_FRESH";
                break;
            case 7:
                str2 = "FAILED_NETWORK";
                break;
            case 8:
                str2 = "FAILED_PEOPLE_API_RESPONSE_EMPTY";
                break;
            case 9:
                str2 = "FAILED_PEOPLE_API_INVALID_ARGUMENT";
                break;
            case 10:
                str2 = "FAILED_GMSCORE_CONNECTION_ERROR";
                break;
            case 11:
                str2 = "FAILED_GMSCORE_EMPTY_QUERY";
                break;
            case 12:
                str2 = "FAILED_TIMEOUT";
                break;
            case 13:
                str2 = "FAILED_CANCELED";
                break;
            case 14:
                str2 = "FAILED_INTERRUPTED";
                break;
            case 15:
                str2 = "FAILED_EXPERIMENTS_CHANGED";
                break;
            case 16:
                str2 = "FAILED_NOT_IMPLEMENTED";
                break;
            case 17:
                str2 = "FAILED_TO_READ_FILE";
                break;
            case 18:
                str2 = "SKIPPED";
                break;
            case 19:
                str2 = "FAILED_HTTP_SERVER_ERROR";
                break;
            case 20:
                str2 = "FAILED_REMOTE";
                break;
            case 21:
                str2 = "FAILED_UNKNOWN_CUSTOM_PROVIDER";
                break;
            default:
                str2 = "FAILED_MISSING_SCHEDULED_EXECUTOR";
                break;
        }
        return "CallbackError{dataSource=" + str + ", status=" + str2 + "}";
    }
}
