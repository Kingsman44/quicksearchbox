package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bq */
/* compiled from: PG */
public final /* synthetic */ class C122258bq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122260bs f339006a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f339007b;

    public /* synthetic */ C122258bq(C122260bs bsVar, Runnable runnable) {
        this.f339006a = bsVar;
        this.f339007b = runnable;
    }

    public final void accept(Object obj) {
        C122260bs bsVar = this.f339006a;
        Runnable runnable = this.f339007b;
        bsVar.f339015f = C17072q.FINISHED_FAILURE;
        bsVar.f339016g = C122260bs.m201773b((Throwable) obj);
        runnable.run();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
