package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.gl */
/* compiled from: PG */
public final /* synthetic */ class C112583gl implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f312178a;

    public /* synthetic */ C112583gl(Map map) {
        this.f312178a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map map = this.f312178a;
        Map.Entry entry = (Map.Entry) obj;
        C58976aa aaVar = C58975e.f156826a;
        return Double.valueOf(1.0d - ((Double) Collection.EL.stream(Collections.unmodifiableMap(((C112144k) entry.getValue()).f311416a).entrySet()).collect(Collectors.reducing(Double.valueOf(1.0d), new C112578gg((C112141h) Map.EL.getOrDefault(map, entry.getKey(), (C112141h) C112144k.f311414b.createBuilder())), C112579gh.f312173a))).doubleValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
