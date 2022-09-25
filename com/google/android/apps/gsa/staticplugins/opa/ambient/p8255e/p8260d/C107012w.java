package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C106864c;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.d.w */
/* compiled from: PG */
public final /* synthetic */ class C107012w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C106989ao f298030a;

    public /* synthetic */ C107012w(C106989ao aoVar) {
        this.f298030a = aoVar;
    }

    public final void accept(Object obj) {
        ((C58970a) ((C58970a) this.f298030a.f297978a.mo56224b()).mo56372aa(23438)).mo56389s("Selected producer: %s", ((C106864c) ((Map.Entry) obj).getValue()).getClass().getSimpleName());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
