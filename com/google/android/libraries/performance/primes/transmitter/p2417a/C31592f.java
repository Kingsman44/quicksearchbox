package com.google.android.libraries.performance.primes.transmitter.p2417a;

import android.text.TextUtils;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4552o.p4566l.C60111ac;
import com.google.common.p4552o.p4566l.C60114af;
import com.google.common.p4552o.p4566l.C60115ag;
import com.google.common.p4552o.p4566l.C60120al;
import com.google.p5271x.p5272a.p5273a.C67963a;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63000ds;
import java.util.Collections;
import java.util.List;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71232bo;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71235br;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71236bs;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71237bt;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71249ce;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71251cg;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71252ch;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71255ck;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71276de;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71278dg;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71287dp;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71288dq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71291dt;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71292du;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71315j;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71318m;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71319n;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71320o;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.a.f */
/* compiled from: PG */
public final class C31592f {

    /* renamed from: a */
    static final C31591e f85029a = new C31588b();

    /* renamed from: b */
    static final C31591e f85030b = new C31589c();

    /* renamed from: c */
    static final C31591e f85031c = new C31590d();

    /* renamed from: d */
    private static final C58869cf f85032d = C58869cf.m90936b(new C58903m('/')).mo56151a();

    /* renamed from: a */
    public static C71308ej m58916a(C71308ej ejVar) {
        C71307ei eiVar = (C71307ei) ejVar.toBuilder();
        m58917b(f85029a, eiVar);
        C71320o oVar = ((C71308ej) eiVar.instance).f190425j;
        if (oVar == null) {
            oVar = C71320o.f190478c;
        }
        if ((oVar.f190480a & 1) != 0) {
            C71320o oVar2 = ((C71308ej) eiVar.instance).f190425j;
            if (oVar2 == null) {
                oVar2 = C71320o.f190478c;
            }
            C71318m mVar = oVar2.f190481b;
            if (mVar == null) {
                mVar = C71318m.f190465k;
            }
            C71315j jVar = (C71315j) mVar.toBuilder();
            m58917b(f85030b, jVar);
            C71320o oVar3 = ((C71308ej) eiVar.instance).f190425j;
            if (oVar3 == null) {
                oVar3 = C71320o.f190478c;
            }
            C71319n nVar = (C71319n) oVar3.toBuilder();
            nVar.copyOnWrite();
            C71320o oVar4 = (C71320o) nVar.instance;
            C71318m mVar2 = (C71318m) jVar.build();
            mVar2.getClass();
            oVar4.f190481b = mVar2;
            oVar4.f190480a |= 1;
            eiVar.copyOnWrite();
            C71308ej ejVar2 = (C71308ej) eiVar.instance;
            C71320o oVar5 = (C71320o) nVar.build();
            oVar5.getClass();
            ejVar2.f190425j = oVar5;
            ejVar2.f190416a |= 256;
        }
        C71278dg dgVar = ((C71308ej) eiVar.instance).f190423h;
        if (dgVar == null) {
            dgVar = C71278dg.f190307j;
        }
        if ((dgVar.f190309a & 256) != 0) {
            C71278dg dgVar2 = ((C71308ej) eiVar.instance).f190423h;
            if (dgVar2 == null) {
                dgVar2 = C71278dg.f190307j;
            }
            C60120al alVar = dgVar2.f190316h;
            if (alVar == null) {
                alVar = C60120al.f162592f;
            }
            C60115ag agVar = (C60115ag) alVar.toBuilder();
            C60114af afVar = ((C60120al) agVar.instance).f162597d;
            if (afVar == null) {
                afVar = C60114af.f162573f;
            }
            C60111ac acVar = (C60111ac) afVar.toBuilder();
            String str = ((C60114af) acVar.instance).f162577c;
            if (!str.isEmpty()) {
                long longValue = C67963a.m98221a(str).longValue();
                acVar.copyOnWrite();
                C60114af afVar2 = (C60114af) acVar.instance;
                afVar2.f162575a |= 4;
                afVar2.f162578d = longValue;
                acVar.copyOnWrite();
                C60114af afVar3 = (C60114af) acVar.instance;
                afVar3.f162575a &= -3;
                afVar3.f162577c = C60114af.f162573f.f162577c;
            }
            C60114af afVar4 = (C60114af) acVar.build();
            agVar.copyOnWrite();
            C60120al alVar2 = (C60120al) agVar.instance;
            afVar4.getClass();
            alVar2.f162597d = afVar4;
            alVar2.f162594a |= 1;
            List<C60114af> unmodifiableList = Collections.unmodifiableList(alVar2.f162598e);
            agVar.copyOnWrite();
            ((C60120al) agVar.instance).f162598e = C60120al.emptyProtobufList();
            for (C60114af builder : unmodifiableList) {
                C60111ac acVar2 = (C60111ac) builder.toBuilder();
                String str2 = ((C60114af) acVar2.instance).f162577c;
                if (!str2.isEmpty()) {
                    long longValue2 = C67963a.m98221a(str2).longValue();
                    acVar2.copyOnWrite();
                    C60114af afVar5 = (C60114af) acVar2.instance;
                    afVar5.f162575a |= 4;
                    afVar5.f162578d = longValue2;
                    acVar2.copyOnWrite();
                    C60114af afVar6 = (C60114af) acVar2.instance;
                    afVar6.f162575a &= -3;
                    afVar6.f162577c = C60114af.f162573f.f162577c;
                }
                C60114af afVar7 = (C60114af) acVar2.build();
                agVar.copyOnWrite();
                C60120al alVar3 = (C60120al) agVar.instance;
                afVar7.getClass();
                alVar3.mo57069a();
                alVar3.f162598e.add(afVar7);
            }
            C71278dg dgVar3 = ((C71308ej) eiVar.instance).f190423h;
            if (dgVar3 == null) {
                dgVar3 = C71278dg.f190307j;
            }
            C71276de deVar = (C71276de) dgVar3.toBuilder();
            C60120al alVar4 = (C60120al) agVar.build();
            deVar.copyOnWrite();
            C71278dg dgVar4 = (C71278dg) deVar.instance;
            alVar4.getClass();
            dgVar4.f190316h = alVar4;
            dgVar4.f190309a |= 256;
            C71278dg dgVar5 = (C71278dg) deVar.build();
            eiVar.copyOnWrite();
            C71308ej ejVar3 = (C71308ej) eiVar.instance;
            dgVar5.getClass();
            ejVar3.f190423h = dgVar5;
            ejVar3.f190416a |= 64;
        }
        C71292du duVar = ((C71308ej) eiVar.instance).f190424i;
        if (duVar == null) {
            duVar = C71292du.f190364k;
        }
        if (duVar.f190375j.size() != 0) {
            C71292du duVar2 = ((C71308ej) eiVar.instance).f190424i;
            if (duVar2 == null) {
                duVar2 = C71292du.f190364k;
            }
            C71287dp dpVar = (C71287dp) duVar2.toBuilder();
            for (int i = 0; i < ((C71292du) dpVar.instance).f190375j.size(); i++) {
                C71288dq dqVar = (C71288dq) ((C71291dt) ((C71292du) dpVar.instance).f190375j.get(i)).toBuilder();
                if (!((C71291dt) dqVar.instance).f190360b.isEmpty()) {
                    dqVar.copyOnWrite();
                    ((C71291dt) dqVar.instance).f190361c = C71291dt.emptyLongList();
                    List c = m58918c(((C71291dt) dqVar.instance).f190360b);
                    dqVar.copyOnWrite();
                    C71291dt dtVar = (C71291dt) dqVar.instance;
                    C62964ck ckVar = dtVar.f190361c;
                    if (!ckVar.mo58948c()) {
                        dtVar.f190361c = C62942bv.mutableCopy(ckVar);
                    }
                    C62947c.addAll((Iterable) c, (List) dtVar.f190361c);
                }
                dqVar.copyOnWrite();
                C71291dt dtVar2 = (C71291dt) dqVar.instance;
                dtVar2.f190359a &= -2;
                dtVar2.f190360b = C71291dt.f190357f.f190360b;
                dpVar.copyOnWrite();
                C71292du duVar3 = (C71292du) dpVar.instance;
                C71291dt dtVar3 = (C71291dt) dqVar.build();
                dtVar3.getClass();
                duVar3.mo62663a();
                duVar3.f190375j.set(i, dtVar3);
            }
            eiVar.copyOnWrite();
            C71308ej ejVar4 = (C71308ej) eiVar.instance;
            C71292du duVar4 = (C71292du) dpVar.build();
            duVar4.getClass();
            ejVar4.f190424i = duVar4;
            ejVar4.f190416a |= 128;
        }
        C71237bt btVar = ((C71308ej) eiVar.instance).f190422g;
        if (btVar == null) {
            btVar = C71237bt.f190195b;
        }
        if (btVar.f190197a.size() != 0) {
            C71237bt btVar2 = ((C71308ej) eiVar.instance).f190422g;
            if (btVar2 == null) {
                btVar2 = C71237bt.f190195b;
            }
            C71236bs bsVar = (C71236bs) btVar2.toBuilder();
            for (int i2 = 0; i2 < ((C71237bt) bsVar.instance).f190197a.size(); i2++) {
                C71232bo boVar = (C71232bo) ((C71235br) ((C71237bt) bsVar.instance).f190197a.get(i2)).toBuilder();
                if (!((C71235br) boVar.instance).f190189t.isEmpty()) {
                    boVar.copyOnWrite();
                    ((C71235br) boVar.instance).f190190u = C71235br.emptyLongList();
                    List c2 = m58918c(((C71235br) boVar.instance).f190189t);
                    boVar.copyOnWrite();
                    C71235br brVar = (C71235br) boVar.instance;
                    C62964ck ckVar2 = brVar.f190190u;
                    if (!ckVar2.mo58948c()) {
                        brVar.f190190u = C62942bv.mutableCopy(ckVar2);
                    }
                    C62947c.addAll((Iterable) c2, (List) brVar.f190190u);
                }
                boVar.copyOnWrite();
                C71235br brVar2 = (C71235br) boVar.instance;
                brVar2.f190170a &= -524289;
                brVar2.f190189t = C71235br.f190169y.f190189t;
                bsVar.copyOnWrite();
                C71237bt btVar3 = (C71237bt) bsVar.instance;
                C71235br brVar3 = (C71235br) boVar.build();
                brVar3.getClass();
                btVar3.mo62660a();
                btVar3.f190197a.set(i2, brVar3);
            }
            eiVar.copyOnWrite();
            C71308ej ejVar5 = (C71308ej) eiVar.instance;
            C71237bt btVar4 = (C71237bt) bsVar.build();
            btVar4.getClass();
            ejVar5.f190422g = btVar4;
            ejVar5.f190416a |= 32;
        }
        C71251cg cgVar = ((C71308ej) eiVar.instance).f190427l;
        if (cgVar == null) {
            cgVar = C71251cg.f190215k;
        }
        if (cgVar.f190220d.size() != 0) {
            C71251cg cgVar2 = ((C71308ej) eiVar.instance).f190427l;
            if (cgVar2 == null) {
                cgVar2 = C71251cg.f190215k;
            }
            C71249ce ceVar = (C71249ce) cgVar2.toBuilder();
            for (int i3 = 0; i3 < ((C71251cg) ceVar.instance).f190220d.size(); i3++) {
                C71252ch chVar = (C71252ch) ((C71255ck) ((C71251cg) ceVar.instance).f190220d.get(i3)).toBuilder();
                m58917b(f85031c, chVar);
                ceVar.copyOnWrite();
                C71251cg cgVar3 = (C71251cg) ceVar.instance;
                C71255ck ckVar3 = (C71255ck) chVar.build();
                ckVar3.getClass();
                cgVar3.mo62661a();
                cgVar3.f190220d.set(i3, ckVar3);
            }
            eiVar.copyOnWrite();
            C71308ej ejVar6 = (C71308ej) eiVar.instance;
            C71251cg cgVar4 = (C71251cg) ceVar.build();
            cgVar4.getClass();
            ejVar6.f190427l = cgVar4;
            ejVar6.f190416a |= 4096;
        }
        return (C71308ej) eiVar.build();
    }

    /* renamed from: b */
    static void m58917b(C31591e eVar, C63000ds dsVar) {
        String a = eVar.mo37268a(dsVar);
        String b = eVar.mo37269b(dsVar);
        if (!TextUtils.isEmpty(a) || TextUtils.isEmpty(b)) {
            eVar.mo37270c(dsVar, (Long) null);
        } else {
            eVar.mo37270c(dsVar, C67963a.m98221a(b));
        }
        eVar.mo37271d(dsVar);
    }

    /* renamed from: c */
    private static List m58918c(String str) {
        return C58597ky.m90217h(f85032d.mo56155i(str), C31587a.f85028a);
    }
}
