package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.assistant.p3793ae.p3794a.C48769a;
import com.google.assistant.p3793ae.p3794a.C48770b;
import com.google.assistant.p3793ae.p3794a.C48773e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.ac */
/* compiled from: PG */
public final /* synthetic */ class C122155ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48769a f338822a;

    public /* synthetic */ C122155ac(C48769a aVar) {
        this.f338822a = aVar;
    }

    public final void accept(Object obj) {
        C48769a aVar = this.f338822a;
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
