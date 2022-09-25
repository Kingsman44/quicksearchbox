package com.google.android.apps.search.googleapp.googleappbrowser;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.C135607c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.p10117aa.p10120c.C133116a;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139769j;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.u */
/* compiled from: PG */
final class C136114u implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C136109q f370713a;

    public C136114u(C136109q qVar) {
        this.f370713a = qVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C135607c cVar = (C135607c) bVar;
        C136109q qVar = this.f370713a;
        if (!qVar.f370700r.mo112949a() || !qVar.f370686d.f369069i) {
            return C47392e.f123116b;
        }
        String a = C133116a.m216079a();
        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
        C139779t tVar = C139779t.GOOGLE_APP_BROWSER;
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
        hVar3.f379871a |= 128;
        hVar3.f379880j = a;
        C139769j jVar = (C139769j) C139770k.f379882c.createBuilder();
        C135459e eVar = (C135459e) C135462h.f369059n.createBuilder();
        C135461g gVar = C135461g.GAB_NEW_TAB_CREATION;
        eVar.copyOnWrite();
        C135462h hVar4 = (C135462h) eVar.instance;
        hVar4.f369064d = gVar.f369058p;
        hVar4.f369061a |= 4;
        String a2 = cVar.mo112396a();
        eVar.copyOnWrite();
        C135462h hVar5 = (C135462h) eVar.instance;
        a2.getClass();
        hVar5.f369061a |= 1;
        hVar5.f369062b = a2;
        eVar.copyOnWrite();
        C135462h hVar6 = (C135462h) eVar.instance;
        hVar6.f369061a |= 8;
        hVar6.f369065e = a;
        eVar.copyOnWrite();
        C135462h hVar7 = (C135462h) eVar.instance;
        hVar7.f369061a |= 128;
        hVar7.f369069i = true;
        jVar.copyOnWrite();
        C139770k kVar = (C139770k) jVar.instance;
        C135462h hVar8 = (C135462h) eVar.build();
        hVar8.getClass();
        kVar.f379885b = hVar8;
        kVar.f379884a = 4;
        fVar.copyOnWrite();
        C139767h hVar9 = (C139767h) fVar.instance;
        C139770k kVar2 = (C139770k) jVar.build();
        kVar2.getClass();
        hVar9.f379877g = kVar2;
        hVar9.f379871a |= 16;
        C47393f.m84236g(new C139760a((C139767h) fVar.build()), qVar.f370687e);
        return C47392e.f123115a;
    }
}
