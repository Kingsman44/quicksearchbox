package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13545u;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13546v;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p5535j.p5536a.p5543b.p5544a.C70937a;
import p5535j.p5536a.p5543b.p5544a.C70939c;
import p5535j.p5536a.p5543b.p5544a.C70941e;
import p5535j.p5536a.p5543b.p5544a.C70942f;
import p5535j.p5536a.p5543b.p5544a.C70943g;
import p5535j.p5536a.p5543b.p5544a.C70945i;
import p5535j.p5536a.p5543b.p5544a.C70949m;
import p5535j.p5536a.p5543b.p5544a.C70951o;
import p5535j.p5536a.p5543b.p5544a.C70952p;
import p5535j.p5536a.p5543b.p5544a.C70953q;
import p5535j.p5536a.p5543b.p5544a.C70954r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.e */
/* compiled from: PG */
public final class C13519e {
    /* renamed from: a */
    public static C37252a m29803a(int i, C13546v vVar) {
        C37258g gVar = C37179a.f97532by;
        C62722b bVar = C62722b.UNKNOWN;
        int b = C13545u.m29827b(vVar.f41511b);
        if (b == 0) {
            b = 1;
        }
        switch (b - 2) {
            case 1:
                bVar = C62722b.OK;
                break;
            case 2:
            case 3:
            case 4:
                bVar = C62722b.INVALID_ARGUMENT;
                break;
            case 5:
            case 6:
                bVar = C62722b.FAILED_PRECONDITION;
                break;
        }
        C37252a i2 = gVar.mo40815i(bVar);
        C62940bt btVar = C70954r.f189185d;
        C70953q qVar = (C70953q) C70954r.f189184c.createBuilder();
        C70943g gVar2 = (C70943g) C70945i.f189164d.createBuilder();
        gVar2.copyOnWrite();
        C70945i iVar = (C70945i) gVar2.instance;
        iVar.f189167b = i - 1;
        iVar.f189166a |= 1;
        C70949m mVar = (C70949m) C70952p.f189179d.createBuilder();
        int a = C70951o.m103849a(vVar.f41511b);
        mVar.copyOnWrite();
        C70952p pVar = (C70952p) mVar.instance;
        int i3 = a - 1;
        if (a != 0) {
            pVar.f189182b = i3;
            pVar.f189181a |= 1;
            C62971cq cqVar = vVar.f41512c;
            int i4 = 0;
            while (i4 < cqVar.size()) {
                C13530f fVar = (C13530f) cqVar.get(i4);
                C70937a aVar = (C70937a) C70942f.f189155g.createBuilder();
                int a2 = C70941e.m103848a(fVar.f41478c);
                aVar.copyOnWrite();
                C70942f fVar2 = (C70942f) aVar.instance;
                int i5 = a2 - 1;
                if (a2 != 0) {
                    fVar2.f189158b = i5;
                    fVar2.f189157a |= 1;
                    int a3 = C70939c.m103847a(fVar.f41479d);
                    aVar.copyOnWrite();
                    C70942f fVar3 = (C70942f) aVar.instance;
                    int i6 = a3 - 1;
                    if (a3 != 0) {
                        fVar3.f189159c = i6;
                        fVar3.f189157a = 2 | fVar3.f189157a;
                        float f = fVar.f41481f;
                        aVar.copyOnWrite();
                        C70942f fVar4 = (C70942f) aVar.instance;
                        fVar4.f189157a |= 4;
                        fVar4.f189160d = f;
                        aVar.copyOnWrite();
                        C70942f fVar5 = (C70942f) aVar.instance;
                        fVar5.f189157a |= 8;
                        fVar5.f189161e = i4;
                        int length = fVar.f41480e.length();
                        aVar.copyOnWrite();
                        C70942f fVar6 = (C70942f) aVar.instance;
                        fVar6.f189157a |= 16;
                        fVar6.f189162f = length;
                        C70942f fVar7 = (C70942f) aVar.build();
                        mVar.copyOnWrite();
                        C70952p pVar2 = (C70952p) mVar.instance;
                        fVar7.getClass();
                        C62971cq cqVar2 = pVar2.f189183c;
                        if (!cqVar2.mo58948c()) {
                            pVar2.f189183c = C62942bv.mutableCopy(cqVar2);
                        }
                        pVar2.f189183c.add(fVar7);
                        i4++;
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            C70952p pVar3 = (C70952p) mVar.build();
            gVar2.copyOnWrite();
            C70945i iVar2 = (C70945i) gVar2.instance;
            pVar3.getClass();
            iVar2.f189168c = pVar3;
            iVar2.f189166a |= 2;
            qVar.copyOnWrite();
            C70954r rVar = (C70954r) qVar.instance;
            C70945i iVar3 = (C70945i) gVar2.build();
            iVar3.getClass();
            rVar.f189188b = iVar3;
            rVar.f189187a = 2;
            ((C37253b) i2).mo40792p(btVar, (C70954r) qVar.build());
            return i2;
        }
        throw null;
    }
}
