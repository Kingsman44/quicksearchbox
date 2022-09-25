package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.exithandler;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127113e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127114f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129540c;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.exithandler.ExitHandler */
/* compiled from: PG */
public final class ExitHandler implements C2376g {

    /* renamed from: a */
    private final C129540c f356116a;

    /* renamed from: b */
    private final C46439e f356117b;

    /* renamed from: c */
    private final C127118j f356118c;

    /* renamed from: d */
    private final C129783a f356119d = new C129783a();

    /* renamed from: e */
    private final C129784b f356120e = new C129784b();

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.exithandler.ExitHandler$a */
    /* compiled from: PG */
    final class C129783a implements C46440f {

        /* renamed from: a */
        private static final C59071e f356121a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.exithandler.ExitHandler$a");

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) f356121a.mo56225c()).mo56382g(th)).mo56372aa(38447)).mo56386p("Failed to start interaction for ui.TAP_EXIT_THIRD_PARTY client input");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            ((C59052c) ((C59052c) f356121a.mo56224b()).mo56372aa(38448)).mo56386p("Exit third party interaction succeeded.");
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.exithandler.ExitHandler$b */
    /* compiled from: PG */
    final class C129784b implements C46440f {

        /* renamed from: a */
        private static final C59071e f356122a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.exithandler.ExitHandler$b");

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) f356122a.mo56225c()).mo56382g(th)).mo56372aa(38449)).mo56386p("Stop interaction failure.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            ((C59052c) ((C59052c) f356122a.mo56224b()).mo56372aa(38450)).mo56386p("Stop interaction succeeded.");
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public ExitHandler(C129540c cVar, C46439e eVar, C127118j jVar) {
        this.f356116a = cVar;
        this.f356117b = eVar;
        this.f356118c = jVar;
    }

    /* renamed from: g */
    public final void mo109262g() {
        C127113e eVar = (C127113e) C127114f.f350009c.createBuilder();
        C127050h hVar = C127050h.EXIT_CANVAS;
        eVar.copyOnWrite();
        C127114f fVar = (C127114f) eVar.instance;
        fVar.f350012b = hVar.getNumber();
        fVar.f350011a |= 1;
        this.f356117b.mo50428h(C46438d.m82810b(this.f356118c.mo107932h((C127114f) eVar.build())).f121541a, (Object) null, this.f356120e);
        C46439e eVar2 = this.f356117b;
        C127118j jVar = this.f356118c;
        C127454b bVar = C127454b.CLIENT_INPUT;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "ui.TAP_EXIT_THIRD_PARTY";
        eVar2.mo50428h(C46438d.m82810b(jVar.mo107931g(C127407d.m208361a(bVar, (C51805du) dsVar.build()))).f121541a, (Object) null, this.f356119d);
        this.f356116a.mo109080a();
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f356117b.mo50429i(this.f356120e);
        this.f356117b.mo50429i(this.f356119d);
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
