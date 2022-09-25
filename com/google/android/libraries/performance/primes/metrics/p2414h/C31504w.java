package com.google.android.libraries.performance.primes.metrics.p2414h;

import com.google.android.libraries.performance.primes.metrics.p2404b.C31295a;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31301d;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31302e;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62995dn;
import java.util.Map;
import java.util.UUID;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71249ce;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71251cg;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71258cn;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.w */
/* compiled from: PG */
public final /* synthetic */ class C31504w implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31505x f84835a;

    /* renamed from: b */
    public final /* synthetic */ C71258cn f84836b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f84837c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f84838d;

    /* renamed from: e */
    public final /* synthetic */ String f84839e;

    public /* synthetic */ C31504w(C31505x xVar, C71258cn cnVar, C60870cx cxVar, C60870cx cxVar2, String str) {
        this.f84835a = xVar;
        this.f84836b = cnVar;
        this.f84837c = cxVar;
        this.f84838d = cxVar2;
        this.f84839e = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C31505x xVar = this.f84835a;
        C71258cn cnVar = this.f84836b;
        C60870cx cxVar = this.f84837c;
        C60870cx cxVar2 = this.f84838d;
        String str = this.f84839e;
        try {
            Map map = (Map) ((C58833ax) C60856cj.m92909r(cxVar)).mo56111f();
            if (map != null) {
                long j = ((C71262cr) cnVar.instance).f190256b;
                for (Map.Entry entry : map.entrySet()) {
                    int intValue = ((Integer) entry.getKey()).intValue();
                    long longValue = ((Long) entry.getValue()).longValue() - j;
                    cnVar.copyOnWrite();
                    C71262cr crVar = (C71262cr) cnVar.instance;
                    C62995dn dnVar = crVar.f190276v;
                    if (!dnVar.f170058b) {
                        crVar.f190276v = dnVar.mo58980a();
                    }
                    crVar.f190276v.put(Integer.valueOf(intValue), Long.valueOf(longValue));
                }
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C31505x.f84840a.mo56226d()).mo56382g(e)).mo56372aa(50415)).mo56386p("Failed to get custom timestamps future");
        }
        C31310m mVar = xVar.f84841b;
        C31301d j2 = C31302e.m58363j();
        C71307ei eiVar = (C71307ei) C71308ej.f190415x.createBuilder();
        C71249ce ceVar = (C71249ce) C71251cg.f190215k.createBuilder();
        long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
        ceVar.copyOnWrite();
        C71251cg cgVar = (C71251cg) ceVar.instance;
        cgVar.f190217a |= 1;
        cgVar.f190218b = leastSignificantBits;
        ceVar.copyOnWrite();
        C71251cg cgVar2 = (C71251cg) ceVar.instance;
        cgVar2.f190219c = 2;
        cgVar2.f190217a = 2 | cgVar2.f190217a;
        ceVar.copyOnWrite();
        C71251cg cgVar3 = (C71251cg) ceVar.instance;
        C71262cr crVar2 = (C71262cr) cnVar.build();
        crVar2.getClass();
        cgVar3.f190223g = crVar2;
        cgVar3.f190217a |= 16;
        eiVar.copyOnWrite();
        C71308ej ejVar = (C71308ej) eiVar.instance;
        C71251cg cgVar4 = (C71251cg) ceVar.build();
        cgVar4.getClass();
        ejVar.f190427l = cgVar4;
        ejVar.f190416a |= 4096;
        j2.mo37004e((C71308ej) eiVar.build());
        C31295a aVar = (C31295a) j2;
        aVar.f84270c = (C71207aq) ((C58833ax) C60856cj.m92909r(cxVar2)).mo56111f();
        aVar.f84271d = str;
        j2.mo37003d(true);
        return mVar.mo37023b(j2.mo37000a());
    }
}
