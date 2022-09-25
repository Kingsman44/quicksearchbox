package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.assistant.p3793ae.p3794a.C48773e;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.b */
/* compiled from: PG */
public final /* synthetic */ class C103927b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f289259a;

    public /* synthetic */ C103927b(String str) {
        this.f289259a = str;
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
        String str = this.f289259a;
        C58974d dVar = C104123t.f289645a;
        return ((C48773e) obj).f126200a.equals(str);
    }
}
