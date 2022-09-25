package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.platform.p8988a.C119500b;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.x */
/* compiled from: PG */
public final class C132662x implements C47102r {

    /* renamed from: a */
    public final Context f362017a;

    /* renamed from: b */
    private final C60887da f362018b;

    /* renamed from: c */
    private final C119500b f362019c;

    /* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.x$a */
    /* compiled from: PG */
    public interface C132663a {
        /* renamed from: bA */
        C132665z mo110869bA();
    }

    public C132662x(Context context, C60887da daVar, C119500b bVar) {
        this.f362017a = context;
        this.f362018b = daVar;
        this.f362019c = bVar;
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        C60870cx a = this.f362019c.mo104411a(C132663a.class);
        C132661w wVar = new C132661w(this, intent);
        return C60922j.m93044g(a, C47810es.m84963c(wVar), this.f362018b);
    }
}
