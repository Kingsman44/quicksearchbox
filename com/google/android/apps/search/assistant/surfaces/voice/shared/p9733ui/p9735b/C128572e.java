package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9735b;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.b.e */
/* compiled from: PG */
public final class C128572e {

    /* renamed from: a */
    public static final C59071e f353526a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.shared.ui.b.e");

    /* renamed from: b */
    public final C128569b f353527b;

    /* renamed from: c */
    final C36624a f353528c;

    /* renamed from: d */
    public final Executor f353529d;

    /* renamed from: e */
    final C126879a f353530e;

    /* renamed from: f */
    public final Optional f353531f;

    /* renamed from: g */
    public final C46439e f353532g;

    /* renamed from: h */
    public final C46440f f353533h = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C128572e.f353526a.mo56225c()).mo56382g(th)).mo56372aa(37893)).mo56389s("Failure related to starting intent to open URL. Intent: %s", (Intent) obj);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Intent intent = (Intent) obj;
            Void voidR = (Void) obj2;
            C128572e eVar = C128572e.this;
            Optional optional = eVar.f353531f;
            optional.getClass();
            eVar.f353532g.getClass();
            optional.ifPresent(new C128571d(this));
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: i */
    public final C46440f f353534i = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C128572e.f353526a.mo56225c()).mo56382g(th)).mo56372aa(37895)).mo56386p("Failure to dismiss Assistant");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    public C128572e(C128569b bVar, C36624a aVar, Executor executor, C126879a aVar2, Optional optional, C46439e eVar) {
        this.f353527b = bVar;
        this.f353528c = aVar;
        this.f353529d = executor;
        this.f353530e = aVar2;
        this.f353531f = optional;
        this.f353532g = eVar;
    }
}
