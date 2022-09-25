package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.e.i */
/* compiled from: PG */
public final /* synthetic */ class C18658i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f52690a;

    public /* synthetic */ C18658i(Set set) {
        this.f52690a = set;
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
        return this.f52690a.contains((C18579g) obj);
    }
}
