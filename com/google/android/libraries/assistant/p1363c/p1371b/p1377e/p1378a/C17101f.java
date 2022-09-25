package com.google.android.libraries.assistant.p1363c.p1371b.p1377e.p1378a;

import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.c.b.e.a.f */
/* compiled from: PG */
public final /* synthetic */ class C17101f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f49769a;

    public /* synthetic */ C17101f(Optional optional) {
        this.f49769a = optional;
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
        return ((Boolean) this.f49769a.map(new C17099d((C10882h) obj)).orElse(true)).booleanValue();
    }
}
