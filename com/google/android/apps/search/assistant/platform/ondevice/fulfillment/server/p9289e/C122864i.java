package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e;

import com.google.p4152bb.p4153a.C55084fg;
import org.json.JSONArray;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.e.i */
/* compiled from: PG */
public final /* synthetic */ class C122864i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ JSONArray f340295a;

    public /* synthetic */ C122864i(JSONArray jSONArray) {
        this.f340295a = jSONArray;
    }

    public final void accept(Object obj) {
        this.f340295a.put(((C55084fg) obj).name());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
