package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.ci */
/* compiled from: PG */
public final /* synthetic */ class C106928ci implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f297850a;

    public /* synthetic */ C106928ci(C58528ij ijVar) {
        this.f297850a = ijVar;
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
        C58528ij ijVar = this.f297850a;
        Optional f = ((C130701b) obj).mo109795f();
        Objects.requireNonNull(ijVar);
        return ((Boolean) f.map(new C106939ct(ijVar)).orElse(false)).booleanValue();
    }
}
