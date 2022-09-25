package com.google.android.apps.search.googleapp.activity;

import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.libraries.search.p2476a.p2482d.C32215d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.googleapp.activity.aa */
/* compiled from: PG */
final class C133377aa implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C133444w f363440a;

    public C133377aa(C133444w wVar) {
        this.f363440a = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C32215d dVar = (C32215d) bVar;
        C133444w wVar = this.f363440a;
        if (wVar.f363596E) {
            wVar.f363593B.mo115320a((C139873i) null, false);
        } else {
            C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
            C139779t tVar = C139779t.INCOGNITO_SETTINGS;
            fVar.copyOnWrite();
            C139767h hVar = (C139767h) fVar.instance;
            hVar.f379872b = tVar.f379907i;
            hVar.f379871a |= 1;
            wVar.mo111146c(new C139760a((C139767h) fVar.build()));
        }
        return C47392e.f123115a;
    }
}
