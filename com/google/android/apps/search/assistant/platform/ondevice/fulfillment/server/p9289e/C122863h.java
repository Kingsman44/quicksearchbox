package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e;

import com.google.p4152bb.p4153a.C55101fx;
import org.json.JSONArray;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.e.h */
/* compiled from: PG */
public final /* synthetic */ class C122863h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ JSONArray f340294a;

    public /* synthetic */ C122863h(JSONArray jSONArray) {
        this.f340294a = jSONArray;
    }

    public final void accept(Object obj) {
        this.f340294a.put(((C55101fx) obj).f144994b.length());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
