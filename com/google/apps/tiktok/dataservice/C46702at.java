package com.google.apps.tiktok.dataservice;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46465q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60806an;
import com.google.common.util.concurrent.C60808ap;
import com.google.common.util.concurrent.C60810ar;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.at */
/* compiled from: PG */
final class C46702at implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C46689ag f121997a;

    /* renamed from: b */
    final /* synthetic */ C46689ag f121998b;

    /* renamed from: c */
    final /* synthetic */ C46465q f121999c;

    /* renamed from: d */
    final /* synthetic */ Executor f122000d;

    /* renamed from: e */
    private final Object f122001e;

    public C46702at(C46689ag agVar, C46689ag agVar2, C46465q qVar, Executor executor) {
        this.f121997a = agVar;
        this.f121998b = agVar2;
        this.f121999c = qVar;
        this.f122000d = executor;
        Object c = agVar.mo18088c();
        c.getClass();
        Object c2 = agVar2.mo18088c();
        c2.getClass();
        this.f122001e = C46770cn.m83319c(c, c2);
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C60817ay ayVar = this.f121997a.mo18086a().f121591a;
        C60817ay ayVar2 = this.f121998b.mo18086a().f121591a;
        C60810ar a = C60817ay.m92814a(ayVar, ayVar2);
        C60808ap k = C47810es.m84971k(new C46701as(this.f121999c, ayVar, ayVar2));
        Executor executor = this.f122000d;
        C60817ay ayVar3 = new C60817ay(a.mo57267b().mo57335b(new C60806an(a, k), executor));
        ayVar3.f164884b.mo57261b(a.f164869a, C60826bg.f164896a);
        return new C46463o(ayVar3);
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return C60856cj.m92897f(this.f121997a.mo18087b(), this.f121998b.mo18087b());
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return this.f122001e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f121997a);
        String valueOf2 = String.valueOf(this.f121998b);
        return "DataSources.combine(" + valueOf + ", " + valueOf2 + ")";
    }
}
