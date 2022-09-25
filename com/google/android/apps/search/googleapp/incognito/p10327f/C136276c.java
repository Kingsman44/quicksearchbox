package com.google.android.apps.search.googleapp.incognito.p10327f;

import android.content.Context;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60559uj;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.incognito.f.c */
/* compiled from: PG */
public final class C136276c implements C136272a {

    /* renamed from: a */
    public static final C59071e f371093a = C59071e.m91332i("com.google.android.apps.search.googleapp.incognito.f.c");

    /* renamed from: b */
    public final Context f371094b;

    /* renamed from: c */
    public final boolean f371095c;

    /* renamed from: d */
    private final Executor f371096d;

    /* renamed from: e */
    private final C136281h f371097e;

    public C136276c(boolean z, Context context, Executor executor, C136281h hVar) {
        this.f371094b = context;
        this.f371095c = z;
        this.f371096d = executor;
        this.f371097e = hVar;
    }

    /* renamed from: a */
    public final void mo112878a(C59743a aVar, C60559uj ujVar) {
        C136281h hVar = this.f371097e;
        C60870cx d = hVar.f371103c.mo46042d();
        C136278e eVar = new C136278e(hVar);
        C47633f g = C47633f.m84733g(C60922j.m93045h(d, C47810es.m84966f(eVar), C60826bg.f164896a));
        C136275b bVar = new C136275b(this, aVar, ujVar);
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(bVar), this.f371096d);
    }
}
