package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51313db;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.aq */
/* compiled from: PG */
final class C126779aq implements C32597b {
    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return C126780ar.f349123b;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C59071e eVar = C126780ar.f349122a;
        C58976aa aaVar = C58975e.f156826a;
        C32796ar arVar = beVar.f87996b;
        if (arVar == null) {
            arVar = C32796ar.f87973c;
        }
        if (arVar.f87975a == 1) {
            String str = (String) arVar.f87976b;
        }
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.DeviceProperties";
        C51303cs csVar = (C51303cs) C51334dw.f133658ab.createBuilder();
        C51313db dbVar = C51313db.CHROME;
        csVar.copyOnWrite();
        C51334dw dwVar = (C51334dw) csVar.instance;
        dwVar.f133704r = dbVar.f133603s;
        dwVar.f133685a |= 524288;
        C63088z byteString = ((C51334dw) csVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
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
        return C60856cj.m92900i((C32801aw) auVar.build());
    }
}
