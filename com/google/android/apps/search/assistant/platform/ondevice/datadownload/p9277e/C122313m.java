package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e;

import com.google.assistant.p3793ae.p3794a.C48769a;
import com.google.assistant.p3793ae.p3794a.C48770b;
import com.google.assistant.p3793ae.p3794a.C48773e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.m */
/* compiled from: PG */
public final /* synthetic */ class C122313m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48769a f339168a;

    public /* synthetic */ C122313m(C48769a aVar) {
        this.f339168a = aVar;
    }

    public final void accept(Object obj) {
        C48769a aVar = this.f339168a;
        C48773e eVar = (C48773e) obj;
        aVar.copyOnWrite();
        C48770b bVar = C48770b.f126194c;
        eVar.getClass();
        ((C48770b) aVar.instance).f126197b = eVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
