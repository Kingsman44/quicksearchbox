package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8252g;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.smartspace.p7259c.C92087c;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52151hc;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.g.a */
/* compiled from: PG */
public final /* synthetic */ class C106771a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C106772b f297546a;

    /* renamed from: b */
    public final /* synthetic */ Context f297547b;

    public /* synthetic */ C106771a(C106772b bVar, Context context) {
        this.f297546a = bVar;
        this.f297547b = context;
    }

    public final void onClick(View view) {
        C106772b bVar = this.f297546a;
        Context context = this.f297547b;
        bVar.f297553f.mo86710o(bVar.f297548a);
        C87565h hVar = new C87565h();
        hVar.mo81686b();
        hVar.f236509M = true;
        hVar.f236560f = 1;
        hVar.f236572r = QueryTriggerType.OPA_SUGGESTION_CHIP;
        hVar.f236556b = e.ab;
        if (bVar.f297551d.isPresent()) {
            ((C58970a) ((C58970a) bVar.f297552e.mo56224b()).mo56372aa(23310)).mo56386p("Cast device present");
            String str = bVar.f297550c;
            String str2 = ((C92087c) bVar.f297551d.get()).f256722a;
            String str3 = ((C92087c) bVar.f297551d.get()).f256723b;
            C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
            mVar.mo58185d(C106772b.m177526c("query", str));
            mVar.mo58185d(C106772b.m177526c("device_id", str2));
            mVar.mo58185d(C106772b.m177526c("device_name", str3));
            mVar.copyOnWrite();
            C61752n nVar = (C61752n) mVar.instance;
            nVar.f166810a |= 4;
            nVar.f166811b = "DoItAgainSendToDevice";
            C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
            C63088z byteString = ((C61752n) mVar.build()).toByteString();
            hcVar.copyOnWrite();
            C52152hd hdVar = (C52152hd) hcVar.instance;
            byteString.getClass();
            hdVar.f136852a |= 1;
            hdVar.f136853b = byteString;
            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar.copyOnWrite();
            C51805du duVar = (C51805du) dsVar.instance;
            duVar.f135926a |= 1;
            duVar.f135927b = "asst_input.INTENT";
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a = 1 | kaVar.f137059a;
            kaVar.f137060b = "assistant.api.client_input.IntentInput";
            C63088z byteString2 = ((C52152hd) hcVar.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString2.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString2;
            dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
            hVar.f236517U = ((C51805du) dsVar.build()).toByteArray();
        } else {
            ((C58970a) ((C58970a) bVar.f297552e.mo56224b()).mo56372aa(23309)).mo56386p("Cast device not present");
            hVar.f236568n = bVar.f297550c;
        }
        bVar.f297549b.mo81689c(context, hVar.mo81685a(), 268468224);
    }
}
