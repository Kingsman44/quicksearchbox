package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9790c;

import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121036e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129660g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.c.f */
/* compiled from: PG */
public final class C129003f {

    /* renamed from: a */
    public static final C59071e f354437a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.c.f");

    /* renamed from: b */
    public final C127118j f354438b;

    /* renamed from: c */
    public final C46439e f354439c;

    /* renamed from: d */
    public final C129024a f354440d;

    /* renamed from: e */
    public final C121036e f354441e;

    /* renamed from: f */
    public final C129566ah f354442f;

    /* renamed from: g */
    public final C129004a f354443g = new C129004a();

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.c.f$a */
    /* compiled from: PG */
    final class C129004a implements C46440f {
        public C129004a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C129003f.f354437a.mo56226d()).mo56382g(th)).mo56372aa(38281)).mo56389s("%s failed.", (String) obj);
            C129003f.this.f354438b.mo107933i();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj2;
            ((C59052c) ((C59052c) C129003f.f354437a.mo56224b()).mo56372aa(38282)).mo56389s("%s succeeded.", (String) obj);
            C129003f.this.f354438b.mo107931g(C127407d.m208365e(C127454b.MIC_ICON));
            C129566ah ahVar = C129003f.this.f354442f;
            C129660g gVar = (C129660g) C129676j.f355890c.createBuilder();
            C129662i iVar = C129662i.INPUT;
            gVar.copyOnWrite();
            C129676j jVar = (C129676j) gVar.instance;
            jVar.f355893b = iVar.f355866l;
            jVar.f355892a |= 1;
            ahVar.mo109105a((C129676j) gVar.build());
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C129003f(C127118j jVar, C46439e eVar, C129024a aVar, C121036e eVar2, C129566ah ahVar) {
        this.f354438b = jVar;
        this.f354439c = eVar;
        this.f354440d = aVar;
        this.f354441e = eVar2;
        this.f354442f = ahVar;
    }
}
