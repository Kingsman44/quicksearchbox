package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14988j;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.ac */
/* compiled from: PG */
public final /* synthetic */ class C14753ac implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C14988j f44527a;

    public /* synthetic */ C14753ac(C14988j jVar) {
        this.f44527a = jVar;
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
        C14988j jVar = (C14988j) obj;
        if (jVar.mo21616a() >= this.f44527a.mo21616a()) {
            return false;
        }
        int d = jVar.mo21619d();
        if (d != 0) {
            return d == 3;
        }
        throw null;
    }
}
