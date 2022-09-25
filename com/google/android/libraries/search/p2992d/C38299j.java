package com.google.android.libraries.search.p2992d;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.d.j */
/* compiled from: PG */
public final class C38299j implements C69464a {

    /* renamed from: a */
    public final C38296g f101467a;

    /* renamed from: b */
    public final Set f101468b;

    /* renamed from: c */
    private final Executor f101469c;

    public C38299j(C38296g gVar, Executor executor, Set set) {
        this.f101467a = gVar;
        this.f101469c = executor;
        this.f101468b = set;
    }

    /* renamed from: a */
    public final C60870cx mo17428b() {
        return mo41364c(this.f101467a.mo41362a(this.f101468b, false));
    }

    /* renamed from: c */
    public final C60870cx mo41364c(C60870cx cxVar) {
        C47558bi a = C47831fm.m85006a("Add bearer to header");
        try {
            C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(C38298i.f101466a), this.f101469c);
            a.mo51417a(h);
            a.close();
            return h;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
