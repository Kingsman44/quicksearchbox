package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8298b;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.b.q */
/* compiled from: PG */
public final /* synthetic */ class C107418q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C83683b f298943a;

    public /* synthetic */ C107418q(C83683b bVar) {
        this.f298943a = bVar;
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
        C83683b bVar = this.f298943a;
        C83683b bVar2 = (C83683b) obj;
        if (C107431k.m178347e(C58833ax.m90834k(bVar2))) {
            return false;
        }
        C48871n nVar = bVar2.f228109c;
        if (nVar == null) {
            nVar = C48871n.f126470e;
        }
        C62971cq cqVar = nVar.f126475d;
        C48851br brVar = bVar.f228110d;
        if (brVar == null) {
            brVar = C48851br.f126412f;
        }
        return cqVar.contains(brVar.f126418e);
    }
}
