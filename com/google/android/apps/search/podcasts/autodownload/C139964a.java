package com.google.android.apps.search.podcasts.autodownload;

import android.content.Context;
import com.google.android.apps.search.podcasts.p10576l.C140498j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.autodownload.a */
/* compiled from: PG */
public final class C139964a {

    /* renamed from: a */
    public final Context f380450a;

    /* renamed from: b */
    public final C140498j f380451b;

    /* renamed from: c */
    private final C47632e f380452c = new C47632e();

    /* renamed from: com.google.android.apps.search.podcasts.autodownload.a$a */
    /* compiled from: PG */
    public interface C139965a {
        /* renamed from: hz */
        C68214a mo115369hz();
    }

    public C139964a(Context context, C140498j jVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(jVar, "devicePreferencesManager");
        this.f380450a = context;
        this.f380451b = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo115368a() {
        C60870cx b = this.f380452c.mo51512b(new C139967c(this), C60826bg.f164896a);
        C69664n.m101060f(b, "fun start(): ListenableF…irectExecutor()\n    )\n  }");
        return b;
    }
}
