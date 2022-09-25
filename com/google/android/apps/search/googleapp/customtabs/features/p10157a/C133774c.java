package com.google.android.apps.search.googleapp.customtabs.features.p10157a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.a.c */
/* compiled from: PG */
public final class C133774c {

    /* renamed from: a */
    public final Object f364382a = new Object();

    /* renamed from: b */
    public final C60836bq f364383b = new C60836bq();

    /* renamed from: c */
    public int f364384c = 0;

    /* renamed from: d */
    private C60870cx f364385d = null;

    /* renamed from: c */
    private final int m216993c(C60870cx cxVar) {
        int i;
        C60870cx cxVar2;
        synchronized (this.f364382a) {
            i = this.f364384c + 1;
            this.f364384c = i;
            cxVar2 = this.f364385d;
            this.f364385d = cxVar;
        }
        if (cxVar2 != null) {
            cxVar2.cancel(false);
        }
        return i;
    }

    /* renamed from: a */
    public final C60870cx mo111389a(C60870cx cxVar, C60931s sVar, Executor executor) {
        C133773b bVar = new C133773b(this, m216993c(cxVar), sVar, executor);
        return C60922j.m93045h(cxVar, C47810es.m84966f(bVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo111390b(C60930r rVar, Executor executor) {
        m216993c((C60870cx) null);
        return this.f364383b.mo57305b(rVar, executor);
    }
}
