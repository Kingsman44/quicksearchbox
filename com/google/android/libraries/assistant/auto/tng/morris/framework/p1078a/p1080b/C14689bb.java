package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14594p;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bb */
/* compiled from: PG */
public final /* synthetic */ class C14689bb implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C14693bf f44368a;

    public /* synthetic */ C14689bb(C14693bf bfVar) {
        this.f44368a = bfVar;
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
        return (C15388p.m32014a((C14594p) obj) & this.f44368a.f44396r.f44373d) != 0;
    }
}
