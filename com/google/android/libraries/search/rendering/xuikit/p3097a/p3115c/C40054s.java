package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28398s;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28399t;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protos.youtube.elements.C66190dd;
import com.google.protos.youtube.elements.C66192df;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.s */
/* compiled from: PG */
public final /* synthetic */ class C40054s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40058w f105234a;

    /* renamed from: b */
    public final /* synthetic */ C66192df f105235b;

    /* renamed from: c */
    public final /* synthetic */ C66190dd f105236c;

    public /* synthetic */ C40054s(C40058w wVar, C66192df dfVar, C66190dd ddVar) {
        this.f105234a = wVar;
        this.f105235b = dfVar;
        this.f105236c = ddVar;
    }

    public final void run() {
        C28440j jVar;
        C40058w wVar = this.f105234a;
        C66192df dfVar = this.f105235b;
        C66190dd ddVar = this.f105236c;
        C40058w.m69566e(dfVar);
        C40035ap a = C40030ak.m69542a(dfVar);
        C69664n.m101061g(ddVar, "gesture");
        C69664n.m101061g(ddVar, "<this>");
        C66190dd ddVar2 = C66190dd.GESTURE_TYPE_UNKNOWN;
        int ordinal = ddVar.ordinal();
        C28442l lVar = null;
        if (ordinal == 1) {
            jVar = C28442l.m53142h();
        } else if (ordinal == 2) {
            jVar = C28442l.m53141g();
        } else if (ordinal != 3) {
            jVar = null;
        } else {
            jVar = C28442l.m53139e();
        }
        if (jVar != null) {
            C69664n.m101061g(ddVar, "gestureType");
            Integer a2 = a.mo42136a(ddVar);
            if (a2 != null) {
                jVar.mo33895b(C28375ak.m53063e(a2.intValue()));
            }
            lVar = jVar.mo33894a();
        }
        if (a.mo42137b(ddVar) && lVar != null) {
            if (a instanceof C40034ao) {
                C28399t tVar = wVar.f105248e;
                C28423g gVar = wVar.f105249f;
                C60214n nVar = ((C40034ao) a).f105193a.f154142c;
                if (nVar == null) {
                    nVar = C60214n.f162914g;
                }
                tVar.f77166a.mo33777c(new C28398s(tVar, nVar, gVar, lVar));
            } else if (a instanceof C40029aj) {
                wVar.mo42159g(new C40055t(wVar, dfVar, lVar));
            }
        }
    }
}
