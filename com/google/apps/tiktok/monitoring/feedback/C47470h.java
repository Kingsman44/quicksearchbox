package com.google.apps.tiktok.monitoring.feedback;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.h */
/* compiled from: PG */
public final /* synthetic */ class C47470h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f123271a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f123272b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f123273c;

    public /* synthetic */ C47470h(C60870cx cxVar, C60870cx cxVar2, C58833ax axVar) {
        this.f123271a = cxVar;
        this.f123272b = cxVar2;
        this.f123273c = axVar;
    }

    public final Object call() {
        C60870cx cxVar = this.f123271a;
        C60870cx cxVar2 = this.f123272b;
        return new C47464b((C58833ax) C60856cj.m92909r(cxVar), C58495hd.m89898l((Map) C60856cj.m92909r(cxVar2)), this.f123273c);
    }
}
