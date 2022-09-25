package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113916t;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60593vq;
import com.google.common.p4552o.C60594vr;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.js */
/* compiled from: PG */
public final class C109328js implements C109330ju, C87682aj {

    /* renamed from: a */
    public Bundle f304541a;

    /* renamed from: b */
    final C108100a f304542b;

    /* renamed from: c */
    private final C108230ba f304543c;

    /* renamed from: d */
    private final C109042fl f304544d;

    /* renamed from: e */
    private final Context f304545e;

    /* renamed from: f */
    private final C109327jr f304546f;

    /* renamed from: g */
    private final C60593vq f304547g = ((C60593vq) C60594vr.f164378d.createBuilder());

    /* renamed from: h */
    private final C113916t f304548h;

    public C109328js(C108230ba baVar, C109042fl flVar, C109327jr jrVar, Context context, C58833ax axVar, C113916t tVar) {
        this.f304543c = baVar;
        this.f304544d = flVar;
        this.f304546f = jrVar;
        this.f304545e = context;
        this.f304542b = (C108100a) axVar.mo56111f();
        this.f304548h = tVar;
    }

    /* renamed from: b */
    private final void m181993b(boolean z) {
        C108100a aVar = this.f304542b;
        if (aVar == null) {
            return;
        }
        if ((aVar.mo96452q() || z) && C87566i.m142297au(this.f304541a)) {
            this.f304544d.mo95151b();
            C113916t tVar = this.f304548h;
            C89849ae aeVar = C89849ae.OPA_ENDSTATE_CANCEL_MULTI_HOTWORD;
            C58976aa aaVar = C58975e.f156826a;
            C58836b bVar = C58836b.f156633a;
            tVar.mo100764h(aeVar, bVar, bVar, bVar);
        }
    }

    /* renamed from: d */
    private final void m181994d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f304543c.mo95434w(38);
        C108262cf cfVar = new C108262cf(4, 4);
        cfVar.f301174d = this.f304545e.getString(R.string.device_response_suppressed);
        cfVar.f301029k.mo85049c(0, 128);
        this.f304543c.mo95430s(cfVar);
    }

    /* renamed from: a */
    public final void mo97764a() {
        C58976aa aaVar = C58975e.f156826a;
        C109327jr jrVar = this.f304546f;
        C59104x b = C109040fj.f303210a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ChatUiController");
        ((C59052c) ((C59052c) b).mo56372aa(22646)).mo56389s("handleMultiDeviceQuerySelection: %s", (Object) null);
        C109040fj fjVar = (C109040fj) jrVar;
        fjVar.f303345bz = true;
        Bundle g = fjVar.mo97535g();
        g.putInt("android.opa.extra.TRIGGERED_BY", 45);
        fjVar.mo97549v((CharSequence) null, QueryTriggerType.USER, g, (String) null);
        if (!fjVar.f303450o.mo95399aj()) {
            if (fjVar.f303234T.mo95358d() != 3) {
                fjVar.mo97498bH(false, false, false, 2);
            }
            fjVar.f303256aP.setVisibility(0);
            fjVar.f303230P.setVisibility(0);
        }
        C60593vq vqVar = this.f304547g;
        vqVar.copyOnWrite();
        C60594vr vrVar = (C60594vr) vqVar.instance;
        C60594vr vrVar2 = C60594vr.f164378d;
        vrVar.f164382c = 1;
        vrVar.f164380a |= 2;
        C60593vq vqVar2 = this.f304547g;
        vqVar2.copyOnWrite();
        C60594vr vrVar3 = (C60594vr) vqVar2.instance;
        vrVar3.f164380a |= 1;
        vrVar3.f164381b = true;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1032;
        C60593vq vqVar3 = this.f304547g;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60594vr vrVar4 = (C60594vr) vqVar3.build();
        vrVar4.getClass();
        ufVar2.f164148bB = vrVar4;
        ufVar2.f164253h |= 2048;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a != C88244um.NOTIFY_DEVICE_SELECTION_SUPPRESSION) {
            C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a2 == null) {
                a2 = C88244um.ATTACH_WEBVIEW;
            }
            if (a2 == C88244um.GACS_FORCE_SUPPRESS_PHONE_OPA_SESSION) {
                C58976aa aaVar = C58975e.f156826a;
                m181994d();
                m181993b(true);
                return;
            }
            return;
        }
        m181994d();
        m181993b(false);
    }
}
