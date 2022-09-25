package com.google.android.libraries.performance.primes.metrics.p2403a;

import com.google.protobuf.MessageLite;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71321p;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71322q;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71324s;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.l */
/* compiled from: PG */
final class C31279l extends C31282o {

    /* renamed from: a */
    public static final C31279l f84249a = new C31279l();

    private C31279l() {
    }

    /* renamed from: a */
    public final /* synthetic */ MessageLite mo36993a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        if (intValue == 0) {
            return null;
        }
        C71321p pVar = (C71321p) C71322q.f190483d.createBuilder();
        pVar.copyOnWrite();
        C71322q qVar = (C71322q) pVar.instance;
        qVar.f190485a |= 1;
        qVar.f190486b = intValue;
        if (str != null) {
            C71324s d = C31285r.m58323d(str);
            pVar.copyOnWrite();
            C71322q qVar2 = (C71322q) pVar.instance;
            d.getClass();
            qVar2.f190487c = d;
            qVar2.f190485a |= 2;
        }
        return (C71322q) pVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo36994b(MessageLite messageLite, MessageLite messageLite2) {
        int i;
        C71322q qVar = (C71322q) messageLite;
        C71322q qVar2 = (C71322q) messageLite2;
        if (qVar == null || qVar2 == null) {
            return qVar;
        }
        if ((qVar.f190485a & 1) == 0 || (i = qVar.f190486b - qVar2.f190486b) == 0) {
            return null;
        }
        C71321p pVar = (C71321p) C71322q.f190483d.createBuilder();
        if ((qVar.f190485a & 2) != 0) {
            C71324s sVar = qVar.f190487c;
            if (sVar == null) {
                sVar = C71324s.f190488d;
            }
            pVar.copyOnWrite();
            C71322q qVar3 = (C71322q) pVar.instance;
            sVar.getClass();
            qVar3.f190487c = sVar;
            qVar3.f190485a |= 2;
        }
        pVar.copyOnWrite();
        C71322q qVar4 = (C71322q) pVar.instance;
        qVar4.f190485a |= 1;
        qVar4.f190486b = i;
        return (C71322q) pVar.build();
    }

    /* renamed from: c */
    public final /* synthetic */ String mo36995c(MessageLite messageLite) {
        C71324s sVar = ((C71322q) messageLite).f190487c;
        if (sVar == null) {
            sVar = C71324s.f190488d;
        }
        return sVar.f190492c;
    }
}
