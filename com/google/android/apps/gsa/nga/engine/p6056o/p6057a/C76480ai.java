package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.understanding.C78994au;
import com.google.android.apps.gsa.nga.engine.understanding.C79004ba;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82919fh;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C76480ai implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C76490as f211662a;

    /* renamed from: b */
    public final /* synthetic */ C78994au f211663b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f211664c;

    public /* synthetic */ C76480ai(C76490as asVar, C78994au auVar, C74965n nVar) {
        this.f211662a = asVar;
        this.f211663b = auVar;
        this.f211664c = nVar;
    }

    public final C60870cx apply(Object obj) {
        C76490as asVar = this.f211662a;
        C78994au auVar = this.f211663b;
        C74965n nVar = this.f211664c;
        C76526t tVar = (C76526t) obj;
        C79004ba d = auVar.mo73756d();
        C60870cx c = tVar.mo72219c();
        int a = C82919fh.m132428a(tVar.mo72215b().f225878c);
        if (a == 0) {
            a = 1;
        }
        d.mo73766e(c, a);
        asVar.f211685g.mo72316a(c, "FulfillmentOrchestrator", Optional.m71637of(nVar.mo71336k()));
        return asVar.f211680b.mo28209i(asVar.f211680b.mo28205e(c, "[NGA] UnderstandingFilterHandler.attachToFuture.handleRuntimeException", RuntimeException.class, new C76473ab(asVar, nVar)), "[NGA] UnderstandingFilterHandler.attachToFuture.maybeInformSuccess", new C76474ac(tVar, d));
    }
}
