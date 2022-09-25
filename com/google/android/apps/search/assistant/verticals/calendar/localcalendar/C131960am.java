package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131947b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4543n.p4545b.C59364ae;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71045cr;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71046cs;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71047ct;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71050cw;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71051cx;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71056db;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.am */
/* compiled from: PG */
public final /* synthetic */ class C131960am implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131963ap f360286a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f360287b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f360288c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f360289d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f360290e;

    /* renamed from: f */
    public final /* synthetic */ String f360291f;

    public /* synthetic */ C131960am(C131963ap apVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, String str) {
        this.f360286a = apVar;
        this.f360287b = cxVar;
        this.f360288c = cxVar2;
        this.f360289d = cxVar3;
        this.f360290e = cxVar4;
        this.f360291f = str;
    }

    public final Object call() {
        int i;
        C131963ap apVar = this.f360286a;
        C60870cx cxVar = this.f360287b;
        C60870cx cxVar2 = this.f360288c;
        C60870cx cxVar3 = this.f360289d;
        C60870cx cxVar4 = this.f360290e;
        String str = this.f360291f;
        str.getClass();
        C58485gu a = C132021w.m214456a((List) C60856cj.m92909r(cxVar), str);
        C58485gu a2 = C132021w.m214456a((List) C60856cj.m92909r(cxVar2), str);
        C58528ij ijVar = (C58528ij) Collection.EL.stream((C58528ij) C60856cj.m92909r(cxVar3)).map(C132019u.f360363a).collect(C58370cn.f155947b);
        C58528ij ijVar2 = (C58528ij) Collection.EL.stream((C58528ij) C60856cj.m92909r(cxVar4)).map(C132019u.f360363a).collect(C58370cn.f155947b);
        C58495hd b = C132021w.m214457b(a);
        C58495hd b2 = C132021w.m214457b(a2);
        C58528ij ijVar3 = (C58528ij) Collection.EL.stream(a).filter(C132013o.f360357a).map(C132014p.f360358a).collect(C58370cn.f155947b);
        String b3 = C131948aa.m214404b(str);
        C58485gu E = C58485gu.m89835E(C58758qx.m90647e(b.keySet(), b2.keySet()));
        C58480gp e = C58485gu.m89837e();
        int i2 = ((C58724pq) E).f156474d;
        int i3 = 0;
        while (i3 < i2) {
            String str2 = (String) E.get(i3);
            C71050cw cwVar = (C71050cw) C71051cx.f189486e.createBuilder();
            int i4 = 3;
            if (b3.equals(str2)) {
                i = 2;
            } else {
                i = ijVar.contains(str2) ? 3 : 4;
            }
            cwVar.copyOnWrite();
            C71051cx cxVar5 = (C71051cx) cwVar.instance;
            cxVar5.f189489b = i - 1;
            cxVar5.f189488a |= 2;
            if (ijVar3.contains(str2)) {
                i4 = 4;
            } else if (!ijVar2.contains(str2)) {
                i4 = 2;
            }
            cwVar.copyOnWrite();
            C71051cx cxVar6 = (C71051cx) cwVar.instance;
            cxVar6.f189490c = i4 - 1;
            cxVar6.f189488a |= 4;
            C58495hd hdVar = (C58495hd) b.getOrDefault(str2, C58729pv.f156485a);
            C58495hd hdVar2 = (C58495hd) b2.getOrDefault(str2, C58729pv.f156485a);
            C58495hd hdVar3 = b2;
            C58485gu E2 = C58485gu.m89835E(C58758qx.m90647e(hdVar.keySet(), hdVar2.keySet()));
            int i5 = ((C58724pq) E2).f156474d;
            C58528ij ijVar4 = ijVar;
            int i6 = 0;
            while (i6 < i5) {
                C58485gu guVar = E2;
                String str3 = (String) E2.get(i6);
                C58495hd hdVar4 = hdVar;
                C131947b bVar = (C131947b) hdVar.get(str3);
                C58528ij ijVar5 = ijVar2;
                C131947b bVar2 = (C131947b) hdVar2.get(str3);
                String str4 = b3;
                boolean z = (bVar != null && bVar.f360267f) || (bVar2 != null && bVar2.f360267f);
                C58495hd hdVar5 = b;
                C71046cs csVar = (C71046cs) C71047ct.f189475h.createBuilder();
                csVar.copyOnWrite();
                C58528ij ijVar6 = ijVar3;
                C71047ct ctVar = (C71047ct) csVar.instance;
                C58485gu guVar2 = E;
                ctVar.f189477a |= 1;
                ctVar.f189478b = z;
                boolean endsWith = str3.endsWith("v.calendar.google.com");
                csVar.copyOnWrite();
                C71047ct ctVar2 = (C71047ct) csVar.instance;
                ctVar2.f189477a |= 2;
                ctVar2.f189479c = endsWith;
                int c = C132021w.m214458c(bVar);
                csVar.copyOnWrite();
                C71047ct ctVar3 = (C71047ct) csVar.instance;
                ctVar3.f189480d = c - 1;
                ctVar3.f189477a |= 4;
                boolean z2 = bVar2 != null;
                csVar.copyOnWrite();
                C71047ct ctVar4 = (C71047ct) csVar.instance;
                ctVar4.f189477a |= 8;
                ctVar4.f189481e = z2;
                if (bVar != null) {
                    int i7 = bVar.f360269h;
                    csVar.copyOnWrite();
                    C71047ct ctVar5 = (C71047ct) csVar.instance;
                    ctVar5.f189477a |= 16;
                    ctVar5.f189482f = i7;
                    int i8 = bVar.f360270i;
                    csVar.copyOnWrite();
                    C71047ct ctVar6 = (C71047ct) csVar.instance;
                    ctVar6.f189477a |= 32;
                    ctVar6.f189483g = i8;
                }
                cwVar.copyOnWrite();
                C71051cx cxVar7 = (C71051cx) cwVar.instance;
                C71047ct ctVar7 = (C71047ct) csVar.build();
                ctVar7.getClass();
                C62971cq cqVar = cxVar7.f189491d;
                if (!cqVar.mo58948c()) {
                    cxVar7.f189491d = C62942bv.mutableCopy(cqVar);
                }
                cxVar7.f189491d.add(ctVar7);
                i6++;
                b3 = str4;
                E2 = guVar;
                hdVar = hdVar4;
                ijVar2 = ijVar5;
                ijVar3 = ijVar6;
                b = hdVar5;
                E = guVar2;
            }
            C58528ij ijVar7 = ijVar2;
            String str5 = b3;
            C58495hd hdVar6 = b;
            C58528ij ijVar8 = ijVar3;
            C58485gu guVar3 = E;
            e.mo55395g((C71051cx) cwVar.build());
            i3++;
            b2 = hdVar3;
            ijVar = ijVar4;
        }
        C58485gu f = e.mo55394f();
        C58485gu guVar4 = (C58485gu) ((C59364ae) Collection.EL.stream(a).filter(C132015q.f360359a).collect(C59364ae.m92268o(C132016r.f360360a, C58370cn.f155946a))).mo56903n(C132021w.f360364a).mo56895e(C132017s.f360361a).collect(C58370cn.f155946a);
        C71045cr crVar = (C71045cr) C71056db.f189507c.createBuilder();
        crVar.copyOnWrite();
        C71056db dbVar = (C71056db) crVar.instance;
        C62971cq cqVar2 = dbVar.f189510a;
        if (!cqVar2.mo58948c()) {
            dbVar.f189510a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) f, (List) dbVar.f189510a);
        crVar.copyOnWrite();
        C71056db dbVar2 = (C71056db) crVar.instance;
        C62971cq cqVar3 = dbVar2.f189511b;
        if (!cqVar3.mo58948c()) {
            dbVar2.f189511b = C62942bv.mutableCopy(cqVar3);
        }
        C62947c.addAll((Iterable) guVar4, (List) dbVar2.f189511b);
        apVar.f360301h.mo19974a(C37176a.f96909ba.mo40812e(C71056db.f189508d, (C71056db) crVar.build()));
        return true;
    }
}
