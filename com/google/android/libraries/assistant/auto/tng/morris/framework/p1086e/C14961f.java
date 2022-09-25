package com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14636z;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e.f */
/* compiled from: PG */
public final /* synthetic */ class C14961f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f44925a;

    public /* synthetic */ C14961f(long j) {
        this.f44925a = j;
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
        long j = this.f44925a;
        C59071e eVar = C14962g.f44926a;
        return ((C14636z) obj).f44234c == j;
    }
}
