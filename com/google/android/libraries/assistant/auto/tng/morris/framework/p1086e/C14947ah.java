package com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14636z;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e.ah */
/* compiled from: PG */
public final /* synthetic */ class C14947ah implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f44900a;

    public /* synthetic */ C14947ah(long j) {
        this.f44900a = j;
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
        return ((C14636z) obj).f44234c == this.f44900a;
    }
}
