package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import com.google.android.libraries.assistant.p1363c.p1371b.p1377e.C17121c;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bn */
/* compiled from: PG */
public final /* synthetic */ class C122255bn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122260bs f339002a;

    public /* synthetic */ C122255bn(C122260bs bsVar) {
        this.f339002a = bsVar;
    }

    public final void accept(Object obj) {
        C122260bs bsVar = this.f339002a;
        C17121c cVar = (C17121c) obj;
        if (!cVar.mo23186b() && cVar.mo23185a().isEmpty()) {
            bsVar.f339015f = C17072q.FINISHED_FAILURE;
            bsVar.f339016g = "Neither a downloaded nor a pending group was found";
            throw new IllegalStateException(bsVar.f339016g);
        } else if (cVar.mo23185a().isPresent()) {
            bsVar.f339013d = cVar.mo23185a();
        } else {
            bsVar.f339013d = Optional.m71637of(0L);
            bsVar.f339015f = C17072q.FINISHED_SUCCESS;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
