package com.google.android.apps.gsa.p6484r;

import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.p7648ce.C97558aq;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58758qx;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.r.f */
/* compiled from: PG */
public final class C84251f {

    /* renamed from: a */
    public static final Set f229272a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public static final Set f229273b = new HashSet();

    @Deprecated
    /* renamed from: a */
    public static void m134339a(C84250e eVar, C90931ca caVar) {
        f229272a.add(eVar);
        for (C97558aq cVar : C58758qx.m90648f(f229273b)) {
            caVar.mo85139d(new C84248c(cVar));
        }
    }

    /* renamed from: b */
    public static void m134340b(C84250e eVar, C22871g gVar) {
        f229272a.add(eVar);
        for (C97558aq bVar : C58758qx.m90648f(f229273b)) {
            gVar.mo28212l("addDebuggableComponent", new C84247b(bVar));
        }
    }
}
