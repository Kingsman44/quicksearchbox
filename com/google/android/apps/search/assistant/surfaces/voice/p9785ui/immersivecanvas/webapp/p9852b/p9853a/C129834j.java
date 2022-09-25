package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.p9846a.C129750e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.p9854a.C129820a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.p9854a.C129821b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.p9854a.C129822c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.p9854a.C129825f;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128544a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17361a;
import com.google.apps.tiktok.p3674l.p3676b.C47376g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58390dg;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.b.a.j */
/* compiled from: PG */
public final class C129834j implements C129819a {

    /* renamed from: a */
    public static final C59071e f356218a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.b.a.j");

    /* renamed from: f */
    private static final Duration f356219f = Duration.ofSeconds(10);

    /* renamed from: g */
    private static final C129825f f356220g;

    /* renamed from: b */
    public final C129750e f356221b;

    /* renamed from: c */
    public final C60887da f356222c;

    /* renamed from: d */
    public final C47376g f356223d;

    /* renamed from: e */
    public final C17361a f356224e;

    /* renamed from: h */
    private final C60888db f356225h;

    /* renamed from: i */
    private final C128544a f356226i;

    static {
        C129822c cVar = (C129822c) C129825f.f356204c.createBuilder();
        cVar.copyOnWrite();
        C129825f fVar = (C129825f) cVar.instance;
        fVar.f356207b = 3;
        fVar.f356206a |= 1;
        f356220g = (C129825f) cVar.build();
    }

    public C129834j(C17361a aVar, C129750e eVar, C60887da daVar, C60888db dbVar, C47376g gVar, C128544a aVar2) {
        this.f356224e = aVar;
        this.f356221b = eVar;
        this.f356222c = daVar;
        this.f356225h = dbVar;
        this.f356223d = gVar;
        this.f356226i = aVar2;
    }

    /* renamed from: a */
    public final void mo109285a(String str, Duration duration) {
        C60872cz e = this.f356225h.mo29165e(C47810es.m84978r(new C129826b(str)), ((Duration) C58390dg.m89476a(duration, Duration.ZERO)).toMillis(), TimeUnit.MILLISECONDS);
        C129831g gVar = new C129831g(this);
        C60856cj.m92911t(e, C47810es.m84974n(gVar), this.f356222c);
    }

    /* renamed from: b */
    public final void mo109287b(String str) {
        C128544a aVar = this.f356226i;
        C129820a aVar2 = (C129820a) C129821b.f356199c.createBuilder();
        aVar2.copyOnWrite();
        C129821b bVar = (C129821b) aVar2.instance;
        str.getClass();
        bVar.f356201a |= 1;
        bVar.f356202b = str;
        C60856cj.m92911t(aVar.mo108509a((C129821b) aVar2.build(), f356219f, f356220g), C47810es.m84974n(new C129828d()), this.f356222c);
    }
}
