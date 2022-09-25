package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import com.google.p4184bj.p4193c.p4201f.C56002b;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.y */
/* compiled from: PG */
public final /* synthetic */ class C36750y implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f95760a;

    public /* synthetic */ C36750y(List list) {
        this.f95760a = list;
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
        return !this.f95760a.contains((C56002b) obj);
    }
}
