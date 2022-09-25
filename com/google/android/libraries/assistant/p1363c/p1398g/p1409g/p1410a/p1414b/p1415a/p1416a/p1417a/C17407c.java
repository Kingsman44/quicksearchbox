package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.p1416a.p1417a;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.b.a.a.a.c */
/* compiled from: PG */
public final class C17407c extends C68247h {

    /* renamed from: a */
    private final C68283d f50303a;

    public C17407c(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C17407c.class), aVar);
        this.f50303a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Optional optional;
        DisplayManager displayManager = (DisplayManager) ((Context) obj).getSystemService("display");
        if (displayManager == null) {
            C59104x b = C17405a.f50299a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TTS.Server");
            ((C59052c) ((C59052c) b).mo56372aa(42706)).mo56386p("DisplayMetrics not produced, displayManager is null");
            optional = Optional.empty();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayManager.getDisplay(0).getMetrics(displayMetrics);
            optional = Optional.m71637of(displayMetrics);
            C58976aa aaVar = C58975e.f156826a;
        }
        return C60856cj.m92900i(optional);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f50303a.mo60297gq();
    }
}
