package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.content.pm.ResolveInfo;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.r */
/* compiled from: PG */
public final /* synthetic */ class C139817r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f380030a;

    public /* synthetic */ C139817r(C58528ij ijVar) {
        this.f380030a = ijVar;
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
        return C139820u.m227327e((ResolveInfo) obj, this.f380030a);
    }
}
