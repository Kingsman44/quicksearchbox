package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.b.u */
/* compiled from: PG */
public final /* synthetic */ class C18550u implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f52556a;

    public /* synthetic */ C18550u(Set set) {
        this.f52556a = set;
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
        return this.f52556a.contains((C18579g) obj);
    }
}
