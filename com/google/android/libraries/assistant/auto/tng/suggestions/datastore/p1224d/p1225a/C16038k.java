package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import android.database.SQLException;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.k */
/* compiled from: PG */
public final /* synthetic */ class C16038k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47485a;

    /* renamed from: b */
    public final /* synthetic */ List f47486b;

    public /* synthetic */ C16038k(C16027ax axVar, List list) {
        this.f47485a = axVar;
        this.f47486b = list;
    }

    public final C60870cx apply(Object obj) {
        C16027ax axVar = this.f47485a;
        List list = this.f47486b;
        List list2 = (List) Collection.EL.stream((List) obj).map(C16030c.f47471a).collect(Collectors.toCollection(C16031d.f47472a));
        list2.addAll(list);
        C58976aa aaVar = C58975e.f156826a;
        C60870cx b = axVar.f47456g.mo22781b(list2);
        C16034g gVar = new C16034g(list2);
        return C47633f.m84733g(C60846c.m92878g(b, SQLException.class, C47810es.m84963c(gVar), axVar.f47452c)).mo51515h(new C16032e(axVar, list2, list), axVar.f47452c);
    }
}
