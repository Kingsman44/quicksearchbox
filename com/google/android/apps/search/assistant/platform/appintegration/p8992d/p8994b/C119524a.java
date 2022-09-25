package com.google.android.apps.search.assistant.platform.appintegration.p8992d.p8994b;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v;
import com.google.android.apps.search.assistant.platform.appintegration.p8992d.C119522a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.d.b.a */
/* compiled from: PG */
public final class C119524a implements C119522a {

    /* renamed from: a */
    private static final C59071e f333141a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.d.b.a");

    /* renamed from: b */
    private static final C32836cd f333142b;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar.copyOnWrite();
        C32836cd cdVar = (C32836cd) ccVar.instance;
        cdVar.f88042a |= 2;
        cdVar.f88044c = true;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        arVar.f87975a = 1;
        arVar.f87976b = "asst.device.capabilities";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f333142b = (C32836cd) ccVar.build();
    }

    /* renamed from: a */
    public final C32836cd mo104416a() {
        C32836cd cdVar = f333142b;
        ((C59052c) ((C59052c) f333141a.mo56224b()).mo56372aa(34436)).mo56389s("get context key=%s", cdVar);
        return cdVar;
    }

    /* renamed from: b */
    public final C60870cx mo104417b(C119640v vVar) {
        ((C59052c) ((C59052c) f333141a.mo56224b()).mo56372aa(34437)).mo56389s("fetchContext context key=%s", f333142b);
        C51714bl blVar = (C51714bl) C51715bm.f135662t.createBuilder();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        bmVar.f135664a |= 2;
        bmVar.f135666c = "OPA_AGSA";
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.DeviceCapabilities";
        C63088z byteString = ((C51715bm) blVar.build()).toByteString();
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
