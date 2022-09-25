package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16342ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.s */
/* compiled from: PG */
public final /* synthetic */ class C14930s implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14930s f44867a = new C14930s();

    private /* synthetic */ C14930s() {
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
        int a = C16342ap.m33337a(((C16344ar) obj).f48118c);
        return a != 0 && a == 3;
    }
}
