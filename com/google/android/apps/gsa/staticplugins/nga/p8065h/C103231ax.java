package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.common.p4535g.C59203do;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.ax */
/* compiled from: PG */
public final /* synthetic */ class C103231ax implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Map f287999a;

    /* renamed from: b */
    public final /* synthetic */ long f288000b;

    public /* synthetic */ C103231ax(Map map, long j) {
        this.f287999a = map;
        this.f288000b = j;
    }

    public final void accept(Object obj) {
        Map map = this.f287999a;
        long j = this.f288000b;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        double d = C59203do.f157270a;
        Double valueOf = Double.valueOf(C59203do.f157270a);
        double doubleValue = ((Double) Map.EL.getOrDefault(map, key, valueOf)).doubleValue();
        double doubleValue2 = ((Double) entry.getValue()).doubleValue();
        if (doubleValue2 / 1000.0d >= ((double) j)) {
            d = doubleValue2 % 1000.0d;
        }
        map.put((C103235ba) entry.getKey(), Double.valueOf(Math.max(Double.valueOf(doubleValue + d).doubleValue(), ((Double) Map.EL.getOrDefault(map, entry.getKey(), valueOf)).doubleValue())));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
