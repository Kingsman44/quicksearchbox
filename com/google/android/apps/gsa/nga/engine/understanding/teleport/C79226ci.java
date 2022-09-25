package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p001a.p014d.p015a.p016a.C0065j;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ci */
/* compiled from: PG */
public final /* synthetic */ class C79226ci implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f217696a;

    /* renamed from: b */
    public final /* synthetic */ String f217697b;

    public /* synthetic */ C79226ci(String str, String str2) {
        this.f217696a = str;
        this.f217697b = str2;
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
        C0065j jVar = (C0065j) obj;
        return jVar.f178e.equals(this.f217696a) || jVar.f179f.equals(this.f217697b);
    }
}
