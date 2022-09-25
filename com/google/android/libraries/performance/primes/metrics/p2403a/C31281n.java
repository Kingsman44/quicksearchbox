package com.google.android.libraries.performance.primes.metrics.p2403a;

import android.os.health.HealthStats;
import com.google.protobuf.MessageLite;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71324s;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71329x;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71330y;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.n */
/* compiled from: PG */
final class C31281n extends C31282o {

    /* renamed from: a */
    public static final C31281n f84251a = new C31281n();

    private C31281n() {
    }

    /* renamed from: a */
    public final /* synthetic */ MessageLite mo36993a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        C71329x xVar = (C71329x) C71330y.f190501i.createBuilder();
        long a = C31285r.m58320a(healthStats, 30001);
        if (a != 0) {
            xVar.copyOnWrite();
            C71330y yVar = (C71330y) xVar.instance;
            yVar.f190503a |= 1;
            yVar.f190504b = a;
        }
        long a2 = C31285r.m58320a(healthStats, 30002);
        if (a2 != 0) {
            xVar.copyOnWrite();
            C71330y yVar2 = (C71330y) xVar.instance;
            yVar2.f190503a |= 2;
            yVar2.f190505c = a2;
        }
        long a3 = C31285r.m58320a(healthStats, 30003);
        if (a3 != 0) {
            xVar.copyOnWrite();
            C71330y yVar3 = (C71330y) xVar.instance;
            yVar3.f190503a |= 4;
            yVar3.f190506d = a3;
        }
        long a4 = C31285r.m58320a(healthStats, 30004);
        if (a4 != 0) {
            xVar.copyOnWrite();
            C71330y yVar4 = (C71330y) xVar.instance;
            yVar4.f190503a |= 8;
            yVar4.f190507e = a4;
        }
        long a5 = C31285r.m58320a(healthStats, 30005);
        if (a5 != 0) {
            xVar.copyOnWrite();
            C71330y yVar5 = (C71330y) xVar.instance;
            yVar5.f190503a |= 16;
            yVar5.f190508f = a5;
        }
        long a6 = C31285r.m58320a(healthStats, 30006);
        if (a6 != 0) {
            xVar.copyOnWrite();
            C71330y yVar6 = (C71330y) xVar.instance;
            yVar6.f190503a |= 32;
            yVar6.f190509g = a6;
        }
        if (str != null) {
            C71324s d = C31285r.m58323d(str);
            xVar.copyOnWrite();
            C71330y yVar7 = (C71330y) xVar.instance;
            d.getClass();
            yVar7.f190510h = d;
            yVar7.f190503a |= 64;
        }
        C71330y yVar8 = (C71330y) xVar.build();
        if (C31285r.m58329j(yVar8)) {
            return null;
        }
        return yVar8;
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo36994b(MessageLite messageLite, MessageLite messageLite2) {
        C71330y yVar = (C71330y) messageLite;
        C71330y yVar2 = (C71330y) messageLite2;
        if (yVar == null || yVar2 == null) {
            return yVar;
        }
        C71329x xVar = (C71329x) C71330y.f190501i.createBuilder();
        if ((yVar.f190503a & 1) != 0) {
            long j = yVar.f190504b - yVar2.f190504b;
            if (j != 0) {
                xVar.copyOnWrite();
                C71330y yVar3 = (C71330y) xVar.instance;
                yVar3.f190503a |= 1;
                yVar3.f190504b = j;
            }
        }
        if ((yVar.f190503a & 2) != 0) {
            long j2 = yVar.f190505c - yVar2.f190505c;
            if (j2 != 0) {
                xVar.copyOnWrite();
                C71330y yVar4 = (C71330y) xVar.instance;
                yVar4.f190503a |= 2;
                yVar4.f190505c = j2;
            }
        }
        if ((yVar.f190503a & 4) != 0) {
            long j3 = yVar.f190506d - yVar2.f190506d;
            if (j3 != 0) {
                xVar.copyOnWrite();
                C71330y yVar5 = (C71330y) xVar.instance;
                yVar5.f190503a |= 4;
                yVar5.f190506d = j3;
            }
        }
        if ((yVar.f190503a & 8) != 0) {
            long j4 = yVar.f190507e - yVar2.f190507e;
            if (j4 != 0) {
                xVar.copyOnWrite();
                C71330y yVar6 = (C71330y) xVar.instance;
                yVar6.f190503a |= 8;
                yVar6.f190507e = j4;
            }
        }
        if ((yVar.f190503a & 16) != 0) {
            long j5 = yVar.f190508f - yVar2.f190508f;
            if (j5 != 0) {
                xVar.copyOnWrite();
                C71330y yVar7 = (C71330y) xVar.instance;
                yVar7.f190503a |= 16;
                yVar7.f190508f = j5;
            }
        }
        if ((yVar.f190503a & 32) != 0) {
            long j6 = yVar.f190509g - yVar2.f190509g;
            if (j6 != 0) {
                xVar.copyOnWrite();
                C71330y yVar8 = (C71330y) xVar.instance;
                yVar8.f190503a |= 32;
                yVar8.f190509g = j6;
            }
        }
        C71324s sVar = yVar.f190510h;
        if (sVar == null) {
            sVar = C71324s.f190488d;
        }
        xVar.copyOnWrite();
        C71330y yVar9 = (C71330y) xVar.instance;
        sVar.getClass();
        yVar9.f190510h = sVar;
        yVar9.f190503a |= 64;
        C71330y yVar10 = (C71330y) xVar.build();
        if (C31285r.m58329j(yVar10)) {
            return null;
        }
        return yVar10;
    }

    /* renamed from: c */
    public final /* synthetic */ String mo36995c(MessageLite messageLite) {
        C71324s sVar = ((C71330y) messageLite).f190510h;
        if (sVar == null) {
            sVar = C71324s.f190488d;
        }
        return sVar.f190492c;
    }
}
