package com.google.android.libraries.social.populous.logging;

import com.google.android.gms.clearcut.C143623ad;
import com.google.android.libraries.social.p3269d.p3270a.C41937l;
import com.google.android.libraries.social.populous.p3289c.p3291b.C42213b;
import com.google.common.base.C58872ci;
import com.google.common.base.C58881cr;
import com.google.common.base.C58889cz;
import com.google.p4420by.p4421a.p4422a.C57867d;
import com.google.p4420by.p4421a.p4422a.C57868e;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p5602o.p5604b.p5605a.C71876b;
import p5602o.p5604b.p5605a.C71877c;
import p5602o.p5604b.p5605a.C71878d;
import p5602o.p5604b.p5605a.C71879e;
import p5602o.p5604b.p5605a.C71881g;
import p5602o.p5604b.p5605a.C71882h;
import p5602o.p5604b.p5605a.C71883i;
import p5602o.p5604b.p5605a.C71884j;
import p5602o.p5604b.p5605a.C71885k;
import p5602o.p5604b.p5605a.C71888n;
import p5602o.p5604b.p5605a.C71889o;
import p5602o.p5604b.p5605a.C71890p;
import p5602o.p5604b.p5605a.C71891q;
import p5602o.p5604b.p5605a.C71892r;
import p5602o.p5604b.p5605a.C71893s;
import p5602o.p5604b.p5605a.C71894t;
import p5602o.p5607c.C71935f;
import p5602o.p5607c.C71936g;
import p5602o.p5607c.C71943n;
import p5602o.p5607c.C71944o;

/* renamed from: com.google.android.libraries.social.populous.logging.aa */
/* compiled from: PG */
public final class C42563aa implements C42591z {

    /* renamed from: a */
    public final C58889cz f111698a;

    /* renamed from: b */
    private final C42582q f111699b;

    /* renamed from: c */
    private final C58881cr f111700c;

    /* renamed from: d */
    private final C143623ad f111701d;

    /* renamed from: e */
    private final C42213b f111702e;

    public C42563aa(C42213b bVar, C42582q qVar, C58889cz czVar, C58881cr crVar, C143623ad adVar) {
        this.f111702e = bVar;
        this.f111699b = qVar;
        this.f111698a = czVar;
        this.f111700c = crVar;
        this.f111701d = adVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C42579n mo45631a(C42576k kVar) {
        return new C42579n(this, kVar);
    }

    /* renamed from: b */
    public final C58872ci mo45632b() {
        return C58872ci.m90947d(this.f111698a);
    }

    /* renamed from: c */
    public final void mo45633c(C71885k kVar, C42576k kVar2) {
        C71881g l = mo45642l(2, kVar2);
        l.copyOnWrite();
        C71894t tVar = (C71894t) l.instance;
        C71894t tVar2 = C71894t.f191480m;
        kVar.getClass();
        tVar.f191487f = kVar;
        tVar.f191482a |= 32;
        mo45641k((C71894t) l.build());
    }

    /* renamed from: d */
    public final /* synthetic */ C58872ci mo45634d(int i, int i2, Integer num, C42576k kVar) {
        C71876b bVar = (C71876b) C71877c.f191427e.createBuilder();
        bVar.copyOnWrite();
        C71877c cVar = (C71877c) bVar.instance;
        cVar.f191430b = i - 1;
        cVar.f191429a |= 1;
        bVar.copyOnWrite();
        C71877c cVar2 = (C71877c) bVar.instance;
        cVar2.f191429a |= 2;
        cVar2.f191431c = i2;
        if (num != null) {
            int intValue = num.intValue();
            bVar.copyOnWrite();
            C71877c cVar3 = (C71877c) bVar.instance;
            cVar3.f191429a |= 8;
            cVar3.f191432d = intValue;
        }
        C71877c cVar4 = (C71877c) bVar.build();
        C71881g l = mo45642l(7, kVar);
        l.copyOnWrite();
        C71894t tVar = (C71894t) l.instance;
        C71894t tVar2 = C71894t.f191480m;
        cVar4.getClass();
        tVar.f191492k = cVar4;
        tVar.f191482a |= 1024;
        mo45641k((C71894t) l.build());
        return C58872ci.m90947d(this.f111698a);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo45635e(int i, C42576k kVar) {
        C71884j jVar = (C71884j) C71885k.f191450d.createBuilder();
        jVar.copyOnWrite();
        C71885k kVar2 = (C71885k) jVar.instance;
        kVar2.f191453b = i - 1;
        kVar2.f191452a |= 2;
        mo45633c((C71885k) jVar.build(), kVar);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo45636f(int i, int i2, C42576k kVar) {
        C71884j jVar = (C71884j) C71885k.f191450d.createBuilder();
        jVar.copyOnWrite();
        C71885k kVar2 = (C71885k) jVar.instance;
        kVar2.f191453b = i - 1;
        kVar2.f191452a |= 2;
        jVar.copyOnWrite();
        C71885k kVar3 = (C71885k) jVar.instance;
        kVar3.f191452a |= 4;
        kVar3.f191454c = (long) i2;
        mo45633c((C71885k) jVar.build(), kVar);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo45637g(int i, int i2, C42590y yVar, Integer num, C42576k kVar) {
        C71878d dVar = (C71878d) C71879e.f191433k.createBuilder();
        dVar.copyOnWrite();
        C71879e eVar = (C71879e) dVar.instance;
        int i3 = i - 1;
        if (i != 0) {
            eVar.f191436b = i3;
            eVar.f191435a |= 1;
            dVar.copyOnWrite();
            C71879e eVar2 = (C71879e) dVar.instance;
            eVar2.f191437c = i2 - 1;
            eVar2.f191435a |= 2;
            int a = yVar.mo45653a();
            dVar.copyOnWrite();
            C71879e eVar3 = (C71879e) dVar.instance;
            eVar3.f191435a |= 128;
            eVar3.f191443i = a;
            int d = yVar.mo45656d();
            dVar.copyOnWrite();
            C71879e eVar4 = (C71879e) dVar.instance;
            int i4 = d - 1;
            if (d != 0) {
                eVar4.f191440f = i4;
                eVar4.f191435a |= 16;
                int e = yVar.mo45657e();
                dVar.copyOnWrite();
                C71879e eVar5 = (C71879e) dVar.instance;
                int i5 = e - 1;
                if (e != 0) {
                    eVar5.f191441g = i5;
                    eVar5.f191435a |= 32;
                    int f = yVar.mo45659f();
                    dVar.copyOnWrite();
                    C71879e eVar6 = (C71879e) dVar.instance;
                    int i6 = f - 1;
                    if (f != 0) {
                        eVar6.f191442h = i6;
                        eVar6.f191435a |= 64;
                        if (yVar.mo45654b() != null) {
                            long a2 = yVar.mo45654b().mo56158a(TimeUnit.MICROSECONDS);
                            dVar.copyOnWrite();
                            C71879e eVar7 = (C71879e) dVar.instance;
                            eVar7.f191435a |= 4;
                            eVar7.f191438d = a2;
                        }
                        if (yVar.mo45655c() != null) {
                            int intValue = yVar.mo45655c().intValue();
                            dVar.copyOnWrite();
                            C71879e eVar8 = (C71879e) dVar.instance;
                            eVar8.f191435a |= 8;
                            eVar8.f191439e = intValue;
                        }
                        if (num != null) {
                            int intValue2 = num.intValue();
                            dVar.copyOnWrite();
                            C71879e eVar9 = (C71879e) dVar.instance;
                            eVar9.f191435a |= 4096;
                            eVar9.f191444j = intValue2;
                        }
                        C71879e eVar10 = (C71879e) dVar.build();
                        C71881g l = mo45642l(8, kVar);
                        l.copyOnWrite();
                        C71894t tVar = (C71894t) l.instance;
                        C71894t tVar2 = C71894t.f191480m;
                        eVar10.getClass();
                        tVar.f191493l = eVar10;
                        tVar.f191482a |= 2048;
                        mo45641k((C71894t) l.build());
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo45638h(int i, C58872ci ciVar, C42576k kVar) {
        C71888n nVar = (C71888n) C71889o.f191463d.createBuilder();
        nVar.copyOnWrite();
        C71889o oVar = (C71889o) nVar.instance;
        oVar.f191466b = i - 1;
        oVar.f191465a |= 1;
        long a = ciVar.mo56158a(TimeUnit.MICROSECONDS);
        nVar.copyOnWrite();
        C71889o oVar2 = (C71889o) nVar.instance;
        oVar2.f191465a |= 2;
        oVar2.f191467c = a;
        C71889o oVar3 = (C71889o) nVar.build();
        C71881g l = mo45642l(3, kVar);
        l.copyOnWrite();
        C71894t tVar = (C71894t) l.instance;
        C71894t tVar2 = C71894t.f191480m;
        oVar3.getClass();
        tVar.f191488g = oVar3;
        tVar.f191482a |= 64;
        mo45641k((C71894t) l.build());
    }

    /* renamed from: i */
    public final /* synthetic */ void mo45639i(int i, long j, C42576k kVar) {
        C71890p pVar = (C71890p) C71891q.f191468d.createBuilder();
        pVar.copyOnWrite();
        C71891q qVar = (C71891q) pVar.instance;
        qVar.f191471b = i - 1;
        qVar.f191470a |= 1;
        pVar.copyOnWrite();
        C71891q qVar2 = (C71891q) pVar.instance;
        qVar2.f191470a |= 4;
        qVar2.f191472c = j;
        C71891q qVar3 = (C71891q) pVar.build();
        C71881g l = mo45642l(5, kVar);
        l.copyOnWrite();
        C71894t tVar = (C71894t) l.instance;
        C71894t tVar2 = C71894t.f191480m;
        qVar3.getClass();
        tVar.f191490i = qVar3;
        tVar.f191482a |= 256;
        mo45641k((C71894t) l.build());
    }

    /* renamed from: j */
    public final /* synthetic */ void mo45640j(int i, int i2, long j, C58872ci ciVar, C42576k kVar) {
        C71892r rVar = (C71892r) C71893s.f191473f.createBuilder();
        rVar.copyOnWrite();
        C71893s sVar = (C71893s) rVar.instance;
        sVar.f191476b = i - 1;
        sVar.f191475a |= 1;
        rVar.copyOnWrite();
        C71893s sVar2 = (C71893s) rVar.instance;
        int i3 = i2 - 1;
        if (i2 != 0) {
            sVar2.f191477c = i3;
            sVar2.f191475a |= 2;
            rVar.copyOnWrite();
            C71893s sVar3 = (C71893s) rVar.instance;
            sVar3.f191475a |= 32;
            sVar3.f191479e = j;
            if (ciVar != null) {
                long a = ciVar.mo56158a(TimeUnit.MICROSECONDS);
                rVar.copyOnWrite();
                C71893s sVar4 = (C71893s) rVar.instance;
                sVar4.f191475a |= 4;
                sVar4.f191478d = a;
            }
            C71893s sVar5 = (C71893s) rVar.build();
            C71881g l = mo45642l(6, kVar);
            l.copyOnWrite();
            C71894t tVar = (C71894t) l.instance;
            C71894t tVar2 = C71894t.f191480m;
            sVar5.getClass();
            tVar.f191491j = sVar5;
            tVar.f191482a |= 512;
            mo45641k((C71894t) l.build());
            return;
        }
        throw null;
    }

    /* renamed from: k */
    public final void mo45641k(C71894t tVar) {
        this.f111702e.mo44910a(tVar, this.f111701d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final C71881g mo45642l(int i, C42576k kVar) {
        C71881g gVar = (C71881g) C71894t.f191480m.createBuilder();
        C71935f fVar = (C71935f) C71936g.f191596f.createBuilder();
        Integer num = kVar.f111738e;
        if (num != null) {
            int intValue = num.intValue();
            fVar.copyOnWrite();
            C71936g gVar2 = (C71936g) fVar.instance;
            gVar2.f191598a |= 16;
            gVar2.f191602e = intValue;
        }
        Long l = kVar.f111735b;
        if (l != null) {
            long longValue = l.longValue();
            fVar.copyOnWrite();
            C71936g gVar3 = (C71936g) fVar.instance;
            gVar3.f191598a |= 1;
            gVar3.f191599b = longValue;
        }
        Long l2 = kVar.f111736c;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            fVar.copyOnWrite();
            C71936g gVar4 = (C71936g) fVar.instance;
            gVar4.f191598a |= 2;
            gVar4.f191600c = longValue2;
        }
        Long l3 = kVar.f111737d;
        if (l3 != null) {
            long longValue3 = l3.longValue();
            fVar.copyOnWrite();
            C71936g gVar5 = (C71936g) fVar.instance;
            gVar5.f191598a |= 4;
            gVar5.f191601d = longValue3;
        }
        C71943n nVar = (C71943n) C71944o.f191610j.createBuilder();
        String c = this.f111699b.f111752d.mo44953c();
        nVar.copyOnWrite();
        C71944o oVar = (C71944o) nVar.instance;
        c.getClass();
        oVar.f191612a |= 8;
        oVar.f191616e = c;
        int i2 = this.f111699b.f111751c.f110821b;
        nVar.copyOnWrite();
        C71944o oVar2 = (C71944o) nVar.instance;
        int i3 = i2 - 1;
        if (i2 != 0) {
            oVar2.f191613b = i3;
            oVar2.f191612a |= 1;
            String b = this.f111699b.f111752d.mo44952b();
            nVar.copyOnWrite();
            C71944o oVar3 = (C71944o) nVar.instance;
            b.getClass();
            oVar3.f191612a |= 4;
            oVar3.f191615d = b;
            nVar.copyOnWrite();
            C71944o oVar4 = (C71944o) nVar.instance;
            oVar4.f191612a |= 16;
            oVar4.f191617f = 475194430;
            C57867d dVar = (C57867d) C57868e.f154587c.createBuilder();
            int i4 = this.f111699b.f111750b.f110715Q;
            dVar.copyOnWrite();
            C57868e eVar = (C57868e) dVar.instance;
            eVar.f154590b = i4 - 1;
            eVar.f154589a |= 2;
            nVar.copyOnWrite();
            C71944o oVar5 = (C71944o) nVar.instance;
            C57868e eVar2 = (C57868e) dVar.build();
            eVar2.getClass();
            oVar5.f191614c = eVar2;
            oVar5.f191612a |= 2;
            nVar.mo63128a(Arrays.asList(this.f111699b.f111750b.f110705G.mo45142a()));
            if (this.f111699b.f111753e.f110811e.mo56113h()) {
                nVar.copyOnWrite();
                C71944o oVar6 = (C71944o) nVar.instance;
                oVar6.f191620i = ((C41937l) this.f111699b.f111753e.f110811e.mo56107c()).f109467ap;
                oVar6.f191612a |= 128;
            }
            gVar.copyOnWrite();
            C71894t tVar = (C71894t) gVar.instance;
            C71936g gVar6 = (C71936g) fVar.build();
            gVar6.getClass();
            tVar.f191484c = gVar6;
            tVar.f191482a |= 2;
            gVar.copyOnWrite();
            C71894t tVar2 = (C71894t) gVar.instance;
            C71944o oVar7 = (C71944o) nVar.build();
            oVar7.getClass();
            tVar2.f191483b = oVar7;
            tVar2.f191482a |= 1;
            gVar.copyOnWrite();
            C71894t tVar3 = (C71894t) gVar.instance;
            tVar3.f191485d = i - 1;
            tVar3.f191482a |= 4;
            C71882h hVar = (C71882h) C71883i.f191446c.createBuilder();
            int intValue2 = ((Integer) this.f111700c.mo6453a()).intValue();
            hVar.copyOnWrite();
            C71883i iVar = (C71883i) hVar.instance;
            iVar.f191448a |= 1;
            iVar.f191449b = intValue2;
            C71883i iVar2 = (C71883i) hVar.build();
            gVar.copyOnWrite();
            C71894t tVar4 = (C71894t) gVar.instance;
            iVar2.getClass();
            tVar4.f191486e = iVar2;
            tVar4.f191482a |= 8;
            return gVar;
        }
        throw null;
    }
}
