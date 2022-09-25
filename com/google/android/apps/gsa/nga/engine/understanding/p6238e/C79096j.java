package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.j */
/* compiled from: PG */
public final /* synthetic */ class C79096j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79096j f217477a = new C79096j();

    private /* synthetic */ C79096j() {
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
        int b = ((C74757n) obj).mo71152e().mo71143b();
        boolean z = b == 2;
        if (b != 0) {
            return z;
        }
        throw null;
    }
}
