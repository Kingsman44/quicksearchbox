package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.s */
/* compiled from: PG */
public final /* synthetic */ class C75733s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C75706ac f210204a;

    /* renamed from: b */
    public final /* synthetic */ Instant f210205b;

    public /* synthetic */ C75733s(C75706ac acVar, Instant instant) {
        this.f210204a = acVar;
        this.f210205b = instant;
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
        C75706ac acVar = this.f210204a;
        return ((Boolean) acVar.f210153d.mo74877Y(((C75650ai) obj).mo71806j()).map(new C75739y(acVar, this.f210205b)).orElse(true)).booleanValue();
    }
}
