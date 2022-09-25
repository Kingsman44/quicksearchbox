package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import android.net.Uri;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C78927i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C78927i f217154a = new C78927i();

    private /* synthetic */ C78927i() {
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
        int i = C78930l.f217158c;
        return ((Uri) obj).getHost() != null;
    }
}
