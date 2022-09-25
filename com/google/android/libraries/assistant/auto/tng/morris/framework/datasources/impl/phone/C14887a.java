package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14594p;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.a */
/* compiled from: PG */
public final /* synthetic */ class C14887a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C14905d f44787a;

    public /* synthetic */ C14887a(C14905d dVar) {
        this.f44787a = dVar;
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
        return this.f44787a.mo21818f((C14594p) obj);
    }
}
