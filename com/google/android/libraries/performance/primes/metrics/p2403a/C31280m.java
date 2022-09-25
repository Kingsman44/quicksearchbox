package com.google.android.libraries.performance.primes.metrics.p2403a;

import android.os.health.HealthStats;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71324s;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71325t;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71326u;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.m */
/* compiled from: PG */
final class C31280m extends C31282o {

    /* renamed from: a */
    public static final C31280m f84250a = new C31280m();

    private C31280m() {
    }

    /* renamed from: a */
    public final /* synthetic */ MessageLite mo36993a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        C71325t tVar = (C71325t) C71326u.f190493e.createBuilder();
        tVar.mo62667a(C31283p.f84252a.mo36996d(C31285r.m58322c(healthStats, 40001)));
        tVar.mo62668b(C31279l.f84249a.mo36996d((healthStats == null || !healthStats.hasMeasurements(40002)) ? Collections.emptyMap() : healthStats.getMeasurements(40002)));
        if (str != null) {
            C71324s d = C31285r.m58323d(str);
            tVar.copyOnWrite();
            C71326u uVar = (C71326u) tVar.instance;
            d.getClass();
            uVar.f190498d = d;
            uVar.f190495a |= 1;
        }
        C71326u uVar2 = (C71326u) tVar.build();
        if (C31285r.m58328i(uVar2)) {
            return null;
        }
        return uVar2;
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo36994b(MessageLite messageLite, MessageLite messageLite2) {
        C71326u uVar = (C71326u) messageLite;
        C71326u uVar2 = (C71326u) messageLite2;
        if (uVar == null || uVar2 == null) {
            return uVar;
        }
        C71325t tVar = (C71325t) C71326u.f190493e.createBuilder();
        tVar.mo62667a(C31283p.f84252a.mo36997e(uVar.f190496b, uVar2.f190496b));
        tVar.mo62668b(C31279l.f84249a.mo36997e(uVar.f190497c, uVar2.f190497c));
        C71324s sVar = uVar.f190498d;
        if (sVar == null) {
            sVar = C71324s.f190488d;
        }
        tVar.copyOnWrite();
        C71326u uVar3 = (C71326u) tVar.instance;
        sVar.getClass();
        uVar3.f190498d = sVar;
        uVar3.f190495a |= 1;
        C71326u uVar4 = (C71326u) tVar.build();
        if (C31285r.m58328i(uVar4)) {
            return null;
        }
        return uVar4;
    }

    /* renamed from: c */
    public final /* synthetic */ String mo36995c(MessageLite messageLite) {
        C71324s sVar = ((C71326u) messageLite).f190498d;
        if (sVar == null) {
            sVar = C71324s.f190488d;
        }
        return sVar.f190492c;
    }
}
