package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82876ds;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bm */
/* compiled from: PG */
public final /* synthetic */ class C79763bm implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79763bm f218692a = new C79763bm();

    private /* synthetic */ C79763bm() {
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
        C82876ds dsVar;
        C82885ea eaVar = ((C82889ee) obj).f226099d;
        if (eaVar == null) {
            eaVar = C82885ea.f225977c;
        }
        if (eaVar.f225979a == 36) {
            dsVar = (C82876ds) eaVar.f225980b;
        } else {
            dsVar = C82876ds.f225961e;
        }
        C51544lq lqVar = dsVar.f225966d;
        if (lqVar == null) {
            lqVar = C51544lq.f134342j;
        }
        return lqVar.f134350g;
    }
}
