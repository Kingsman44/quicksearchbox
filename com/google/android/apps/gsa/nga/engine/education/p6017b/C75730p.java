package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48734p;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.p */
/* compiled from: PG */
public final /* synthetic */ class C75730p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C75706ac f210197a;

    /* renamed from: b */
    public final /* synthetic */ long f210198b;

    /* renamed from: c */
    public final /* synthetic */ String f210199c;

    public /* synthetic */ C75730p(C75706ac acVar, long j, String str) {
        this.f210197a = acVar;
        this.f210198b = j;
        this.f210199c = str;
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
        return !this.f210197a.mo71861j(((C48734p) obj).f126108b, this.f210198b, this.f210199c);
    }
}
