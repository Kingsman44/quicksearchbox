package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112698f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112147n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b.C112189o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113343cn;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113371dl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.assistant.p1594s.p1597b.C19141ab;
import com.google.android.libraries.assistant.p1594s.p1597b.C19148ai;
import com.google.android.libraries.assistant.p1594s.p1597b.C19149aj;
import com.google.android.libraries.assistant.p1594s.p1597b.C19156aq;
import com.google.android.libraries.assistant.p1594s.p1597b.C19157ar;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ij */
/* compiled from: PG */
public final class C112637ij extends C112147n {

    /* renamed from: a */
    public static final /* synthetic */ int f312244a = 0;

    /* renamed from: b */
    private final C86124t f312245b;

    /* renamed from: c */
    private final C112189o f312246c;

    public C112637ij(C86124t tVar, C112189o oVar, C112698f fVar) {
        super(fVar);
        this.f312245b = tVar;
        this.f312246c = oVar;
    }

    /* renamed from: d */
    private static void m186418d(Map map, C112636ii iiVar) {
        ((Set) Map.EL.computeIfAbsent(map, C113371dl.m187573c(iiVar.f312242a.mo100204d()), C112625hy.f312227a)).add(Integer.valueOf(iiVar.f312243b));
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.TAPAS_SUGGESTIONS_TRUNCATOR;
    }

    /* renamed from: l */
    public final java.util.Map mo99418l(C113405ep epVar, java.util.Map map) {
        long j;
        long j2;
        long j3;
        HashMap hashMap;
        C58485gu guVar;
        HashMap hashMap2;
        C113405ep epVar2 = epVar;
        boolean isPresent = epVar.mo100031n().isPresent();
        C58976aa aaVar = C58975e.f156826a;
        if (isPresent) {
            j = this.f312245b.mo79743a(C90063do.f249258aD);
        } else {
            j = this.f312245b.mo79743a(C90063do.f249260aF);
        }
        int i = (int) j;
        if (isPresent) {
            j2 = this.f312245b.mo79743a(C90063do.f249258aD);
        } else {
            j2 = this.f312245b.mo79743a(C90063do.f249257aC);
        }
        int i2 = (int) j2;
        if (isPresent) {
            j3 = this.f312245b.mo79743a(C90063do.f249258aD);
        } else {
            j3 = this.f312245b.mo79743a(C90063do.f249259aE);
        }
        int i3 = (int) j3;
        HashMap hashMap3 = new HashMap(this.f312246c.mo99465b(epVar2));
        C58490gz gzVar = new C58490gz(4);
        C19141ab abVar = epVar.mo100022f().f53685m;
        if (abVar == null) {
            abVar = C19141ab.f53614i;
        }
        C19157ar arVar = abVar.f53618c;
        if (arVar == null) {
            arVar = C19157ar.f53652b;
        }
        for (C19156aq aqVar : arVar.f53654a) {
            C48580an b = C48580an.m85241b(aqVar.f53650b);
            if (b == null) {
                b = C48580an.UNKNOWN;
            }
            gzVar.mo55429h(b, Integer.valueOf(aqVar.f53651c));
        }
        HashMap hashMap4 = new HashMap(gzVar.mo55427f(false));
        if (isPresent) {
            hashMap = new HashMap((C58495hd) this.f312246c.f311483c.get());
        } else {
            C58490gz gzVar2 = new C58490gz(4);
            C19141ab abVar2 = epVar.mo100022f().f53685m;
            if (abVar2 == null) {
                abVar2 = C19141ab.f53614i;
            }
            C19149aj ajVar = abVar2.f53619d;
            if (ajVar == null) {
                ajVar = C19149aj.f53636b;
            }
            for (C19148ai aiVar : ajVar.f53638a) {
                C48672ag b2 = C48672ag.m85259b(aiVar.f53634b);
                if (b2 == null) {
                    b2 = C48672ag.UNKNOWN;
                }
                gzVar2.mo55429h(b2, Integer.valueOf(aiVar.f53635c));
            }
            hashMap = new HashMap(gzVar2.mo55427f(false));
        }
        C112626hz hzVar = r5;
        HashMap hashMap5 = hashMap;
        HashMap hashMap6 = hashMap;
        Optional k = epVar.mo100028k();
        C112626hz hzVar2 = new C112626hz(hashMap3, i2, hashMap4, i, hashMap5, i3);
        k.ifPresent(hzVar);
        long a = C113343cn.m187516a(this.f312245b, epVar2) - ((long) ((Integer) epVar.mo100028k().map(C112628ia.f312234a).orElse(0)).intValue());
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(map.values()).flatMap(C112629ib.f312235a).sorted(Comparator.EL.reversed(Comparator.CC.comparing(C112630ic.f312236a))).collect(C58370cn.f155946a);
        HashMap hashMap7 = new HashMap();
        int size = guVar2.size();
        int i4 = 0;
        while (i4 < size) {
            C112636ii iiVar = (C112636ii) guVar2.get(i4);
            if (a < 1) {
                m186418d(hashMap7, iiVar);
                guVar = guVar2;
                hashMap2 = hashMap6;
            } else {
                int intValue = ((Integer) Map.EL.getOrDefault(hashMap3, Integer.valueOf(iiVar.f312242a.mo100204d()), Integer.valueOf(i2))).intValue();
                int intValue2 = ((Integer) Map.EL.getOrDefault(hashMap4, iiVar.f312242a.mo100210j(), Integer.valueOf(i))).intValue();
                guVar = guVar2;
                hashMap2 = hashMap6;
                int intValue3 = ((Integer) Map.EL.getOrDefault(hashMap2, iiVar.f312242a.mo100211k(), Integer.valueOf(i3))).intValue();
                if (intValue2 <= 0 || intValue <= 0 || intValue3 <= 0) {
                    m186418d(hashMap7, iiVar);
                } else {
                    a--;
                    Map.EL.merge(hashMap3, Integer.valueOf(iiVar.f312242a.mo100204d()), Integer.valueOf(i2 - 1), C112631id.f312237a);
                    Map.EL.merge(hashMap4, iiVar.f312242a.mo100210j(), Integer.valueOf(i - 1), C112632ie.f312238a);
                    Map.EL.merge(hashMap2, iiVar.f312242a.mo100211k(), Integer.valueOf(i3 - 1), C112633if.f312239a);
                }
            }
            i4++;
            hashMap6 = hashMap2;
            guVar2 = guVar;
        }
        return hashMap7;
    }
}
