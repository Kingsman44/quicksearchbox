package com.google.android.libraries.social.populous.p3296e.p3299c;

import com.google.android.libraries.social.populous.core.C42299by;
import com.google.android.libraries.social.populous.core.C42313cl;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.core.Photo;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42404aa;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42418ao;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42440s;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42442u;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.p4181bi.C55782a;
import com.google.p4181bi.C55809as;
import com.google.p4181bi.C55810at;
import com.google.p4181bi.C55814ax;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55816az;
import com.google.p4181bi.C55817b;
import com.google.p4181bi.C55828ba;
import com.google.p4181bi.C55829bb;
import com.google.p4181bi.C55832be;
import com.google.p4181bi.C55845g;
import com.google.p4181bi.C55847i;
import com.google.p4181bi.C55854p;
import com.google.p4181bi.C55856r;
import com.google.p4181bi.C55857s;
import com.google.p4181bi.C55858t;
import com.google.p4181bi.C55859u;
import com.google.p4181bi.C55864z;

/* renamed from: com.google.android.libraries.social.populous.e.c.ah */
/* compiled from: PG */
public abstract class C42457ah {
    /* renamed from: a */
    public abstract long mo45500a();

    /* renamed from: b */
    public abstract Photo mo45501b();

    /* renamed from: c */
    public abstract C42418ao mo45502c();

    /* renamed from: d */
    public abstract C58485gu mo45503d();

    /* renamed from: e */
    public abstract C58485gu mo45504e();

    /* renamed from: f */
    public abstract String mo45505f();

    /* renamed from: g */
    public final C42405ab mo45506g(String str, C58833ax axVar) {
        C55815ay ayVar;
        C55814ax axVar2 = (C55814ax) C55815ay.f147275f.createBuilder();
        C58485gu e = mo45504e();
        int size = e.size();
        int i = 0;
        int i2 = 0;
        boolean z = true;
        while (i2 < size) {
            C42442u uVar = (C42442u) e.get(i2);
            C55854p pVar = (C55854p) C55856r.f147380k.createBuilder();
            C55857s sVar = (C55857s) C55858t.f147392f.createBuilder();
            sVar.copyOnWrite();
            C55858t tVar = (C55858t) sVar.instance;
            tVar.f147394a |= 8;
            tVar.f147398e = z;
            if (mo45501b() != null) {
                C55829bb bbVar = (C55829bb) C55832be.f147328e.createBuilder();
                String d = mo45501b().mo45048d();
                bbVar.copyOnWrite();
                C55832be beVar = (C55832be) bbVar.instance;
                d.getClass();
                beVar.f147330a |= 1;
                beVar.f147331b = d;
                bbVar.copyOnWrite();
                C55832be beVar2 = (C55832be) bbVar.instance;
                beVar2.f147332c = 3;
                beVar2.f147330a |= 2;
                sVar.copyOnWrite();
                C55858t tVar2 = (C55858t) sVar.instance;
                C55832be beVar3 = (C55832be) bbVar.build();
                beVar3.getClass();
                tVar2.f147395b = beVar3;
                tVar2.f147394a |= 1;
            }
            if (!mo45503d().isEmpty()) {
                C42440s sVar2 = (C42440s) mo45503d().get(i);
                C55809as asVar = (C55809as) C55810at.f147265f.createBuilder();
                String e2 = sVar2.mo45450e();
                asVar.copyOnWrite();
                C55810at atVar = (C55810at) asVar.instance;
                e2.getClass();
                atVar.f147267a |= 1;
                atVar.f147268b = e2;
                if (sVar2.mo45448c() != null) {
                    String c = sVar2.mo45448c();
                    asVar.copyOnWrite();
                    C55810at atVar2 = (C55810at) asVar.instance;
                    c.getClass();
                    atVar2.f147267a |= 2;
                    atVar2.f147269c = c;
                }
                if (sVar2.mo45447a() != null) {
                    String a = sVar2.mo45447a();
                    asVar.copyOnWrite();
                    C55810at atVar3 = (C55810at) asVar.instance;
                    a.getClass();
                    atVar3.f147267a |= 4;
                    atVar3.f147270d = a;
                }
                sVar.copyOnWrite();
                C55858t tVar3 = (C55858t) sVar.instance;
                C55810at atVar4 = (C55810at) asVar.build();
                atVar4.getClass();
                tVar3.f147396c = atVar4;
                tVar3.f147394a |= 2;
            }
            if (axVar.mo56113h()) {
                double c2 = ((C42495v) axVar.mo56107c()).mo45515c(mo45502c());
                C55782a aVar = (C55782a) C55817b.f147283d.createBuilder();
                aVar.copyOnWrite();
                C55817b bVar = (C55817b) aVar.instance;
                bVar.f147285a |= 2;
                bVar.f147287c = c2;
                sVar.copyOnWrite();
                C55858t tVar4 = (C55858t) sVar.instance;
                C55817b bVar2 = (C55817b) aVar.build();
                bVar2.getClass();
                tVar4.f147397d = bVar2;
                tVar4.f147394a |= 4;
            }
            C55858t tVar5 = (C55858t) sVar.build();
            pVar.copyOnWrite();
            C55856r rVar = (C55856r) pVar.instance;
            tVar5.getClass();
            rVar.f147385d = tVar5;
            rVar.f147382a |= 1;
            if (uVar.mo45464b() == C42299by.EMAIL) {
                C55859u uVar2 = (C55859u) C55864z.f147406f.createBuilder();
                String h = uVar.mo45471h();
                uVar2.copyOnWrite();
                C55864z zVar = (C55864z) uVar2.instance;
                h.getClass();
                zVar.f147408a |= 1;
                zVar.f147409b = h;
                pVar.copyOnWrite();
                C55856r rVar2 = (C55856r) pVar.instance;
                C55864z zVar2 = (C55864z) uVar2.build();
                zVar2.getClass();
                rVar2.f147384c = zVar2;
                rVar2.f147383b = 2;
                if (uVar.mo45471h().equals(str)) {
                    pVar.copyOnWrite();
                    C55856r rVar3 = (C55856r) pVar.instance;
                    rVar3.f147382a |= 16;
                    rVar3.f147387f = true;
                }
            } else {
                String str2 = str;
                if (uVar.mo45464b() == C42299by.PHONE_NUMBER) {
                    C55816az azVar = (C55816az) C55828ba.f147322d.createBuilder();
                    String h2 = uVar.mo45471h();
                    azVar.copyOnWrite();
                    C55828ba baVar = (C55828ba) azVar.instance;
                    h2.getClass();
                    baVar.f147324a |= 1;
                    baVar.f147325b = h2;
                    if (!uVar.mo45469f().isEmpty()) {
                        String f = uVar.mo45469f();
                        azVar.copyOnWrite();
                        C55828ba baVar2 = (C55828ba) azVar.instance;
                        f.getClass();
                        baVar2.f147324a = 2 | baVar2.f147324a;
                        baVar2.f147326c = f;
                    }
                    pVar.copyOnWrite();
                    C55856r rVar4 = (C55856r) pVar.instance;
                    C55828ba baVar3 = (C55828ba) azVar.build();
                    baVar3.getClass();
                    rVar4.f147384c = baVar3;
                    rVar4.f147383b = 3;
                } else {
                    i2++;
                    i = 0;
                }
            }
            pVar.copyOnWrite();
            C55856r rVar5 = (C55856r) pVar.instance;
            rVar5.f147382a |= 64;
            rVar5.f147389h = true;
            axVar2.mo54278a(pVar);
            z = false;
            i2++;
            i = 0;
        }
        if (axVar.mo56113h()) {
            double c3 = ((C42495v) axVar.mo56107c()).mo45515c(mo45502c());
            C55782a aVar2 = (C55782a) C55817b.f147283d.createBuilder();
            aVar2.copyOnWrite();
            C55817b bVar3 = (C55817b) aVar2.instance;
            bVar3.f147285a |= 2;
            bVar3.f147287c = c3;
            axVar2.copyOnWrite();
            C55815ay ayVar2 = (C55815ay) axVar2.instance;
            C55817b bVar4 = (C55817b) aVar2.build();
            bVar4.getClass();
            ayVar2.f147278b = bVar4;
            ayVar2.f147277a |= 1;
        }
        C55845g gVar = (C55845g) C55847i.f147358c.createBuilder();
        gVar.copyOnWrite();
        C55847i iVar = (C55847i) gVar.instance;
        C55815ay ayVar3 = (C55815ay) axVar2.build();
        ayVar3.getClass();
        iVar.f147361b = ayVar3;
        iVar.f147360a = 1;
        C55847i iVar2 = (C55847i) gVar.build();
        C42404aa aaVar = new C42404aa();
        aaVar.mo45397d(iVar2);
        aaVar.f111220c.add(C42331dc.DEVICE);
        if (iVar2.f147360a == 1) {
            ayVar = (C55815ay) iVar2.f147361b;
        } else {
            ayVar = C55815ay.f147275f;
        }
        aaVar.f111224g.put(ayVar, (C42313cl) new C42455af(this).apply(aaVar.mo45395b(ayVar)));
        return aaVar.mo45394a();
    }
}
