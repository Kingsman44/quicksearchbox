package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9698b;

import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126929g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126930h;
import com.google.android.libraries.search.assistant.performer.communication.C35513af;
import com.google.android.libraries.search.assistant.performer.communication.C35557bp;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.b.f */
/* compiled from: PG */
public final /* synthetic */ class C128276f {
    /* renamed from: a */
    public static C126930h m209362a(C35513af afVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "contact.CALL_HISTORY_LOOKUP";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        Objects.requireNonNull(afVar);
        return C126929g.m207621b((C51785da) czVar.build(), new C128275e(afVar));
    }

    /* renamed from: b */
    public static C126930h m209363b(C126879a aVar, C35557bp bpVar, C37215b bVar) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "contact.LOOKUP";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207621b((C51785da) czVar.build(), new C128272b(bpVar, aVar, bVar));
    }
}
