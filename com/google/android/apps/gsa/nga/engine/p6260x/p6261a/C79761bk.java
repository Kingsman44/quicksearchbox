package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.evernote.android.state.BuildConfig;
import com.google.p4140ba.p4147b.p4148a.p4149a.C54940e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bk */
/* compiled from: PG */
public final /* synthetic */ class C79761bk implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79761bk f218690a = new C79761bk();

    private /* synthetic */ C79761bk() {
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
        C54940e eVar = (C54940e) obj;
        return (eVar.f144435a == 2 ? (String) eVar.f144436b : BuildConfig.FLAVOR).equals("UnintendedInvocation");
    }
}
