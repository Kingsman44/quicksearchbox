package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import com.google.android.libraries.mdi.C29690f;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bp */
/* compiled from: PG */
public final /* synthetic */ class C122257bp implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122260bs f339004a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f339005b;

    public /* synthetic */ C122257bp(C122260bs bsVar, Runnable runnable) {
        this.f339004a = bsVar;
        this.f339005b = runnable;
    }

    public final void accept(Object obj) {
        C122260bs bsVar = this.f339004a;
        Runnable runnable = this.f339005b;
        C29690f fVar = (C29690f) obj;
        bsVar.f339015f = C17072q.FINISHED_SUCCESS;
        bsVar.f339013d.ifPresent(new C122254bm(bsVar));
        runnable.run();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
