package com.google.android.apps.search.assistant.verticals.contextdebug;

import com.google.android.libraries.search.assistant.p2566g.C33425t;
import com.google.android.libraries.search.assistant.p2566g.C33427v;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.o */
/* compiled from: PG */
public final /* synthetic */ class C132045o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f360414a;

    public /* synthetic */ C132045o(C58528ij ijVar) {
        this.f360414a = ijVar;
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
        C58528ij ijVar = this.f360414a;
        C33425t a = C33425t.m62009a(((C33427v) obj).f89526b);
        if (a == null) {
            a = C33425t.ENTRY_UNDEFINED;
        }
        return ijVar.contains(a);
    }
}
