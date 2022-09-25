package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.ag */
/* compiled from: PG */
public final /* synthetic */ class C95958ag implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f268678a;

    public /* synthetic */ C95958ag(String str) {
        this.f268678a = str;
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
        String str = this.f268678a;
        C59071e eVar = C96017bm.f268828a;
        return ((NodeParcelable) obj).f395613a.equals(str);
    }
}
