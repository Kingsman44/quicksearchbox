package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.p4526f.C59071e;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.ab.av */
/* compiled from: PG */
public final /* synthetic */ class C32380av implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Map f86803a;

    public /* synthetic */ C32380av(Map map) {
        this.f86803a = map;
    }

    public final void accept(Object obj) {
        Map map = this.f86803a;
        C32365ag agVar = (C32365ag) obj;
        C59071e eVar = C32389bd.f86813a;
        map.put(agVar.f86761b, agVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
