package com.google.apps.tiktok.tracing;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.apps.tiktok.tracing.u */
/* compiled from: PG */
final class C47861u extends IllegalStateException {
    public C47861u(String str) {
        super(m85082a((String) null, str));
    }

    /* renamed from: a */
    private static String m85082a(String str, String str2) {
        String concat = str == null ? BuildConfig.FLAVOR : ": ".concat(str);
        return "Starting new trace " + str2 + " when already associated with a trace" + concat + ". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues";
    }

    public C47861u(String str, String str2, Throwable th) {
        super(m85082a(str, str2), th);
    }
}
