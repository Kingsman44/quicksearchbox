package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.al */
/* compiled from: PG */
public final /* synthetic */ class C77159al implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ boolean f212934a;

    public /* synthetic */ C77159al(boolean z) {
        this.f212934a = z;
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
        boolean z = this.f212934a;
        Duration duration = C77160am.f212935a;
        return (((C51473j) obj).f134093b == 4) == z;
    }
}
