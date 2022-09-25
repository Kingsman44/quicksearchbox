package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.z */
/* compiled from: PG */
public final /* synthetic */ class C126282z implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347944a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f347945b;

    public /* synthetic */ C126282z(C126208av avVar, AtomicReference atomicReference) {
        this.f347944a = avVar;
        this.f347945b = atomicReference;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C126208av avVar = this.f347944a;
        this.f347945b.set(cVar);
        long j = avVar.f347761j;
        return "Oration#" + j + ".orationResponseStreamCompleted";
    }
}
