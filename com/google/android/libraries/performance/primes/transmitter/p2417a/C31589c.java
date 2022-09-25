package com.google.android.libraries.performance.primes.transmitter.p2417a;

import com.google.protobuf.C63000ds;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71315j;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71318m;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.a.c */
/* compiled from: PG */
final class C31589c implements C31591e {
    /* renamed from: a */
    public final /* synthetic */ String mo37268a(C63000ds dsVar) {
        return ((C71318m) ((C71315j) dsVar).instance).f190471e;
    }

    /* renamed from: b */
    public final /* synthetic */ String mo37269b(C63000ds dsVar) {
        return ((C71318m) ((C71315j) dsVar).instance).f190470d;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo37270c(C63000ds dsVar, Long l) {
        C71315j jVar = (C71315j) dsVar;
        if (l != null) {
            long longValue = l.longValue();
            jVar.copyOnWrite();
            C71318m mVar = (C71318m) jVar.instance;
            C71318m mVar2 = C71318m.f190465k;
            mVar.f190467a |= 2;
            mVar.f190469c = longValue;
            return;
        }
        jVar.copyOnWrite();
        C71318m mVar3 = (C71318m) jVar.instance;
        C71318m mVar4 = C71318m.f190465k;
        mVar3.f190467a &= -3;
        mVar3.f190469c = 0;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo37271d(C63000ds dsVar) {
        C71315j jVar = (C71315j) dsVar;
        jVar.copyOnWrite();
        C71318m mVar = (C71318m) jVar.instance;
        C71318m mVar2 = C71318m.f190465k;
        mVar.f190467a &= -5;
        mVar.f190470d = C71318m.f190465k.f190470d;
    }
}
