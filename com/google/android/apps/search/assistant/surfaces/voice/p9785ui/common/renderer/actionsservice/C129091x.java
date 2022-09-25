package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import com.google.android.apps.gsa.binaries.satin.app.aou;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126929g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126930h;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.x */
/* compiled from: PG */
public final class C129091x {

    /* renamed from: a */
    public static final Duration f354628a = Duration.ofSeconds(5);

    /* renamed from: a */
    public static C126930h m210721a(aou aou) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "provider.BIND_APP_ACTIONS_SERVICE";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207623d((C51785da) czVar.build(), new C129089v(aou));
    }

    /* renamed from: b */
    public static C126930h m210722b(aou aou) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "provider.UPDATE_APP_ACTIONS_SERVICE";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207623d((C51785da) czVar.build(), new C129090w(aou));
    }
}
