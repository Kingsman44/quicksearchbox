package com.google.android.apps.gsa.search.core.state;

import com.google.common.p4552o.C60537to;

/* renamed from: com.google.android.apps.gsa.search.core.state.fb */
/* compiled from: PG */
final class C87040fb {

    /* renamed from: a */
    final long f235105a;

    /* renamed from: b */
    final int f235106b;

    /* renamed from: c */
    final C60537to f235107c;

    public C87040fb(long j, int i, C60537to toVar) {
        this.f235105a = j;
        this.f235106b = i;
        this.f235107c = toVar;
    }

    public final String toString() {
        String str;
        long j = this.f235105a;
        int i = this.f235106b;
        String str2 = i != 463 ? i != 464 ? "CANCEL" : "FAILURE" : "SUCCESS";
        C60537to toVar = C60537to.UNKNOWN_STATE;
        switch (this.f235107c.ordinal()) {
            case 0:
                str = "UNKNOWN_STATE";
                break;
            case 1:
                str = "SERVER_ERROR";
                break;
            case 2:
                str = "WEBVIEW_ERROR";
                break;
            case 3:
                str = "S3_ERROR";
                break;
            case 4:
                str = "NO_SPEECH_DETECTED";
                break;
            case 5:
                str = "NO_MATCH_FROM_NETWORK";
                break;
            case 6:
                str = "NO_CONNECTIVITY";
                break;
            default:
                str = "UNKNOWN(" + String.valueOf(this.f235107c) + ")";
                break;
        }
        return "requestId: " + j + ": " + str2 + ": " + str;
    }
}
