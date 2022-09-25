package com.google.android.apps.search.googleapp.tabs.manager.p10525b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.b.c */
/* compiled from: PG */
public final class C139734c {
    /* renamed from: a */
    public static C136128i m227200a() {
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.SEARCH);
        l.mo112769d(true);
        return l;
    }

    /* renamed from: b */
    public static void m227201b(Context context, C136129j jVar) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
        C136127h.m221196a(intent, jVar);
        C47810es.m84979s(context, intent);
    }
}
