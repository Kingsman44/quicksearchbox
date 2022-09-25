package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p813b;

import android.util.LruCache;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13316a;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58373cq;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.b.o */
/* compiled from: PG */
public final class C12526o implements C46675m {

    /* renamed from: a */
    public final boolean f39455a;

    /* renamed from: b */
    public final LruCache f39456b = new LruCache(10);

    /* renamed from: c */
    private final Executor f39457c;

    public C12526o(String str, Executor executor) {
        this.f39455a = C13316a.m29573b(str);
        this.f39457c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        Executor executor;
        if (oVar.mo50706f()) {
            executor = C60826bg.f164896a;
        } else {
            executor = this.f39457c;
        }
        return C47633f.m84733g(C60856cj.m92896e(C58485gu.m89842j(new C58373cq(this.f39456b.snapshot().values(), C12524m.f39453a)))).mo51515h(new C12525n(this), executor).mo51515h(C12522k.f39450a, executor);
    }
}
