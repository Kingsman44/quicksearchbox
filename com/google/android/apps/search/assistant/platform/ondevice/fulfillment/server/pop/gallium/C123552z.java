package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium;

import com.google.android.libraries.assistant.gallium.framework.C18229c;
import com.google.common.p4522b.C58480gp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.z */
/* compiled from: PG */
public final /* synthetic */ class C123552z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58480gp f341405a;

    public /* synthetic */ C123552z(C58480gp gpVar) {
        this.f341405a = gpVar;
    }

    public final void accept(Object obj) {
        C123180ae aeVar = (C123180ae) obj;
        this.f341405a.mo55395g(new C18229c(aeVar.mo39646a(), new C123176aa(aeVar)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
