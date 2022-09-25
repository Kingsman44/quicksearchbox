package com.google.apps.tiktok.dataservice;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.av */
/* compiled from: PG */
public final class C46704av implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C46689ag f122003a;

    /* renamed from: b */
    final /* synthetic */ C58817ah f122004b;

    /* renamed from: c */
    final /* synthetic */ Executor f122005c;

    public C46704av(C46689ag agVar, C58817ah ahVar, Executor executor) {
        this.f122003a = agVar;
        this.f122004b = ahVar;
        this.f122005c = executor;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return new C46463o(this.f122003a.mo18086a().f121591a.mo57272e(C47810es.m84970j(new C46703au(this.f122004b)), this.f122005c));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return this.f122003a.mo18087b();
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return this.f122003a.mo18088c();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f122003a);
        String valueOf2 = String.valueOf(this.f122004b);
        return "DataSources.transform(" + valueOf + ", " + valueOf2 + ")";
    }
}
