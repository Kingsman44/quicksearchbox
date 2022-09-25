package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125072b;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.h */
/* compiled from: PG */
public final /* synthetic */ class C125252h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125255k f345519a;

    /* renamed from: b */
    public final /* synthetic */ long f345520b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f345521c;

    public /* synthetic */ C125252h(C125255k kVar, long j, AtomicReference atomicReference) {
        this.f345519a = kVar;
        this.f345520b = j;
        this.f345521c = atomicReference;
    }

    public final void accept(Object obj) {
        this.f345519a.mo106882d(this.f345520b, (C125234by) this.f345521c.get(), (C125072b) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
