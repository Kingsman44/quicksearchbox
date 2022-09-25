package com.google.android.apps.search.assistant.verticals.recommend.p10072c;

import com.google.android.libraries.search.location.C38683aa;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.recommend.c.c */
/* compiled from: PG */
public final class C132519c {

    /* renamed from: a */
    public final C38683aa f361670a;

    /* renamed from: b */
    private final Executor f361671b;

    /* renamed from: c */
    private final C132523g f361672c;

    public C132519c(C38683aa aaVar, Executor executor, C132523g gVar) {
        this.f361670a = aaVar;
        this.f361671b = executor;
        this.f361672c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo110792a() {
        C47558bi a = C47831fm.m85006a("Get location header");
        try {
            C132523g gVar = this.f361672c;
            C60870cx a2 = gVar.f361680e.mo50251a();
            C132521e eVar = new C132521e(gVar);
            C60870cx h = C60922j.m93045h(a2, C47810es.m84966f(eVar), gVar.f361678c);
            C132517a aVar = new C132517a(this);
            C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(aVar), this.f361671b);
            C132518b bVar = C132518b.f361669a;
            C60870cx g = C60922j.m93044g(h2, C47810es.m84963c(bVar), C60826bg.f164896a);
            a.mo51417a(g);
            a.close();
            return g;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
