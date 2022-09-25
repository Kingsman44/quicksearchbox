package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.assistant.p3897e.p3899b.p3901b.C50879f;
import com.google.assistant.p3897e.p3899b.p3901b.C50880g;
import com.google.assistant.p3897e.p3899b.p3901b.C50881h;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.a */
/* compiled from: PG */
public final class C12721a implements C35472h {

    /* renamed from: a */
    private static final C59071e f39817a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.a");

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        Optional b = C12875h.m29134b(dwVar, "client_reconnect_args", C50879f.f132476b.getParserForType());
        if (b.isEmpty()) {
            ((C59052c) ((C59052c) f39817a.mo56226d()).mo56372aa(44414)).mo56386p("Failed to get client reconnect args");
            return C60856cj.m92900i(C12788a.f39966a);
        }
        C50880g gVar = (C50880g) C50881h.f132480c.createBuilder();
        C63088z zVar = ((C50879f) b.get()).f132478a;
        gVar.copyOnWrite();
        C50881h hVar = (C50881h) gVar.instance;
        zVar.getClass();
        hVar.f132482a |= 1;
        hVar.f132483b = zVar;
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "client_reconnect_result";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.ClientReconnectResult";
        C63088z byteString = ((C50881h) gVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        eaVar.mo53780b((C52232kc) kbVar.build());
        C52069eb ebVar = (C52069eb) eaVar.build();
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return C60856cj.m92900i((C52070ec) dzVar.build());
    }
}
