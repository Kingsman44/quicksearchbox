package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bo */
/* compiled from: PG */
public final /* synthetic */ class C122256bo implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122260bs f339003a;

    public /* synthetic */ C122256bo(C122260bs bsVar) {
        this.f339003a = bsVar;
    }

    public final void accept(Object obj) {
        C122260bs bsVar = this.f339003a;
        bsVar.f339015f = C17072q.FINISHED_FAILURE;
        bsVar.f339016g = C122260bs.m201773b((Throwable) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
