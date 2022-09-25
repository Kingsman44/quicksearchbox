package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82963gy;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.i */
/* compiled from: PG */
public final /* synthetic */ class C79825i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79825i f218896a = new C79825i();

    private /* synthetic */ C79825i() {
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
        C82964gz gzVar;
        C82885ea eaVar = ((C82889ee) obj).f226099d;
        if (eaVar == null) {
            eaVar = C82885ea.f225977c;
        }
        if (eaVar.f225979a == 13) {
            gzVar = (C82964gz) eaVar.f225980b;
        } else {
            gzVar = C82964gz.f226343j;
        }
        int a = C82963gy.m132440a(gzVar.f226346b);
        return a != 0 && a == 6;
    }
}
