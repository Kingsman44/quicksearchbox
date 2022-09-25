package com.google.android.apps.gsa.shared.monet;

import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87987kz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87991lc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88002ln;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88003lo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88028mm;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.common.p4575r.C60757n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.monet.w */
/* compiled from: PG */
final class C90352w implements C91078e {

    /* renamed from: a */
    final /* synthetic */ C88028mm f252337a;

    /* renamed from: b */
    final /* synthetic */ C90353x f252338b;

    public C90352w(C90353x xVar, C88028mm mmVar) {
        this.f252338b = xVar;
        this.f252337a = mmVar;
    }

    /* renamed from: a */
    public final void mo18206a(String[] strArr, int[] iArr) {
        C87991lc lcVar = (C87991lc) C88012lx.f238010e.createBuilder();
        String str = this.f252338b.f252339a.f252332a;
        lcVar.copyOnWrite();
        C88012lx lxVar = (C88012lx) lcVar.instance;
        str.getClass();
        lxVar.f238012a |= 512;
        lxVar.f238015d = str;
        C88002ln lnVar = (C88002ln) C88003lo.f237985e.createBuilder();
        int i = this.f252337a.f238040b;
        lnVar.copyOnWrite();
        C88003lo loVar = (C88003lo) lnVar.instance;
        loVar.f237987a |= 1;
        loVar.f237988b = i;
        List asList = Arrays.asList(strArr);
        lnVar.copyOnWrite();
        C88003lo loVar2 = (C88003lo) lnVar.instance;
        C62971cq cqVar = loVar2.f237989c;
        if (!cqVar.mo58948c()) {
            loVar2.f237989c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) asList, (List) loVar2.f237989c);
        List j = C60757n.m92749j(iArr);
        lnVar.copyOnWrite();
        C88003lo loVar3 = (C88003lo) lnVar.instance;
        C62961ch chVar = loVar3.f237990d;
        if (!chVar.mo58948c()) {
            loVar3.f237990d = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) j, (List) loVar3.f237990d);
        C88003lo loVar4 = (C88003lo) lnVar.build();
        lcVar.copyOnWrite();
        C88012lx lxVar2 = (C88012lx) lcVar.instance;
        loVar4.getClass();
        lxVar2.f238014c = loVar4;
        lxVar2.f238013b = 10;
        C87680ah ahVar = this.f252338b.f252341c;
        C88489j jVar = new C88489j(C87739bu.MONET_CLIENT_EVENT);
        jVar.mo82014b(C87987kz.f237952a, (C88012lx) lcVar.build());
        ahVar.mo81961c(jVar.mo82013a());
    }
}
