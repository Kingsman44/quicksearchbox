package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9898b;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131195b;
import com.google.protobuf.C63042fg;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.b.c */
/* compiled from: PG */
public final /* synthetic */ class C130483c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Map f357459a;

    public /* synthetic */ C130483c(Map map) {
        this.f357459a = map;
    }

    public final void accept(Object obj) {
        Map map = this.f357459a;
        C131195b bVar = (C131195b) obj;
        Integer valueOf = Integer.valueOf(bVar.f358805d);
        C63042fg fgVar = bVar.f358806e;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        map.put(valueOf, fgVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
