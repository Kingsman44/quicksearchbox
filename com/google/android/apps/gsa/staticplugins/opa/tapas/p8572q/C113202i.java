package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.i */
/* compiled from: PG */
public final /* synthetic */ class C113202i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ List f313535a;

    /* renamed from: b */
    public final /* synthetic */ Map f313536b;

    public /* synthetic */ C113202i(List list, Map map) {
        this.f313535a = list;
        this.f313536b = map;
    }

    public final void accept(Object obj) {
        this.f313535a.add((List) Map.EL.getOrDefault(this.f313536b, ((Pair) obj).first, new ArrayList()));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
