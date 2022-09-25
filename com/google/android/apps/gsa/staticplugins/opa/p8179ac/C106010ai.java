package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.ana;
import com.google.assistant.p3897e.p3921j.anb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.ai */
/* compiled from: PG */
public final /* synthetic */ class C106010ai implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106023av f295955a;

    /* renamed from: b */
    public final /* synthetic */ String f295956b;

    public /* synthetic */ C106010ai(C106023av avVar, String str) {
        this.f295955a = avVar;
        this.f295956b = str;
    }

    public final void run() {
        C106023av avVar = this.f295955a;
        String str = this.f295956b;
        C106025ax axVar = avVar.f295980a;
        ana ana = (ana) anb.f135415c.createBuilder();
        ana.copyOnWrite();
        anb anb = (anb) ana.instance;
        str.getClass();
        anb.f135417a |= 1;
        anb.f135418b = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.ThirdPartyTriggerSceneInput";
        C63088z byteString = ((anb) ana.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "third_party.TRIGGER_SCENE";
        dsVar.mo53729a("third_party_trigger_scene_input", (C52230ka) jzVar.build());
        axVar.mo95243y((C51805du) dsVar.build());
    }
}
