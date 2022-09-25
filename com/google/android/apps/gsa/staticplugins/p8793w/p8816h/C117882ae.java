package com.google.android.apps.gsa.staticplugins.p8793w.p8816h;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52637zc;
import com.google.assistant.p3897e.p3921j.C52638zd;
import com.google.assistant.p3897e.p3921j.C52639ze;
import com.google.assistant.p3897e.p3921j.C52640zf;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.ae */
/* compiled from: PG */
final class C117882ae implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C87739bu f327150a;

    /* renamed from: b */
    final /* synthetic */ String f327151b;

    /* renamed from: c */
    final /* synthetic */ C117886ai f327152c;

    public C117882ae(C117886ai aiVar, C87739bu buVar, String str) {
        this.f327152c = aiVar;
        this.f327150a = buVar;
        this.f327151b = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C117886ai.f327159a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CarAssistantSessCtlr");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(18684)).mo56386p("Failed to get message notification");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C51805du duVar;
        C58833ax axVar = (C58833ax) obj;
        C59071e eVar = C117886ai.f327159a;
        C58976aa aaVar = C58975e.f156826a;
        if (!axVar.mo56113h()) {
            C59104x d = C117886ai.f327159a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CarAssistantSessCtlr");
            ((C59052c) ((C59052c) d).mo56372aa(18688)).mo56386p("#sendTapNotificationClientInput, messageNotification missing");
            return;
        }
        aco aco = (aco) axVar.mo56107c();
        if (!aco.f134833k) {
            C59104x b = C117886ai.f327159a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "CarAssistantSessCtlr");
            ((C59052c) ((C59052c) b).mo56372aa(18686)).mo56386p("#sendTapNotificationClientInput, Message reply action not available.");
            if (this.f327150a == C87739bu.SEND_DIRECT_REPLY_CLIENT_INPUT) {
                C59104x d2 = C117886ai.f327159a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "CarAssistantSessCtlr");
                ((C59052c) ((C59052c) d2).mo56372aa(18687)).mo56386p("#sendTapNotificationClientInput, missing reply for reply session, cancel flow");
                this.f327152c.mo103470o(R.string.action_fallback_long_query_eyes_free_tts);
                return;
            }
        }
        if (this.f327150a == C87739bu.SEND_TTR_CLIENT_INPUT) {
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.client_input.MessageNotificationReadParam";
            C52637zc zcVar = (C52637zc) C52638zd.f138205f.createBuilder();
            aco.getClass();
            zcVar.copyOnWrite();
            C52638zd zdVar = (C52638zd) zcVar.instance;
            zdVar.f138208b = aco;
            zdVar.f138207a |= 1;
            C63088z byteString = ((C52638zd) zcVar.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar.copyOnWrite();
            C51805du duVar2 = (C51805du) dsVar.instance;
            duVar2.f135926a |= 1;
            duVar2.f135927b = "message_notification.READ";
            dsVar.mo53729a("message_notification_read_param", (C52230ka) jzVar.build());
            duVar = (C51805du) dsVar.build();
        } else {
            C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar2.copyOnWrite();
            C52230ka kaVar3 = (C52230ka) jzVar2.instance;
            kaVar3.f137059a |= 1;
            kaVar3.f137060b = "assistant.api.client_input.MessageNotificationReplyParam";
            C52639ze zeVar = (C52639ze) C52640zf.f138212e.createBuilder();
            aco.getClass();
            zeVar.copyOnWrite();
            C52640zf zfVar = (C52640zf) zeVar.instance;
            zfVar.f138215b = aco;
            zfVar.f138214a |= 1;
            C63088z byteString2 = ((C52640zf) zeVar.build()).toByteString();
            jzVar2.copyOnWrite();
            C52230ka kaVar4 = (C52230ka) jzVar2.instance;
            byteString2.getClass();
            kaVar4.f137059a |= 2;
            kaVar4.f137061c = byteString2;
            C51803ds dsVar2 = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar2.copyOnWrite();
            C51805du duVar3 = (C51805du) dsVar2.instance;
            duVar3.f135926a |= 1;
            duVar3.f135927b = "message_notification.REPLY";
            dsVar2.mo53729a("message_notification_reply_param", (C52230ka) jzVar2.build());
            duVar = (C51805du) dsVar2.build();
        }
        this.f327152c.mo103467c(duVar, this.f327151b);
    }
}
