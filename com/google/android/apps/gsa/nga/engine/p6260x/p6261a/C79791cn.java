package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.cn */
/* compiled from: PG */
public final /* synthetic */ class C79791cn implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79791cn f218773a = new C79791cn();

    private /* synthetic */ C79791cn() {
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
        C80484i iVar;
        C82885ea eaVar = ((C82889ee) obj).f226099d;
        if (eaVar == null) {
            eaVar = C82885ea.f225977c;
        }
        if (eaVar.f225979a == 1) {
            iVar = (C80484i) eaVar.f225980b;
        } else {
            iVar = C80484i.f220937h;
        }
        if (!iVar.f220939a.contains("feedback")) {
            return true;
        }
        return false;
    }
}
