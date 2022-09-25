package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125072b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.f */
/* compiled from: PG */
public final /* synthetic */ class C125250f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125255k f345516a;

    /* renamed from: b */
    public final /* synthetic */ long f345517b;

    public /* synthetic */ C125250f(C125255k kVar, long j) {
        this.f345516a = kVar;
        this.f345517b = j;
    }

    public final void accept(Object obj) {
        C125255k kVar = this.f345516a;
        long j = this.f345517b;
        if (((C125072b) obj).equals(C125072b.AIAI_UNAVAILABLE_TIMEOUT)) {
            kVar.f345535f.mo107407f(j);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
