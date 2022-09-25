package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1223d;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16353b;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.c.d.b */
/* compiled from: PG */
public final /* synthetic */ class C15999b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f47408a;

    public /* synthetic */ C15999b(C58528ij ijVar) {
        this.f47408a = ijVar;
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
        C58528ij ijVar = this.f47408a;
        C58528ij ijVar2 = C16001d.f47410a;
        return ijVar.contains(((C16353b) obj).f48135a);
    }
}
