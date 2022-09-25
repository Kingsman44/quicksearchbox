package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127113e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127114f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.C128245a;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32953f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.s */
/* compiled from: PG */
public final class C129144s implements C32953f {

    /* renamed from: a */
    private final C127118j f354765a;

    /* renamed from: b */
    private final C128245a f354766b;

    public C129144s(C127118j jVar, C128245a aVar) {
        this.f354765a = jVar;
        this.f354766b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo38395a(Intent intent) {
        C60870cx a = this.f354766b.mo108383a(intent);
        C129143r rVar = C129143r.f354764a;
        return C60922j.m93044g(a, C47810es.m84963c(rVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo38396b(C52078ek ekVar) {
        C51805du duVar;
        C51805du duVar2;
        if (ekVar.f136674b == 5) {
            duVar = (C51805du) ekVar.f136675c;
        } else {
            duVar = C51805du.f135924e;
        }
        String str = duVar.f135927b;
        C127118j jVar = this.f354765a;
        C127454b bVar = C127454b.CLIENT_INPUT;
        if (ekVar.f136674b == 5) {
            duVar2 = (C51805du) ekVar.f136675c;
        } else {
            duVar2 = C51805du.f135924e;
        }
        jVar.mo107931g(C127407d.m208361a(bVar, duVar2));
    }

    /* renamed from: c */
    public final void mo38397c() {
        C127113e eVar = (C127113e) C127114f.f350009c.createBuilder();
        C127050h hVar = C127050h.UNSPECIFIED;
        eVar.copyOnWrite();
        C127114f fVar = (C127114f) eVar.instance;
        fVar.f350012b = hVar.getNumber();
        fVar.f350011a |= 1;
        this.f354765a.mo107932h((C127114f) eVar.build());
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo38398d() {
        return C60856cj.m92899h(new UnsupportedOperationException());
    }
}
