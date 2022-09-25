package com.google.apps.tiktok.dataservice;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.az */
/* compiled from: PG */
public final class C46708az extends C46722bf {

    /* renamed from: a */
    final /* synthetic */ C46689ag f122013a;

    /* renamed from: b */
    final /* synthetic */ C60931s f122014b;

    /* renamed from: c */
    final /* synthetic */ Executor f122015c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46708az(C46689ag agVar, C46689ag agVar2, C60931s sVar, Executor executor) {
        super(agVar);
        this.f122013a = agVar2;
        this.f122014b = sVar;
        this.f122015c = executor;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return new C46463o(this.f122013a.mo18086a().f121591a.mo57273f(C47810es.m84968h(new C46707ay(this.f122014b, this.f122015c)), this.f122015c));
    }
}
