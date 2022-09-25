package com.google.android.libraries.storage.protostore;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.dk */
/* compiled from: PG */
public final /* synthetic */ class C42975dk implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42981dq f112406a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f112407b;

    /* renamed from: c */
    public final /* synthetic */ C60931s f112408c;

    /* renamed from: d */
    public final /* synthetic */ Executor f112409d;

    public /* synthetic */ C42975dk(C42981dq dqVar, C60870cx cxVar, C60931s sVar, Executor executor) {
        this.f112406a = dqVar;
        this.f112407b = cxVar;
        this.f112408c = sVar;
        this.f112409d = executor;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C42981dq dqVar = this.f112406a;
        C60870cx cxVar = this.f112407b;
        C60931s sVar = this.f112408c;
        Executor executor = this.f112409d;
        C60870cx h = C60922j.m93045h(cxVar, new C42976dl(dqVar), C60826bg.f164896a);
        C60870cx h2 = C60922j.m93045h(h, sVar, executor);
        return C60922j.m93045h(h2, C47810es.m84966f(new C42972dh(dqVar, h, h2)), C60826bg.f164896a);
    }
}
