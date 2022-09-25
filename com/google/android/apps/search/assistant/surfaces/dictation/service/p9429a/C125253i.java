package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125072b;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.i */
/* compiled from: PG */
public final /* synthetic */ class C125253i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125255k f345522a;

    /* renamed from: b */
    public final /* synthetic */ long f345523b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f345524c;

    public /* synthetic */ C125253i(C125255k kVar, long j, AtomicReference atomicReference) {
        this.f345522a = kVar;
        this.f345523b = j;
        this.f345524c = atomicReference;
    }

    public final void accept(Object obj) {
        C125072b bVar;
        C125255k kVar = this.f345522a;
        long j = this.f345523b;
        Throwable th = (Throwable) obj;
        C125234by byVar = (C125234by) this.f345524c.get();
        ((C59052c) ((C59052c) ((C59052c) C125255k.f345530a.mo56226d()).mo56382g(th)).mo56372aa(36435)).mo56386p("AiAi availability check failed. [SD]");
        if (th instanceof TimeoutException) {
            bVar = C125072b.AIAI_UNAVAILABLE_TIMEOUT;
        } else {
            bVar = C125072b.AIAI_UNAVAILABLE_REASON_UNKNOWN;
        }
        kVar.mo106882d(j, byVar, bVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
