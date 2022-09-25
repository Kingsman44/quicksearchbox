package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.v */
/* compiled from: PG */
public final /* synthetic */ class C125367v implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f345775a;

    public /* synthetic */ C125367v(AtomicReference atomicReference) {
        this.f345775a = atomicReference;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        this.f345775a.set(Optional.m71637of(cVar));
        return "invalidatedFuture";
    }
}
