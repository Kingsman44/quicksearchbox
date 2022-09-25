package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.j */
/* compiled from: PG */
public final /* synthetic */ class C111314j implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111305ag f309767a;

    public /* synthetic */ C111314j(C111305ag agVar) {
        this.f309767a = agVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111305ag agVar = this.f309767a;
        List list = (List) obj;
        float m = (float) agVar.f309740j.mo79747m(C90063do.f249638n);
        float m2 = (float) agVar.f309740j.mo79747m(C90063do.f249639o);
        if (m == 0.0f) {
            return (C58485gu) Collection.EL.stream(list).filter(C111315k.f309768a).collect(C58370cn.f155946a);
        }
        List list2 = (List) Collection.EL.stream(list).filter(C111315k.f309768a).sorted(Comparator.CC.comparing(C111316l.f309769a)).collect(Collectors.toCollection(C111317m.f309770a));
        int size = list2.size();
        int i = 0;
        while (m > 0.0f && i < size) {
            C113414ey h = ((C113415ez) list2.get(i)).mo100208h();
            h.mo100162g(m);
            list2.set(i, h.mo100156a());
            m -= m2;
            i++;
        }
        return C58485gu.m89842j(list2);
    }
}
