package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1162f;

import androidx.work.WorkerParameters;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.C15755h;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.C15756i;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.C15757j;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.apps.tiktok.contrib.work.C46513b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.f.l */
/* compiled from: PG */
public final class C15750l implements C46513b {

    /* renamed from: a */
    public final Executor f46940a;

    /* renamed from: b */
    public final C15757j f46941b;

    /* renamed from: c */
    public final C15756i f46942c;

    /* renamed from: d */
    public final Set f46943d;

    /* renamed from: e */
    public final C15755h f46944e;

    /* renamed from: f */
    public final C69464a f46945f;

    /* renamed from: g */
    private final C16850a f46946g;

    public C15750l(C16850a aVar, C15757j jVar, C15756i iVar, Executor executor, Set set, C69464a aVar2, C15755h hVar) {
        this.f46941b = jVar;
        this.f46946g = aVar;
        this.f46942c = iVar;
        this.f46940a = executor;
        this.f46943d = set;
        this.f46944e = hVar;
        this.f46945f = aVar2;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C60870cx b = this.f46946g.mo23063b();
        C15740b bVar = new C15740b(this);
        return C60922j.m93045h(b, C47810es.m84966f(bVar), this.f46940a);
    }
}
