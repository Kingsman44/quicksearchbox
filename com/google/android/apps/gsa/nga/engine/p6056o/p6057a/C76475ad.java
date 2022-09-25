package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74755l;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.protos.p4985f.p5030q.C65196fc;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C76475ad implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76490as f211650a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f211651b;

    public /* synthetic */ C76475ad(C76490as asVar, C74965n nVar) {
        this.f211650a = asVar;
        this.f211651b = nVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80401n nVar;
        C76490as asVar = this.f211650a;
        C74965n nVar2 = this.f211651b;
        C77426t tVar = (C77426t) obj;
        if (C81442m.m129547i(tVar.mo72528e()).isPresent()) {
            return tVar;
        }
        C65196fc fcVar = tVar.mo72528e().f220666i;
        if (fcVar == null) {
            fcVar = C65196fc.f176453l;
        }
        boolean contains = fcVar.f176465k.contains(110769);
        if (asVar.f211684f.mo85405j(C90126fx.f251300gH)) {
            if (!contains) {
                asVar.mo72213c(3, nVar2);
            }
            C80363t tVar2 = C80363t.ON_DEVICE_FULFILLMENT_HOLD_BACK;
            C74755l e = tVar.mo72525b().mo73746a().mo71152e();
            int b = e.mo71143b();
            int i = b - 1;
            if (b != 0) {
                if (i == 0) {
                    nVar = C81442m.m129542d(e.mo71141c().mo71147d(), tVar2);
                } else if (i == 1) {
                    nVar = C81442m.m129541c(e.mo71140a().mo71142a(), tVar2);
                } else {
                    throw new AssertionError();
                }
                return tVar.mo72567j(nVar);
            }
            throw null;
        } else if (contains) {
            return tVar;
        } else {
            asVar.mo72213c(1, nVar2);
            return tVar;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
