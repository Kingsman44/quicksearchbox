package com.google.android.apps.gsa.staticplugins.opa.p8378m;

import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52606xz;
import com.google.assistant.p3897e.p3921j.C52609yb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.m.c */
/* compiled from: PG */
public final class C109457c {
    /* renamed from: a */
    public static C51805du m182152a(long j, int i) {
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "media.STATUS";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.MediaStatusInput";
        C52606xz xzVar = (C52606xz) C52609yb.f138130d.createBuilder();
        xzVar.copyOnWrite();
        C52609yb ybVar = (C52609yb) xzVar.instance;
        ybVar.f138133b = i - 1;
        ybVar.f138132a |= 1;
        xzVar.copyOnWrite();
        C52609yb ybVar2 = (C52609yb) xzVar.instance;
        ybVar2.f138132a |= 2;
        ybVar2.f138134c = j;
        C63088z byteString = ((C52609yb) xzVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("media_status_input", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }
}
