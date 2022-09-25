package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v;
import java.util.List;
import p3186j$.util.Collection;
import p5535j.p5536a.p5545c.p5547b.C70970a;
import p5535j.p5536a.p5545c.p5547b.C70971b;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.ch */
/* compiled from: PG */
public final /* synthetic */ class C136980ch implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137003dd f372795a;

    /* renamed from: b */
    public final /* synthetic */ C137009dj f372796b;

    public /* synthetic */ C136980ch(C137003dd ddVar, C137009dj djVar) {
        this.f372795a = ddVar;
        this.f372796b = djVar;
    }

    public final Object apply(Object obj) {
        C137003dd ddVar = this.f372795a;
        C137009dj djVar = this.f372796b;
        List list = (List) obj;
        if (!list.isEmpty()) {
            C37259h d = C37182a.f98183hr.mo40806d();
            C63926bm a = C63926bm.m96318a(djVar.f372882b);
            if (a == null) {
                a = C63926bm.UNSPECIFIED;
            }
            C70970a aVar = (C70970a) C70971b.f189249k.createBuilder();
            aVar.mo62595a((C58485gu) Collection.EL.stream(list).map(C136996cx.f372821a).collect(C58370cn.f155946a));
            aVar.copyOnWrite();
            C70971b bVar = (C70971b) aVar.instance;
            bVar.f189257f = a.f172871h;
            bVar.f189252a |= 16;
            C63958v vVar = C63958v.DISCOVER_TOOLTIP;
            aVar.copyOnWrite();
            C70971b bVar2 = (C70971b) aVar.instance;
            bVar2.f189258g = vVar.f172980h;
            bVar2.f189252a |= 32;
            C37252a e = d.mo40781e(C62722b.OK);
            ((C37253b) e).mo40792p(C70971b.f189250l, (C70971b) aVar.build());
            ddVar.f372849l.mo19974a(e);
        }
        return list;
    }
}
