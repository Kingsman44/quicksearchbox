package com.google.android.apps.gsa.staticplugins.opa.p8378m;

import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52270ln;
import com.google.assistant.p3897e.p3921j.C52271lo;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.m.e */
/* compiled from: PG */
public final class C109459e {
    /* renamed from: a */
    public static C51805du m182156a(String str) {
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "ui.TAP";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.TapInput";
        C52270ln lnVar = (C52270ln) C52271lo.f137214c.createBuilder();
        lnVar.copyOnWrite();
        C52271lo loVar = (C52271lo) lnVar.instance;
        str.getClass();
        loVar.f137216a |= 1;
        loVar.f137217b = str;
        C63088z byteString = ((C52271lo) lnVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("tap_input", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }
}
