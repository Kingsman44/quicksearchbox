package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import p5602o.p5607c.p5608a.p5609a.C71912k;
import p5602o.p5607c.p5608a.p5609a.C71913l;
import p5602o.p5607c.p5608a.p5609a.C71916o;
import p5602o.p5607c.p5608a.p5609a.C71917p;
import p5602o.p5607c.p5608a.p5609a.C71919r;
import p5602o.p5607c.p5608a.p5609a.C71920s;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.d */
/* compiled from: PG */
final class C41985d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Stopwatch f109623a;

    /* renamed from: b */
    final /* synthetic */ C41986e f109624b;

    public C41985d(C41986e eVar, Stopwatch stopwatch) {
        this.f109624b = eVar;
        this.f109623a = stopwatch;
    }

    public final void run() {
        C42075e eVar = this.f109624b.f109629e;
        C71912k kVar = (C71912k) C71913l.f191523f.createBuilder();
        kVar.copyOnWrite();
        C71913l lVar = (C71913l) kVar.instance;
        lVar.f191526b = 4;
        lVar.f191525a |= 1;
        C71916o oVar = (C71916o) C71917p.f191532e.createBuilder();
        oVar.copyOnWrite();
        C71917p pVar = (C71917p) oVar.instance;
        pVar.f191535b = 2;
        pVar.f191534a |= 1;
        long a = this.f109623a.mo44569a();
        oVar.copyOnWrite();
        C71917p pVar2 = (C71917p) oVar.instance;
        pVar2.f191534a |= 2;
        pVar2.f191536c = a;
        kVar.copyOnWrite();
        C71913l lVar2 = (C71913l) kVar.instance;
        C71917p pVar3 = (C71917p) oVar.build();
        pVar3.getClass();
        lVar2.f191529e = pVar3;
        lVar2.f191525a |= 8;
        C71919r rVar = (C71919r) C71920s.f191539e.createBuilder();
        int f = this.f109624b.f109629e.mo44580f();
        rVar.copyOnWrite();
        C71920s sVar = (C71920s) rVar.instance;
        int i = f - 1;
        if (f != 0) {
            sVar.f191542b = i;
            sVar.f191541a |= 1;
            rVar.copyOnWrite();
            C71920s sVar2 = (C71920s) rVar.instance;
            sVar2.f191543c = 3;
            sVar2.f191541a |= 2;
            kVar.copyOnWrite();
            C71913l lVar3 = (C71913l) kVar.instance;
            C71920s sVar3 = (C71920s) rVar.build();
            sVar3.getClass();
            lVar3.f191527c = sVar3;
            lVar3.f191525a |= 2;
            eVar.mo44576b((C71913l) kVar.build());
            C42075e eVar2 = this.f109624b.f109629e;
            C71912k kVar2 = (C71912k) C71913l.f191523f.createBuilder();
            kVar2.copyOnWrite();
            C71913l lVar4 = (C71913l) kVar2.instance;
            lVar4.f191526b = 4;
            lVar4.f191525a |= 1;
            C71916o oVar2 = (C71916o) C71917p.f191532e.createBuilder();
            oVar2.copyOnWrite();
            C71917p pVar4 = (C71917p) oVar2.instance;
            pVar4.f191535b = 8;
            pVar4.f191534a |= 1;
            long a2 = this.f109624b.f109629e.mo44575a("ListViewDeviceSuggestionsTime").mo44569a();
            oVar2.copyOnWrite();
            C71917p pVar5 = (C71917p) oVar2.instance;
            pVar5.f191534a |= 2;
            pVar5.f191536c = a2;
            kVar2.copyOnWrite();
            C71913l lVar5 = (C71913l) kVar2.instance;
            C71917p pVar6 = (C71917p) oVar2.build();
            pVar6.getClass();
            lVar5.f191529e = pVar6;
            lVar5.f191525a |= 8;
            C71919r rVar2 = (C71919r) C71920s.f191539e.createBuilder();
            int f2 = this.f109624b.f109629e.mo44580f();
            rVar2.copyOnWrite();
            C71920s sVar4 = (C71920s) rVar2.instance;
            int i2 = f2 - 1;
            if (f2 != 0) {
                sVar4.f191542b = i2;
                sVar4.f191541a |= 1;
                rVar2.copyOnWrite();
                C71920s sVar5 = (C71920s) rVar2.instance;
                sVar5.f191543c = 3;
                sVar5.f191541a |= 2;
                kVar2.copyOnWrite();
                C71913l lVar6 = (C71913l) kVar2.instance;
                C71920s sVar6 = (C71920s) rVar2.build();
                sVar6.getClass();
                lVar6.f191527c = sVar6;
                lVar6.f191525a |= 2;
                eVar2.mo44576b((C71913l) kVar2.build());
                return;
            }
            throw null;
        }
        throw null;
    }
}
