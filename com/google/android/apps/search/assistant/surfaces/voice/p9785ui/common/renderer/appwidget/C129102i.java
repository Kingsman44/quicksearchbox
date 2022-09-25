package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget;

import com.google.android.apps.gsa.binaries.satin.app.aou;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126929g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126930h;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.i */
/* compiled from: PG */
public final class C129102i {

    /* renamed from: a */
    public static final Duration f354671a = Duration.ofSeconds(5);

    /* renamed from: a */
    public static C126930h m210744a(aou aou) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "ui.SHOW_APP_WIDGET";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        return C126929g.m207623d((C51785da) czVar.build(), new C129101h(aou));
    }
}
