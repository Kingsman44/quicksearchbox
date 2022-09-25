package com.google.android.libraries.storage.protostore;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.storage.protostore.al */
/* compiled from: PG */
public final /* synthetic */ class C42886al implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42905ba f112203a;

    public /* synthetic */ C42886al(C42905ba baVar) {
        this.f112203a = baVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C42905ba baVar = this.f112203a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicLong atomicLong = new AtomicLong(0);
        C60870cx f = baVar.f112246a.mo45990f((C42954cv) null);
        C60870cx h = C60922j.m93045h(f, C47810es.m84966f(new C42895au(baVar, atomicBoolean, atomicLong)), C60826bg.f164896a);
        C60856cj.m92911t(h, new C42896av(atomicBoolean), C60826bg.f164896a);
        return C60922j.m93045h(C60856cj.m92897f(f, h), C47810es.m84966f(new C42884aj(baVar, f, h, atomicBoolean, atomicLong)), C60826bg.f164896a);
    }
}
