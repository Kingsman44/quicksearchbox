package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.shared.search.Query;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.af */
/* compiled from: PG */
final class C118116af {

    /* renamed from: a */
    final int f327766a;

    /* renamed from: b */
    public final String f327767b;

    /* renamed from: c */
    public final Query f327768c;

    /* renamed from: d */
    public final long f327769d;

    /* renamed from: e */
    public long f327770e = 0;

    public C118116af(int i, String str, Query query, long j) {
        this.f327766a = i;
        this.f327767b = str;
        this.f327768c = query;
        this.f327769d = j;
    }

    public final String toString() {
        String str;
        int i = this.f327766a;
        switch (i) {
            case 0:
                str = "PAGE_STARTED";
                break;
            case 1:
                str = "PAGE_FINISHED";
                break;
            case 2:
                str = "PAGE_INTERCEPT";
                break;
            case 3:
                str = "WEBVIEW_RESPONSIVE";
                break;
            case 4:
                str = "RENDER_COMPLETE";
                break;
            case 5:
                str = "WEBVIEW_SET_CLIENT";
                break;
            case 6:
                str = "WEBVIEW_SET_CHROME_CLIENT";
                break;
            case 8:
                str = "WEBVIEW_SET_BACKGROUND_COLOR";
                break;
            case 9:
                str = "WEBVIEW_SET_CONTENT_DESCRIPTION";
                break;
            case 10:
                str = "WEBVIEW_GO_BACK";
                break;
            case 11:
                str = "WEBVIEW_EVALUATE_JAVASCRIPT";
                break;
            case 12:
                str = "WEBVIEW_LOAD_URL";
                break;
            case 13:
                str = "WEBVIEW_CLEAR_VIEW";
                break;
            case 14:
                str = "WEBVIEW_CLEAR_HISTORY";
                break;
            case 15:
                str = "WEBVIEW_DESTROY";
                break;
            default:
                str = "UNKNOWN(" + i + ")";
                break;
        }
        String str2 = str + "; requestId: " + this.f327768c.f252780s + "; url: " + this.f327767b;
        long j = this.f327769d;
        if (j == 0) {
            return str2;
        }
        return str2 + "; elapsedRealtime: " + j;
    }
}
