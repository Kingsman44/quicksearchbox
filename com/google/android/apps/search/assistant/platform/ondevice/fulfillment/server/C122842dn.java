package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65191ey;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dn */
/* compiled from: PG */
public final /* synthetic */ class C122842dn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C65185es f340236a;

    public /* synthetic */ C122842dn(C65185es esVar) {
        this.f340236a = esVar;
    }

    public final void accept(Object obj) {
        C65185es esVar = this.f340236a;
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
