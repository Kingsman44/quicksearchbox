package com.google.android.apps.gsa.nga.engine.recognition.p6136o;

import com.google.android.apps.gsa.nga.engine.recognition.C77562ao;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.o.a */
/* compiled from: PG */
public final /* synthetic */ class C77876a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C77876a f214531a = new C77876a();

    private /* synthetic */ C77876a() {
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
        return ((C77562ao) obj) != C77562ao.UNKNOWN;
    }
}
