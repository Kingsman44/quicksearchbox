package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63933bt;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63934bu;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.cc */
/* compiled from: PG */
public final /* synthetic */ class C136975cc implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C63934bu f372786a;

    /* renamed from: b */
    public final /* synthetic */ C63926bm f372787b;

    public /* synthetic */ C136975cc(C63934bu buVar, C63926bm bmVar) {
        this.f372786a = buVar;
        this.f372787b = bmVar;
    }

    public final Object apply(Object obj) {
        C63959w wVar;
        Object obj2;
        C63934bu buVar = this.f372786a;
        C63926bm bmVar = this.f372787b;
        C137007dh dhVar = (C137007dh) obj;
        C58974d dVar = C137003dd.f372837a;
        C63926bm a = C63926bm.m96318a(dhVar.f372874d);
        if (a == null) {
            a = C63926bm.UNSPECIFIED;
        }
        if (dhVar.f372872b == 2) {
            wVar = (C63959w) dhVar.f372873c;
        } else {
            wVar = C63959w.f172981b;
        }
        C62940bt r4 = C62942bv.checkIsLite(C63933bt.f172893e);
        wVar.mo58887l(r4);
        Object l = wVar.f169962ag.mo58854l(r4.f169971d);
        if (l == null) {
            obj2 = r4.f169969b;
        } else {
            obj2 = r4.mo58889c(l);
        }
        int i = ((C63933bt) obj2).f172895a;
        C63958v vVar = C63958v.TOOLTIP;
        C63958v a2 = C63958v.m96327a(wVar.f172983a);
        if (a2 == null) {
            a2 = C63958v.TYPE_UNSPECIFIED;
        }
        return (!vVar.equals(a2) || i == 0 || i != buVar.f172907h || a == C63926bm.UNSPECIFIED || a != bmVar) ? C137007dh.f372869h : dhVar;
    }
}
