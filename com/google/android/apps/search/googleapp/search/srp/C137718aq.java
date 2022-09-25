package com.google.android.apps.search.googleapp.search.srp;

import com.google.android.apps.search.googleapp.accounts.C133149a;
import com.google.android.apps.search.googleapp.accounts.C133152b;
import com.google.android.apps.search.googleapp.p10527u.C139774o;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.aq */
/* compiled from: PG */
final class C137718aq implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C137711an f374615a;

    public C137718aq(C137711an anVar) {
        this.f374615a = anVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C133149a aVar = (C133149a) bVar;
        C137542d a = this.f374615a.mo113913a();
        C139779t tVar = C139779t.SEARCH;
        C139774o oVar = (C139774o) C139775p.f379888c.createBuilder();
        C137418g gVar = a.f374092f;
        if (gVar == null) {
            gVar = C137418g.f373767r;
        }
        oVar.copyOnWrite();
        C139775p pVar = (C139775p) oVar.instance;
        gVar.getClass();
        pVar.f379891b = gVar;
        pVar.f379890a = 1;
        return C47392e.m84229a(new C133152b(tVar, (C139775p) oVar.build()));
    }
}
