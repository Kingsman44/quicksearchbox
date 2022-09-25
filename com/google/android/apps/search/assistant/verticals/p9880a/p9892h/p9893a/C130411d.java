package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9893a;

import android.content.pm.ShortcutInfo;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.a.d */
/* compiled from: PG */
public final /* synthetic */ class C130411d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f357362a;

    public /* synthetic */ C130411d(C58528ij ijVar) {
        this.f357362a = ijVar;
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
        return this.f357362a.contains(((ShortcutInfo) obj).getPackage());
    }
}
