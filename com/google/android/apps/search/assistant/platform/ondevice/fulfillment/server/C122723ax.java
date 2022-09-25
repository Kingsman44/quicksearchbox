package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122403av;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122436ca;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122437cb;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ax */
/* compiled from: PG */
public final /* synthetic */ class C122723ax implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122723ax f340035a = new C122723ax();

    private /* synthetic */ C122723ax() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122403av avVar = (C122403av) obj;
        C122436ca caVar = (C122436ca) C122437cb.f339434c.createBuilder();
        caVar.copyOnWrite();
        C122437cb cbVar = (C122437cb) caVar.instance;
        avVar.getClass();
        cbVar.f339437b = avVar;
        cbVar.f339436a = 1;
        return (C122437cb) caVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
