package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122383ab;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122384ac;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.C122107b;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ar */
/* compiled from: PG */
public final /* synthetic */ class C122717ar implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122717ar f340011a = new C122717ar();

    private /* synthetic */ C122717ar() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122107b bVar = (C122107b) obj;
        C122383ab abVar = (C122383ab) C122384ac.f339296c.createBuilder();
        C122106o a = bVar.mo105527a();
        abVar.copyOnWrite();
        a.getClass();
        ((C122384ac) abVar.instance).f339298a = a;
        String b = bVar.mo105528b();
        abVar.copyOnWrite();
        b.getClass();
        ((C122384ac) abVar.instance).f339299b = b;
        return (C122384ac) abVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
