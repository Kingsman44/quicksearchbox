package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ay */
/* compiled from: PG */
public final /* synthetic */ class C79188ay implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f217652a;

    public /* synthetic */ C79188ay(String str) {
        this.f217652a = str;
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
        String str = this.f217652a;
        int i = C79204bn.f217670a;
        return ((C79211bu) obj).mo73833b().startsWith(str);
    }
}
