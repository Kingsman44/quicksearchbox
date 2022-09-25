package com.google.android.apps.gsa.assistant.handoff;

import android.content.Intent;
import android.net.Uri;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.ag */
/* compiled from: PG */
final class C9450ag {

    /* renamed from: a */
    public static final String f32871a = new Uri.Builder().scheme("assistant-handoff").authority("complete").build().toString();

    /* renamed from: a */
    static C58833ax m23975a(Intent intent) {
        Uri uri;
        if (intent.hasExtra("uri")) {
            uri = Uri.parse(intent.getStringExtra("uri"));
        } else {
            uri = intent.getData();
            if (m23978d(uri)) {
                uri = Uri.parse(uri.getQueryParameter("start_url"));
            }
        }
        return C58833ax.m90833j(uri);
    }

    /* renamed from: b */
    static String m23976b() {
        return "start_url";
    }

    /* renamed from: c */
    static boolean m23977c(Uri uri) {
        return m23980f(uri) == 2;
    }

    /* renamed from: d */
    static boolean m23978d(Uri uri) {
        return m23980f(uri) == 1;
    }

    /* renamed from: e */
    static boolean m23979e(Uri uri) {
        return uri != null && uri.getScheme().equals("assistant-handoff");
    }

    /* renamed from: f */
    private static int m23980f(Uri uri) {
        if (uri == null || !m23979e(uri)) {
            return 0;
        }
        if ((uri.getHost() == null || uri.getHost().isEmpty()) && uri.getPathSegments().isEmpty() && uri.getQueryParameter("start_url") != null) {
            return 1;
        }
        return (uri.getHost() == null || !uri.getHost().equals("complete")) ? 0 : 2;
    }
}
