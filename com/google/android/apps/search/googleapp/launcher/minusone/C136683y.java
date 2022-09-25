package com.google.android.apps.search.googleapp.launcher.minusone;

import android.content.Intent;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.libraries.search.p2476a.p2482d.C32215d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.y */
/* compiled from: PG */
final class C136683y implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C136681w f372059a;

    public C136683y(C136681w wVar) {
        this.f372059a = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C32215d dVar = (C32215d) bVar;
        C136681w wVar = this.f372059a;
        if (wVar.f372057f) {
            wVar.f372056e.mo115320a((C139873i) null, false);
        } else {
            Intent intent = new Intent();
            C136128i l = C136129j.m221208l();
            l.mo112776k(C139779t.INCOGNITO_SETTINGS);
            C136127h.m221196a(intent, l.mo112766a());
            wVar.f372053b.startActivity(intent);
        }
        return C47392e.f123115a;
    }
}
