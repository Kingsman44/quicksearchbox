package com.google.android.apps.gsa.staticplugins.opa.p8378m;

import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.assistant.p3897e.p3921j.amo;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.m.f */
/* compiled from: PG */
public final class C109460f {
    /* renamed from: a */
    public static C51805du m182157a(CharSequence charSequence) {
        amm amm = (amm) C51682amp.f135384d.createBuilder();
        String obj = charSequence.toString();
        amm.copyOnWrite();
        C51682amp amp = (C51682amp) amm.instance;
        obj.getClass();
        amp.f135386a |= 1;
        amp.f135387b = obj;
        amo amo = amo.TRUSTED;
        amm.copyOnWrite();
        C51682amp amp2 = (C51682amp) amm.instance;
        amp2.f135388c = amo.f135383d;
        amp2.f135386a |= 2;
        return m182158b((C51682amp) amm.build());
    }

    /* renamed from: b */
    public static C51805du m182158b(C51682amp amp) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.TextInputParam";
        C63088z byteString = amp.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "text.QUERY";
        dsVar.mo53729a("text_input_params", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }
}
