package com.google.android.libraries.performance.primes.metrics.p2403a;

import android.os.health.HealthStats;
import com.google.protobuf.MessageLite;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71191aa;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71324s;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71331z;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.p */
/* compiled from: PG */
final class C31283p extends C31282o {

    /* renamed from: a */
    public static final C31283p f84252a = new C31283p();

    private C31283p() {
    }

    /* renamed from: a */
    public final /* synthetic */ MessageLite mo36993a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        C71331z zVar = (C71331z) C71191aa.f189947e.createBuilder();
        int a = (int) C31285r.m58320a(healthStats, 50001);
        if (a != 0) {
            zVar.copyOnWrite();
            C71191aa aaVar = (C71191aa) zVar.instance;
            aaVar.f189949a |= 1;
            aaVar.f189950b = a;
        }
        int a2 = (int) C31285r.m58320a(healthStats, 50002);
        if (a2 != 0) {
            zVar.copyOnWrite();
            C71191aa aaVar2 = (C71191aa) zVar.instance;
            aaVar2.f189949a |= 2;
            aaVar2.f189951c = a2;
        }
        if (str != null) {
            C71324s d = C31285r.m58323d(str);
            zVar.copyOnWrite();
            C71191aa aaVar3 = (C71191aa) zVar.instance;
            d.getClass();
            aaVar3.f189952d = d;
            aaVar3.f189949a |= 4;
        }
        C71191aa aaVar4 = (C71191aa) zVar.build();
        if (C31285r.m58330k(aaVar4)) {
            return null;
        }
        return aaVar4;
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo36994b(MessageLite messageLite, MessageLite messageLite2) {
        int i;
        int i2;
        C71191aa aaVar = (C71191aa) messageLite;
        C71191aa aaVar2 = (C71191aa) messageLite2;
        if (aaVar == null || aaVar2 == null) {
            return aaVar;
        }
        C71331z zVar = (C71331z) C71191aa.f189947e.createBuilder();
        if (!((aaVar.f189949a & 1) == 0 || (i2 = aaVar.f189950b - aaVar2.f189950b) == 0)) {
            zVar.copyOnWrite();
            C71191aa aaVar3 = (C71191aa) zVar.instance;
            aaVar3.f189949a |= 1;
            aaVar3.f189950b = i2;
        }
        if (!((aaVar.f189949a & 2) == 0 || (i = aaVar.f189951c - aaVar2.f189951c) == 0)) {
            zVar.copyOnWrite();
            C71191aa aaVar4 = (C71191aa) zVar.instance;
            aaVar4.f189949a |= 2;
            aaVar4.f189951c = i;
        }
        C71324s sVar = aaVar.f189952d;
        if (sVar == null) {
            sVar = C71324s.f190488d;
        }
        zVar.copyOnWrite();
        C71191aa aaVar5 = (C71191aa) zVar.instance;
        sVar.getClass();
        aaVar5.f189952d = sVar;
        aaVar5.f189949a |= 4;
        C71191aa aaVar6 = (C71191aa) zVar.build();
        if (C31285r.m58330k(aaVar6)) {
            return null;
        }
        return aaVar6;
    }

    /* renamed from: c */
    public final /* synthetic */ String mo36995c(MessageLite messageLite) {
        C71324s sVar = ((C71191aa) messageLite).f189952d;
        if (sVar == null) {
            sVar = C71324s.f190488d;
        }
        return sVar.f190492c;
    }
}
