package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.a */
/* compiled from: PG */
public final /* synthetic */ class C77746a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C77809n f214173a;

    public /* synthetic */ C77746a(C77809n nVar) {
        this.f214173a = nVar;
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
        return this.f214173a.f214341a.contains((String) obj);
    }
}
