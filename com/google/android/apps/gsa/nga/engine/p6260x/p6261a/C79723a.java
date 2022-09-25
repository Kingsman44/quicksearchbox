package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80294ap;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82988hw;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.a */
/* compiled from: PG */
public final /* synthetic */ class C79723a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79723a f218621a = new C79723a();

    private /* synthetic */ C79723a() {
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
        C82823bt btVar;
        C82885ea eaVar = ((C82889ee) obj).f226099d;
        if (eaVar == null) {
            eaVar = C82885ea.f225977c;
        }
        if (eaVar.f225979a == 29) {
            btVar = (C82823bt) eaVar.f225980b;
        } else {
            btVar = C82823bt.f225680i;
        }
        C82988hw hwVar = btVar.f225683b;
        if (hwVar == null) {
            hwVar = C82988hw.f226443y;
        }
        C80401n nVar = hwVar.f226470x;
        if (nVar == null) {
            nVar = C80401n.f220656k;
        }
        return C81442m.m129549k(nVar, C80294ap.FEEDBACK_OP).isPresent();
    }
}
