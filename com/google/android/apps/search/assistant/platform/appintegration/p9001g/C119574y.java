package com.google.android.apps.search.assistant.platform.appintegration.p9001g;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v;
import com.google.android.apps.search.assistant.platform.appintegration.p8992d.C119522a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9009b.C119662e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c.C119767q;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119788aj;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119811bf;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119812bg;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119817bl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119818bm;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119829bx;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32904f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.g.y */
/* compiled from: PG */
final class C119574y {

    /* renamed from: c */
    private static final C59071e f333253c = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.g.y");

    /* renamed from: a */
    public final Executor f333254a;

    /* renamed from: b */
    public C119748c f333255b;

    /* renamed from: d */
    private final Executor f333256d;

    /* renamed from: e */
    private final C119662e f333257e;

    /* renamed from: f */
    private final C119640v f333258f;

    /* renamed from: g */
    private final C119550ae f333259g;

    /* renamed from: h */
    private final C32904f f333260h;

    /* renamed from: i */
    private final C119567r f333261i;

    /* renamed from: j */
    private final C119767q f333262j;

    /* renamed from: k */
    private final C119548ac f333263k;

    public C119574y(C119548ac acVar, C119640v vVar, C32904f fVar, C119550ae aeVar, Executor executor, C119662e eVar, C119567r rVar, C119767q qVar) {
        this.f333262j = qVar;
        this.f333258f = vVar;
        this.f333260h = fVar;
        this.f333259g = aeVar;
        this.f333256d = executor;
        this.f333257e = eVar;
        this.f333263k = acVar;
        this.f333261i = rVar;
        this.f333254a = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo104434a(C119851cs csVar) {
        C59071e eVar = f333253c;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(34548)).mo56389s("connectAndStartInteraction: %s", csVar);
        if (this.f333255b != null) {
            return mo104435b(csVar);
        }
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(34549)).mo56386p("No apa connection. Create one");
        C119767q qVar = this.f333262j;
        C58431eu c = C58431eu.m89653c(this.f333257e.mo104474b(), this.f333258f.f333413d);
        C119640v vVar = this.f333258f;
        if ((vVar.f333410a & 2) != 0 && !vVar.f333411b) {
            c = c.mo55246e(C119571v.f333248a);
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((C59052c) ((C59052c) f333253c.mo56224b()).mo56372aa(34547)).mo56389s("user subscribe to clientOp = %s", ((C51785da) it.next()).f135878b);
        }
        C32904f fVar = this.f333260h;
        C119550ae aeVar = this.f333259g;
        C119640v vVar2 = this.f333258f;
        ArrayList arrayList = new ArrayList(aeVar.f333192a.size());
        for (C119522a adVar : aeVar.f333192a) {
            arrayList.add(new C119549ad(adVar, vVar2));
        }
        C32849cq b = fVar.mo38224a("AppIntegration", C58485gu.m89842j(arrayList)).mo38265b();
        C119788aj ajVar = (C119788aj) C119789ak.f333656k.createBuilder();
        C119893l lVar = this.f333258f.f333414e;
        if (lVar == null) {
            lVar = C119893l.f333893e;
        }
        ajVar.copyOnWrite();
        C119789ak akVar = (C119789ak) ajVar.instance;
        lVar.getClass();
        akVar.f333663f = lVar;
        akVar.f333658a |= 8;
        C119829bx bxVar = this.f333258f.f333415f;
        if (bxVar == null) {
            bxVar = C119829bx.f333757f;
        }
        ajVar.copyOnWrite();
        C119789ak akVar2 = (C119789ak) ajVar.instance;
        bxVar.getClass();
        akVar2.f333664g = bxVar;
        akVar2.f333658a |= 16;
        C119811bf bfVar = (C119811bf) C119812bg.f333724c.createBuilder();
        bfVar.copyOnWrite();
        C119812bg bgVar = (C119812bg) bfVar.instance;
        b.getClass();
        bgVar.f333727b = b;
        bgVar.f333726a |= 1;
        C119812bg bgVar2 = (C119812bg) bfVar.build();
        ajVar.copyOnWrite();
        C119789ak akVar3 = (C119789ak) ajVar.instance;
        bgVar2.getClass();
        akVar3.f333660c = bgVar2;
        akVar3.f333658a |= 1;
        C119817bl blVar = (C119817bl) C119818bm.f333734b.createBuilder();
        blVar.mo104528a(c);
        ajVar.copyOnWrite();
        C119789ak akVar4 = (C119789ak) ajVar.instance;
        C119818bm bmVar = (C119818bm) blVar.build();
        bmVar.getClass();
        akVar4.f333665h = bmVar;
        akVar4.f333658a |= 32;
        C119567r rVar = this.f333261i;
        C119548ac acVar = this.f333263k;
        C119640v vVar3 = this.f333258f;
        acVar.getClass();
        vVar3.getClass();
        ((C32904f) rVar.f333240a.mo17428b()).getClass();
        Executor executor = (Executor) rVar.f333241b.mo17428b();
        executor.getClass();
        C119662e eVar2 = (C119662e) rVar.f333242c.mo17428b();
        eVar2.getClass();
        ((C119767q) rVar.f333243d.mo17428b()).getClass();
        return C60856cj.m92905n(C47810es.m84965e(new C119570u(this, qVar.mo104511a((C119789ak) ajVar.build(), new C119566q(acVar, vVar3, executor, eVar2), this.f333256d), csVar)), this.f333254a);
    }

    /* renamed from: b */
    public final C60870cx mo104435b(C119851cs csVar) {
        C119748c cVar = this.f333255b;
        cVar.getClass();
        return cVar.mo104498a(csVar);
    }
}
