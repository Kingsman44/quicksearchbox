package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import com.google.assistant.p3886c.C50818do;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.g */
/* compiled from: PG */
public final /* synthetic */ class C131238g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f358872a;

    public /* synthetic */ C131238g(Set set) {
        this.f358872a = set;
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
        return !this.f358872a.contains((C50818do) obj);
    }
}
