package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65191ey;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ah */
/* compiled from: PG */
public final /* synthetic */ class C122572ah implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C65185es f339732a;

    public /* synthetic */ C122572ah(C65185es esVar) {
        this.f339732a = esVar;
    }

    public final void accept(Object obj) {
        C65185es esVar = this.f339732a;
        String str = (String) obj;
        esVar.copyOnWrite();
        C65191ey eyVar = C65191ey.f176424p;
        str.getClass();
        ((C65191ey) esVar.instance).f176429d = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
