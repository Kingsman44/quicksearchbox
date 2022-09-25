package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1064c;

import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.assistant.p3897e.p3921j.C52565wl;
import com.google.assistant.p3897e.p3921j.C52568wo;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.a */
/* compiled from: PG */
public final /* synthetic */ class C14029a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f42645a;

    public /* synthetic */ C14029a(long j) {
        this.f42645a = j;
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
        long j = this.f42645a;
        C52174hz hzVar = (C52174hz) obj;
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52565wl wlVar = woVar.f138009p;
        if (wlVar == null) {
            wlVar = C52565wl.f137961c;
        }
        if ((wlVar.f137963a & 2) == 0) {
            return false;
        }
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        C52565wl wlVar2 = woVar2.f138009p;
        if (wlVar2 == null) {
            wlVar2 = C52565wl.f137961c;
        }
        C52407qp qpVar = wlVar2.f137964b;
        if (qpVar == null) {
            qpVar = C52407qp.f137523d;
        }
        return qpVar.f137526b < j;
    }
}
