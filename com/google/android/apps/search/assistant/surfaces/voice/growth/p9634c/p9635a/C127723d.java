package com.google.android.apps.search.assistant.surfaces.voice.growth.p9634c.p9635a;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36657a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.c.a.d */
/* compiled from: PG */
public final class C127723d {

    /* renamed from: a */
    public static final C59071e f351603a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.growth.c.a.d");

    /* renamed from: b */
    public final C36657a f351604b;

    /* renamed from: c */
    public final C46439e f351605c;

    /* renamed from: d */
    public final Context f351606d;

    /* renamed from: e */
    public final C127724a f351607e = new C127724a();

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.c.a.d$a */
    /* compiled from: PG */
    final class C127724a implements C46440f {
        public C127724a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C127723d.f351603a.mo56225c()).mo56382g(th)).mo56372aa(37655)).mo56386p("StartActivityCallback: onFailure");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C47810es.m84979s(C127723d.this.f351606d, (Intent) obj2);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C127723d(C127722c cVar, C36657a aVar, C46439e eVar) {
        this.f351606d = cVar.getContext();
        this.f351604b = aVar;
        this.f351605c = eVar;
    }
}
