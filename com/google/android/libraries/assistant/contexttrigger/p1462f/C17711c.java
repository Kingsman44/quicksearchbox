package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.assistant.p3803ag.p3807b.p3808a.C48922x;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.c */
/* compiled from: PG */
public final /* synthetic */ class C17711c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C17711c f50909a = new C17711c();

    private /* synthetic */ C17711c() {
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
        return ((C48922x) obj).equals(C48922x.ACTIVE);
    }
}
