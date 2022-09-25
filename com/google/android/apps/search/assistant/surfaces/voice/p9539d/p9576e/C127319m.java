package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.assistant.p3897e.p3917i.p3918a.C51422hc;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.m */
/* compiled from: PG */
public final /* synthetic */ class C127319m implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C127319m f350647a = new C127319m();

    private /* synthetic */ C127319m() {
    }

    public final Object apply(Object obj) {
        C32836cd cdVar = C127323q.f350651a;
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.GwsRequestParams";
        C63088z byteString = ((C51422hc) obj).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        azVar.copyOnWrite();
        C32806ba baVar = (C32806ba) azVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        baVar.f87991b = kaVar3;
        baVar.f87990a |= 1;
        auVar.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar.instance;
        C32806ba baVar2 = (C32806ba) azVar.build();
        baVar2.getClass();
        awVar.f87981b = baVar2;
        awVar.f87980a = 1;
        return (C32801aw) auVar.build();
    }
}
