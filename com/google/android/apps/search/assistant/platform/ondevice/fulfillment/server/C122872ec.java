package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ec */
/* compiled from: PG */
public final class C122872ec extends Exception {

    /* renamed from: a */
    public final String f340335a;

    /* renamed from: b */
    public final String f340336b;

    public C122872ec(String str, String str2) {
        super(m202202a(str, str2));
        this.f340335a = str;
        this.f340336b = str2;
    }

    /* renamed from: a */
    private static String m202202a(String str, String str2) {
        return String.format(Locale.US, "origin: %s description: %s", new Object[]{str, str2});
    }

    public C122872ec(String str, String str2, Throwable th) {
        super(m202202a(str, str2), th);
        this.f340335a = str;
        this.f340336b = str2;
    }
}
