package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48734p;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.o */
/* compiled from: PG */
public final /* synthetic */ class C75729o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ boolean f210196a;

    public /* synthetic */ C75729o(boolean z) {
        this.f210196a = z;
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
        boolean z = this.f210196a;
        boolean z2 = ((C48734p) obj).f126110d;
        return z ? z2 : !z2;
    }
}
