package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.android.libraries.p10923ac.p10925b.p10934e.C146853aw;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147078aw;
import com.google.android.libraries.p10923ac.p10925b.p10944k.C147148h;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147177k;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C63971ah;
import com.google.protos.p4895aw.p4902b.C63979ap;
import com.google.protos.p4895aw.p4902b.C63981ar;
import com.google.protos.p4895aw.p4902b.C64005bo;
import com.google.protos.p4895aw.p4902b.C64006bp;
import com.google.protos.p4895aw.p4902b.C64057dm;
import com.google.protos.p4895aw.p4902b.C64058dn;
import com.google.protos.p4895aw.p4902b.C64060dp;
import com.google.protos.p4895aw.p4902b.C64061dq;
import com.google.protos.p4895aw.p4902b.C64062dr;
import com.google.protos.p4895aw.p4902b.C64088f;
import com.google.protos.p4895aw.p4902b.C64089g;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.b.q */
/* compiled from: PG */
public final class C146888q extends C68247h {

    /* renamed from: a */
    private final C69464a f396500a;

    /* renamed from: c */
    private final C68283d f396501c;

    /* renamed from: d */
    private final C68283d f396502d;

    /* renamed from: e */
    private final C68283d f396503e;

    /* renamed from: f */
    private final C68283d f396504f;

    /* renamed from: g */
    private final C68283d f396505g;

    /* renamed from: h */
    private final C68283d f396506h;

    /* renamed from: i */
    private final C68283d f396507i;

    /* renamed from: j */
    private final C68283d f396508j;

    public C146888q(C69464a aVar, C69464a aVar2, C69464a aVar3, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8) {
        super(aVar2, new C68277d(C146888q.class), aVar);
        this.f396500a = aVar3;
        this.f396501c = C68236af.m98549d(dVar);
        this.f396502d = C68236af.m98549d(dVar2);
        this.f396503e = C68236af.m98549d(dVar3);
        this.f396504f = C68236af.m98549d(dVar4);
        this.f396505g = C68236af.m98549d(dVar5);
        this.f396506h = C68236af.m98549d(dVar6);
        this.f396507i = C68236af.m98549d(dVar7);
        this.f396508j = C68236af.m98549d(dVar8);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Throwable th;
        C63979ap apVar;
        Long l;
        C63971ah ahVar;
        C63971ah ahVar2;
        C63981ar arVar;
        List list = (List) obj;
        C68214a a = C68219e.m98518a(this.f396500a);
        C64098p pVar = (C64098p) list.get(0);
        int i = 1;
        C64006bp bpVar = (C64006bp) list.get(1);
        C146853aw awVar = (C146853aw) list.get(2);
        Long l2 = (Long) list.get(3);
        Long l3 = (Long) list.get(4);
        Integer num = (Integer) list.get(5);
        C58485gu guVar = (C58485gu) list.get(6);
        C147177k kVar = (C147177k) list.get(7);
        int a2 = C64005bo.m96333a(bpVar.f173090c);
        if (a2 == 0 || a2 != 2) {
            throw new C147148h("Client doesn't support paging of server changes!");
        }
        C62971cq<C64089g> cqVar = bpVar.f173088a;
        C147078aw b = awVar.mo123767a().mo123904b();
        try {
            for (C64089g gVar : cqVar) {
                int i2 = gVar.f173269d;
                int a3 = C64088f.m96350a(i2);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i3 = a3 - 1;
                if (i3 == i) {
                    l = l2;
                    awVar.mo123775i();
                    kVar.mo123999c();
                } else if (i3 == 2) {
                    l = l2;
                    if (gVar.f173267b == 4) {
                        ahVar = (C63971ah) gVar.f173268c;
                    } else {
                        ahVar = C63971ah.f173003f;
                    }
                    C146881j.m239378a(ahVar);
                    long j = ahVar.f173006b;
                    ahVar.f173008d.mo59174N();
                    awVar.mo123770d();
                } else if (i3 == 3) {
                    l = l2;
                    if (gVar.f173267b == 4) {
                        ahVar2 = (C63971ah) gVar.f173268c;
                    } else {
                        ahVar2 = C63971ah.f173003f;
                    }
                    C146881j.m239378a(ahVar2);
                    long j2 = ahVar2.f173006b;
                    awVar.mo123768b();
                } else if (i3 != 5) {
                    int a4 = C64088f.m96350a(i2);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    throw new C147148h("Got unknown change type " + Integer.toString(a4 - 1) + " while syncing channel " + String.valueOf(pVar));
                } else {
                    if (gVar.f173267b == 7) {
                        arVar = (C63981ar) gVar.f173268c;
                    } else {
                        arVar = C63981ar.f173032e;
                    }
                    if ((arVar.f173034a & 1) != 0) {
                        C63088z.m96143E(arVar.f173035b).mo59174N();
                    }
                    int i4 = arVar.f173034a;
                    if ((i4 & 4) != 0) {
                        l = l2;
                        long j3 = arVar.f173037d;
                    } else {
                        l = l2;
                    }
                    if ((i4 & 2) != 0) {
                        long j4 = arVar.f173036c;
                    }
                    awVar.mo123769c();
                }
                l2 = l;
                i = 1;
            }
            Long l4 = l2;
            C64057dm dmVar = bpVar.f173089b;
            if (dmVar == null) {
                dmVar = C64057dm.f173196c;
            }
            awVar.mo123856k(b, dmVar);
            awVar.mo123863lf(b, num.intValue());
            awVar.mo123865lh(b, l3.longValue());
            awVar.mo123855j(b, bpVar.f173091d);
            C64058dn dnVar = (C64058dn) C64060dp.f173200c.createBuilder();
            C64061dq dqVar = (C64061dq) C64062dr.f173204b.createBuilder();
            dqVar.copyOnWrite();
            C64062dr drVar = (C64062dr) dqVar.instance;
            C62971cq cqVar2 = drVar.f173206a;
            if (!cqVar2.mo58948c()) {
                drVar.f173206a = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) guVar, (List) drVar.f173206a);
            dnVar.copyOnWrite();
            C64060dp dpVar = (C64060dp) dnVar.instance;
            C64062dr drVar2 = (C64062dr) dqVar.build();
            drVar2.getClass();
            dpVar.f173203b = drVar2;
            dpVar.f173202a = 3;
            awVar.mo123864lg(b, (C64060dp) dnVar.build());
            awVar.mo123866li(b, l4.longValue());
            b.mo123901j();
            if (b != null) {
                b.close();
            }
            if (pVar.f173294a == 2) {
                apVar = (C63979ap) pVar.f173295b;
            } else {
                apVar = C63979ap.f173026e;
            }
            ((C147256m) a.mo27525b()).mo124065h("Downloaded %d changes to the local %s/%s footprints storage.", Integer.valueOf(cqVar.size()), Integer.valueOf(apVar.f173029b), Integer.valueOf(apVar.f173030c));
            kVar.mo124001e((long) bpVar.f173088a.size());
            long serializedSize = (long) bpVar.getSerializedSize();
            kVar.mo124002f(serializedSize, serializedSize);
            return C60866ct.f164955a;
        } catch (Throwable th2) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396501c.mo60297gq(), this.f396502d.mo60297gq(), this.f396503e.mo60297gq(), this.f396504f.mo60297gq(), this.f396505g.mo60297gq(), this.f396506h.mo60297gq(), this.f396507i.mo60297gq(), this.f396508j.mo60297gq());
    }
}
