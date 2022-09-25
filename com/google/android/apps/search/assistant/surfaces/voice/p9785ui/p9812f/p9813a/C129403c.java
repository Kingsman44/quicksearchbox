package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9813a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36657a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.a.c */
/* compiled from: PG */
public final class C129403c {

    /* renamed from: a */
    public static final C59071e f355334a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.f.a.c");

    /* renamed from: b */
    public final C36657a f355335b;

    /* renamed from: c */
    public final C46439e f355336c;

    /* renamed from: d */
    public final Context f355337d;

    /* renamed from: e */
    public final C127118j f355338e;

    /* renamed from: f */
    public final C129024a f355339f;

    /* renamed from: g */
    public final C129404a f355340g = new C129404a();

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.a.c$a */
    /* compiled from: PG */
    final class C129404a implements C46440f {
        public C129404a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C129403c.f355334a.mo56225c()).mo56382g(th)).mo56372aa(38539)).mo56386p("StartActivityCallback: onFailure");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C47810es.m84979s(C129403c.this.f355337d, (Intent) obj2);
            C129403c.this.f355338e.mo107933i();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C129403c(C129402b bVar, C36657a aVar, C46439e eVar, C127118j jVar, C129024a aVar2) {
        this.f355337d = bVar.getContext();
        this.f355335b = aVar;
        this.f355336c = eVar;
        this.f355338e = jVar;
        this.f355339f = aVar2;
    }
}
