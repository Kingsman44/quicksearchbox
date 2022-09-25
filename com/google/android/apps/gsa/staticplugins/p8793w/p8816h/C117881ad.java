package com.google.android.apps.gsa.staticplugins.p8793w.p8816h;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87699ah;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87701aj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.ad */
/* compiled from: PG */
final class C117881ad implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ ClientEventData f327147a;

    /* renamed from: b */
    final /* synthetic */ C87739bu f327148b;

    /* renamed from: c */
    final /* synthetic */ C117886ai f327149c;

    public C117881ad(C117886ai aiVar, ClientEventData clientEventData, C87739bu buVar) {
        this.f327149c = aiVar;
        this.f327147a = clientEventData;
        this.f327148b = buVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C117886ai.f327159a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "CarAssistantSessCtlr");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(18682)).mo56386p("Failed to parse");
        this.f327149c.mo103470o(R.string.ttr_notification_not_supported_tts);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str;
        Object obj2;
        List list = (List) obj;
        if (list.isEmpty()) {
            C59104x c = C117886ai.f327159a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CarAssistantSessCtlr");
            ((C59052c) ((C59052c) c).mo56372aa(18683)).mo56386p("Parsing resulted in an empty list");
            this.f327149c.mo103470o(R.string.ttr_app_not_supported_tts);
            return;
        }
        ClientEventData clientEventData = this.f327147a;
        C62940bt btVar = C87699ah.f237155a;
        C87741bw bwVar = clientEventData.f236955a;
        C62940bt r1 = C62942bv.checkIsLite(btVar);
        bwVar.mo58887l(r1);
        if (bwVar.f169962ag.mo58857o(r1.f169971d)) {
            ClientEventData clientEventData2 = this.f327147a;
            C62940bt btVar2 = C87699ah.f237155a;
            C87741bw bwVar2 = clientEventData2.f236955a;
            C62940bt r12 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r12);
            Object l = bwVar2.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj2 = r12.f169969b;
            } else {
                obj2 = r12.mo58889c(l);
            }
            str = ((C87701aj) obj2).f237158a;
        } else {
            str = null;
        }
        C117886ai aiVar = this.f327149c;
        C87739bu buVar = this.f327148b;
        C58976aa aaVar = C58975e.f156826a;
        C60856cj.m92911t(aiVar.f327190d.mo77885c((BundledMessageNotification) list.get(0), aiVar.f327192f.mo79746e(C90025cd.f248154l)), new C117882ae(aiVar, buVar, str), C60826bg.f164896a);
    }
}
