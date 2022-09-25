package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6519al.p6733g.C85472a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.staticplugins.opa.util.C113812ca;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52148h;
import com.google.assistant.p3897e.p3921j.C52175i;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63088z;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.al */
/* compiled from: PG */
public final /* synthetic */ class C92877al implements C85472a {

    /* renamed from: a */
    public final /* synthetic */ C92878am f259121a;

    public /* synthetic */ C92877al(C92878am amVar) {
        this.f259121a = amVar;
    }

    /* renamed from: a */
    public final void mo78994a(JSONObject jSONObject) {
        C52175i iVar;
        C92878am amVar = this.f259121a;
        if (!amVar.f259124c.mo56113h()) {
            ((C59052c) ((C59052c) C92878am.f259122a.mo56225c()).mo56372aa(13099)).mo56386p("opaStarter not present during ampaction result");
            return;
        }
        String str = (!amVar.f259125d.mo56113h() || TextUtils.isEmpty(((C113812ca) amVar.f259125d.mo56107c()).f315214a)) ? "and.opa" : ((C113812ca) amVar.f259125d.mo56107c()).f315214a;
        if (jSONObject == null) {
            iVar = C52175i.f136907c;
        } else {
            C52148h hVar = (C52148h) C52175i.f136907c.createBuilder();
            String jSONObject2 = jSONObject.toString();
            hVar.copyOnWrite();
            C52175i iVar2 = (C52175i) hVar.instance;
            jSONObject2.getClass();
            iVar2.f136909a |= 1;
            iVar2.f136910b = jSONObject2;
            iVar = (C52175i) hVar.build();
        }
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.AmpActionsParam";
        C63088z byteString = iVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "amp.AMP_ACTIONS";
        dsVar.mo53729a("amp_actions_params", (C52230ka) jzVar.build());
        C87565h hVar2 = new C87565h();
        hVar2.f236556b = e.b;
        hVar2.f236512P = 268435456;
        hVar2.f236523a = str;
        hVar2.f236560f = 4;
        hVar2.f236517U = ((C51805du) dsVar.build()).toByteArray();
        ((C87568k) amVar.f259124c.mo56107c()).mo81688b(amVar.f259123b, hVar2.mo81685a());
    }
}
