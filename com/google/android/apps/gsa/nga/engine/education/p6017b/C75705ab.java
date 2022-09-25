package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C75705ab implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C75706ac f210149a;

    public /* synthetic */ C75705ab(C75706ac acVar) {
        this.f210149a = acVar;
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
        return !this.f210149a.f210153d.mo74882ac(((C75650ai) obj).mo71806j());
    }
}
