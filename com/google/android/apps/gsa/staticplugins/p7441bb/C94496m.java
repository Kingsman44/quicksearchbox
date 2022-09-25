package com.google.android.apps.gsa.staticplugins.p7441bb;

import com.google.android.apps.gsa.search.core.google.C86074p;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p6968aa.C89016an;
import com.google.android.apps.gsa.shared.p6968aa.C89059o;
import com.google.android.apps.gsa.shared.p6968aa.p6969a.C89001a;
import com.google.android.apps.gsa.shared.p6968aa.p6969a.C89002b;
import com.google.android.apps.gsa.shared.util.C90773bq;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.gsa.p1833c.p1834a.C22224aw;
import com.google.android.libraries.gsa.p1833c.p1834a.C22266r;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4541l.C59326i;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.p5523c.C70261e;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.gsa.staticplugins.bb.m */
/* compiled from: PG */
public final class C94496m implements C89001a {

    /* renamed from: a */
    private final C89016an f264198a;

    /* renamed from: b */
    private final C58881cr f264199b;

    /* renamed from: c */
    private final C94494k f264200c;

    /* renamed from: d */
    private final C94491h f264201d;

    /* renamed from: e */
    private final C94503t f264202e;

    public C94496m(C89016an anVar, C22266r rVar, C94494k kVar, C94491h hVar, C94503t tVar) {
        this.f264198a = anVar;
        this.f264199b = C58886cw.m90973a(new C94495l(rVar));
        this.f264200c = kVar;
        this.f264201d = hVar;
        this.f264202e = tVar;
    }

    /* renamed from: a */
    public final C70888j mo82973a() {
        C70334de deVar = new C70334de();
        C70334de deVar2 = new C70334de();
        C89002b.m144698a(deVar2, "X-Goog-Api-Key", "AIzaSyDe0Iv2_zsVzc2gvgezBKuRSs_wrmp2XRI");
        C94503t tVar = this.f264202e;
        C70334de deVar3 = new C70334de();
        C89002b.m144698a(deVar3, "X-Android-Package", tVar.f264216c);
        C86074p pVar = tVar.f264215b;
        byte[] byteArray = pVar.mo79713a(true, pVar.mo79714b()).toByteArray();
        C89002b.m144698a(deVar3, "X-Client-Data", C59326i.f157517e.mo56837l(byteArray, byteArray.length));
        C89002b.m144698a(deVar3, "Save-Data", true != tVar.f264214a.mo27385k() ? "off" : "on");
        C89002b.m144698a(deVar3, "X-Client-Version", C90773bq.m148322d(tVar.f264217d));
        deVar2.mo62032g(deVar3);
        deVar2.mo62032g(deVar);
        C70261e b = C70261e.m102411b("oncontent-pa.googleapis.com", 443, (CronetEngine) this.f264199b.mo6453a());
        C94491h hVar = this.f264201d;
        C90851k kVar = (C90851k) hVar.f264187a.mo17428b();
        kVar.getClass();
        C86054o oVar = (C86054o) hVar.f264188b.mo17428b();
        oVar.getClass();
        C22871g gVar = (C22871g) hVar.f264189c.mo17428b();
        gVar.getClass();
        b.f187275c.mo62292g(Arrays.asList(new C70899n[]{new C70879r(deVar2), new C94485b(), new C22224aw("oncontent-pa.googleapis.com", 443, 64, this.f264198a, (C89059o) null), new C94490g("oauth2:https://www.googleapis.com/auth/googlenow", false, kVar, oVar, gVar), this.f264200c}));
        return b.f187275c.mo57963c();
    }
}
