package com.google.android.libraries.lens.sdk.p2045c;

import android.os.Bundle;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.sdk.c.n */
/* compiled from: PG */
public final /* synthetic */ class C24929n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Map.Entry f68050a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f68051b;

    public /* synthetic */ C24929n(Map.Entry entry, Consumer consumer) {
        this.f68050a = entry;
        this.f68051b = consumer;
    }

    public final void accept(Object obj) {
        Map.Entry entry = this.f68050a;
        Consumer consumer = this.f68051b;
        Bundle bundle = (Bundle) obj;
        bundle.putString("SessionType", (String) entry.getKey());
        consumer.accept(bundle);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
