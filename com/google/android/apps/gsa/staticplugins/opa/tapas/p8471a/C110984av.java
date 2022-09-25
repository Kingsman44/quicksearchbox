package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.p4129b.p4136c.C54761i;
import java.util.Collections;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.av */
/* compiled from: PG */
public final /* synthetic */ class C110984av implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58480gp f309166a;

    public /* synthetic */ C110984av(C58480gp gpVar) {
        this.f309166a = gpVar;
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
        C58485gu f = this.f309166a.mo55394f();
        C54761i iVar = ((C49301bt) obj).f127429e;
        if (iVar == null) {
            iVar = C54761i.f143683c;
        }
        return !Collections.disjoint(f, (C58528ij) Collection.EL.stream(iVar.f143685a).map(C111018bo.f309200a).collect(C58370cn.f155947b));
    }
}
