package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.base.C58833ax;
import com.google.speech.p5218j.C66964g;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.v */
/* compiled from: PG */
public final /* synthetic */ class C10960v implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f36082a;

    public /* synthetic */ C10960v(C58833ax axVar) {
        this.f36082a = axVar;
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
        return ((Boolean) this.f36082a.mo56106b(new C10957s((C66964g) obj)).mo56109e(true)).booleanValue();
    }
}
