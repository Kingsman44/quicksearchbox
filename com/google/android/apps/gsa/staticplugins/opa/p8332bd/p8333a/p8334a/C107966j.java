package com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bd.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C107966j implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C107970n f300405a;

    /* renamed from: b */
    public final /* synthetic */ List f300406b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f300407c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f300408d;

    /* renamed from: e */
    public final /* synthetic */ C58833ax f300409e;

    public /* synthetic */ C107966j(C107970n nVar, List list, C58833ax axVar, C53306j jVar, C58833ax axVar2) {
        this.f300405a = nVar;
        this.f300406b = list;
        this.f300407c = axVar;
        this.f300408d = jVar;
        this.f300409e = axVar2;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C60870cx cxVar;
        C107970n nVar = this.f300405a;
        List list = this.f300406b;
        C58833ax axVar = this.f300407c;
        C53306j jVar = this.f300408d;
        C58833ax axVar2 = this.f300409e;
        if (list.isEmpty()) {
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            cxVar = nVar.f300431j.mo28209i(C60856cj.m92906o((List) Collection.EL.stream(list).map(new C107963g(nVar)).collect(C58370cn.f155946a)), "Get pn-device media recommendations", new C107964h(nVar.f300432k.mo26870b() - (nVar.f300433l * 1000), list));
        }
        new C90873ag(cxVar, nVar.f300431j, "Can fetch from cache future", new C107968l(nVar, axVar, jVar, cVar, axVar2, list)).mo85223a(new C107969m(nVar, axVar2, jVar, cVar));
        return "Retrieve on-device media";
    }
}
