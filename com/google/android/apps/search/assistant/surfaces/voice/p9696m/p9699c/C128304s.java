package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9699c;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126929g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126930h;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9699c.p9700a.C128286c;
import com.google.android.libraries.search.assistant.invocation.assistdata.p2595a.C33517a;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2652a.C33975b;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35872aa;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35895ax;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35896ay;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35897az;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35931c;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35937cb;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35941cf;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52439ru;
import com.google.assistant.p3897e.p3921j.C52440rv;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.protobuf.C63088z;
import java.util.Set;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.c.s */
/* compiled from: PG */
public final /* synthetic */ class C128304s {
    /* renamed from: a */
    public static C126930h m209387a(C69464a aVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "battery.LEVEL_LOOKUP";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207621b((C51785da) czVar.build(), aVar);
    }

    /* renamed from: b */
    public static C126930h m209388b(C69464a aVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "device.CHECK_PERMISSION";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207621b((C51785da) czVar.build(), aVar);
    }

    /* renamed from: c */
    public static C126930h m209389c(C35872aa aaVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "client.RECONNECT";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 2;
        Objects.requireNonNull(aaVar);
        return C126929g.m207621b((C51785da) czVar.build(), new C128292g());
    }

    /* renamed from: d */
    public static C126930h m209390d(C69464a aVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "device.POWER";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207621b((C51785da) czVar.build(), aVar);
    }

    /* renamed from: e */
    public static C126930h m209391e(C69464a aVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "device.GET_SETTINGS";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 2;
        return C126929g.m207621b((C51785da) czVar.build(), aVar);
    }

    /* renamed from: f */
    public static C126930h m209392f(C69464a aVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "device.HANDLE_WELLBEING";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207621b((C51785da) czVar.build(), aVar);
    }

    /* renamed from: g */
    public static C126930h m209393g(C35897az azVar, boolean z, C128286c cVar) {
        C52439ru ruVar = (C52439ru) C52440rv.f137654d.createBuilder();
        ruVar.copyOnWrite();
        C52440rv rvVar = (C52440rv) ruVar.instance;
        rvVar.f137656a |= 1;
        rvVar.f137657b = true;
        ruVar.copyOnWrite();
        C52440rv rvVar2 = (C52440rv) ruVar.instance;
        rvVar2.f137656a |= 2;
        rvVar2.f137658c = true;
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "device.MODIFY_SETTING";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 2;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a = 1 | kaVar.f137059a;
        kaVar.f137060b = "assistant.api.client_op.properties.DeviceModifySettingClientOpProperty";
        C63088z byteString = ((C52440rv) ruVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a = 2 | kaVar2.f137059a;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        czVar.copyOnWrite();
        C51785da daVar3 = (C51785da) czVar.instance;
        kaVar3.getClass();
        daVar3.f135880d = kaVar3;
        daVar3.f135877a |= 4;
        C35895ax b = C35896ay.m64292b();
        ((C35931c) b).f94089a = Boolean.valueOf(z);
        return C126929g.m207621b((C51785da) czVar.build(), new C128302q(azVar, cVar, b.mo39875a()));
    }

    /* renamed from: h */
    public static C126930h m209394h(C69464a aVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "provider.VERIFY";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207621b((C51785da) czVar.build(), aVar);
    }

    /* renamed from: i */
    public static C126930h m209395i(C69464a aVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "execution.WAIT";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207621b((C51785da) czVar.build(), aVar);
    }

    /* renamed from: j */
    public static C126930h m209396j(C35941cf cfVar, C33517a aVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "device.TAKE_SCREENSHOT";
        return C126929g.m207622c((C51785da) czVar.build(), new C128295j(cfVar, aVar));
    }

    /* renamed from: k */
    public static Set m209397k(boolean z, C35937cb cbVar, C33517a aVar, C33975b bVar) {
        if (!z) {
            return C58733pz.f156496a;
        }
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "device.SCREEN_NAVIGATION";
        return new C58759qy(C126929g.m207622c((C51785da) czVar.build(), new C128299n(cbVar, aVar)));
    }

    /* renamed from: l */
    public static C126930h m209398l(C32221c cVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "credential.UPDATE";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 2;
        return C126929g.m207621b((C51785da) czVar.build(), new C128287b(cVar));
    }
}
