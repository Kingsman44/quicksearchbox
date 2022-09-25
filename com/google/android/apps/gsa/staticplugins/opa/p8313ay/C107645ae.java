package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import com.google.android.apps.gsa.opa.C83607e;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88099pc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88101pe;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8545i.C112078c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.ae */
/* compiled from: PG */
final class C107645ae implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C107656ap f299477a;

    public C107645ae(C107656ap apVar) {
        this.f299477a = apVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C112078c cVar;
        C83607e eVar = C83607e.UNDEFINED;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a.ordinal() == 152) {
            C58976aa aaVar = C58975e.f156826a;
            C62940bt btVar = C88099pc.f238189a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (uoVar.f169962ag.mo58857o(r0.f169971d)) {
                C88101pe peVar = (C88101pe) serviceEventData.mo81918e(C88099pc.f238189a);
                boolean z = true;
                if ((peVar.f238192a & 1) == 0 || !peVar.f238193b) {
                    z = false;
                }
                if (!this.f299477a.f299582e.mo79746e(C90063do.f249512et) && (cVar = this.f299477a.f299510S) != null) {
                    C112078c cVar2 = cVar;
                    cVar2.f311257h = z;
                    if (z) {
                        cVar2.mo99353d();
                    }
                }
            }
        }
    }
}
