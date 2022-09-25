package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.av */
/* compiled from: PG */
public final /* synthetic */ class C103842av implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f289094a;

    public /* synthetic */ C103842av(String str) {
        this.f289094a = str;
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
        String str = this.f289094a;
        C58974d dVar = C103868bu.f289129a;
        return ((String) obj).startsWith(str);
    }
}
