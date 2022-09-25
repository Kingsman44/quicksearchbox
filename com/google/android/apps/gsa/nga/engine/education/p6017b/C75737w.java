package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.w */
/* compiled from: PG */
public final /* synthetic */ class C75737w implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C75706ac f210209a;

    public /* synthetic */ C75737w(C75706ac acVar) {
        this.f210209a = acVar;
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
        return !this.f210209a.f210153d.mo74883ad(((C75650ai) obj).mo71806j());
    }
}
