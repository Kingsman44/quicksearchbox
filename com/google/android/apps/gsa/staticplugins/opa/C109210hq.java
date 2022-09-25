package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107554c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107542u;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107545x;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11300h;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.p640a.C11292a;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonField;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq */
/* compiled from: PG */
final class C109210hq implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C109258hw f304068a;

    public C109210hq(C109258hw hwVar) {
        this.f304068a = hwVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        Object obj;
        C11300h hVar;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 112) {
            C62940bt btVar = C107505a.f299120a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r1 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r1);
            if (!uoVar.f169962ag.mo58857o(r1.f169971d)) {
                ((C59052c) ((C59052c) C109258hw.f304227a.mo56226d()).mo56372aa(22741)).mo56389s("onServiceEvent: %s missing OpaSessionServiceEvent extension", a);
                return;
            }
            C107556e eVar = (C107556e) serviceEventData.mo81918e(C107505a.f299120a);
            C109258hw hwVar = this.f304068a;
            int a2 = C107554c.m178398a(eVar.f299213b);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 - 1 == 21) {
                C62940bt r12 = C62942bv.checkIsLite(C107545x.f299195a);
                eVar.mo58887l(r12);
                if (eVar.f169962ag.mo58857o(r12.f169971d)) {
                    C62940bt r13 = C62942bv.checkIsLite(C107545x.f299195a);
                    eVar.mo58887l(r13);
                    Object l = eVar.f169962ag.mo58854l(r13.f169971d);
                    if (l == null) {
                        obj = r13.f169969b;
                    } else {
                        obj = r13.mo58889c(l);
                    }
                    if ((((C107542u) obj).f299191a & 1) != 0 && (hVar = hwVar.f304293p) != null && (hVar instanceof C11292a)) {
                        for (ButtonField buttonField : ((C11292a) hVar).f36722a.f36709d) {
                            buttonField.f36920c.mo19777a();
                        }
                    }
                }
            }
        } else if (ordinal == 184) {
            if (!serviceEventData.mo81913d(Query.class)) {
                ((C59052c) ((C59052c) C109258hw.f304227a.mo56226d()).mo56372aa(22742)).mo56389s("onServiceEvent: %s missing Query parcelable", a);
                return;
            }
            Query query = (Query) serviceEventData.mo81912b(Query.class);
            if (this.f304068a.f304298u.mo56113h() && !((Long) this.f304068a.f304298u.mo56107c()).equals(Long.valueOf(query.f252780s))) {
                this.f304068a.f304280c.mo95362D();
            }
        }
    }
}
