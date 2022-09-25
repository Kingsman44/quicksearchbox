package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.platform.p8988a.C119500b;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.k */
/* compiled from: PG */
public final class C132647k implements C47102r {

    /* renamed from: a */
    public final Context f361987a;

    /* renamed from: b */
    private final C60887da f361988b;

    /* renamed from: c */
    private final C119500b f361989c;

    /* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.k$a */
    /* compiled from: PG */
    public interface C132648a {
        /* renamed from: bz */
        C132649l mo110859bz();
    }

    public C132647k(Context context, C60887da daVar, C119500b bVar) {
        this.f361987a = context;
        this.f361988b = daVar;
        this.f361989c = bVar;
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        C60870cx a = this.f361989c.mo104411a(C132648a.class);
        C132646j jVar = new C132646j(this, intent);
        return C60922j.m93044g(a, C47810es.m84963c(jVar), this.f361988b);
    }
}
