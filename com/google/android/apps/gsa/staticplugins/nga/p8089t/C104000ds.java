package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ds */
/* compiled from: PG */
public final /* synthetic */ class C104000ds implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C104026er f289407a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f289408b;

    public /* synthetic */ C104000ds(C104026er erVar, C58528ij ijVar) {
        this.f289407a = erVar;
        this.f289408b = ijVar;
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
        C104026er erVar = this.f289407a;
        C58528ij ijVar = this.f289408b;
        C80627v vVar = (C80627v) obj;
        if (vVar.equals(C80627v.SODA)) {
            if (!((C104032ex) erVar.f289461o.mo27525b()).mo93928f(erVar.f289458l.mo93886h())) {
                return true;
            }
            return false;
        } else if (!ijVar.contains(vVar)) {
            return true;
        } else {
            return false;
        }
    }
}
