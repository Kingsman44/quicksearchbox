package com.google.android.apps.search.googleapp.urlhandler.optimizer.p10532a;

import android.net.Uri;
import com.google.android.apps.gsa.p8867w.p8879i.C118803d;
import com.google.android.apps.search.googleapp.customtabs.p10152d.C133747h;
import com.google.android.apps.search.googleapp.customtabs.p10152d.C133749j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.optimizer.a.f */
/* compiled from: PG */
public final class C139835f implements C139840k {

    /* renamed from: a */
    public final C133749j f380096a;

    /* renamed from: b */
    public final C60888db f380097b;

    /* renamed from: c */
    private final C118803d f380098c;

    public C139835f(C133749j jVar, C118803d dVar, C60888db dbVar) {
        this.f380096a = jVar;
        this.f380097b = dbVar;
        this.f380098c = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo115300a() {
        C133749j jVar = this.f380096a;
        C60870cx a = jVar.f364293a.mo111386a();
        C133747h hVar = C133747h.f364291a;
        return C60922j.m93044g(a, C47810es.m84963c(hVar), jVar.f364294b);
    }

    /* renamed from: b */
    public final C60870cx mo115301b() {
        return C47633f.m84733g(this.f380096a.mo111384b()).mo51516i(C139830a.f380090a, this.f380097b).mo51515h(C139831b.f380091a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo115302c(Uri uri) {
        C60870cx a = this.f380098c.mo103972a();
        C139834e eVar = C139834e.f380095a;
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(eVar), this.f380097b);
        C139833d dVar = new C139833d(this, uri);
        return C60922j.m93045h(g, C47810es.m84966f(dVar), this.f380097b);
    }
}
