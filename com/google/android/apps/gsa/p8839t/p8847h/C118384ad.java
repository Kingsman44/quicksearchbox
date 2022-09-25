package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4522b.C58487gw;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.t.h.ad */
/* compiled from: PG */
public final /* synthetic */ class C118384ad implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C118384ad f328610a = new C118384ad();

    private /* synthetic */ C118384ad() {
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
        C52560wg wgVar = (C52560wg) obj;
        C58487gw gwVar = C118426bs.f328679a;
        C52568wo woVar = wgVar.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if ((woVar.f137994a & 1024) == 0) {
            return false;
        }
        C52568wo woVar2 = wgVar.f137950f;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        C51012dc dcVar = woVar2.f138004k;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        if ((dcVar.f132815a & 2) != 0) {
            return true;
        }
        C52568wo woVar3 = wgVar.f137950f;
        if (woVar3 == null) {
            woVar3 = C52568wo.f137992v;
        }
        C51012dc dcVar2 = woVar3.f138004k;
        if (dcVar2 == null) {
            dcVar2 = C51012dc.f132813k;
        }
        if ((dcVar2.f132815a & 8) == 0) {
            return false;
        }
        return true;
    }
}
