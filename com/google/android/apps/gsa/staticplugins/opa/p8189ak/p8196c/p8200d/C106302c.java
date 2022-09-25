package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8200d;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107554c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107539r;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107540s;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.d.c */
/* compiled from: PG */
public final /* synthetic */ class C106302c implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ C106304e f296577a;

    public /* synthetic */ C106302c(C106304e eVar) {
        this.f296577a = eVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        Object obj;
        C106304e eVar = this.f296577a;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a.ordinal() == 112) {
            C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a2 == null) {
                a2 = C88244um.ATTACH_WEBVIEW;
            }
            C62940bt btVar = C107505a.f299120a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r2 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r2);
            if (!uoVar.f169962ag.mo58857o(r2.f169971d)) {
                ((C59052c) ((C59052c) C106304e.f296579a.mo56226d()).mo56372aa(25223)).mo56389s("onServiceEvent: %s missing OpaSessionServiceEvent extension", a2);
                return;
            }
            C107556e eVar2 = (C107556e) serviceEventData.mo81918e(C107505a.f299120a);
            int a3 = C107554c.m178398a(eVar2.f299213b);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a3 - 1 == 17) {
                C62940bt r1 = C62942bv.checkIsLite(C107540s.f299188a);
                eVar2.mo58887l(r1);
                Object l = eVar2.f169962ag.mo58854l(r1.f169971d);
                if (l == null) {
                    obj = r1.f169969b;
                } else {
                    obj = r1.mo58889c(l);
                }
                eVar.f296581c.remove(Integer.valueOf(((C107539r) obj).f299187b));
                if (eVar.f296581c.isEmpty()) {
                    ((C107705p) eVar.f296580b.mo27525b()).mo96236i();
                    ((C107705p) eVar.f296580b.mo27525b()).mo96231d();
                    eVar.mo95479b();
                }
            }
        }
    }
}
