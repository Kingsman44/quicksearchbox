package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119796ar;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119798at;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119870dk;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119874do;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a.C33437e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60904dr;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.aa */
/* compiled from: PG */
public final class C119944aa {

    /* renamed from: a */
    public final C119789ak f334026a;

    /* renamed from: b */
    public final Executor f334027b;

    /* renamed from: c */
    public final Map f334028c = new HashMap();

    /* renamed from: d */
    public boolean f334029d = false;

    /* renamed from: e */
    public boolean f334030e = false;

    /* renamed from: f */
    public final C33437e f334031f;

    /* renamed from: g */
    private final AtomicLong f334032g = new AtomicLong(1);

    /* renamed from: h */
    private final C119996j f334033h;

    public C119944aa(C119981bh bhVar, Executor executor, C119996j jVar, C33437e eVar) {
        this.f334026a = ((C119990d) bhVar).f334111a;
        this.f334027b = new C60904dr(executor);
        this.f334033h = jVar;
        this.f334031f = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C119908e mo104582a(C119796ar arVar) {
        C120012z zVar = new C120012z(this, this.f334032g.getAndIncrement());
        this.f334027b.execute(C47810es.m84977q(new C120004r(this, zVar, arVar)));
        return zVar;
    }

    /* renamed from: b */
    public final void mo104583b(C119798at atVar) {
        C119996j jVar = this.f334033h;
        C119870dk dkVar = (C119870dk) C119874do.f333841c.createBuilder();
        dkVar.copyOnWrite();
        C119874do doVar = (C119874do) dkVar.instance;
        atVar.getClass();
        doVar.f333844b = atVar;
        doVar.f333843a = 4;
        jVar.mo104614b((C119874do) dkVar.build());
    }
}
