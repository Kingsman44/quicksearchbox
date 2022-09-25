package com.google.android.libraries.performance.primes.metrics.p2403a;

import android.os.health.TimerStat;
import com.google.protobuf.MessageLite;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71193ac;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71324s;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.q */
/* compiled from: PG */
final class C31284q extends C31282o {

    /* renamed from: a */
    public static final C31284q f84253a = new C31284q();

    private C31284q() {
    }

    /* renamed from: a */
    public final /* synthetic */ MessageLite mo36993a(String str, Object obj) {
        return C31285r.m58326g(str, (TimerStat) obj);
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo36994b(MessageLite messageLite, MessageLite messageLite2) {
        return C31285r.m58325f((C71193ac) messageLite, (C71193ac) messageLite2);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ String mo36995c(MessageLite messageLite) {
        C71193ac acVar = (C71193ac) messageLite;
        C71324s sVar = acVar.f189958d;
        if (sVar == null) {
            sVar = C71324s.f190488d;
        }
        int i = sVar.f190490a & 2;
        C71324s sVar2 = acVar.f189958d;
        if (i != 0) {
            if (sVar2 == null) {
                sVar2 = C71324s.f190488d;
            }
            return sVar2.f190492c;
        }
        if (sVar2 == null) {
            sVar2 = C71324s.f190488d;
        }
        return Long.toHexString(sVar2.f190491b);
    }
}
