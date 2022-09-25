package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112698f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112147n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.gn */
/* compiled from: PG */
public final class C112585gn extends C112147n {

    /* renamed from: a */
    public static final /* synthetic */ int f312180a = 0;

    /* renamed from: b */
    private final C111248k f312181b;

    /* renamed from: c */
    private final C86124t f312182c;

    public C112585gn(C86124t tVar, C112698f fVar, C111248k kVar) {
        super(fVar);
        this.f312182c = tVar;
        this.f312181b = kVar;
    }

    /* renamed from: d */
    public static void m186393d(Map map, Map map2, double d) {
        Map.EL.forEach(map2, new C112580gi(map, d));
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.DUPLICATE_SUGGESTIONS_SUPPRESSOR;
    }

    /* renamed from: l */
    public final java.util.Map mo99418l(C113405ep epVar, java.util.Map map) {
        EnumMap enumMap = new EnumMap(C112142i.class);
        Collection.EL.stream(((C113408es) epVar.mo100028k().orElse(C113408es.f314036b)).mo100053o()).forEach(new C112581gj(enumMap));
        HashMap hashMap = new HashMap();
        C58485gu guVar = (C58485gu) Collection.EL.stream(map.entrySet()).sorted(Comparator.EL.reversed(Comparator.CC.comparing(C112582gk.f312177a))).collect(C58370cn.f155946a);
        int size = guVar.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            C113295bt btVar = (C113295bt) ((Map.Entry) guVar.get(i)).getValue();
            C58526ih ihVar = new C58526ih();
            int i2 = 0;
            while (i2 < btVar.f313760a.size()) {
                C113415ez ezVar = (C113415ez) btVar.f313760a.get(i2);
                double doubleValue = ((Double) Collection.EL.stream(ezVar.mo100213m().entrySet()).map(new C112583gl(enumMap)).max(Comparator.CC.naturalOrder()).orElse(Double.valueOf(C59203do.f157270a))).doubleValue();
                C111248k kVar = this.f312181b;
                C111255r rVar = C111255r.SIMILARITY_KEYS;
                Object[] objArr = new Object[3];
                objArr[c] = ezVar.mo100199L();
                StringBuilder sb = new StringBuilder();
                C58485gu guVar2 = guVar;
                sb.append("{");
                int i3 = size;
                Map.EL.forEach(ezVar.mo100213m(), new C112576ge(sb));
                sb.append("}");
                objArr[1] = sb.toString();
                objArr[2] = Double.valueOf(doubleValue);
                kVar.mo99076a(rVar, String.format("suggestion '%s' has keys %s and max similarity %f", objArr));
                if (doubleValue > this.f312182c.mo79747m(C90063do.f249471eE)) {
                    C58976aa aaVar = C58975e.f156826a;
                    ezVar.mo100199L();
                    ihVar.mo55373c(Integer.valueOf(i2));
                    if (this.f312182c.mo79746e(C90063do.f249276aV)) {
                        m186393d(enumMap, ezVar.mo100213m(), doubleValue);
                    }
                } else {
                    m186393d(enumMap, ezVar.mo100213m(), 1.0d);
                }
                i2++;
                guVar = guVar2;
                size = i3;
                c = 0;
            }
            hashMap.put(btVar.f313761b, ihVar.mo55486f());
            i++;
            guVar = guVar;
            size = size;
            c = 0;
        }
        return hashMap;
    }
}
