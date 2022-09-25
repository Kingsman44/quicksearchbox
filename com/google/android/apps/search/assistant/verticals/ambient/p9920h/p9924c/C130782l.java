package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130696a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.assistant.p3860as.C49783bs;
import com.google.assistant.p3860as.C49784bt;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.l */
/* compiled from: PG */
public final /* synthetic */ class C130782l implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C130782l f358003a = new C130782l();

    private /* synthetic */ C130782l() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C130701b bVar = (C130701b) obj;
        C130701b bVar2 = (C130701b) obj2;
        C130696a b = C130701b.m213087b();
        b.mo109786b(bVar2.mo109797h());
        b.mo109787c(bVar.mo109791a() + bVar2.mo109791a());
        C49784bt d = bVar.mo109793d();
        C49784bt d2 = bVar2.mo109793d();
        C49783bs bsVar = (C49783bs) C49784bt.f128552i.createBuilder();
        boolean z = true;
        if (!((d.f128554a & 1) == 0 && (d2.f128554a & 1) == 0)) {
            double d3 = d.f128555b;
            double d4 = d2.f128555b;
            bsVar.copyOnWrite();
            C49784bt btVar = (C49784bt) bsVar.instance;
            btVar.f128554a |= 1;
            btVar.f128555b = d3 + d4;
        }
        if (!((d.f128554a & 2) == 0 && (d2.f128554a & 2) == 0)) {
            double d5 = d.f128556c;
            double d6 = d2.f128556c;
            bsVar.copyOnWrite();
            C49784bt btVar2 = (C49784bt) bsVar.instance;
            btVar2.f128554a |= 2;
            btVar2.f128556c = d5 + d6;
        }
        if (!((d.f128554a & 4) == 0 && (d2.f128554a & 4) == 0)) {
            double d7 = d.f128557d;
            double d8 = d2.f128557d;
            bsVar.copyOnWrite();
            C49784bt btVar3 = (C49784bt) bsVar.instance;
            btVar3.f128554a |= 4;
            btVar3.f128557d = d7 + d8;
        }
        if (!((d.f128554a & 8) == 0 && (d2.f128554a & 8) == 0)) {
            double d9 = d.f128558e;
            double d10 = d2.f128558e;
            bsVar.copyOnWrite();
            C49784bt btVar4 = (C49784bt) bsVar.instance;
            btVar4.f128554a |= 8;
            btVar4.f128558e = d9 + d10;
        }
        if (!((d.f128554a & 32) == 0 && (d2.f128554a & 32) == 0)) {
            double d11 = d.f128559f;
            double d12 = d2.f128559f;
            bsVar.copyOnWrite();
            C49784bt btVar5 = (C49784bt) bsVar.instance;
            btVar5.f128554a |= 32;
            btVar5.f128559f = d11 + d12;
        }
        if (!((d.f128554a & 64) == 0 && (d2.f128554a & 64) == 0)) {
            double d13 = d.f128560g;
            double d14 = d2.f128560g;
            bsVar.copyOnWrite();
            C49784bt btVar6 = (C49784bt) bsVar.instance;
            btVar6.f128554a |= 64;
            btVar6.f128560g = d13 + d14;
        }
        if (!((d.f128554a & 128) == 0 && (d2.f128554a & 128) == 0)) {
            if (!d.f128561h && !d2.f128561h) {
                z = false;
            }
            bsVar.copyOnWrite();
            C49784bt btVar7 = (C49784bt) bsVar.instance;
            btVar7.f128554a |= 128;
            btVar7.f128561h = z;
        }
        b.mo109788d((C49784bt) bsVar.build());
        return b.mo109785a();
    }
}
