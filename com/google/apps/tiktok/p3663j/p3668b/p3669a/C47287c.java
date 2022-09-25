package com.google.apps.tiktok.p3663j.p3668b.p3669a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.p3663j.p3668b.C47306an;
import com.google.apps.tiktok.p3663j.p3668b.C47307ao;
import com.google.apps.tiktok.p3663j.p3668b.C47308ap;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.j.b.a.c */
/* compiled from: PG */
public final class C47287c implements C47306an {

    /* renamed from: a */
    public final C46578l f122940a;

    /* renamed from: b */
    public final C21370a f122941b;

    /* renamed from: c */
    private final C47308ap f122942c;

    /* renamed from: d */
    private final Executor f122943d;

    public C47287c(C46578l lVar, C47308ap apVar, C21370a aVar, Executor executor) {
        this.f122940a = lVar;
        this.f122942c = apVar;
        this.f122941b = aVar;
        this.f122943d = executor;
    }

    /* renamed from: a */
    public final C60870cx mo51175a(Set set, long j, Map map) {
        C47308ap apVar = this.f122942c;
        return C60922j.m93045h(C60922j.m93044g(apVar.f122973b.mo51181b(), C47810es.m84963c(new C47307ao(apVar, map, set, j)), apVar.f122974c), C47810es.m84966f(new C47285a(this)), this.f122943d);
    }
}
