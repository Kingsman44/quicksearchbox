package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79574f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.a */
/* compiled from: PG */
public final /* synthetic */ class C79404a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C79570b f218042a;

    public /* synthetic */ C79404a(C79570b bVar) {
        this.f218042a = bVar;
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
        C79570b bVar = this.f218042a;
        C79570b a = C79570b.m127648a(((C79574f) obj).f218349c);
        if (a == null) {
            a = C79570b.CONTEXT_TYPE_UNSPECIFIED;
        }
        return bVar.equals(a);
    }
}
