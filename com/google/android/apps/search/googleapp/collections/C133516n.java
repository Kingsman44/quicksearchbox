package com.google.android.apps.search.googleapp.collections;

import android.net.Uri;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139762c;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139769j;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.C137404d;
import com.google.android.apps.search.googleapp.search.C137411e;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58837ba;
import java.util.Collections;

/* renamed from: com.google.android.apps.search.googleapp.collections.n */
/* compiled from: PG */
public final /* synthetic */ class C133516n implements C43714a {

    /* renamed from: a */
    public final /* synthetic */ C133521s f363791a;

    public /* synthetic */ C133516n(C133521s sVar) {
        this.f363791a = sVar;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        C47388b bVar;
        C133521s sVar = this.f363791a;
        String b = sVar.f363802g.mo113396b(Uri.parse(lVar.f113296b));
        if (C58837ba.m90859h(b)) {
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
            C139769j jVar = (C139769j) C139770k.f379882c.createBuilder();
            C137404d dVar = (C137404d) C137411e.f373755g.createBuilder();
            C139704d dVar2 = C139704d.COLLECTIONS;
            dVar.copyOnWrite();
            C137411e eVar = (C137411e) dVar.instance;
            eVar.f373758b = dVar2.f379715p;
            eVar.f373757a = 1 | eVar.f373757a;
            jVar.copyOnWrite();
            C139770k kVar = (C139770k) jVar.instance;
            C137411e eVar2 = (C137411e) dVar.build();
            eVar2.getClass();
            kVar.f379885b = eVar2;
            kVar.f379884a = 2;
            fVar.copyOnWrite();
            C139767h hVar3 = (C139767h) fVar.instance;
            C139770k kVar2 = (C139770k) jVar.build();
            kVar2.getClass();
            hVar3.f379877g = kVar2;
            hVar3.f379871a |= 16;
            bVar = new C139760a((C139767h) fVar.build());
        } else {
            bVar = C139762c.m227231c(b, Collections.emptyMap());
        }
        C47393f.m84236g(bVar, sVar.f363799d);
    }
}
