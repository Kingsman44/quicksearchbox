package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.android.apps.gsa.nga.engine.understanding.C79330v;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.ao */
/* compiled from: PG */
public final /* synthetic */ class C76571ao implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String[] f211808a;

    /* renamed from: b */
    public final /* synthetic */ int f211809b;

    public /* synthetic */ C76571ao(String[] strArr, int i) {
        this.f211808a = strArr;
        this.f211809b = i;
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
        return ((C76590bg) obj).f211838b.equals(C79330v.m127277b(this.f211808a[this.f211809b + 1]));
    }
}
