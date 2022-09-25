package com.google.android.apps.search.googleapp.search.p10411g;

import com.google.android.libraries.search.location.C38683aa;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.search.g.c */
/* compiled from: PG */
public final class C137454c {

    /* renamed from: a */
    public final C38683aa f373854a;

    /* renamed from: b */
    private final Executor f373855b;

    /* renamed from: c */
    private final C137458g f373856c;

    public C137454c(C38683aa aaVar, Executor executor, C137458g gVar) {
        this.f373854a = aaVar;
        this.f373855b = executor;
        this.f373856c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo113746a() {
        C47558bi a = C47831fm.m85006a("Get location header");
        try {
            C137458g gVar = this.f373856c;
            C60870cx a2 = gVar.f373863d.mo50251a();
            C137457f fVar = new C137457f(gVar);
            C60870cx h = C60922j.m93045h(a2, C47810es.m84966f(fVar), gVar.f373862c);
            C137452a aVar = new C137452a(this);
            C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(aVar), this.f373855b);
            C137453b bVar = C137453b.f373853a;
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
