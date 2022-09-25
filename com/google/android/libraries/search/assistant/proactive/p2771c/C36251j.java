package com.google.android.libraries.search.assistant.proactive.p2771c;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.proactive.c.j */
/* compiled from: PG */
public final /* synthetic */ class C36251j implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C36251j f94696a = new C36251j();

    private /* synthetic */ C36251j() {
    }

    public final Object apply(Object obj) {
        int i = C36252k.f94697a;
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.DialogStateParams";
        C63088z zVar = C63088z.f170246b;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        zVar.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = zVar;
        C52230ka kaVar3 = (C52230ka) ((Optional) obj).orElse((C52230ka) jzVar.build());
        azVar.copyOnWrite();
        C32806ba baVar = (C32806ba) azVar.instance;
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
