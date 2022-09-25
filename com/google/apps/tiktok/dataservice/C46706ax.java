package com.google.apps.tiktok.dataservice;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.ax */
/* compiled from: PG */
public final class C46706ax implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C46689ag f122008a;

    /* renamed from: b */
    final /* synthetic */ C60931s f122009b;

    /* renamed from: c */
    final /* synthetic */ Executor f122010c;

    public C46706ax(C46689ag agVar, C60931s sVar, Executor executor) {
        this.f122008a = agVar;
        this.f122009b = sVar;
        this.f122010c = executor;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return new C46463o(this.f122008a.mo18086a().f121591a.mo57273f(C47810es.m84968h(new C46705aw(this.f122009b, this.f122010c)), this.f122010c));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return this.f122008a.mo18087b();
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return this.f122008a.mo18088c();
    }

    public final String toString() {
        String obj = this.f122008a.toString();
        String obj2 = this.f122009b.toString();
        return "DataSources.transform(" + obj + ", " + obj2 + ")";
    }
}
