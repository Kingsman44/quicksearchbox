package com.google.android.libraries.performance.primes.metrics.p2416j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71252ch;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71255ck;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.l */
/* compiled from: PG */
final class C31544l {

    /* renamed from: a */
    public final C31543k f84955a;

    /* renamed from: b */
    private long f84956b = 1;

    public C31544l(C31543k kVar) {
        this.f84955a = kVar;
    }

    /* renamed from: a */
    public final void mo37241a(C31543k kVar, long j, ArrayList arrayList) {
        List<C31543k> list;
        if (kVar.f84952f == null) {
            list = kVar.f84952f == null ? Collections.emptyList() : kVar.f84952f;
        } else {
            list = kVar.f84952f;
            kVar.f84952f = null;
        }
        if (!kVar.mo37239c() || !list.isEmpty()) {
            C71252ch chVar = (C71252ch) C71255ck.f190229m.createBuilder();
            int i = kVar.f84953g;
            String str = kVar.f84948b;
            chVar.copyOnWrite();
            C71255ck ckVar = (C71255ck) chVar.instance;
            str.getClass();
            ckVar.f190231a |= 1;
            ckVar.f190232b = str;
            long j2 = kVar.f84949c;
            chVar.copyOnWrite();
            C71255ck ckVar2 = (C71255ck) chVar.instance;
            ckVar2.f190231a |= 32;
            ckVar2.f190237g = j2;
            long a = kVar.mo37237a();
            chVar.copyOnWrite();
            C71255ck ckVar3 = (C71255ck) chVar.instance;
            ckVar3.f190231a |= 64;
            ckVar3.f190238h = a;
            long j3 = kVar.f84951e;
            chVar.copyOnWrite();
            C71255ck ckVar4 = (C71255ck) chVar.instance;
            ckVar4.f190231a |= 256;
            ckVar4.f190240j = j3;
            long j4 = this.f84956b;
            this.f84956b = 1 + j4;
            chVar.copyOnWrite();
            C71255ck ckVar5 = (C71255ck) chVar.instance;
            ckVar5.f190231a |= 8;
            ckVar5.f190235e = j4;
            chVar.copyOnWrite();
            C71255ck ckVar6 = (C71255ck) chVar.instance;
            ckVar6.f190231a |= 16;
            ckVar6.f190236f = j;
            int i2 = kVar.f84954h - 1;
            if (i2 == 1) {
                chVar.copyOnWrite();
                C71255ck ckVar7 = (C71255ck) chVar.instance;
                ckVar7.f190241k = 1;
                ckVar7.f190231a |= 512;
            } else if (i2 != 3) {
                chVar.copyOnWrite();
                C71255ck ckVar8 = (C71255ck) chVar.instance;
                ckVar8.f190241k = 0;
                ckVar8.f190231a |= 512;
            } else {
                chVar.copyOnWrite();
                C71255ck ckVar9 = (C71255ck) chVar.instance;
                ckVar9.f190241k = 4;
                ckVar9.f190231a |= 512;
            }
            if (kVar.mo37239c()) {
                long j5 = ((C31543k) list.get(list.size() - 1)).f84950d;
                long j6 = kVar.f84949c;
                chVar.copyOnWrite();
                C71255ck ckVar10 = (C71255ck) chVar.instance;
                ckVar10.f190231a |= 64;
                ckVar10.f190238h = j5 - j6;
            }
            arrayList.add((C71255ck) chVar.build());
            for (C31543k a2 : list) {
                mo37241a(a2, ((C71255ck) chVar.instance).f190235e, arrayList);
            }
        }
    }
}
