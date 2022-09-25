package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9786a;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9786a.p9787a.p9788a.C128984d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.a.f */
/* compiled from: PG */
public final class C128989f {

    /* renamed from: a */
    public static final C59071e f354409a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.a.f");

    /* renamed from: b */
    public final AccountId f354410b;

    /* renamed from: c */
    public final C127118j f354411c;

    /* renamed from: d */
    public final C46439e f354412d;

    /* renamed from: e */
    public final C126879a f354413e;

    /* renamed from: f */
    public final C129024a f354414f;

    /* renamed from: g */
    public final C46440f f354415g = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C128989f.f354409a.mo56225c()).mo56382g(th)).mo56372aa(38081)).mo56386p("Can't get recovery intent.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Intent intent = (Intent) obj2;
            if (C128989f.this.f354413e != null && intent != null && intent.getAction() != null) {
                ((C59052c) ((C59052c) C128989f.f354409a.mo56224b()).mo56372aa(38083)).mo56389s("Starting recovery activity: %s.", intent);
                C128989f.this.f354413e.mo39653g(intent);
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: h */
    public final C128984d f354416h;

    public C128989f(AccountId accountId, C127118j jVar, C128984d dVar, C46439e eVar, C126879a aVar, C129024a aVar2) {
        this.f354410b = accountId;
        this.f354411c = jVar;
        this.f354416h = dVar;
        this.f354412d = eVar;
        this.f354413e = aVar;
        this.f354414f = aVar2;
    }
}
