package com.google.android.libraries.p2460r.p2469c;

import com.google.android.libraries.p2460r.p2464b.p2466b.C32054a;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57440dk;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57442dm;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57444do;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57446dq;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57472ep;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.r.c.au */
/* compiled from: PG */
public final class C32090au {

    /* renamed from: a */
    public final Map f86167a = new C32079aj("Stylesheet", C57404cb.ERR_DUPLICATE_STYLESHEET);

    /* renamed from: b */
    public final Map f86168b = new C32079aj("Template", C57404cb.ERR_DUPLICATE_TEMPLATE);

    /* renamed from: c */
    public final C32078ai f86169c;

    /* renamed from: d */
    private final Map f86170d = new C32079aj("Style", C57404cb.ERR_DUPLICATE_STYLESHEET);

    public C32090au(List list, C32078ai aiVar) {
        this.f86169c = aiVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C57440dk dkVar = (C57440dk) it.next();
            if (dkVar.f153430a.size() > 0) {
                for (C57442dm dmVar : dkVar.f153430a) {
                    if (aiVar.mo37859a(dmVar.f153438d)) {
                        this.f86167a.put(dmVar.f153436b, dmVar);
                    }
                }
            }
            for (C57446dq dqVar : dkVar.f153431b) {
                if (aiVar.mo37859a(dqVar.f153450d)) {
                    this.f86168b.put(dqVar.f153447a, dqVar);
                }
            }
        }
    }

    /* renamed from: b */
    private final void m59779b(C57442dm dmVar, C32079aj ajVar) {
        if (this.f86169c.mo37859a(dmVar.f153438d)) {
            for (C57472ep epVar : dmVar.f153437c) {
                if (this.f86169c.mo37859a(epVar.f153523g)) {
                    ajVar.put(epVar.f153522f, epVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C32079aj mo37869a(C57444do doVar, C32136n nVar) {
        if (this.f86170d.containsKey(doVar)) {
            return (C32079aj) this.f86170d.get(doVar);
        }
        C32079aj ajVar = new C32079aj("Style", C57404cb.ERR_DUPLICATE_STYLE);
        for (C57442dm b : doVar.f153443b) {
            m59779b(b, ajVar);
        }
        for (String str : doVar.f153442a) {
            C57442dm dmVar = (C57442dm) this.f86167a.get(str);
            if (dmVar == null) {
                String format = String.format("Stylesheet [%s] was not found in the PietSharedState", new Object[]{str});
                nVar.mo37936a(2, C57404cb.ERR_MISSING_STYLESHEET, format);
                C32054a.m59731b(5, "PietStylesHelper", (Throwable) null, format, new Object[0]);
            } else {
                m59779b(dmVar, ajVar);
            }
        }
        this.f86170d.put(doVar, ajVar);
        return ajVar;
    }
}
