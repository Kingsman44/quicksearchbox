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

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.c */
/* compiled from: PG */
final class C41984c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Stopwatch f109620a;

    /* renamed from: b */
    final /* synthetic */ C42094d f109621b;

    /* renamed from: c */
    final /* synthetic */ C41986e f109622c;

    public C41984c(C41986e eVar, Stopwatch stopwatch, C42094d dVar) {
        this.f109622c = eVar;
        this.f109620a = stopwatch;
        this.f109621b = dVar;
    }

    public final void run() {
        C42075e eVar = this.f109622c.f109629e;
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
        long a = this.f109620a.mo44569a();
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
        int f = this.f109622c.f109629e.mo44580f();
        rVar.copyOnWrite();
        C71920s sVar = (C71920s) rVar.instance;
        int i = f - 1;
        if (f != 0) {
            sVar.f191542b = i;
            sVar.f191541a |= 1;
            rVar.copyOnWrite();
            C71920s sVar2 = (C71920s) rVar.instance;
            sVar2.f191543c = 1;
            sVar2.f191541a |= 2;
            kVar.copyOnWrite();
            C71913l lVar3 = (C71913l) kVar.instance;
            C71920s sVar3 = (C71920s) rVar.build();
            sVar3.getClass();
            lVar3.f191527c = sVar3;
            lVar3.f191525a |= 2;
            eVar.mo44576b((C71913l) kVar.build());
            C42075e eVar2 = this.f109622c.f109629e;
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
            long a2 = this.f109622c.f109629e.mo44575a("ListViewTopSuggestionsTime").mo44569a();
            oVar2.copyOnWrite();
            C71917p pVar5 = (C71917p) oVar2.instance;
            pVar5.f191534a |= 2;
            pVar5.f191536c = a2;
            int e = this.f109622c.f109629e.mo44579e();
            oVar2.copyOnWrite();
            C71917p pVar6 = (C71917p) oVar2.instance;
            int i2 = e - 1;
            if (e != 0) {
                pVar6.f191537d = i2;
                pVar6.f191534a |= 4;
                kVar2.copyOnWrite();
                C71913l lVar5 = (C71913l) kVar2.instance;
                C71917p pVar7 = (C71917p) oVar2.build();
                pVar7.getClass();
                lVar5.f191529e = pVar7;
                lVar5.f191525a |= 8;
                C71919r rVar2 = (C71919r) C71920s.f191539e.createBuilder();
                int f2 = this.f109622c.f109629e.mo44580f();
                rVar2.copyOnWrite();
                C71920s sVar4 = (C71920s) rVar2.instance;
                int i3 = f2 - 1;
                if (f2 != 0) {
                    sVar4.f191542b = i3;
                    sVar4.f191541a |= 1;
                    rVar2.copyOnWrite();
                    C71920s sVar5 = (C71920s) rVar2.instance;
                    sVar5.f191543c = 1;
                    sVar5.f191541a |= 2;
                    int i4 = this.f109621b.f110050a;
                    rVar2.copyOnWrite();
                    C71920s sVar6 = (C71920s) rVar2.instance;
                    sVar6.f191541a |= 4;
                    sVar6.f191544d = i4;
                    kVar2.copyOnWrite();
                    C71913l lVar6 = (C71913l) kVar2.instance;
                    C71920s sVar7 = (C71920s) rVar2.build();
                    sVar7.getClass();
                    lVar6.f191527c = sVar7;
                    lVar6.f191525a |= 2;
                    eVar2.mo44576b((C71913l) kVar2.build());
                    Stopwatch a3 = this.f109622c.f109629e.mo44575a("TotalInitialize");
                    if (a3.f109976c) {
                        a3.mo44572d();
                        C42075e eVar3 = this.f109622c.f109629e;
                        C71912k kVar3 = (C71912k) C71913l.f191523f.createBuilder();
                        kVar3.copyOnWrite();
                        C71913l lVar7 = (C71913l) kVar3.instance;
                        lVar7.f191526b = 4;
                        lVar7.f191525a |= 1;
                        C71916o oVar3 = (C71916o) C71917p.f191532e.createBuilder();
                        oVar3.copyOnWrite();
                        C71917p pVar8 = (C71917p) oVar3.instance;
                        pVar8.f191535b = 12;
                        pVar8.f191534a |= 1;
                        long a4 = a3.mo44569a();
                        oVar3.copyOnWrite();
                        C71917p pVar9 = (C71917p) oVar3.instance;
                        pVar9.f191534a |= 2;
                        pVar9.f191536c = a4;
                        int e2 = this.f109622c.f109629e.mo44579e();
                        oVar3.copyOnWrite();
                        C71917p pVar10 = (C71917p) oVar3.instance;
                        int i5 = e2 - 1;
                        if (e2 != 0) {
                            pVar10.f191537d = i5;
                            pVar10.f191534a |= 4;
                            kVar3.copyOnWrite();
                            C71913l lVar8 = (C71913l) kVar3.instance;
                            C71917p pVar11 = (C71917p) oVar3.build();
                            pVar11.getClass();
                            lVar8.f191529e = pVar11;
                            lVar8.f191525a |= 8;
                            C71919r rVar3 = (C71919r) C71920s.f191539e.createBuilder();
                            int f3 = this.f109622c.f109629e.mo44580f();
                            rVar3.copyOnWrite();
                            C71920s sVar8 = (C71920s) rVar3.instance;
                            int i6 = f3 - 1;
                            if (f3 != 0) {
                                sVar8.f191542b = i6;
                                sVar8.f191541a |= 1;
                                rVar3.copyOnWrite();
                                C71920s sVar9 = (C71920s) rVar3.instance;
                                sVar9.f191543c = 1;
                                sVar9.f191541a |= 2;
                                int i7 = this.f109621b.f110050a;
                                rVar3.copyOnWrite();
                                C71920s sVar10 = (C71920s) rVar3.instance;
                                sVar10.f191541a = 4 | sVar10.f191541a;
                                sVar10.f191544d = i7;
                                kVar3.copyOnWrite();
                                C71913l lVar9 = (C71913l) kVar3.instance;
                                C71920s sVar11 = (C71920s) rVar3.build();
                                sVar11.getClass();
                                lVar9.f191527c = sVar11;
                                lVar9.f191525a |= 2;
                                eVar3.mo44576b((C71913l) kVar3.build());
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
