package com.google.apps.tiktok.dataservice;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60800ah;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.bc */
/* compiled from: PG */
public final class C46719bc implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C46464p f122034a;

    /* renamed from: b */
    public final /* synthetic */ Object f122035b;

    /* renamed from: c */
    final /* synthetic */ C46723bg f122036c;

    public C46719bc(C46723bg bgVar, C46464p pVar, Object obj) {
        this.f122036c = bgVar;
        this.f122034a = pVar;
        this.f122035b = obj;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return new C46463o(new C60817ay((C60800ah) new C46717ba(this.f122034a), (Executor) C60826bg.f164896a).mo57272e(C47810es.m84970j(new C46718bb(this)), C60826bg.f164896a));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return this.f122035b;
    }

    public final String toString() {
        String obj = this.f122034a.toString();
        return "LocalDataSource[" + obj + "]";
    }
}
