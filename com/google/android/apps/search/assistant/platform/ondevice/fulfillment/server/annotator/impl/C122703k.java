package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl;

import com.google.android.apps.gsa.nga.engine.annotators.ca;
import com.google.android.apps.gsa.nga.engine.annotators.cb;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.k */
/* compiled from: PG */
public final /* synthetic */ class C122703k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ ca f339978a;

    public /* synthetic */ C122703k(ca caVar) {
        this.f339978a = caVar;
    }

    public final void accept(Object obj) {
        ca caVar = this.f339978a;
        String str = (String) obj;
        caVar.copyOnWrite();
        cb cbVar = caVar.instance;
        cb cbVar2 = cb.j;
        str.getClass();
        cbVar.a |= 128;
        cbVar.i = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
