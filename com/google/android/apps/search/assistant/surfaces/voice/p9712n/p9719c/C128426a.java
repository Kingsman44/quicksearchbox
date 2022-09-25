package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c;

import com.google.android.apps.search.assistant.surfaces.voice.p9689l.C128239a;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.net.p4726a.p4727a.C62722b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.c.a */
/* compiled from: PG */
public final class C128426a {

    /* renamed from: a */
    public final String f353193a = C128239a.m209321a();

    /* renamed from: b */
    public String f353194b;

    /* renamed from: c */
    private final C37215b f353195c;

    /* renamed from: d */
    private boolean f353196d;

    public C128426a(C37215b bVar) {
        this.f353195c = bVar;
    }

    /* renamed from: a */
    public final synchronized void mo108423a(String str) {
        C69664n.m101061g(str, "clientOpName");
        if ("tts.OUTPUT".equals(str)) {
            C37258g gVar = C37176a.f97145fy;
            C69664n.m101060f(gVar, "MAIN_ASSISTANT_TTS_CLIENT_OP_RECEIVED");
            mo108429g(gVar);
        } else if (!this.f353196d) {
            C37258g gVar2 = C37176a.f96823U;
            C69664n.m101060f(gVar2, "MAIN_ASSISTANT_FIRST_CLIENT_OP_RECEIVED");
            mo108429g(gVar2);
            this.f353196d = true;
        }
    }

    /* renamed from: b */
    public final void mo108424b(C37252a aVar) {
        String str = this.f353194b;
        if (str != null) {
            ((C37253b) aVar).mo40794r(str);
        }
        mo108428f(aVar);
    }

    /* renamed from: c */
    public final void mo108425c(C34819a aVar) {
        mo108424b(C37176a.f96856aa.mo40803a(aVar.mo39520a(), aVar.mo39522e()));
    }

    /* renamed from: d */
    public final void mo108426d(C62722b bVar) {
        C69664n.m101061g(bVar, "statusCode");
        mo108424b(C37176a.f96856aa.mo40805c(bVar));
    }

    /* renamed from: e */
    public final void mo108427e(C62722b bVar) {
        C69664n.m101061g(bVar, "statusCode");
        mo108428f(C37176a.f96827Y.mo40815i(bVar));
    }

    /* renamed from: f */
    public final void mo108428f(C37252a aVar) {
        C37215b bVar = this.f353195c;
        aVar.mo40795s("interaction", this.f353193a);
        bVar.mo19974a(aVar);
    }

    /* renamed from: g */
    public final void mo108429g(C37254c cVar) {
        C69664n.m101061g(cVar, "event");
        C37252a c = cVar.mo40779c();
        C69664n.m101060f(c, "event.toBuilder()");
        mo108428f(c);
    }
}
