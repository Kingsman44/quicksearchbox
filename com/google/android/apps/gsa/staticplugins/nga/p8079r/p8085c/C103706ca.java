package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52151hc;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.ca */
/* compiled from: PG */
public final /* synthetic */ class C103706ca implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C103707cb f288831a;

    public /* synthetic */ C103706ca(C103707cb cbVar) {
        this.f288831a = cbVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C103707cb cbVar = this.f288831a;
        C87565h hVar = new C87565h();
        hVar.mo81686b();
        hVar.f236509M = true;
        hVar.f236535af = true;
        hVar.f236560f = 6;
        hVar.f236572r = QueryTriggerType.OPA_SUGGESTION_CHIP;
        hVar.f236556b = e.H;
        hVar.f236512P = 805306368;
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "Narrate_current_content";
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
        cbVar.f288833a.mo81688b(cbVar.f288834b, hVar.mo81685a());
        return C80275dd.f220288c;
    }
}
