package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e;

import org.json.JSONArray;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.e.g */
/* compiled from: PG */
public final /* synthetic */ class C122862g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ JSONArray f340293a;

    public /* synthetic */ C122862g(JSONArray jSONArray) {
        this.f340293a = jSONArray;
    }

    public final void accept(Object obj) {
        this.f340293a.put(((String) obj).length());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
