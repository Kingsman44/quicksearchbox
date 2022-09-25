package com.google.android.apps.search.googleapp.homescreen;

import com.google.android.apps.search.googleapp.p10257g.C135451x;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.u */
/* compiled from: PG */
final class C136209u implements C47391d {
    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C135451x xVar = (C135451x) bVar;
        C69664n.m101061g(xVar, "event");
        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
        C139779t tVar = C139779t.SEARCH;
        fVar.copyOnWrite();
        C139767h hVar = (C139767h) fVar.instance;
        hVar.f379872b = tVar.f379907i;
        hVar.f379871a |= 1;
        fVar.copyOnWrite();
        C139767h hVar2 = (C139767h) fVar.instance;
        hVar2.f379871a |= 2;
        hVar2.f379873c = true;
        fVar.copyOnWrite();
        C139767h hVar3 = (C139767h) fVar.instance;
        hVar3.f379871a |= 4;
        hVar3.f379874d = true;
        fVar.mo115229a(xVar.f369016b);
        String str = xVar.f369015a;
        fVar.copyOnWrite();
        C139767h hVar4 = (C139767h) fVar.instance;
        hVar4.f379871a |= 8;
        hVar4.f379876f = str;
        return C47392e.m84229a(new C139760a((C139767h) fVar.build()));
    }
}
