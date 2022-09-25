package com.google.android.libraries.gsa.p1825a.p1827b;

import android.net.Uri;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99488l;
import com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99489m;
import com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99490n;
import com.google.android.apps.search.googleapp.p10338l.p10339a.C136382ae;
import com.google.android.libraries.search.p2998g.p2999a.C38335a;
import com.google.android.libraries.search.p2998g.p2999a.C38344b;
import com.google.android.libraries.search.p2998g.p2999a.C38362c;
import com.google.android.libraries.search.p2998g.p2999a.C38363d;
import com.google.android.libraries.search.p2998g.p2999a.C38365f;
import com.google.android.libraries.search.p2998g.p2999a.C38366g;
import com.google.android.libraries.search.p2998g.p2999a.C38367h;
import com.google.android.libraries.search.p2998g.p2999a.C38368i;
import com.google.android.libraries.search.p2998g.p2999a.C38369j;
import com.google.android.libraries.search.p2998g.p2999a.C38370k;
import com.google.android.libraries.search.p2998g.p2999a.C38379t;
import com.google.android.libraries.search.p2998g.p2999a.C38380u;
import com.google.android.libraries.search.p2998g.p2999a.C38383x;
import com.google.android.libraries.search.p2998g.p2999a.C38384y;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38347b;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38348c;
import com.google.common.p4541l.C59326i;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.gsa.a.b.a */
/* compiled from: PG */
public final class C22020a {
    static {
        Uri.parse("https://www.google.com/assistant/wearables/setup");
    }

    /* renamed from: a */
    public static Uri m41268a(String str, int i) {
        C62940bt btVar = C99490n.f278409e;
        C99489m mVar = (C99489m) C99490n.f278408d.createBuilder();
        C99488l lVar = C99488l.START_OOBE;
        mVar.copyOnWrite();
        C99490n nVar = (C99490n) mVar.instance;
        nVar.f278412b = lVar.f278407c;
        nVar.f278411a |= 1;
        mVar.copyOnWrite();
        C99490n nVar2 = (C99490n) mVar.instance;
        nVar2.f278411a |= 2;
        nVar2.f278413c = str;
        Uri.Builder path = new Uri.Builder().scheme(C136382ae.f371303a).authority("deeplink").path("/");
        C38335a aVar = (C38335a) C38370k.f101593f.createBuilder();
        C38344b bVar = (C38344b) C38362c.f101570c.createBuilder();
        bVar.copyOnWrite();
        C38362c cVar = (C38362c) bVar.instance;
        cVar.f101572a |= 1;
        cVar.f101573b = "https://www.google.com";
        aVar.copyOnWrite();
        C38370k kVar = (C38370k) aVar.instance;
        C38362c cVar2 = (C38362c) bVar.build();
        cVar2.getClass();
        kVar.f101599e = cVar2;
        kVar.f101595a |= 8;
        C38368i iVar = (C38368i) C38369j.f101588d.createBuilder();
        iVar.copyOnWrite();
        C38369j jVar = (C38369j) iVar.instance;
        jVar.f101590a |= 1;
        jVar.f101591b = 300746767;
        aVar.copyOnWrite();
        C38370k kVar2 = (C38370k) aVar.instance;
        C38369j jVar2 = (C38369j) iVar.build();
        jVar2.getClass();
        kVar2.f101596b = jVar2;
        kVar2.f101595a |= 1;
        C38366g gVar = (C38366g) C38367h.f101583d.createBuilder();
        gVar.copyOnWrite();
        C38367h hVar = (C38367h) gVar.instance;
        hVar.f101585a |= 1;
        hVar.f101586b = i;
        aVar.copyOnWrite();
        C38370k kVar3 = (C38370k) aVar.instance;
        C38367h hVar2 = (C38367h) gVar.build();
        hVar2.getClass();
        kVar3.f101597c = hVar2;
        kVar3.f101595a |= 2;
        C38363d dVar = (C38363d) C38365f.f101578c.createBuilder();
        C38379t tVar = (C38379t) C38380u.f101620d.createBuilder();
        tVar.copyOnWrite();
        C38380u uVar = (C38380u) tVar.instance;
        uVar.f101623b = 9;
        uVar.f101622a |= 1;
        C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
        C62940bt btVar2 = C38346a.f101532a;
        C38347b bVar2 = (C38347b) C38348c.f101533a.createBuilder();
        bVar2.mo58885m(btVar, (C99490n) mVar.build());
        baVar.mo58885m(btVar2, (C38348c) bVar2.build());
        tVar.copyOnWrite();
        C38380u uVar2 = (C38380u) tVar.instance;
        C88431bb bbVar = (C88431bb) baVar.build();
        bbVar.getClass();
        uVar2.f101624c = bbVar;
        uVar2.f101622a |= 2;
        dVar.copyOnWrite();
        C38365f fVar = (C38365f) dVar.instance;
        C38380u uVar3 = (C38380u) tVar.build();
        uVar3.getClass();
        fVar.f101581b = uVar3;
        fVar.f101580a = 2;
        aVar.copyOnWrite();
        C38370k kVar4 = (C38370k) aVar.instance;
        C38365f fVar2 = (C38365f) dVar.build();
        fVar2.getClass();
        kVar4.f101598d = fVar2;
        kVar4.f101595a |= 4;
        C38383x xVar = (C38383x) C38384y.f101627d.createBuilder();
        C63088z byteString = ((C38370k) aVar.build()).toByteString();
        xVar.copyOnWrite();
        C38384y yVar = (C38384y) xVar.instance;
        byteString.getClass();
        yVar.f101629a |= 2;
        yVar.f101631c = byteString;
        C59326i f = C59326i.f157517e.mo56826f();
        byte[] byteArray = ((C38384y) xVar.build()).toByteArray();
        return path.appendQueryParameter("data", f.mo56837l(byteArray, byteArray.length)).build();
    }
}
