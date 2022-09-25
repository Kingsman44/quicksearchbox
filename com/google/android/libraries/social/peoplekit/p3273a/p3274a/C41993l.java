package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42094d;
import p5602o.p5607c.p5608a.p5609a.C71912k;
import p5602o.p5607c.p5608a.p5609a.C71913l;
import p5602o.p5607c.p5608a.p5609a.C71916o;
import p5602o.p5607c.p5608a.p5609a.C71917p;
import p5602o.p5607c.p5608a.p5609a.C71919r;
import p5602o.p5607c.p5608a.p5609a.C71920s;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.l */
/* compiled from: PG */
final class C41993l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Stopwatch f109647a;

    /* renamed from: b */
    final /* synthetic */ C42094d f109648b;

    /* renamed from: c */
    final /* synthetic */ C41994m f109649c;

    public C41993l(C41994m mVar, Stopwatch stopwatch, C42094d dVar) {
        this.f109649c = mVar;
        this.f109647a = stopwatch;
        this.f109648b = dVar;
    }

    public final void run() {
        C42075e eVar = this.f109649c.f109652c;
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
        long a = this.f109647a.mo44569a();
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
        int f = this.f109649c.f109652c.mo44580f();
        rVar.copyOnWrite();
        C71920s sVar = (C71920s) rVar.instance;
        int i = f - 1;
        if (f != 0) {
            sVar.f191542b = i;
            sVar.f191541a |= 1;
            rVar.copyOnWrite();
            C71920s sVar2 = (C71920s) rVar.instance;
            sVar2.f191543c = 2;
            sVar2.f191541a |= 2;
            int i2 = this.f109648b.f110050a;
            rVar.copyOnWrite();
            C71920s sVar3 = (C71920s) rVar.instance;
            sVar3.f191541a |= 4;
            sVar3.f191544d = i2;
            kVar.copyOnWrite();
            C71913l lVar3 = (C71913l) kVar.instance;
            C71920s sVar4 = (C71920s) rVar.build();
            sVar4.getClass();
            lVar3.f191527c = sVar4;
            lVar3.f191525a |= 2;
            eVar.mo44576b((C71913l) kVar.build());
            C42075e eVar2 = this.f109649c.f109652c;
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
            long a2 = this.f109649c.f109652c.mo44575a("ACQueryToRender").mo44569a();
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
            int f2 = this.f109649c.f109652c.mo44580f();
            rVar2.copyOnWrite();
            C71920s sVar5 = (C71920s) rVar2.instance;
            int i3 = f2 - 1;
            if (f2 != 0) {
                sVar5.f191542b = i3;
                sVar5.f191541a |= 1;
                rVar2.copyOnWrite();
                C71920s sVar6 = (C71920s) rVar2.instance;
                sVar6.f191543c = 2;
                sVar6.f191541a |= 2;
                int i4 = this.f109648b.f110050a;
                rVar2.copyOnWrite();
                C71920s sVar7 = (C71920s) rVar2.instance;
                sVar7.f191541a = 4 | sVar7.f191541a;
                sVar7.f191544d = i4;
                kVar2.copyOnWrite();
                C71913l lVar6 = (C71913l) kVar2.instance;
                C71920s sVar8 = (C71920s) rVar2.build();
                sVar8.getClass();
                lVar6.f191527c = sVar8;
                lVar6.f191525a |= 2;
                eVar2.mo44576b((C71913l) kVar2.build());
                return;
            }
            throw null;
        }
        throw null;
    }
}
