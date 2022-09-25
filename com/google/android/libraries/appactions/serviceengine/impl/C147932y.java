package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.Intent;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.y */
/* compiled from: PG */
public final /* synthetic */ class C147932y implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C147906ao f399011a;

    public /* synthetic */ C147932y(C147906ao aoVar) {
        this.f399011a = aoVar;
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
        return this.f399011a.mo124570g((Intent) obj, "com.instacart.client");
    }
}
