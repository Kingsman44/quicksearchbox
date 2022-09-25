package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.gi */
/* compiled from: PG */
public final /* synthetic */ class C112580gi implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Map f312174a;

    /* renamed from: b */
    public final /* synthetic */ double f312175b;

    public /* synthetic */ C112580gi(Map map, double d) {
        this.f312174a = map;
        this.f312175b = d;
    }

    public final void accept(Object obj, Object obj2) {
        Map map = this.f312174a;
        double d = this.f312175b;
        C112142i iVar = (C112142i) obj;
        int i = C112585gn.f312180a;
        C112141h hVar = (C112141h) Map.EL.getOrDefault(map, iVar, (C112141h) C112144k.f311414b.createBuilder());
        Map.EL.forEach(Collections.unmodifiableMap(((C112144k) obj2).f311416a), new C112577gf(hVar, d));
        map.put(iVar, hVar);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
