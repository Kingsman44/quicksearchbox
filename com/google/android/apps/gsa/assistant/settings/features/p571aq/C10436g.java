package com.google.android.apps.gsa.assistant.settings.features.p571aq;

import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18514b;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18515c;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18516d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aq.g */
/* compiled from: PG */
public final /* synthetic */ class C10436g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C18515c f35171a;

    public /* synthetic */ C10436g(C18515c cVar) {
        this.f35171a = cVar;
    }

    public final void accept(Object obj) {
        C18515c cVar = this.f35171a;
        cVar.copyOnWrite();
        C18516d dVar = (C18516d) cVar.instance;
        C18516d dVar2 = C18516d.f52474d;
        dVar.f52478c = ((C18514b) obj).f52473d;
        dVar.f52476a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
