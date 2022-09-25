package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9705g;

import com.google.android.apps.gsa.binaries.satin.app.aoy;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126929g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126930h;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2605b.C33587b;
import com.google.android.libraries.search.assistant.performer.p2757g.C36055ay;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.adn;
import com.google.assistant.p3897e.p3921j.ado;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.protobuf.C63088z;
import java.util.HashSet;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.g.f */
/* compiled from: PG */
public final class C128319f {
    /* renamed from: a */
    public static C126930h m209410a(C69464a aVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "media.NOTIFY_NOW_PLAYING";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207621b((C51785da) czVar.build(), aVar);
    }

    /* renamed from: b */
    public static C126930h m209411b(C36055ay ayVar, C126879a aVar, boolean z) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "media.PLAY_MEDIA";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.PlayMediaProperties";
        adn adn = (adn) ado.f134898b.createBuilder();
        adn.mo53675a(3);
        adn.mo53675a(10);
        C63088z byteString = ((ado) adn.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        daVar2.f135880d = kaVar3;
        daVar2.f135877a |= 4;
        czVar.copyOnWrite();
        C51785da daVar3 = (C51785da) czVar.instance;
        daVar3.f135877a |= 2;
        daVar3.f135879c = 2;
        return C126929g.m207621b((C51785da) czVar.build(), new C128318e(ayVar, aVar, z));
    }

    /* renamed from: c */
    public static C126930h m209412c(C36055ay ayVar, C126879a aVar, boolean z) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "media.PREPARE_MEDIA";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207621b((C51785da) czVar.build(), new C128317d(ayVar, aVar, z));
    }

    /* renamed from: d */
    public static Set m209413d(C69464a aVar) {
        HashSet hashSet = new HashSet();
        C58485gu o = C58485gu.m89847o("media.SET_FOCUS", "media.CLEAR_FOCUS");
        int i = ((C58724pq) o).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) o.get(i2);
            C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
            czVar.copyOnWrite();
            C51785da daVar = (C51785da) czVar.instance;
            str.getClass();
            daVar.f135877a |= 1;
            daVar.f135878b = str;
            czVar.copyOnWrite();
            C51785da daVar2 = (C51785da) czVar.instance;
            daVar2.f135877a |= 2;
            daVar2.f135879c = 1;
            hashSet.add(C126929g.m207621b((C51785da) czVar.build(), aVar));
        }
        return hashSet;
    }

    /* renamed from: e */
    public static Set m209414e(aoy aoy, C33587b bVar) {
        HashSet hashSet = new HashSet();
        C58485gu D = C58485gu.m89834D("media.NEXT", "media.PREVIOUS", "media.PAUSE", "media.RESUME", "media.SEEK_RELATIVE", "media.SEEK_TO_POSITION", "media.SET_RATING", "media.STOP", "media.REPLAY_MEDIA_ITEM", "media.SHUFFLE", "media.SET_REPEAT", "media.SET_PLAYBACK_RATE", new String[0]);
        int i = ((C58724pq) D).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) D.get(i2);
            C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
            czVar.copyOnWrite();
            C51785da daVar = (C51785da) czVar.instance;
            str.getClass();
            daVar.f135877a |= 1;
            daVar.f135878b = str;
            czVar.copyOnWrite();
            C51785da daVar2 = (C51785da) czVar.instance;
            daVar2.f135877a |= 2;
            daVar2.f135879c = 1;
            aoy aoy2 = aoy;
            hashSet.add(C126929g.m207622c((C51785da) czVar.build(), new C128316c(aoy, bVar)));
        }
        return hashSet;
    }
}
