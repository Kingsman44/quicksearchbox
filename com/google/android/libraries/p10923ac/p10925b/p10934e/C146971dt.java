package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10945l.C147177k;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64014bx;
import com.google.protos.p4895aw.p4902b.C64057dm;
import com.google.protos.p4895aw.p4902b.C64076ee;
import com.google.protos.p4895aw.p4902b.C64079eh;
import com.google.protos.p4895aw.p4902b.C64080ei;
import com.google.protos.p4895aw.p4902b.C64081ej;
import com.google.protos.p4895aw.p4902b.C64082ek;
import com.google.protos.p4895aw.p4902b.C64087ep;
import com.google.protos.p4895aw.p4902b.C64091i;
import com.google.protos.p4895aw.p4902b.C64093k;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.dt */
/* compiled from: PG */
public final class C146971dt extends C68247h {

    /* renamed from: a */
    private final C68283d f396733a;

    /* renamed from: c */
    private final C68283d f396734c;

    /* renamed from: d */
    private final C68283d f396735d;

    /* renamed from: e */
    private final C68283d f396736e;

    /* renamed from: f */
    private final C68283d f396737f;

    /* renamed from: g */
    private final C68283d f396738g;

    /* renamed from: h */
    private final C68283d f396739h;

    /* renamed from: i */
    private final C68283d f396740i;

    /* renamed from: j */
    private final C68283d f396741j;

    /* renamed from: k */
    private final C68283d f396742k;

    public C146971dt(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9, C68283d dVar10) {
        super(aVar2, new C68277d(C146971dt.class), aVar);
        this.f396733a = C68236af.m98549d(dVar);
        this.f396734c = C68236af.m98549d(dVar2);
        this.f396735d = C68236af.m98549d(dVar3);
        this.f396736e = C68236af.m98549d(dVar4);
        this.f396737f = C68236af.m98549d(dVar5);
        this.f396738g = C68236af.m98549d(dVar6);
        this.f396739h = C68236af.m98549d(dVar7);
        this.f396740i = C68236af.m98549d(dVar8);
        this.f396741j = C68236af.m98549d(dVar9);
        this.f396742k = C68236af.m98549d(dVar10);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C64091i iVar;
        Long l;
        List list = (List) obj;
        C147266a aVar = (C147266a) list.get(0);
        C64014bx bxVar = (C64014bx) list.get(1);
        C64093k kVar = (C64093k) list.get(2);
        C64098p pVar = (C64098p) list.get(3);
        C64057dm dmVar = (C64057dm) list.get(4);
        Collection collection = (Collection) list.get(5);
        Collection collection2 = (Collection) list.get(6);
        Long l2 = (Long) list.get(7);
        C147177k kVar2 = (C147177k) list.get(8);
        C58881cr crVar = (C58881cr) list.get(9);
        if (collection.isEmpty()) {
            kVar2.mo124001e(0);
            kVar2.mo124002f(0, 0);
            C64082ek ekVar = (C64082ek) C64087ep.f173258e.createBuilder();
            ekVar.copyOnWrite();
            C64087ep epVar = (C64087ep) ekVar.instance;
            dmVar.getClass();
            epVar.f173261b = dmVar;
            epVar.f173260a = 1 | epVar.f173260a;
            return C60856cj.m92900i((C64087ep) ekVar.build());
        }
        C64076ee eeVar = (C64076ee) C64081ej.f173236h.createBuilder();
        eeVar.copyOnWrite();
        C64081ej ejVar = (C64081ej) eeVar.instance;
        pVar.getClass();
        ejVar.f173239b = pVar;
        ejVar.f173238a |= 1;
        eeVar.copyOnWrite();
        C64081ej ejVar2 = (C64081ej) eeVar.instance;
        dmVar.getClass();
        ejVar2.f173241d = dmVar;
        ejVar2.f173238a = 2 | ejVar2.f173238a;
        eeVar.mo59253a(collection);
        eeVar.mo59254b(collection2);
        if (C147266a.m240134e()) {
            Iterator it = kVar.f173282a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iVar = C64091i.f173270i;
                    break;
                }
                iVar = (C64091i) it.next();
                C64098p pVar2 = iVar.f173275d;
                if (pVar2 == null) {
                    pVar2 = C64098p.f173292c;
                }
                if (pVar.equals(pVar2)) {
                    break;
                }
            }
            if (!(!iVar.f173279h || (l = (Long) crVar.mo6453a()) == null || l.longValue() == 0)) {
                C64079eh ehVar = (C64079eh) C64080ei.f173232c.createBuilder();
                long longValue = l.longValue();
                ehVar.copyOnWrite();
                C64080ei eiVar = (C64080ei) ehVar.instance;
                eiVar.f173234a = 1;
                eiVar.f173235b = Long.valueOf(longValue);
                C64080ei eiVar2 = (C64080ei) ehVar.build();
                eeVar.copyOnWrite();
                C64081ej ejVar3 = (C64081ej) eeVar.instance;
                eiVar2.getClass();
                ejVar3.f173244g = eiVar2;
                ejVar3.f173238a |= 16;
            }
        }
        C64081ej ejVar4 = (C64081ej) eeVar.build();
        kVar2.mo124001e((long) ejVar4.f173240c.size());
        long serializedSize = (long) ejVar4.getSerializedSize();
        kVar2.mo124002f(serializedSize, serializedSize);
        return bxVar.mo59249c(ejVar4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396733a.mo60297gq(), this.f396734c.mo60297gq(), this.f396735d.mo60297gq(), this.f396736e.mo60297gq(), this.f396737f.mo60297gq(), this.f396738g.mo60297gq(), this.f396739h.mo60297gq(), this.f396740i.mo60297gq(), this.f396741j.mo60297gq(), this.f396742k.mo60297gq());
    }
}
