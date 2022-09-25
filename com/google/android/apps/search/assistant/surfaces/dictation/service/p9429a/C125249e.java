package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.e */
/* compiled from: PG */
public final /* synthetic */ class C125249e implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C125255k f345512a;

    /* renamed from: b */
    public final /* synthetic */ long f345513b;

    /* renamed from: c */
    public final /* synthetic */ C125258n f345514c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReference f345515d;

    public /* synthetic */ C125249e(C125255k kVar, long j, C125258n nVar, AtomicReference atomicReference) {
        this.f345512a = kVar;
        this.f345513b = j;
        this.f345514c = nVar;
        this.f345515d = atomicReference;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C125255k kVar = this.f345512a;
        long j = this.f345513b;
        C125258n nVar = this.f345514c;
        AtomicReference atomicReference = this.f345515d;
        C125234by a = kVar.f345534e.mo66634a(new C125254j(cVar, kVar.f345538i, kVar.f345535f, j), nVar);
        atomicReference.set(a);
        C46459k.m82829b(a.mo106854b(), "Error when starting %s [SD]", a);
        if (!kVar.f345538i) {
            return "AiAi availability check.";
        }
        C125236c cVar2 = new C125236c(kVar, a);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(cVar2), kVar.f345533d), "Error when sending empty audio for AiAi availability check to %s [SD]", a);
        return "AiAi availability check.";
    }
}
