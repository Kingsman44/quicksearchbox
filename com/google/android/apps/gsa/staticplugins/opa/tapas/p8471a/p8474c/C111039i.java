package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.p8474c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111060j;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.p4129b.p4136c.C54756d;
import com.google.p4129b.p4136c.C54757e;
import com.google.p4129b.p4136c.C54776x;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.c.i */
/* compiled from: PG */
public final class C111039i implements C111060j {

    /* renamed from: a */
    public final Map f309240a;

    public C111039i(Map map) {
        this.f309240a = map;
    }

    /* renamed from: a */
    public final C58495hd mo99034a(C48582b bVar, C54757e eVar) {
        int a = C54756d.m87526a(eVar.f143673a);
        if (a == 0 || a != 3) {
            return C58729pv.f156485a;
        }
        C54776x xVar = eVar.f143674b;
        if (xVar == null) {
            xVar = C54776x.f143709e;
        }
        return (C58495hd) Collection.EL.stream(Collections.unmodifiableMap(xVar.f143712b).entrySet()).filter(new C111035e(this, bVar)).collect(C58370cn.m89403c(C111036f.f309236a, new C111037g(this, bVar), C111038h.f309239a));
    }
}
