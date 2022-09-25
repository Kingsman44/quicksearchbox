package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.as */
/* compiled from: PG */
public final /* synthetic */ class C14804as implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ ConcurrentHashMap f44601a;

    public /* synthetic */ C14804as(ConcurrentHashMap concurrentHashMap) {
        this.f44601a = concurrentHashMap;
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
        return this.f44601a.containsKey((Integer) obj);
    }
}
