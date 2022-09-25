package com.google.android.libraries.performance.primes.transmitter.p2417a;

import com.google.protobuf.C63000ds;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.a.b */
/* compiled from: PG */
final class C31588b implements C31591e {
    /* renamed from: a */
    public final /* synthetic */ String mo37268a(C63000ds dsVar) {
        return ((C71308ej) ((C71307ei) dsVar).instance).f190419d;
    }

    /* renamed from: b */
    public final /* synthetic */ String mo37269b(C63000ds dsVar) {
        return ((C71308ej) ((C71307ei) dsVar).instance).f190418c;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo37270c(C63000ds dsVar, Long l) {
        C71307ei eiVar = (C71307ei) dsVar;
        if (l != null) {
            long longValue = l.longValue();
            eiVar.copyOnWrite();
            C71308ej ejVar = (C71308ej) eiVar.instance;
            C71308ej ejVar2 = C71308ej.f190415x;
            ejVar.f190416a |= 1;
            ejVar.f190417b = longValue;
            return;
        }
        eiVar.copyOnWrite();
        C71308ej ejVar3 = (C71308ej) eiVar.instance;
        C71308ej ejVar4 = C71308ej.f190415x;
        ejVar3.f190416a &= -2;
        ejVar3.f190417b = 0;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo37271d(C63000ds dsVar) {
        C71307ei eiVar = (C71307ei) dsVar;
        eiVar.copyOnWrite();
        C71308ej ejVar = (C71308ej) eiVar.instance;
        C71308ej ejVar2 = C71308ej.f190415x;
        ejVar.f190416a &= -3;
        ejVar.f190418c = C71308ej.f190415x.f190418c;
    }
}
