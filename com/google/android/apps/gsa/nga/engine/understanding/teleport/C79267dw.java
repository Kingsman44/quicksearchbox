package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.dw */
/* compiled from: PG */
public final /* synthetic */ class C79267dw implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C79290es f217733a;

    /* renamed from: b */
    public final /* synthetic */ C79298f f217734b;

    public /* synthetic */ C79267dw(C79290es esVar, C79298f fVar) {
        this.f217733a = esVar;
        this.f217734b = fVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C79290es esVar = this.f217733a;
        C79298f fVar = this.f217734b;
        C80047aa aaVar = (C80047aa) obj;
        Optional f = C79290es.m127207f(aaVar);
        if (!f.isPresent()) {
            return false;
        }
        return Collection.EL.stream(esVar.mo73848a((C79311i) f.get()).f118c).map(new C79288eq(esVar)).map(new C79230cm(fVar)).filter(C79240cw.f217707a).map(C79231cn.f217701a).anyMatch(new C79232co(aaVar));
    }
}
