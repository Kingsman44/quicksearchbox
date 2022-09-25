package com.google.android.apps.gsa.sidekick.shared.p7241j;

import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.j.g */
/* compiled from: PG */
public final /* synthetic */ class C91751g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Map f255876a;

    public /* synthetic */ C91751g(Map map) {
        this.f255876a = map;
    }

    public final void accept(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Map.EL.putIfAbsent(this.f255876a, (String) entry.getKey(), (String) entry.getValue());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
