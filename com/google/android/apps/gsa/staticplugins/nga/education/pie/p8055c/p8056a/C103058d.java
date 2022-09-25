package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.p8056a;

import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81367m;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81368n;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82489hb;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82718po;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82719pp;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.C103097o;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C103058d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C103076v f287679a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f287680b;

    public /* synthetic */ C103058d(C103076v vVar, C58495hd hdVar) {
        this.f287679a = vVar;
        this.f287680b = hdVar;
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
        C103076v vVar = this.f287679a;
        C58495hd hdVar = this.f287680b;
        C103097o oVar = (C103097o) obj;
        boolean z = true;
        if (hdVar.containsKey(oVar.mo93607b())) {
            if (C81367m.m129421a(((C81368n) hdVar.getOrDefault(oVar.mo93607b(), C81368n.f222701e)).f222704b) != 2) {
                z = false;
            }
            if (!z) {
                oVar.mo93607b();
                C83305i iVar = vVar.f287708e;
                C82718po f = C82719pp.m132240f();
                f.mo76447b(oVar.mo93607b().name());
                ((C82489hb) f).f225395b = "USECASE_INACTIVE_DROPPED";
                iVar.mo75579d(f.mo76446a());
            }
        }
        return z;
    }
}
