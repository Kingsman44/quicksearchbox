package com.google.android.libraries.performance.primes.metrics.p2416j;

import com.google.android.libraries.performance.primes.metrics.p2404b.C31295a;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31301d;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31302e;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62947c;
import java.util.List;
import java.util.UUID;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71249ce;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71251cg;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.w */
/* compiled from: PG */
public final /* synthetic */ class C31555w implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31531ab f84966a;

    /* renamed from: b */
    public final /* synthetic */ C31553u f84967b;

    public /* synthetic */ C31555w(C31531ab abVar, C31553u uVar) {
        this.f84966a = abVar;
        this.f84967b = uVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C31531ab abVar = this.f84966a;
        C31553u uVar = this.f84967b;
        if (!((C31550r) abVar.f84912c.mo27525b()).mo36980b()) {
            return C60866ct.f164955a;
        }
        if (((C31547o) abVar.f84911b.mo27525b()).mo36980b()) {
            return C60866ct.f164955a;
        }
        if (abVar.f84914e.mo36968c()) {
            return C60866ct.f164955a;
        }
        abVar.f84914e.mo36967b();
        List b = C31533ad.m58791b(uVar);
        if (b == null || b.isEmpty()) {
            return C60866ct.f164955a;
        }
        C71249ce ceVar = (C71249ce) C71251cg.f190215k.createBuilder();
        long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
        ceVar.copyOnWrite();
        C71251cg cgVar = (C71251cg) ceVar.instance;
        cgVar.f190217a |= 1;
        cgVar.f190218b = leastSignificantBits;
        ceVar.copyOnWrite();
        C71251cg cgVar2 = (C71251cg) ceVar.instance;
        cgVar2.mo62661a();
        C62947c.addAll((Iterable) b, (List) cgVar2.f190220d);
        C71251cg cgVar3 = (C71251cg) ceVar.build();
        long a = abVar.f84910a.mo37022a(C31531ab.m58782e(cgVar3));
        if (a == -1) {
            return C60866ct.f164955a;
        }
        C71307ei eiVar = (C71307ei) C71308ej.f190415x.createBuilder();
        eiVar.copyOnWrite();
        C71308ej ejVar = (C71308ej) eiVar.instance;
        cgVar3.getClass();
        ejVar.f190427l = cgVar3;
        ejVar.f190416a |= 4096;
        long j = cgVar3.f190218b;
        C31310m mVar = abVar.f84910a;
        C31301d j2 = C31302e.m58363j();
        j2.mo37004e((C71308ej) eiVar.build());
        ((C31295a) j2).f84272e = Long.valueOf(a);
        return mVar.mo37023b(j2.mo37000a());
    }
}
