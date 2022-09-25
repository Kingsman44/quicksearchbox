package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77388am;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77402o;
import com.google.android.apps.gsa.nga.engine.understanding.C78977ad;
import com.google.android.apps.gsa.nga.engine.understanding.C78978ae;
import com.google.android.apps.gsa.nga.engine.understanding.C78984ak;
import com.google.android.apps.gsa.nga.engine.understanding.C78994au;
import com.google.android.apps.gsa.nga.engine.understanding.C79138g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58480gp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.z */
/* compiled from: PG */
public final /* synthetic */ class C76532z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C76490as f211757a;

    /* renamed from: b */
    public final /* synthetic */ C77402o f211758b;

    /* renamed from: c */
    public final /* synthetic */ C77388am f211759c;

    /* renamed from: d */
    public final /* synthetic */ C58480gp f211760d;

    /* renamed from: e */
    public final /* synthetic */ C78994au f211761e;

    public /* synthetic */ C76532z(C76490as asVar, C77402o oVar, C77388am amVar, C58480gp gpVar, C78994au auVar) {
        this.f211757a = asVar;
        this.f211758b = oVar;
        this.f211759c = amVar;
        this.f211760d = gpVar;
        this.f211761e = auVar;
    }

    public final void accept(Object obj) {
        C76490as asVar = this.f211757a;
        C77402o oVar = this.f211758b;
        C77388am amVar = this.f211759c;
        C58480gp gpVar = this.f211760d;
        C78994au auVar = this.f211761e;
        C77426t tVar = (C77426t) obj;
        C80386p a = oVar.mo72540a(tVar);
        gpVar.mo55395g(new C76478ag(tVar, a, amVar.mo72539c(a)));
        if (asVar.f211684f.mo85405j(C90126fx.f251494jq)) {
            C78977ad c = auVar.mo73755c();
            C79138g gVar = new C79138g(a, C78984ak.RUN_FULFILLER_CANDIDATES);
            synchronized (c.f217236a) {
                Object obj2 = c.f217240e;
                if (obj2 == null || c.f217238c.compare(gVar, obj2) < 0) {
                    c.f217240e = gVar;
                    for (C78978ae aeVar : c.f217237b) {
                        if (c.mo73730c(aeVar.mo73732b(), gVar)) {
                            c.f217239d.accept(aeVar, gVar);
                            aeVar.mo73735e();
                        }
                    }
                }
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
