package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.C97074b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.p7598a.C97069d;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.p7598a.C97070e;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.p7598a.C97071f;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.p7598a.C97072g;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b.C96991i;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b.C96992j;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b.C96994l;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97015t;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a.C97029d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.b.g */
/* compiled from: PG */
public final /* synthetic */ class C97056g implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C97063n f271194a;

    /* renamed from: b */
    public final /* synthetic */ C97061l f271195b;

    public /* synthetic */ C97056g(C97063n nVar, C97061l lVar) {
        this.f271194a = nVar;
        this.f271195b = lVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96991i iVar;
        C97063n nVar = this.f271194a;
        C97061l lVar = this.f271195b;
        C97050a aVar = (C97050a) lVar;
        long j = aVar.f271185a;
        if (nVar.mo90426g() && nVar.f271211j.equals(aVar.f271187c) && ((C97050a) nVar.f271215n).f271185a <= j) {
            C97029d dVar = nVar.f271213l;
            C96992j jVar = (C96992j) obj;
            if (jVar.f271058a == 2) {
                iVar = (C96991i) jVar.f271059b;
            } else {
                iVar = C96991i.f271051b;
            }
            C97015t tVar = iVar.f271053a;
            if (tVar == null) {
                tVar = C97015t.f271114l;
            }
            C97071f fVar = (C97071f) dVar;
            fVar.f271241a.f271244c.mo90419b(tVar);
            C97069d dVar2 = fVar.f271241a.f271247f;
            if (dVar2 != null) {
                C97070e eVar = dVar2.f271231a;
                eVar.f271232a.mo90436a(tVar);
                if (eVar.f271235d == 2) {
                    eVar.f271235d = 3;
                    Runnable runnable = eVar.f271234c;
                    if (runnable != null) {
                        ((C97074b) runnable).f271250a.mo90518f();
                    }
                }
            }
            C97072g gVar = fVar.f271241a;
            gVar.f271245d = gVar.f271243b.mo26870b();
            if ((tVar.f271117a & 16) != 0) {
                C96994l lVar2 = tVar.f271122f;
                if (lVar2 == null) {
                    lVar2 = C96994l.f271061e;
                }
                C96994l lVar3 = tVar.f271122f;
                if (lVar3 == null) {
                    lVar3 = C96994l.f271061e;
                }
                if (!C97072g.m160680b(lVar3)) {
                    ((C59052c) ((C59052c) C97072g.f271242a.mo56225c()).mo56372aa(18364)).mo56389s("Invalid update config: [%s]", lVar2);
                } else {
                    C97072g gVar2 = fVar.f271241a;
                    C96994l lVar4 = tVar.f271122f;
                    gVar2.f271246e = (long) (lVar4 == null ? C96994l.f271061e : lVar4).f271066d;
                    C97053d dVar3 = gVar2.f271244c;
                    if (lVar4 == null) {
                        lVar4 = C96994l.f271061e;
                    }
                    C97062m a = C97072g.m160679a(lVar4);
                    if (!dVar3.f271212k.equals(a)) {
                        dVar3.f271212k = a;
                        if (dVar3.mo90426g()) {
                            dVar3.mo90424e();
                        }
                    }
                }
            } else {
                fVar.f271241a.f271244c.mo90425f();
            }
            nVar.f271215n = lVar;
        }
    }
}
