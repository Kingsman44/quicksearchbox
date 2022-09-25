package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129712a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129713b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129714c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129715d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.p9846a.C129746a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128544a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.p3926e.C51854bo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.h */
/* compiled from: PG */
public final class C129725h implements C129711b {

    /* renamed from: a */
    public static final C59071e f355976a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.h");

    /* renamed from: b */
    private static final Duration f355977b = Duration.ofSeconds(10);

    /* renamed from: c */
    private static final C129715d f355978c;

    /* renamed from: d */
    private final C60887da f355979d;

    /* renamed from: e */
    private final C129746a f355980e;

    /* renamed from: f */
    private final C128544a f355981f;

    static {
        C129712a aVar = (C129712a) C129715d.f355957c.createBuilder();
        C129713b bVar = (C129713b) C129714c.f355952d.createBuilder();
        bVar.copyOnWrite();
        C129714c cVar = (C129714c) bVar.instance;
        cVar.f355954a |= 1;
        cVar.f355955b = true;
        aVar.copyOnWrite();
        C129715d dVar = (C129715d) aVar.instance;
        C129714c cVar2 = (C129714c) bVar.build();
        cVar2.getClass();
        dVar.f355960b = cVar2;
        dVar.f355959a = 1;
        f355978c = (C129715d) aVar.build();
    }

    public C129725h(C60887da daVar, C129746a aVar, C128544a aVar2) {
        this.f355979d = daVar;
        this.f355980e = aVar;
        this.f355981f = aVar2;
    }

    /* renamed from: a */
    public final void mo109201a(C51854bo boVar) {
        C128544a aVar = this.f355981f;
        C129712a aVar2 = (C129712a) C129715d.f355957c.createBuilder();
        aVar2.copyOnWrite();
        C129715d dVar = (C129715d) aVar2.instance;
        boVar.getClass();
        dVar.f355960b = boVar;
        dVar.f355959a = 2;
        C60870cx a = aVar.mo108509a((C129715d) aVar2.build(), f355977b, (Object) null);
        C129724g gVar = new C129724g();
        C60856cj.m92911t(a, C47810es.m84974n(gVar), this.f355979d);
    }

    /* renamed from: b */
    public final void mo109202b() {
        C129746a aVar = this.f355980e;
        ((C59052c) ((C59052c) C129746a.f356047a.mo56224b()).mo56372aa(38443)).mo56386p("CMM started");
        aVar.f356048b.set(true);
        C60870cx a = this.f355981f.mo108509a(f355978c, f355977b, (Object) null);
        C129724g gVar = new C129724g();
        C60856cj.m92911t(a, C47810es.m84974n(gVar), this.f355979d);
    }

    /* renamed from: c */
    public final void mo109203c(int i) {
        this.f355980e.mo109221a();
        C128544a aVar = this.f355981f;
        C129712a aVar2 = (C129712a) C129715d.f355957c.createBuilder();
        C129713b bVar = (C129713b) C129714c.f355952d.createBuilder();
        bVar.copyOnWrite();
        C129714c cVar = (C129714c) bVar.instance;
        cVar.f355954a |= 1;
        cVar.f355955b = false;
        bVar.copyOnWrite();
        C129714c cVar2 = (C129714c) bVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            cVar2.f355956c = i2;
            cVar2.f355954a |= 2;
            aVar2.copyOnWrite();
            C129715d dVar = (C129715d) aVar2.instance;
            C129714c cVar3 = (C129714c) bVar.build();
            cVar3.getClass();
            dVar.f355960b = cVar3;
            dVar.f355959a = 1;
            C60856cj.m92911t(aVar.mo108509a((C129715d) aVar2.build(), f355977b, (Object) null), C47810es.m84974n(new C129724g()), this.f355979d);
            return;
        }
        throw null;
    }
}
