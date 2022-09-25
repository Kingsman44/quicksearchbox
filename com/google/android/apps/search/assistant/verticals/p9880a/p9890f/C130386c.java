package com.google.android.apps.search.assistant.verticals.p9880a.p9890f;

import com.google.assistant.p3825an.p3830c.p3831a.C49335l;
import com.google.assistant.p3825an.p3830c.p3831a.C49339p;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.f.c */
/* compiled from: PG */
public final /* synthetic */ class C130386c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f357321a;

    public /* synthetic */ C130386c(String str) {
        this.f357321a = str;
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
        String str = this.f357321a;
        int i = C130390g.f357325a;
        C49335l lVar = ((C49339p) obj).f127533b;
        if (lVar == null) {
            lVar = C49335l.f127511o;
        }
        return str.equals(lVar.f127525m);
    }
}
