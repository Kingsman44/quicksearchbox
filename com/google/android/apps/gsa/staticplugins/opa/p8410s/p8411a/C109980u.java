package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.common.base.C58879cp;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4908a.C64111c;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4908a.C64113e;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69872g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.a.u */
/* compiled from: PG */
final class C109980u implements C87682aj {

    /* renamed from: a */
    private final C21232ab f306436a;

    /* renamed from: b */
    private final String f306437b;

    /* renamed from: c */
    private final C107710u f306438c;

    /* renamed from: d */
    private final C69872g f306439d;

    public C109980u(C21232ab abVar, String str, C69872g gVar, C107710u uVar) {
        this.f306436a = abVar;
        this.f306437b = str;
        this.f306439d = gVar;
        this.f306438c = uVar;
    }

    /* renamed from: a */
    private final void m183174a(int i) {
        if (!C58879cp.m90962d(this.f306437b)) {
            C21232ab abVar = this.f306436a;
            String str = this.f306437b;
            C64111c cVar = (C64111c) C64113e.f173331c.createBuilder();
            cVar.copyOnWrite();
            C64113e eVar = (C64113e) cVar.instance;
            eVar.f173334b = i - 1;
            eVar.f173333a |= 1;
            abVar.mo26140c(str, ((C64113e) cVar.build()).toByteArray());
        }
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 31) {
            m183174a(3);
            this.f306439d.mo61500a();
            this.f306438c.mo96221d(this, C88244um.TTS_PLAYBACK_STARTED, C88244um.TTS_PLAYBACK_DONE);
        } else if (ordinal == 32) {
            m183174a(2);
        }
    }
}
