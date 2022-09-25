package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90605m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.ac */
/* compiled from: PG */
public final /* synthetic */ class C93124ac implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259759a;

    public /* synthetic */ C93124ac(C93150bb bbVar) {
        this.f259759a = bbVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93150bb bbVar = this.f259759a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C59104x b = C93150bb.f259800a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
            ((C59052c) ((C59052c) b).mo56372aa(13402)).mo56386p("#playTtsForMessageNotification, tts present");
            bbVar.f259812m.mo19974a(C37176a.f97313jg.mo40815i(C62722b.OK));
            C84352a aVar = bbVar.f259803d;
            Query b2 = bbVar.f259808i.mo87473b();
            C90605m mVar = new C90605m();
            mVar.mo84746b((C63088z) axVar.mo56107c());
            return aVar.mo77889c(b2, mVar.mo84745a(), C93134am.f259776a);
        }
        C59104x d = C93150bb.f259800a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
        ((C59052c) ((C59052c) d).mo56372aa(13401)).mo56386p("#playTtsForMessageNotification, tts not present");
        bbVar.f259812m.mo19974a(C37176a.f97313jg.mo40815i(C62722b.UNAVAILABLE));
        return C60856cj.m92899h(new RuntimeException("Failed to get online TTS."));
    }
}
