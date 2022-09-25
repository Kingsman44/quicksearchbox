package com.google.android.apps.gsa.staticplugins.opa;

import android.widget.FrameLayout;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106269ab;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107554c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107511ae;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.lx */
/* compiled from: PG */
final class C109451lx implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C109452ly f304787a;

    public C109451lx(C109452ly lyVar) {
        this.f304787a = lyVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        Object obj;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        int i = 1;
        if (ordinal != 112) {
            switch (ordinal) {
                case 64:
                    this.f304787a.f304801M = false;
                    return;
                case 65:
                    this.f304787a.f304801M = true;
                    return;
                case 66:
                    C87566i.m142294ar(this.f304787a.f304836w);
                    return;
                default:
                    return;
            }
        } else {
            C109452ly lyVar = this.f304787a;
            C62940bt btVar = C107505a.f299120a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r1 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r1);
            if (uoVar.f169962ag.mo58857o(r1.f169971d)) {
                C107556e eVar = (C107556e) serviceEventData.mo81918e(C107505a.f299120a);
                int a2 = C107554c.m178398a(eVar.f299213b);
                if (a2 != 0) {
                    i = a2;
                }
                if (i - 1 == 19) {
                    C109732nf nfVar = (C109732nf) lyVar.f304826m.mo27525b();
                    FrameLayout frameLayout = lyVar.f304829p;
                    C58976aa aaVar = C58975e.f156826a;
                    C62940bt r2 = C62942bv.checkIsLite(C107511ae.f299134a);
                    eVar.mo58887l(r2);
                    if (eVar.f169962ag.mo58857o(r2.f169971d)) {
                        C62940bt r22 = C62942bv.checkIsLite(C107511ae.f299134a);
                        eVar.mo58887l(r22);
                        Object l = eVar.f169962ag.mo58854l(r22.f169971d);
                        if (l == null) {
                            obj = r22.f169969b;
                        } else {
                            obj = r22.mo58889c(l);
                        }
                        nfVar.f305706b.mo74719a(frameLayout, new C109730nd(nfVar, (C106269ab) obj), nfVar.f305708d);
                    }
                }
            }
        }
    }
}
