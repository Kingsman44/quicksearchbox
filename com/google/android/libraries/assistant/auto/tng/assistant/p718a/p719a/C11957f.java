package com.google.android.libraries.assistant.auto.tng.assistant.p718a.p719a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.a.a.f */
/* compiled from: PG */
public final class C11957f {

    /* renamed from: a */
    public static final C59071e f38407a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.a.a.f");

    /* renamed from: b */
    public final C60870cx f38408b;

    /* renamed from: c */
    public final C11962k f38409c;

    /* renamed from: d */
    public final AtomicBoolean f38410d = new AtomicBoolean();

    /* renamed from: e */
    public final Executor f38411e;

    public C11957f(C60870cx cxVar, C11953b bVar, Executor executor, C11963l lVar) {
        this.f38408b = cxVar;
        bVar.getClass();
        C11961j jVar = (C11961j) lVar.f38423a.mo17428b();
        jVar.getClass();
        C15481g gVar = (C15481g) lVar.f38424b.mo17428b();
        gVar.getClass();
        this.f38409c = new C11962k(bVar, jVar, gVar, lVar.f38425c);
        this.f38411e = executor;
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C11956e(this)), executor);
    }

    /* renamed from: a */
    public final void mo20335a() {
        this.f38410d.set(true);
        C11962k kVar = this.f38409c;
        kVar.f38418a.set(true);
        kVar.f38419b.mo20336a();
    }
}
