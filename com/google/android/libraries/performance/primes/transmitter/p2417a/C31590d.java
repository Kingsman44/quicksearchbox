package com.google.android.libraries.performance.primes.transmitter.p2417a;

import com.google.protobuf.C63000ds;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71252ch;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71255ck;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.a.d */
/* compiled from: PG */
final class C31590d implements C31591e {
    /* renamed from: a */
    public final /* synthetic */ String mo37268a(C63000ds dsVar) {
        return ((C71255ck) ((C71252ch) dsVar).instance).f190232b;
    }

    /* renamed from: b */
    public final /* synthetic */ String mo37269b(C63000ds dsVar) {
        return ((C71255ck) ((C71252ch) dsVar).instance).f190234d;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo37270c(C63000ds dsVar, Long l) {
        C71252ch chVar = (C71252ch) dsVar;
        if (l == null) {
            chVar.copyOnWrite();
            C71255ck ckVar = (C71255ck) chVar.instance;
            C71255ck ckVar2 = C71255ck.f190229m;
            ckVar.f190231a &= -3;
            ckVar.f190233c = 0;
            return;
        }
        long longValue = l.longValue();
        chVar.copyOnWrite();
        C71255ck ckVar3 = (C71255ck) chVar.instance;
        C71255ck ckVar4 = C71255ck.f190229m;
        ckVar3.f190231a |= 2;
        ckVar3.f190233c = longValue;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo37271d(C63000ds dsVar) {
        C71252ch chVar = (C71252ch) dsVar;
        chVar.copyOnWrite();
        C71255ck ckVar = (C71255ck) chVar.instance;
        C71255ck ckVar2 = C71255ck.f190229m;
        ckVar.f190231a &= -5;
        ckVar.f190234d = C71255ck.f190229m.f190234d;
    }
}
