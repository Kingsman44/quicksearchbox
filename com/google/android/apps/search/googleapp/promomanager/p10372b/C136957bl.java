package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137041j;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C63042fg;
import com.google.protos.p4880aq.C63739ba;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import java.util.List;
import p3186j$.util.Collection;
import p5535j.p5536a.p5545c.p5547b.C70970a;
import p5535j.p5536a.p5545c.p5547b.C70971b;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.bl */
/* compiled from: PG */
public final /* synthetic */ class C136957bl implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136958bm f372730a;

    /* renamed from: b */
    public final /* synthetic */ C137041j f372731b;

    /* renamed from: c */
    public final /* synthetic */ C137009dj f372732c;

    public /* synthetic */ C136957bl(C136958bm bmVar, C137041j jVar, C137009dj djVar) {
        this.f372730a = bmVar;
        this.f372731b = jVar;
        this.f372732c = djVar;
    }

    public final Object apply(Object obj) {
        C136958bm bmVar = this.f372730a;
        C137041j jVar = this.f372731b;
        C137009dj djVar = this.f372732c;
        List list = (List) obj;
        if (!list.isEmpty()) {
            C37259h d = C37182a.f98183hr.mo40806d();
            C63926bm a = C63926bm.m96318a(djVar.f372882b);
            if (a == null) {
                a = C63926bm.UNSPECIFIED;
            }
            C70970a aVar = (C70970a) C70971b.f189249k.createBuilder();
            aVar.mo62595a((C58485gu) Collection.EL.stream(list).map(C136943ay.f372703a).collect(C58370cn.f155946a));
            C63042fg fgVar = jVar.f372946f;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            aVar.copyOnWrite();
            C70971b bVar = (C70971b) aVar.instance;
            fgVar.getClass();
            bVar.f189260i = fgVar;
            bVar.f189252a |= 128;
            C63739ba a2 = C136959bn.m222628a(a);
            aVar.copyOnWrite();
            C70971b bVar2 = (C70971b) aVar.instance;
            bVar2.f189256e = a2.f172434i;
            bVar2.f189252a |= 8;
            C37252a e = d.mo40781e(C62722b.OK);
            ((C37253b) e).mo40792p(C70971b.f189250l, (C70971b) aVar.build());
            bmVar.f372755o.mo19974a(e);
        }
        return list;
    }
}
