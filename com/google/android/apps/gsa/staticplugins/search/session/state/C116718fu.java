package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.common.p4552o.C60537to;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.fu */
/* compiled from: PG */
final class C116718fu {

    /* renamed from: a */
    final long f323690a;

    /* renamed from: b */
    final int f323691b;

    /* renamed from: c */
    final C60537to f323692c;

    public C116718fu(long j, int i, C60537to toVar) {
        this.f323690a = j;
        this.f323691b = i;
        this.f323692c = toVar;
    }

    public final String toString() {
        String str;
        long j = this.f323690a;
        int i = this.f323691b;
        String str2 = i != 463 ? i != 464 ? "CANCEL" : "FAILURE" : "SUCCESS";
        C60537to toVar = C60537to.UNKNOWN_STATE;
        switch (this.f323692c.ordinal()) {
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
                str = "UNKNOWN(" + String.valueOf(this.f323692c) + ")";
                break;
        }
        return "requestId: " + j + ": " + str2 + ": " + str;
    }
}
