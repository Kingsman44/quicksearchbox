package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.assistant.p3803ag.p3809c.C49109gu;
import com.google.assistant.p3994s.p3995a.C53306j;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.d */
/* compiled from: PG */
public final /* synthetic */ class C18681d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f52716a;

    public /* synthetic */ C18681d(Set set) {
        this.f52716a = set;
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
        Set set = this.f52716a;
        C53306j a = C53306j.m86809a(((C49109gu) obj).f127016d);
        if (a == null) {
            a = C53306j.UNKNOWNN;
        }
        return !set.contains(a);
    }
}
