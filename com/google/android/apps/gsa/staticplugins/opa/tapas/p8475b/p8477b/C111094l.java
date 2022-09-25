package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8477b;

import android.app.usage.UsageStatsManager;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113168bz;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48659t;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48661v;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48663x;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48664y;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48665z;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.l */
/* compiled from: PG */
public final /* synthetic */ class C111094l implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C111095m f309325a;

    public /* synthetic */ C111094l(C111095m mVar) {
        this.f309325a = mVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C111095m mVar = this.f309325a;
        long b = mVar.f309328c.mo26870b();
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        C48659t tVar = (C48659t) C48661v.f125758b.createBuilder();
        UsageStatsManager usageStatsManager = (UsageStatsManager) mVar.f309327b.getSystemService("usagestats");
        if (usageStatsManager == null) {
            return (C48635bx) bvVar.build();
        }
        Map map = (Map) Collection.EL.stream(usageStatsManager.queryUsageStats(0, b - Duration.ofDays(mVar.f309330e.mo79743a(C90063do.f249282ab)).toMillis(), b)).collect(Collectors.groupingBy(C111092j.f309323a, Collectors.mapping(C111093k.f309324a, C58370cn.f155946a)));
        boolean e = mVar.f309330e.mo79746e(C90063do.f249286af);
        HashMap hashMap = new HashMap();
        Iterator it = map.entrySet().iterator();
        double d = Double.MIN_VALUE;
        double d2 = Double.MAX_VALUE;
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C58485gu guVar = (C58485gu) entry.getValue();
            int size = guVar.size();
            long j = 0;
            double d3 = d2;
            long j2 = 0;
            while (i < size) {
                C48663x xVar = (C48663x) guVar.get(i);
                j += xVar.f125769g;
                j2 = Math.max(j2, xVar.f125766d);
                i++;
                tVar = tVar;
                guVar = guVar;
            }
            double a = ((C113168bz) mVar.f309329d.mo27525b()).mo99895a(e, j, j2);
            C58976aa aaVar = C58975e.f156826a;
            entry.getKey();
            Double valueOf = Double.valueOf(a);
            d = Math.max(d, a);
            d2 = Math.min(d3, a);
            hashMap.put((String) entry.getKey(), valueOf);
            mVar = mVar;
            tVar = tVar;
        }
        C48659t tVar2 = tVar;
        double d4 = d2;
        double d5 = C59203do.f157270a;
        if (e) {
            double d6 = d - d4;
            if (d6 > C59203do.f157270a) {
                C58485gu j3 = C58485gu.m89842j(hashMap.keySet());
                int size2 = j3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = (String) j3.get(i2);
                    Double d7 = (Double) hashMap.get(str);
                    d7.getClass();
                    hashMap.put(str, Double.valueOf((d7.doubleValue() - d4) / d6));
                }
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        for (String str2 : map.keySet()) {
            C48664y yVar = (C48664y) C48665z.f125771d.createBuilder();
            double doubleValue = ((Double) Optional.ofNullable((Double) hashMap.get(str2)).orElse(Double.valueOf(d5))).doubleValue();
            yVar.copyOnWrite();
            C48665z zVar = (C48665z) yVar.instance;
            zVar.f125773a |= 1;
            zVar.f125775c = doubleValue;
            C58485gu guVar2 = (C58485gu) map.get(str2);
            if (guVar2 != null) {
                int size3 = guVar2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C48663x xVar2 = (C48663x) guVar2.get(i3);
                    if (xVar2.f125763a > xVar2.f125764b) {
                        C59104x c = C111095m.f309326a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "AppUsageSignalFetch");
                        ((C59052c) ((C59052c) c).mo56372aa(27092)).mo56350C("Unexpected BucketStats range: [%d, %d]", xVar2.f125763a, xVar2.f125764b);
                    } else {
                        yVar.copyOnWrite();
                        C48665z zVar2 = (C48665z) yVar.instance;
                        xVar2.getClass();
                        C62971cq cqVar = zVar2.f125774b;
                        if (!cqVar.mo58948c()) {
                            zVar2.f125774b = C62942bv.mutableCopy(cqVar);
                        }
                        zVar2.f125774b.add(xVar2);
                    }
                }
            }
            if (guVar2 != null) {
                guVar2.size();
            }
            C48665z zVar3 = (C48665z) yVar.build();
            str2.getClass();
            zVar3.getClass();
            tVar2.copyOnWrite();
            C48659t tVar3 = tVar2;
            C48661v vVar = (C48661v) tVar3.instance;
            C62995dn dnVar = vVar.f125760a;
            if (!dnVar.f170058b) {
                vVar.f125760a = dnVar.mo58980a();
            }
            vVar.f125760a.put(str2, zVar3);
            tVar2 = tVar3;
            d5 = C59203do.f157270a;
        }
        bvVar.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar.instance;
        C48661v vVar2 = (C48661v) tVar2.build();
        vVar2.getClass();
        bxVar.f125707b = vVar2;
        bxVar.f125706a = 14;
        return (C48635bx) bvVar.build();
    }
}
