package com.google.android.apps.search.googleapp.incognito.p10324e;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;

/* renamed from: com.google.android.apps.search.googleapp.incognito.e.a */
/* compiled from: PG */
public final class C136247a {

    /* renamed from: a */
    private final Activity f371045a;

    /* renamed from: b */
    private final C136249c f371046b;

    public C136247a(Activity activity, C136249c cVar) {
        this.f371045a = activity;
        this.f371046b = cVar;
    }

    /* renamed from: a */
    public final void mo112861a() {
        Intent intent = new Intent();
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.HOME_SCREEN);
        C136127h.m221196a(intent, l.mo112766a());
        this.f371045a.startActivity(intent);
        this.f371045a.finish();
    }

    /* renamed from: b */
    public final void mo112862b(int i) {
        this.f371046b.mo112863a(i);
        mo112861a();
    }
}
