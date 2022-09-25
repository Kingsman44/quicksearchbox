package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80375e;
import com.google.common.p4522b.C58528ij;
import com.google.knowledge.p4661a.p4662a.C61746h;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.n */
/* compiled from: PG */
public final /* synthetic */ class C79156n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80375e f217603a;

    public /* synthetic */ C79156n(C80375e eVar) {
        this.f217603a = eVar;
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
        C80375e eVar = this.f217603a;
        C58528ij ijVar = C79158p.f217605a;
        return Collection.EL.stream(eVar.f220546b).anyMatch(new C79154l((C61746h) obj));
    }
}
