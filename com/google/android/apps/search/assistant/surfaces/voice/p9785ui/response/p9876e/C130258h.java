package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9876e;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127113e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127114f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9737a.C128580a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.e.h */
/* compiled from: PG */
public final class C130258h {

    /* renamed from: a */
    public static final C59071e f357097a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.response.e.h");

    /* renamed from: b */
    public final C130253c f357098b;

    /* renamed from: c */
    public final C127118j f357099c;

    /* renamed from: d */
    public final C46439e f357100d;

    /* renamed from: e */
    public final C130259a f357101e = new C130259a();

    /* renamed from: f */
    public final C47400m f357102f;

    /* renamed from: g */
    public final AccountId f357103g;

    /* renamed from: h */
    public final C46855i f357104h;

    /* renamed from: i */
    public final C128580a f357105i;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.e.h$a */
    /* compiled from: PG */
    final class C130259a implements C46440f {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C130258h.f357097a.mo56225c()).mo56382g(th)).mo56372aa(38791)).mo56386p("Interaction failed.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            ((C59052c) ((C59052c) C130258h.f357097a.mo56224b()).mo56372aa(38792)).mo56386p("Interaction succeeded.");
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C130258h(C46439e eVar, C127118j jVar, C130253c cVar, C47400m mVar, AccountId accountId, C46855i iVar, C128580a aVar) {
        this.f357100d = eVar;
        this.f357099c = jVar;
        this.f357098b = cVar;
        this.f357102f = mVar;
        this.f357103g = accountId;
        this.f357104h = iVar;
        this.f357105i = aVar;
    }

    /* renamed from: a */
    public final void mo109614a(C127050h hVar) {
        C127113e eVar = (C127113e) C127114f.f350009c.createBuilder();
        eVar.copyOnWrite();
        C127114f fVar = (C127114f) eVar.instance;
        fVar.f350012b = hVar.getNumber();
        fVar.f350011a |= 1;
        this.f357100d.mo50428h(C46438d.m82810b(this.f357099c.mo107932h((C127114f) eVar.build())).f121541a, (Object) null, this.f357101e);
    }
}
