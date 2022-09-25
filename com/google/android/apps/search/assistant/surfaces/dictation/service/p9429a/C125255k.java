package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125072b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.k */
/* compiled from: PG */
public final class C125255k {

    /* renamed from: a */
    public static final C59071e f345530a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.a.k");

    /* renamed from: b */
    public final C60888db f345531b;

    /* renamed from: c */
    public final Executor f345532c;

    /* renamed from: d */
    public final Executor f345533d;

    /* renamed from: e */
    public final C125193ak f345534e;

    /* renamed from: f */
    public final C126174c f345535f;

    /* renamed from: g */
    public final Duration f345536g;

    /* renamed from: h */
    public final Duration f345537h;

    /* renamed from: i */
    public final boolean f345538i;

    /* renamed from: j */
    public final boolean f345539j;

    /* renamed from: k */
    public final int f345540k;

    /* renamed from: l */
    public final Map f345541l = new HashMap();

    /* renamed from: m */
    public final AtomicLong f345542m = new AtomicLong(1);

    /* renamed from: n */
    public final int f345543n;

    public C125255k(C60888db dbVar, Executor executor, C125193ak akVar, C126174c cVar, C62910ar arVar, C62910ar arVar2, boolean z, boolean z2, long j) {
        this.f345531b = dbVar;
        this.f345532c = new C60904dr(dbVar);
        this.f345533d = executor;
        this.f345534e = akVar;
        this.f345543n = 5;
        this.f345535f = cVar;
        this.f345536g = C62950b.m95473d(arVar);
        this.f345537h = C62950b.m95473d(arVar2);
        this.f345538i = z;
        this.f345539j = z2;
        this.f345540k = (int) j;
    }

    /* renamed from: a */
    public final C60870cx mo106879a(C125258n nVar) {
        ((C59052c) ((C59052c) f345530a.mo56224b()).mo56372aa(36434)).mo56389s("Run AiAi availability check for '%s'. [SD]", nVar);
        C46423aj ajVar = new C46423aj(new C125248d(this, nVar), this.f345531b);
        this.f345541l.put(nVar, ajVar);
        return mo106880b(ajVar.mo50395b());
    }

    /* renamed from: b */
    public final C60870cx mo106880b(C60870cx cxVar) {
        C60870cx e = C126309ar.m206526e(C60856cj.m92901j(cxVar), this.f345536g, this.f345531b);
        C125209b bVar = C125209b.f345371a;
        return C60846c.m92878g(e, Throwable.class, C47810es.m84963c(bVar), this.f345531b);
    }

    /* renamed from: c */
    public final void mo106881c(C125258n nVar) {
        this.f345541l.remove(nVar);
    }

    /* renamed from: d */
    public final void mo106882d(long j, C125234by byVar, C125072b bVar) {
        this.f345535f.mo107404c(j, byVar.f345456b, bVar);
        C46459k.m82829b(byVar.mo106855c(), "Error when stopping %s after AiAi availability check [SD]", byVar);
    }
}
