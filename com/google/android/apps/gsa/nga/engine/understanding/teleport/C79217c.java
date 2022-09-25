package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.c */
/* compiled from: PG */
public final /* synthetic */ class C79217c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79217c f217681a = new C79217c();

    private /* synthetic */ C79217c() {
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
        C80080z a = C80080z.m128077a(((C80047aa) obj).f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        return a.equals(C80080z.WEBREF);
    }
}
