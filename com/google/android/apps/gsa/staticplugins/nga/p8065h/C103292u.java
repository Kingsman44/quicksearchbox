package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.common.p4535g.C59203do;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.u */
/* compiled from: PG */
public final /* synthetic */ class C103292u implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Map f288092a;

    public /* synthetic */ C103292u(Map map) {
        this.f288092a = map;
    }

    public final void accept(Object obj) {
        Map map = this.f288092a;
        Map.Entry entry = (Map.Entry) obj;
        map.put((C103295x) entry.getKey(), Double.valueOf(((Double) Map.EL.getOrDefault(map, entry.getKey(), Double.valueOf(C59203do.f157270a))).doubleValue() + ((Double) entry.getValue()).doubleValue()));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
