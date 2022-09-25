package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.dx */
/* compiled from: PG */
public final /* synthetic */ class C77252dx implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f213101a;

    public /* synthetic */ C77252dx(Optional optional) {
        this.f213101a = optional;
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
        C51592nk nkVar = (C51592nk) obj;
        return (nkVar.f134464a & 32) != 0 && C80884a.m128736a(nkVar.f134470g).equals(this.f213101a.get());
    }
}
