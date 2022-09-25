package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112686ax;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113302c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4553a.C59450aa;
import com.google.common.p4552o.p4553a.C59496bt;
import com.google.common.p4552o.p4553a.C59513cj;
import com.google.common.p4552o.p4553a.C59514ck;
import com.google.protobuf.C62995dn;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bf */
/* compiled from: PG */
public final /* synthetic */ class C111868bf implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111877bo f310857a;

    /* renamed from: b */
    public final /* synthetic */ Map f310858b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f310859c;

    /* renamed from: d */
    public final /* synthetic */ C59450aa f310860d;

    /* renamed from: e */
    public final /* synthetic */ long f310861e;

    /* renamed from: f */
    public final /* synthetic */ C113405ep f310862f;

    /* renamed from: g */
    public final /* synthetic */ Optional f310863g;

    public /* synthetic */ C111868bf(C111877bo boVar, Map map, C113405ep epVar, C59450aa aaVar, long j, C113405ep epVar2, Optional optional) {
        this.f310857a = boVar;
        this.f310858b = map;
        this.f310859c = epVar;
        this.f310860d = aaVar;
        this.f310861e = j;
        this.f310862f = epVar2;
        this.f310863g = optional;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        long j;
        Optional optional;
        C113405ep epVar;
        int i;
        long j2;
        C113405ep epVar2;
        C111877bo boVar = this.f310857a;
        Map map = this.f310858b;
        C113405ep epVar3 = this.f310859c;
        C59450aa aaVar = this.f310860d;
        long j3 = this.f310861e;
        C113405ep epVar4 = this.f310862f;
        Optional optional2 = this.f310863g;
        Map map2 = (Map) obj;
        map.isEmpty();
        Map map3 = (Map) Collection.EL.stream(map2.entrySet()).collect(Collectors.toMap(C111870bh.f310865a, C111875bm.f310871a, C111876bn.f310872a, C111830au.f310795a));
        C58490gz gzVar = new C58490gz(4);
        C58490gz gzVar2 = new C58490gz(4);
        Map.EL.forEach(map3, new C111873bk(gzVar, gzVar2));
        C58495hd f = gzVar2.mo55427f(false);
        if (f.isEmpty()) {
            j = j3;
            epVar = epVar4;
            optional = optional2;
        } else {
            int i2 = (int) (50.0f / ((float) ((C58729pv) f).f156487c));
            HashMap hashMap = new HashMap();
            C58800sl lA = f.entrySet().iterator();
            int i3 = 0;
            int i4 = 50;
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                Optional optional3 = optional2;
                int size = ((C59496bt) entry.getValue()).f157865d.size();
                if (size > i2) {
                    int i5 = size - i2;
                    epVar2 = epVar4;
                    j2 = j3;
                    hashMap.put((Integer) entry.getKey(), Integer.valueOf(i5));
                    i4 -= i2;
                    i3 += i5;
                } else {
                    j2 = j3;
                    epVar2 = epVar4;
                    i4 -= size;
                }
                epVar4 = epVar2;
                optional2 = optional3;
                j3 = j2;
            }
            j = j3;
            epVar = epVar4;
            optional = optional2;
            if (i3 > i4) {
                Iterator it = hashMap.entrySet().iterator();
                int i6 = i4;
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    int intValue = ((Integer) entry2.getValue()).intValue();
                    Iterator it2 = it;
                    int i7 = (int) ((((float) intValue) / ((float) i3)) * ((float) i4));
                    entry2.setValue(Integer.valueOf(intValue - i7));
                    if (((Integer) entry2.getValue()).intValue() < 0) {
                        i = i3;
                        ((C59052c) ((C59052c) C111877bo.f310874b.mo56226d()).mo56372aa(27416)).mo56389s("Unexpected adjuster num remaining: %s", entry2);
                        int i8 = C90755l.f253831a;
                    } else {
                        i = i3;
                    }
                    i6 -= i7;
                    it = it2;
                    i3 = i;
                }
                for (Map.Entry entry3 : hashMap.entrySet()) {
                    if (i6 <= 0) {
                        break;
                    }
                    int intValue2 = ((Integer) entry3.getValue()).intValue();
                    if (intValue2 > 0) {
                        i6--;
                        entry3.setValue(Integer.valueOf(intValue2 - 1));
                    }
                }
                map3.clear();
                map3.putAll(gzVar.mo55427f(false));
                map3.putAll((C58495hd) Collection.EL.stream(f.entrySet()).collect(C58370cn.m89403c(C111870bh.f310865a, new C111871bi(hashMap), C111872bj.f310867a)));
            }
        }
        C113407er p = C113408es.m187705p();
        p.mo100095e(epVar3);
        ((C113302c) p).f313775g = Optional.m71637of(aaVar);
        p.mo100096f(C113339cj.m187495c(map));
        C59513cj cjVar = (C59513cj) C59514ck.f157909b.createBuilder();
        cjVar.copyOnWrite();
        C59514ck ckVar = (C59514ck) cjVar.instance;
        C62995dn dnVar = ckVar.f157911a;
        if (!dnVar.f170058b) {
            ckVar.f157911a = dnVar.mo58980a();
        }
        ckVar.f157911a.putAll(map3);
        p.mo100094d((C59514ck) cjVar.build());
        C121438d dVar = (C121438d) map2.get(Integer.valueOf(C48667ab.CORTEX_SCORE_ADJUSTER.f125795r));
        if (dVar != null) {
            Optional e = dVar.mo105152e();
            Objects.requireNonNull(p);
            e.ifPresent(new C111831av(p));
            Optional d = dVar.mo105151d();
            Objects.requireNonNull(p);
            d.ifPresent(new C111832aw(p));
        }
        long c = boVar.f310877e.mo26871c() - j;
        C112686ax axVar = boVar.f310876d;
        if (epVar.mo100033p().length() == 0) {
            axVar.f312386t.mo104025g(c);
        } else {
            axVar.f312387u.mo104025g(c);
        }
        axVar.f312385s.mo104025g(c);
        if (boVar.f310875c.mo79746e(C90063do.f249390cd)) {
            optional.ifPresent(new C111833ax(map));
        }
        return p.mo100091a();
    }
}
