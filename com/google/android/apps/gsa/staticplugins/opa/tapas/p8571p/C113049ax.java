package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import com.google.assistant.p3781ad.p3789d.p3791b.C48721cb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.NetError;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.ax */
/* compiled from: PG */
public final class C113049ax {

    /* renamed from: a */
    private C58485gu f313238a = C58485gu.m89845m();

    /* renamed from: b */
    private C113048aw f313239b = C113048aw.m187029c(0);

    /* renamed from: c */
    private final HashMap f313240c = new HashMap();

    /* renamed from: d */
    private final HashMap f313241d = new HashMap();

    /* renamed from: e */
    private final HashMap f313242e = new HashMap();

    /* renamed from: f */
    private final HashMap f313243f = new HashMap();

    /* renamed from: g */
    private final HashMap f313244g = new HashMap();

    /* renamed from: h */
    private final HashMap f313245h = new HashMap();

    /* renamed from: i */
    private final HashMap f313246i = new HashMap();

    /* renamed from: j */
    private final HashMap f313247j = new HashMap();

    private C113049ax() {
    }

    /* renamed from: b */
    public static C113049ax m187033b(List list) {
        C113049ax axVar = new C113049ax();
        Locale locale = Locale.getDefault();
        List subList = list.subList(Math.max(0, list.size() + NetError.ERR_CERT_COMMON_NAME_INVALID), list.size());
        C58485gu guVar = (C58485gu) Collection.EL.stream(subList).map(new C113112y(locale)).collect(C58370cn.f155946a);
        axVar.f313238a = (C58485gu) Collection.EL.stream(guVar).distinct().sorted().collect(C58370cn.f155946a);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < axVar.f313238a.size(); i++) {
            hashMap.put((String) axVar.f313238a.get(i), Integer.valueOf(i));
        }
        for (int i2 = 0; i2 < Math.min(200, subList.size()); i2++) {
            C48716bx bxVar = (C48716bx) subList.get(i2);
            if (axVar.f313239b.f313237a.isEmpty()) {
                axVar.f313239b = C113048aw.m187029c(axVar.f313238a.size());
            }
            Integer num = (Integer) hashMap.get(guVar.get(i2));
            num.getClass();
            int intValue = num.intValue();
            for (C48721cb cbVar : bxVar.f126046b) {
                ((C113052b) axVar.f313239b.f313237a.get(intValue)).mo99836g(cbVar.f126064h, false, false);
                axVar.m187036e(axVar.f313240c, cbVar.f126062f, intValue, cbVar);
                axVar.m187036e(axVar.f313241d, Integer.valueOf(cbVar.f126058b), intValue, cbVar);
                axVar.m187036e(axVar.f313244g, Integer.valueOf(cbVar.f126063g), intValue, cbVar);
                HashMap hashMap2 = axVar.f313245h;
                C48580an b = C48580an.m85241b(cbVar.f126061e);
                if (b == null) {
                    b = C48580an.UNKNOWN;
                }
                axVar.m187036e(hashMap2, b, intValue, cbVar);
                axVar.m187036e(axVar.f313246i, cbVar.f126067k, intValue, cbVar);
                if ((cbVar.f126057a & 128) != 0) {
                    axVar.m187036e(axVar.f313242e, Integer.valueOf(cbVar.f126065i), intValue, cbVar);
                }
                if ((cbVar.f126057a & 256) != 0) {
                    axVar.m187036e(axVar.f313243f, cbVar.f126066j, intValue, cbVar);
                }
                if ((cbVar.f126057a & 1024) != 0) {
                    axVar.m187036e(axVar.f313247j, cbVar.f126068l, intValue, cbVar);
                }
            }
            for (C48721cb cbVar2 : bxVar.f126046b) {
                C113048aw awVar = (C113048aw) axVar.f313241d.get(Integer.valueOf(cbVar2.f126058b));
                awVar.getClass();
                ((C113052b) awVar.f313237a.get(intValue)).mo99835f();
                HashMap hashMap3 = axVar.f313245h;
                C48580an b2 = C48580an.m85241b(cbVar2.f126061e);
                if (b2 == null) {
                    b2 = C48580an.UNKNOWN;
                }
                C113048aw awVar2 = (C113048aw) hashMap3.get(b2);
                awVar2.getClass();
                ((C113052b) awVar2.f313237a.get(intValue)).mo99835f();
                C113048aw awVar3 = (C113048aw) axVar.f313244g.get(Integer.valueOf(cbVar2.f126063g));
                awVar3.getClass();
                ((C113052b) awVar3.f313237a.get(intValue)).mo99835f();
                C113048aw awVar4 = (C113048aw) axVar.f313246i.get(cbVar2.f126067k);
                awVar4.getClass();
                ((C113052b) awVar4.f313237a.get(intValue)).mo99835f();
            }
        }
        m187034c(axVar.f313239b);
        m187035d(axVar.f313240c);
        m187035d(axVar.f313241d);
        m187035d(axVar.f313245h);
        m187035d(axVar.f313244g);
        m187035d(axVar.f313246i);
        m187035d(axVar.f313242e);
        m187035d(axVar.f313243f);
        m187035d(axVar.f313247j);
        return axVar;
    }

    /* renamed from: c */
    private static void m187034c(C113048aw awVar) {
        for (int i = 1; i < awVar.f313237a.size(); i++) {
            ((C113052b) awVar.f313237a.get(i)).mo99834e((C113052b) awVar.f313237a.get(i - 1));
        }
    }

    /* renamed from: d */
    private static void m187035d(HashMap hashMap) {
        for (C113048aw c : hashMap.values()) {
            m187034c(c);
        }
    }

    /* renamed from: e */
    private final void m187036e(HashMap hashMap, Object obj, int i, C48721cb cbVar) {
        if (!hashMap.containsKey(obj)) {
            hashMap.put(obj, C113048aw.m187029c(this.f313238a.size()));
        }
        ((C113052b) ((C113048aw) hashMap.get(obj)).f313237a.get(i)).mo99836g(cbVar.f126064h, false, false);
    }

    /* renamed from: a */
    public final C113101n mo99823a() {
        C113093f fVar = (C113093f) C113101n.f313365l.createBuilder();
        C58485gu guVar = this.f313238a;
        fVar.copyOnWrite();
        C113101n nVar = (C113101n) fVar.instance;
        C62971cq cqVar = nVar.f313368b;
        if (!cqVar.mo58948c()) {
            nVar.f313368b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) nVar.f313368b);
        C113103p b = this.f313239b.mo99822b();
        fVar.copyOnWrite();
        C113101n nVar2 = (C113101n) fVar.instance;
        b.getClass();
        nVar2.f313369c = b;
        nVar2.f313367a |= 1;
        Map map = (Map) Collection.EL.stream(this.f313240c.entrySet()).collect(C58370cn.m89403c(C113035aj.f313222a, C113113z.f313396a, C113029ad.f313216a));
        fVar.copyOnWrite();
        C113101n nVar3 = (C113101n) fVar.instance;
        C62995dn dnVar = nVar3.f313370d;
        if (!dnVar.f170058b) {
            nVar3.f313370d = dnVar.mo58980a();
        }
        nVar3.f313370d.putAll(map);
        Map map2 = (Map) Collection.EL.stream(this.f313241d.entrySet()).collect(C58370cn.m89403c(C113040ao.f313227a, C113030ae.f313217a, C113031af.f313218a));
        fVar.copyOnWrite();
        C113101n nVar4 = (C113101n) fVar.instance;
        C62995dn dnVar2 = nVar4.f313371e;
        if (!dnVar2.f170058b) {
            nVar4.f313371e = dnVar2.mo58980a();
        }
        nVar4.f313371e.putAll(map2);
        Map map3 = (Map) Collection.EL.stream(this.f313245h.entrySet()).collect(C58370cn.m89403c(C113032ag.f313219a, C113033ah.f313220a, C113034ai.f313221a));
        fVar.copyOnWrite();
        C113101n nVar5 = (C113101n) fVar.instance;
        C62995dn dnVar3 = nVar5.f313375i;
        if (!dnVar3.f170058b) {
            nVar5.f313375i = dnVar3.mo58980a();
        }
        nVar5.f313375i.putAll(map3);
        Map map4 = (Map) Collection.EL.stream(this.f313244g.entrySet()).collect(C58370cn.m89403c(C113040ao.f313227a, C113036ak.f313223a, C113037al.f313224a));
        fVar.copyOnWrite();
        C113101n nVar6 = (C113101n) fVar.instance;
        C62995dn dnVar4 = nVar6.f313374h;
        if (!dnVar4.f170058b) {
            nVar6.f313374h = dnVar4.mo58980a();
        }
        nVar6.f313374h.putAll(map4);
        Map map5 = (Map) Collection.EL.stream(this.f313246i.entrySet()).collect(C58370cn.m89403c(C113035aj.f313222a, C113038am.f313225a, C113039an.f313226a));
        fVar.copyOnWrite();
        C113101n nVar7 = (C113101n) fVar.instance;
        C62995dn dnVar5 = nVar7.f313376j;
        if (!dnVar5.f170058b) {
            nVar7.f313376j = dnVar5.mo58980a();
        }
        nVar7.f313376j.putAll(map5);
        Map map6 = (Map) Collection.EL.stream(this.f313242e.entrySet()).collect(C58370cn.m89403c(C113040ao.f313227a, C113041ap.f313228a, C113042aq.f313229a));
        fVar.copyOnWrite();
        C113101n nVar8 = (C113101n) fVar.instance;
        C62995dn dnVar6 = nVar8.f313372f;
        if (!dnVar6.f170058b) {
            nVar8.f313372f = dnVar6.mo58980a();
        }
        nVar8.f313372f.putAll(map6);
        Map map7 = (Map) Collection.EL.stream(this.f313243f.entrySet()).collect(C58370cn.m89403c(C113035aj.f313222a, C113043ar.f313230a, C113026aa.f313213a));
        fVar.copyOnWrite();
        C113101n nVar9 = (C113101n) fVar.instance;
        C62995dn dnVar7 = nVar9.f313373g;
        if (!dnVar7.f170058b) {
            nVar9.f313373g = dnVar7.mo58980a();
        }
        nVar9.f313373g.putAll(map7);
        Map map8 = (Map) Collection.EL.stream(this.f313247j.entrySet()).collect(C58370cn.m89403c(C113035aj.f313222a, C113027ab.f313214a, C113028ac.f313215a));
        fVar.copyOnWrite();
        C113101n nVar10 = (C113101n) fVar.instance;
        C62995dn dnVar8 = nVar10.f313377k;
        if (!dnVar8.f170058b) {
            nVar10.f313377k = dnVar8.mo58980a();
        }
        nVar10.f313377k.putAll(map8);
        return (C113101n) fVar.build();
    }
}
