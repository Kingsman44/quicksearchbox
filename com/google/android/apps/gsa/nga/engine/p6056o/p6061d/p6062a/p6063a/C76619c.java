package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6062a.p6063a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122381a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122408b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C76619c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122381a f211866a;

    public /* synthetic */ C76619c(C122381a aVar) {
        this.f211866a = aVar;
    }

    public final void accept(Object obj) {
        C122381a aVar = this.f211866a;
        long longValue = ((Long) obj).longValue();
        aVar.copyOnWrite();
        C122408b bVar = (C122408b) aVar.instance;
        C122408b bVar2 = C122408b.f339356h;
        bVar.f339358a |= 1;
        bVar.f339363f = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
