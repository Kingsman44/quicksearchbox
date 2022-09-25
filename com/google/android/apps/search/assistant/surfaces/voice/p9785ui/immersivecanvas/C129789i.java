package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import com.google.android.apps.gsa.binaries.satin.app.aou;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129660g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.i */
/* compiled from: PG */
public final /* synthetic */ class C129789i implements C69464a {

    /* renamed from: a */
    public final /* synthetic */ aou f356129a;

    public /* synthetic */ C129789i(aou aou) {
        this.f356129a = aou;
    }

    /* renamed from: b */
    public final Object mo17428b() {
        aou aou = this.f356129a;
        Duration ofSeconds = Duration.ofSeconds(30);
        C129660g gVar = (C129660g) C129676j.f355890c.createBuilder();
        C129662i iVar = C129662i.IMMERSIVE_CANVAS;
        gVar.copyOnWrite();
        C129676j jVar = (C129676j) gVar.instance;
        jVar.f355893b = iVar.f355866l;
        jVar.f355892a |= 1;
        return aou.a(ofSeconds, (C129676j) gVar.build());
    }
}
