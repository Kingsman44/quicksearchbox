package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a;

import com.google.common.p4522b.C58485gu;
import com.google.research.p5181a.C66393v;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.d */
/* compiled from: PG */
public final class C112300d extends C112301e {
    /* renamed from: e */
    public final C112300d clone() {
        C112300d dVar = new C112300d();
        for (Map.Entry entry : this.f311641a.entrySet()) {
            dVar.f311641a.put((String) entry.getKey(), (Integer) entry.getValue());
        }
        for (Map.Entry entry2 : this.f311642b.entrySet()) {
            dVar.f311642b.put((Integer) entry2.getKey(), (Long) entry2.getValue());
        }
        boolean[] zArr = this.f311643c;
        dVar.f311643c = Arrays.copyOf(zArr, zArr.length);
        return dVar;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ List mo99492f(C66376a aVar) {
        return C58485gu.m89846n(((C66393v) aVar.mo59466i().f180315a.instance).f180536d);
    }
}
