package com.google.android.libraries.search.rendering.xuikit.p3144e;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4648g.p4650b.C61641d;
import java.util.concurrent.Executor;
import p5488io.p5490b.C69807c;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69872g;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.e.b */
/* compiled from: PG */
public final /* synthetic */ class C40484b implements C69807c {

    /* renamed from: a */
    public final /* synthetic */ C61641d f106242a;

    /* renamed from: b */
    public final /* synthetic */ Executor f106243b;

    public /* synthetic */ C40484b(C61641d dVar, Executor executor) {
        this.f106242a = dVar;
        this.f106243b = executor;
    }

    /* renamed from: a */
    public final void mo25806a(C69872g gVar) {
        C61641d dVar = this.f106242a;
        Executor executor = this.f106243b;
        try {
            C60870cx cxVar = (C60870cx) dVar.get();
            cxVar.getClass();
            gVar.mo61502c(new C40485c(cxVar));
            C60856cj.m92911t(cxVar, C47810es.m84974n(new C40488f(gVar)), executor);
        } catch (Throwable th) {
            C69813f.m101292a(th);
            executor.execute(C47810es.m84977q(new C40486d(gVar, th)));
        }
    }
}
