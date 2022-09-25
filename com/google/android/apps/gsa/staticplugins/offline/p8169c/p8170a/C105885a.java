package com.google.android.apps.gsa.staticplugins.offline.p8169c.p8170a;

import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C55028de;
import com.google.p4152bb.p4153a.C55029df;
import com.google.p4152bb.p4153a.C55030dg;
import com.google.p4152bb.p4153a.C55031dh;
import com.google.p4152bb.p4153a.C55032di;
import com.google.p4152bb.p4153a.C55035dl;
import com.google.p4152bb.p4153a.C55130gz;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55135hd;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55137hf;
import com.google.p4152bb.p4153a.C55138hg;
import com.google.p4152bb.p4153a.C55201jp;
import com.google.p4152bb.p4153a.C55202jq;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55214kb;
import com.google.p4152bb.p4153a.C55215kc;
import com.google.p4152bb.p4153a.C55220kh;
import com.google.p4152bb.p4153a.C55221ki;
import com.google.p4152bb.p4153a.C55222kj;
import com.google.p4152bb.p4153a.C55223kk;
import com.google.p4152bb.p4153a.C55224kl;
import com.google.p4152bb.p4153a.C55225km;
import com.google.p4152bb.p4153a.C55232kt;
import com.google.p4152bb.p4153a.C55233ku;
import com.google.p4152bb.p4153a.C55234kv;
import com.google.p4152bb.p4153a.C55235kw;
import com.google.p4152bb.p4153a.C55238kz;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55243ld;
import com.google.p4152bb.p4153a.C55244le;
import com.google.p4152bb.p4153a.C55246lg;
import com.google.p4152bb.p4153a.C55247lh;
import com.google.p4152bb.p4153a.C55248li;
import com.google.p4152bb.p4153a.C55249lj;
import com.google.p4152bb.p4153a.C55250lk;
import com.google.p4152bb.p4153a.C55251ll;
import com.google.p4152bb.p4153a.C55252lm;
import com.google.p4152bb.p4153a.C55253ln;
import com.google.p4152bb.p4153a.C55256lq;
import com.google.p4152bb.p4153a.C55257lr;
import com.google.p4152bb.p4153a.C55258ls;
import com.google.p4152bb.p4153a.C55259lt;
import com.google.p4152bb.p4153a.C55262lw;
import com.google.p4152bb.p4153a.C55263lx;
import com.google.p4152bb.p4153a.C55287mu;
import com.google.p4152bb.p4153a.C55289mw;
import com.google.p4152bb.p4153a.C55290mx;
import com.google.p4152bb.p4153a.C55294na;
import com.google.p4152bb.p4153a.C55295nb;
import com.google.p4152bb.p4153a.C55296nc;
import com.google.p4152bb.p4153a.C55297nd;
import com.google.p4152bb.p4153a.C55300ng;
import com.google.p4152bb.p4153a.C55301nh;
import com.google.p4152bb.p4153a.C55302ni;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55362po;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4242bp.p4267h.p4268a.C56373f;
import com.google.p4242bp.p4267h.p4268a.C56377j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.c.a.a */
/* compiled from: PG */
public final class C105885a {

    /* renamed from: a */
    private final C105886b f295524a;

    public C105885a(C105886b bVar) {
        this.f295524a = bVar;
    }

    /* renamed from: h */
    static void m176391h(C55243ld ldVar, C55244le leVar) {
        if (!(ldVar == null || leVar == null)) {
            for (int i = 0; i < ((C55244le) ldVar.instance).f145470c.size(); i++) {
                Iterator it = leVar.f145470c.iterator();
                if (it.hasNext()) {
                    C55238kz kzVar = (C55238kz) ldVar.mo54215a(i).toBuilder();
                    m176394k(kzVar, (C55240la) it.next());
                    ldVar.copyOnWrite();
                    C55244le leVar2 = (C55244le) ldVar.instance;
                    C55240la laVar = (C55240la) kzVar.build();
                    laVar.getClass();
                    leVar2.mo54217b();
                    leVar2.f145470c.set(i, laVar);
                }
            }
        }
        if (!(ldVar == null || leVar == null || leVar.f145469b.size() <= 0)) {
            ldVar.copyOnWrite();
            ((C55244le) ldVar.instance).f145469b = C55244le.emptyProtobufList();
            C62971cq cqVar = leVar.f145469b;
            ldVar.copyOnWrite();
            C55244le leVar3 = (C55244le) ldVar.instance;
            leVar3.mo54216a();
            C62947c.addAll((Iterable) cqVar, (List) leVar3.f145469b);
        }
        if (ldVar != null && leVar != null && leVar.f145472e.size() > 0) {
            ldVar.copyOnWrite();
            ((C55244le) ldVar.instance).f145472e = C55244le.emptyProtobufList();
            C62971cq cqVar2 = leVar.f145472e;
            ldVar.copyOnWrite();
            C55244le leVar4 = (C55244le) ldVar.instance;
            leVar4.mo54218c();
            C62947c.addAll((Iterable) cqVar2, (List) leVar4.f145472e);
        }
    }

    /* renamed from: n */
    static final boolean m176397n(C55223kk kkVar) {
        String str;
        if (kkVar == null) {
            return false;
        }
        C55224kl klVar = (C55224kl) kkVar.instance;
        if ((klVar.f145396a & 2) == 0 || (str = klVar.f145398c) == null) {
            return true;
        }
        kkVar.copyOnWrite();
        C55224kl klVar2 = (C55224kl) kkVar.instance;
        klVar2.f145396a |= 2;
        klVar2.f145398c = str;
        return true;
    }

    /* renamed from: o */
    static final boolean m176398o(C55295nb nbVar) {
        String str;
        if (nbVar == null) {
            return false;
        }
        C55296nc ncVar = (C55296nc) nbVar.instance;
        if ((ncVar.f145665a & 4) == 0 || (str = ncVar.f145668d) == null) {
            return true;
        }
        nbVar.copyOnWrite();
        C55296nc ncVar2 = (C55296nc) nbVar.instance;
        ncVar2.f145665a |= 4;
        ncVar2.f145668d = str;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo95128a(C55201jp jpVar) {
        C55220kh khVar;
        C55300ng ngVar;
        if (jpVar == null) {
            return false;
        }
        int size = ((C55202jq) jpVar.instance).f145292b.size();
        if (size > 0) {
            C55214kb[] kbVarArr = new C55214kb[size];
            for (int i = 0; i < size; i++) {
                kbVarArr[i] = (C55214kb) ((C55215kc) ((C55202jq) jpVar.instance).f145292b.get(i)).toBuilder();
            }
            jpVar.copyOnWrite();
            ((C55202jq) jpVar.instance).f145292b = C55202jq.emptyProtobufList();
            for (int i2 = 0; i2 < size; i2++) {
                C55214kb kbVar = kbVarArr[i2];
                if (kbVar != null) {
                    C105886b bVar = this.f295524a;
                    if (!bVar.mo95140g((C55215kc) kbVar.build(), C56373f.f150336c) && (((List) kbVar.mo58881i(C56373f.f150337d)).isEmpty() || bVar.mo95140g((C55215kc) kbVar.build(), C56373f.f150337d))) {
                        kbVar.mo58884l(C56373f.f150336c);
                        kbVar.mo58884l(C56373f.f150337d);
                        if (kbVar.mo58882j(C56373f.f150335b)) {
                            Integer num = (Integer) bVar.f295525e.get(Integer.valueOf(((C54944ab) kbVar.mo58881i(C56373f.f150335b)).f144530R));
                            if (num != null) {
                                int intValue = num.intValue();
                                kbVar.copyOnWrite();
                                C55215kc kcVar = (C55215kc) kbVar.instance;
                                C55215kc kcVar2 = C55215kc.f145365c;
                                kcVar.f145367a |= 1;
                                kcVar.f145368b = intValue;
                                kbVar.mo58884l(C56373f.f150335b);
                            }
                        }
                        if (kbVar.mo58882j(C55301nh.f145684c) && (ngVar = (C55300ng) ((C55301nh) kbVar.mo58881i(C55301nh.f145684c)).toBuilder()) != null) {
                            int size2 = ((C55301nh) ngVar.instance).f145686a.size();
                            if (size2 > 0) {
                                C55362po[] poVarArr = new C55362po[size2];
                                for (int i3 = 0; i3 < size2; i3++) {
                                    poVarArr[i3] = (C55362po) ((C55365pr) ((C55301nh) ngVar.instance).f145686a.get(i3)).toBuilder();
                                }
                                ngVar.copyOnWrite();
                                ((C55301nh) ngVar.instance).f145686a = C55301nh.emptyProtobufList();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    if (mo95133f(poVarArr[i4])) {
                                        C55365pr prVar = (C55365pr) poVarArr[i4].build();
                                        ngVar.copyOnWrite();
                                        C55301nh nhVar = (C55301nh) ngVar.instance;
                                        prVar.getClass();
                                        C62971cq cqVar = nhVar.f145686a;
                                        if (!cqVar.mo58948c()) {
                                            nhVar.f145686a = C62942bv.mutableCopy(cqVar);
                                        }
                                        nhVar.f145686a.add(prVar);
                                    }
                                }
                            }
                            kbVar.mo58885m(C55301nh.f145684c, (C55301nh) ngVar.build());
                        }
                        if (kbVar.mo58882j(C55221ki.f145381l) && (khVar = (C55220kh) ((C55221ki) kbVar.mo58881i(C55221ki.f145381l)).toBuilder()) != null) {
                            int size3 = ((C55221ki) khVar.instance).f145383a.size();
                            if (size3 > 0) {
                                C55362po[] poVarArr2 = new C55362po[size3];
                                for (int i5 = 0; i5 < size3; i5++) {
                                    poVarArr2[i5] = (C55362po) ((C55365pr) ((C55221ki) khVar.instance).f145383a.get(i5)).toBuilder();
                                }
                                khVar.copyOnWrite();
                                ((C55221ki) khVar.instance).f145383a = C55221ki.emptyProtobufList();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    if (mo95133f(poVarArr2[i6])) {
                                        C55365pr prVar2 = (C55365pr) poVarArr2[i6].build();
                                        khVar.copyOnWrite();
                                        C55221ki kiVar = (C55221ki) khVar.instance;
                                        prVar2.getClass();
                                        C62971cq cqVar2 = kiVar.f145383a;
                                        if (!cqVar2.mo58948c()) {
                                            kiVar.f145383a = C62942bv.mutableCopy(cqVar2);
                                        }
                                        kiVar.f145383a.add(prVar2);
                                    }
                                }
                            }
                            int size4 = ((C55221ki) khVar.instance).f145384b.size();
                            if (size4 > 0) {
                                C55362po[] poVarArr3 = new C55362po[size4];
                                for (int i7 = 0; i7 < size4; i7++) {
                                    poVarArr3[i7] = (C55362po) ((C55365pr) ((C55221ki) khVar.instance).f145384b.get(i7)).toBuilder();
                                }
                                khVar.copyOnWrite();
                                ((C55221ki) khVar.instance).f145384b = C55221ki.emptyProtobufList();
                                for (int i8 = 0; i8 < size4; i8++) {
                                    if (mo95133f(poVarArr3[i8])) {
                                        C55365pr prVar3 = (C55365pr) poVarArr3[i8].build();
                                        khVar.copyOnWrite();
                                        C55221ki kiVar2 = (C55221ki) khVar.instance;
                                        prVar3.getClass();
                                        C62971cq cqVar3 = kiVar2.f145384b;
                                        if (!cqVar3.mo58948c()) {
                                            kiVar2.f145384b = C62942bv.mutableCopy(cqVar3);
                                        }
                                        kiVar2.f145384b.add(prVar3);
                                    }
                                }
                            }
                            int size5 = ((C55221ki) khVar.instance).f145385c.size();
                            if (size5 > 0) {
                                C55362po[] poVarArr4 = new C55362po[size5];
                                for (int i9 = 0; i9 < size5; i9++) {
                                    poVarArr4[i9] = (C55362po) ((C55365pr) ((C55221ki) khVar.instance).f145385c.get(i9)).toBuilder();
                                }
                                khVar.copyOnWrite();
                                ((C55221ki) khVar.instance).f145385c = C55221ki.emptyProtobufList();
                                for (int i10 = 0; i10 < size5; i10++) {
                                    if (mo95133f(poVarArr4[i10])) {
                                        C55365pr prVar4 = (C55365pr) poVarArr4[i10].build();
                                        khVar.copyOnWrite();
                                        C55221ki kiVar3 = (C55221ki) khVar.instance;
                                        prVar4.getClass();
                                        C62971cq cqVar4 = kiVar3.f145385c;
                                        if (!cqVar4.mo58948c()) {
                                            kiVar3.f145385c = C62942bv.mutableCopy(cqVar4);
                                        }
                                        kiVar3.f145385c.add(prVar4);
                                    }
                                }
                            }
                            int size6 = ((C55221ki) khVar.instance).f145386d.size();
                            if (size6 > 0) {
                                C55362po[] poVarArr5 = new C55362po[size6];
                                for (int i11 = 0; i11 < size6; i11++) {
                                    poVarArr5[i11] = (C55362po) ((C55365pr) ((C55221ki) khVar.instance).f145386d.get(i11)).toBuilder();
                                }
                                khVar.copyOnWrite();
                                ((C55221ki) khVar.instance).f145386d = C55221ki.emptyProtobufList();
                                for (int i12 = 0; i12 < size6; i12++) {
                                    if (mo95133f(poVarArr5[i12])) {
                                        C55365pr prVar5 = (C55365pr) poVarArr5[i12].build();
                                        khVar.copyOnWrite();
                                        C55221ki kiVar4 = (C55221ki) khVar.instance;
                                        prVar5.getClass();
                                        C62971cq cqVar5 = kiVar4.f145386d;
                                        if (!cqVar5.mo58948c()) {
                                            kiVar4.f145386d = C62942bv.mutableCopy(cqVar5);
                                        }
                                        kiVar4.f145386d.add(prVar5);
                                    }
                                }
                            }
                            int size7 = ((C55221ki) khVar.instance).f145387e.size();
                            if (size7 > 0) {
                                C55362po[] poVarArr6 = new C55362po[size7];
                                for (int i13 = 0; i13 < size7; i13++) {
                                    poVarArr6[i13] = (C55362po) ((C55365pr) ((C55221ki) khVar.instance).f145387e.get(i13)).toBuilder();
                                }
                                khVar.copyOnWrite();
                                ((C55221ki) khVar.instance).f145387e = C55221ki.emptyProtobufList();
                                for (int i14 = 0; i14 < size7; i14++) {
                                    if (mo95133f(poVarArr6[i14])) {
                                        C55365pr prVar6 = (C55365pr) poVarArr6[i14].build();
                                        khVar.copyOnWrite();
                                        C55221ki kiVar5 = (C55221ki) khVar.instance;
                                        prVar6.getClass();
                                        C62971cq cqVar6 = kiVar5.f145387e;
                                        if (!cqVar6.mo58948c()) {
                                            kiVar5.f145387e = C62942bv.mutableCopy(cqVar6);
                                        }
                                        kiVar5.f145387e.add(prVar6);
                                    }
                                }
                            }
                            int size8 = ((C55221ki) khVar.instance).f145388f.size();
                            if (size8 > 0) {
                                C55362po[] poVarArr7 = new C55362po[size8];
                                for (int i15 = 0; i15 < size8; i15++) {
                                    poVarArr7[i15] = (C55362po) ((C55365pr) ((C55221ki) khVar.instance).f145388f.get(i15)).toBuilder();
                                }
                                khVar.copyOnWrite();
                                ((C55221ki) khVar.instance).f145388f = C55221ki.emptyProtobufList();
                                for (int i16 = 0; i16 < size8; i16++) {
                                    if (mo95133f(poVarArr7[i16])) {
                                        C55365pr prVar7 = (C55365pr) poVarArr7[i16].build();
                                        khVar.copyOnWrite();
                                        C55221ki kiVar6 = (C55221ki) khVar.instance;
                                        prVar7.getClass();
                                        C62971cq cqVar7 = kiVar6.f145388f;
                                        if (!cqVar7.mo58948c()) {
                                            kiVar6.f145388f = C62942bv.mutableCopy(cqVar7);
                                        }
                                        kiVar6.f145388f.add(prVar7);
                                    }
                                }
                            }
                            int size9 = ((C55221ki) khVar.instance).f145389g.size();
                            if (size9 > 0) {
                                C55362po[] poVarArr8 = new C55362po[size9];
                                for (int i17 = 0; i17 < size9; i17++) {
                                    poVarArr8[i17] = (C55362po) ((C55365pr) ((C55221ki) khVar.instance).f145389g.get(i17)).toBuilder();
                                }
                                khVar.copyOnWrite();
                                ((C55221ki) khVar.instance).f145389g = C55221ki.emptyProtobufList();
                                for (int i18 = 0; i18 < size9; i18++) {
                                    if (mo95133f(poVarArr8[i18])) {
                                        C55365pr prVar8 = (C55365pr) poVarArr8[i18].build();
                                        khVar.copyOnWrite();
                                        C55221ki kiVar7 = (C55221ki) khVar.instance;
                                        prVar8.getClass();
                                        C62971cq cqVar8 = kiVar7.f145389g;
                                        if (!cqVar8.mo58948c()) {
                                            kiVar7.f145389g = C62942bv.mutableCopy(cqVar8);
                                        }
                                        kiVar7.f145389g.add(prVar8);
                                    }
                                }
                            }
                            int size10 = ((C55221ki) khVar.instance).f145390h.size();
                            if (size10 > 0) {
                                C55362po[] poVarArr9 = new C55362po[size10];
                                for (int i19 = 0; i19 < size10; i19++) {
                                    poVarArr9[i19] = (C55362po) ((C55365pr) ((C55221ki) khVar.instance).f145390h.get(i19)).toBuilder();
                                }
                                khVar.copyOnWrite();
                                ((C55221ki) khVar.instance).f145390h = C55221ki.emptyProtobufList();
                                for (int i20 = 0; i20 < size10; i20++) {
                                    if (mo95133f(poVarArr9[i20])) {
                                        C55365pr prVar9 = (C55365pr) poVarArr9[i20].build();
                                        khVar.copyOnWrite();
                                        C55221ki kiVar8 = (C55221ki) khVar.instance;
                                        prVar9.getClass();
                                        C62971cq cqVar9 = kiVar8.f145390h;
                                        if (!cqVar9.mo58948c()) {
                                            kiVar8.f145390h = C62942bv.mutableCopy(cqVar9);
                                        }
                                        kiVar8.f145390h.add(prVar9);
                                    }
                                }
                            }
                            int size11 = ((C55221ki) khVar.instance).f145391i.size();
                            if (size11 > 0) {
                                C55362po[] poVarArr10 = new C55362po[size11];
                                for (int i21 = 0; i21 < size11; i21++) {
                                    poVarArr10[i21] = (C55362po) ((C55365pr) ((C55221ki) khVar.instance).f145391i.get(i21)).toBuilder();
                                }
                                khVar.copyOnWrite();
                                ((C55221ki) khVar.instance).f145391i = C55221ki.emptyProtobufList();
                                for (int i22 = 0; i22 < size11; i22++) {
                                    if (mo95133f(poVarArr10[i22])) {
                                        C55365pr prVar10 = (C55365pr) poVarArr10[i22].build();
                                        khVar.copyOnWrite();
                                        C55221ki kiVar9 = (C55221ki) khVar.instance;
                                        prVar10.getClass();
                                        C62971cq cqVar10 = kiVar9.f145391i;
                                        if (!cqVar10.mo58948c()) {
                                            kiVar9.f145391i = C62942bv.mutableCopy(cqVar10);
                                        }
                                        kiVar9.f145391i.add(prVar10);
                                    }
                                }
                            }
                            int size12 = ((C55221ki) khVar.instance).f145392j.size();
                            if (size12 > 0) {
                                C55362po[] poVarArr11 = new C55362po[size12];
                                for (int i23 = 0; i23 < size12; i23++) {
                                    poVarArr11[i23] = (C55362po) ((C55365pr) ((C55221ki) khVar.instance).f145392j.get(i23)).toBuilder();
                                }
                                khVar.copyOnWrite();
                                ((C55221ki) khVar.instance).f145392j = C55221ki.emptyProtobufList();
                                for (int i24 = 0; i24 < size12; i24++) {
                                    if (mo95133f(poVarArr11[i24])) {
                                        C55365pr prVar11 = (C55365pr) poVarArr11[i24].build();
                                        khVar.copyOnWrite();
                                        C55221ki kiVar10 = (C55221ki) khVar.instance;
                                        prVar11.getClass();
                                        C62971cq cqVar11 = kiVar10.f145392j;
                                        if (!cqVar11.mo58948c()) {
                                            kiVar10.f145392j = C62942bv.mutableCopy(cqVar11);
                                        }
                                        kiVar10.f145392j.add(prVar11);
                                    }
                                }
                            }
                            kbVar.mo58885m(C55221ki.f145381l, (C55221ki) khVar.build());
                        }
                        jpVar.mo54206a((C55215kc) kbVarArr[i2].build());
                    }
                }
            }
        }
        int size13 = ((C55202jq) jpVar.instance).f145293c.size();
        if (size13 > 0) {
            C55362po[] poVarArr12 = new C55362po[size13];
            for (int i25 = 0; i25 < size13; i25++) {
                poVarArr12[i25] = (C55362po) ((C55365pr) ((C55202jq) jpVar.instance).f145293c.get(i25)).toBuilder();
            }
            jpVar.copyOnWrite();
            ((C55202jq) jpVar.instance).f145293c = C55202jq.emptyProtobufList();
            for (int i26 = 0; i26 < size13; i26++) {
                if (mo95133f(poVarArr12[i26])) {
                    C55365pr prVar12 = (C55365pr) poVarArr12[i26].build();
                    jpVar.copyOnWrite();
                    C55202jq jqVar = (C55202jq) jpVar.instance;
                    prVar12.getClass();
                    C62971cq cqVar12 = jqVar.f145293c;
                    if (!cqVar12.mo58948c()) {
                        jqVar.f145293c = C62942bv.mutableCopy(cqVar12);
                    }
                    jqVar.f145293c.add(prVar12);
                }
            }
        }
        int size14 = ((C55202jq) jpVar.instance).f145294d.size();
        if (size14 > 0) {
            C55362po[] poVarArr13 = new C55362po[size14];
            for (int i27 = 0; i27 < size14; i27++) {
                poVarArr13[i27] = (C55362po) ((C55365pr) ((C55202jq) jpVar.instance).f145294d.get(i27)).toBuilder();
            }
            jpVar.copyOnWrite();
            ((C55202jq) jpVar.instance).f145294d = C55202jq.emptyProtobufList();
            for (int i28 = 0; i28 < size14; i28++) {
                if (mo95133f(poVarArr13[i28])) {
                    C55365pr prVar13 = (C55365pr) poVarArr13[i28].build();
                    jpVar.copyOnWrite();
                    C55202jq jqVar2 = (C55202jq) jpVar.instance;
                    prVar13.getClass();
                    C62971cq cqVar13 = jqVar2.f145294d;
                    if (!cqVar13.mo58948c()) {
                        jqVar2.f145294d = C62942bv.mutableCopy(cqVar13);
                    }
                    jqVar2.f145294d.add(prVar13);
                }
            }
        }
        C55202jq jqVar3 = (C55202jq) jpVar.instance;
        if ((jqVar3.f145291a & 1) != 0) {
            C55365pr prVar14 = jqVar3.f145295e;
            if (prVar14 == null) {
                prVar14 = C55365pr.f145876l;
            }
            C55362po poVar = (C55362po) prVar14.toBuilder();
            if (mo95133f(poVar)) {
                jpVar.copyOnWrite();
                C55202jq jqVar4 = (C55202jq) jpVar.instance;
                C55365pr prVar15 = (C55365pr) poVar.build();
                prVar15.getClass();
                jqVar4.f145295e = prVar15;
                jqVar4.f145291a |= 1;
            } else {
                jpVar.copyOnWrite();
                C55202jq jqVar5 = (C55202jq) jpVar.instance;
                jqVar5.f145295e = null;
                jqVar5.f145291a &= -2;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo95129b(C55211jz jzVar) {
        C55258ls lsVar;
        C55256lq lqVar;
        String str;
        C55232kt ktVar;
        String str2;
        C55248li liVar;
        String str3;
        C55294na naVar;
        C55222kj kjVar;
        C55234kv kvVar;
        String str4;
        C55030dg dgVar;
        String str5;
        String str6;
        String str7;
        String str8;
        C55287mu muVar;
        String str9;
        String str10;
        C55211jz jzVar2 = jzVar;
        if (jzVar2 == null) {
            return false;
        }
        C55213ka kaVar = (C55213ka) jzVar2.instance;
        if (!((kaVar.f145358a & 2) == 0 || (str10 = kaVar.f145360c) == null)) {
            jzVar.copyOnWrite();
            C55213ka kaVar2 = (C55213ka) jzVar2.instance;
            kaVar2.f145358a |= 2;
            kaVar2.f145360c = str10;
        }
        C55213ka kaVar3 = (C55213ka) jzVar2.instance;
        if ((kaVar3.f145358a & 4) != 0) {
            C55136he heVar = kaVar3.f145361d;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            C55135hd hdVar = (C55135hd) heVar.toBuilder();
            if (mo95132e(hdVar)) {
                jzVar.copyOnWrite();
                C55213ka kaVar4 = (C55213ka) jzVar2.instance;
                C55136he heVar2 = (C55136he) hdVar.build();
                heVar2.getClass();
                kaVar4.f145361d = heVar2;
                kaVar4.f145358a |= 4;
            } else {
                jzVar.copyOnWrite();
                C55213ka kaVar5 = (C55213ka) jzVar2.instance;
                kaVar5.f145361d = null;
                kaVar5.f145358a &= -5;
            }
        }
        if (jzVar2.mo58882j(C55290mx.f145636f) && (muVar = (C55287mu) ((C55290mx) jzVar2.mo58881i(C55290mx.f145636f)).toBuilder()) != null) {
            C55290mx mxVar = (C55290mx) muVar.instance;
            if (!((mxVar.f145638a & 1) == 0 || (str9 = mxVar.f145639b) == null)) {
                muVar.copyOnWrite();
                C55290mx mxVar2 = (C55290mx) muVar.instance;
                mxVar2.f145638a |= 1;
                mxVar2.f145639b = str9;
            }
            int size = ((C55290mx) muVar.instance).f145641d.size();
            if (size > 0) {
                C55135hd[] hdVarArr = new C55135hd[size];
                for (int i = 0; i < size; i++) {
                    hdVarArr[i] = (C55135hd) ((C55136he) ((C55290mx) muVar.instance).f145641d.get(i)).toBuilder();
                }
                muVar.copyOnWrite();
                ((C55290mx) muVar.instance).f145641d = C55290mx.emptyProtobufList();
                for (int i2 = 0; i2 < size; i2++) {
                    if (mo95132e(hdVarArr[i2])) {
                        C55136he heVar3 = (C55136he) hdVarArr[i2].build();
                        muVar.copyOnWrite();
                        C55290mx mxVar3 = (C55290mx) muVar.instance;
                        heVar3.getClass();
                        mxVar3.mo54232a();
                        mxVar3.f145641d.add(heVar3);
                    }
                }
            }
            jzVar2.mo58885m(C55290mx.f145636f, (C55290mx) muVar.build());
        }
        if (jzVar2.mo58882j(C55235kw.f145427j) && (kvVar = (C55234kv) ((C55235kw) jzVar2.mo58881i(C55235kw.f145427j)).toBuilder()) != null) {
            int size2 = ((C55235kw) kvVar.instance).f145431c.size();
            if (size2 > 0) {
                C55246lg[] lgVarArr = new C55246lg[size2];
                for (int i3 = 0; i3 < size2; i3++) {
                    lgVarArr[i3] = (C55246lg) kvVar.mo54209a(i3).toBuilder();
                }
                kvVar.copyOnWrite();
                ((C55235kw) kvVar.instance).f145431c = C55235kw.emptyProtobufList();
                for (int i4 = 0; i4 < size2; i4++) {
                    C55246lg lgVar = lgVarArr[i4];
                    if (lgVar != null) {
                        C55247lh lhVar = (C55247lh) lgVar.instance;
                        if (!((lhVar.f145479a & 1) == 0 || (str8 = lhVar.f145480b) == null)) {
                            lgVar.copyOnWrite();
                            C55247lh lhVar2 = (C55247lh) lgVar.instance;
                            lhVar2.f145479a |= 1;
                            lhVar2.f145480b = str8;
                        }
                        C55247lh lhVar3 = (C55247lh) lgVar.instance;
                        if (!((lhVar3.f145479a & 4) == 0 || (str7 = lhVar3.f145481c) == null)) {
                            lgVar.copyOnWrite();
                            C55247lh lhVar4 = (C55247lh) lgVar.instance;
                            lhVar4.f145479a |= 4;
                            lhVar4.f145481c = str7;
                        }
                        C55247lh lhVar5 = (C55247lh) lgVar.instance;
                        if (!((lhVar5.f145479a & 16) == 0 || (str6 = lhVar5.f145482d) == null)) {
                            lgVar.copyOnWrite();
                            C55247lh lhVar6 = (C55247lh) lgVar.instance;
                            lhVar6.f145479a |= 16;
                            lhVar6.f145482d = str6;
                        }
                        C55247lh lhVar7 = (C55247lh) lgVar.instance;
                        if (!((lhVar7.f145479a & 128) == 0 || (str5 = lhVar7.f145485g) == null)) {
                            lgVar.copyOnWrite();
                            C55247lh lhVar8 = (C55247lh) lgVar.instance;
                            lhVar8.f145479a |= 128;
                            lhVar8.f145485g = str5;
                        }
                        C55247lh lhVar9 = (C55247lh) lgVar.instance;
                        if ((lhVar9.f145479a & 512) != 0) {
                            C55136he heVar4 = lhVar9.f145487j;
                            if (heVar4 == null) {
                                heVar4 = C55136he.f145130j;
                            }
                            C55135hd hdVar2 = (C55135hd) heVar4.toBuilder();
                            if (mo95132e(hdVar2)) {
                                lgVar.copyOnWrite();
                                C55247lh lhVar10 = (C55247lh) lgVar.instance;
                                C55136he heVar5 = (C55136he) hdVar2.build();
                                heVar5.getClass();
                                lhVar10.f145487j = heVar5;
                                lhVar10.f145479a |= 512;
                            } else {
                                lgVar.copyOnWrite();
                                C55247lh lhVar11 = (C55247lh) lgVar.instance;
                                lhVar11.f145487j = null;
                                lhVar11.f145479a &= -513;
                            }
                        }
                        kvVar.mo54212d((C55247lh) lgVarArr[i4].build());
                    }
                }
            }
            int size3 = ((C55235kw) kvVar.instance).f145434f.size();
            if (size3 > 0) {
                C55028de[] deVarArr = new C55028de[size3];
                for (int i5 = 0; i5 < size3; i5++) {
                    deVarArr[i5] = (C55028de) kvVar.mo54210b(i5).toBuilder();
                }
                kvVar.copyOnWrite();
                ((C55235kw) kvVar.instance).f145434f = C55235kw.emptyProtobufList();
                for (int i6 = 0; i6 < size3; i6++) {
                    C55028de deVar = deVarArr[i6];
                    if (deVar != null) {
                        if (deVar.mo58882j(C55035dl.f144791g) && (dgVar = (C55030dg) ((C55035dl) deVar.mo58881i(C55035dl.f144791g)).toBuilder()) != null) {
                            int size4 = ((C55035dl) dgVar.instance).f144796d.size();
                            if (size4 > 0) {
                                C55031dh[] dhVarArr = new C55031dh[size4];
                                for (int i7 = 0; i7 < size4; i7++) {
                                    dhVarArr[i7] = (C55031dh) dgVar.mo54170a(i7).toBuilder();
                                }
                                dgVar.copyOnWrite();
                                ((C55035dl) dgVar.instance).f144796d = C55035dl.emptyProtobufList();
                                for (int i8 = 0; i8 < size4; i8++) {
                                    C55031dh dhVar = dhVarArr[i8];
                                    if (dhVar != null) {
                                        C55032di diVar = (C55032di) dhVar.instance;
                                        if ((diVar.f144779a & 256) != 0) {
                                            C55136he heVar6 = diVar.f144787i;
                                            if (heVar6 == null) {
                                                heVar6 = C55136he.f145130j;
                                            }
                                            C55135hd hdVar3 = (C55135hd) heVar6.toBuilder();
                                            if (mo95132e(hdVar3)) {
                                                dhVar.copyOnWrite();
                                                C55032di diVar2 = (C55032di) dhVar.instance;
                                                C55136he heVar7 = (C55136he) hdVar3.build();
                                                heVar7.getClass();
                                                diVar2.f144787i = heVar7;
                                                diVar2.f144779a |= 256;
                                            } else {
                                                dhVar.copyOnWrite();
                                                C55032di diVar3 = (C55032di) dhVar.instance;
                                                diVar3.f144787i = null;
                                                diVar3.f144779a &= -257;
                                            }
                                        }
                                        dgVar.mo54171b((C55032di) dhVarArr[i8].build());
                                    }
                                }
                            }
                            deVar.mo58885m(C55035dl.f144791g, (C55035dl) dgVar.build());
                        }
                        C55029df dfVar = (C55029df) deVarArr[i6].build();
                        kvVar.copyOnWrite();
                        C55235kw kwVar = (C55235kw) kvVar.instance;
                        dfVar.getClass();
                        kwVar.mo54214b();
                        kwVar.f145434f.add(dfVar);
                    }
                }
            }
            C55235kw kwVar2 = (C55235kw) kvVar.instance;
            if (!((kwVar2.f145429a & 16) == 0 || (str4 = kwVar2.f145436h) == null)) {
                kvVar.copyOnWrite();
                C55235kw kwVar3 = (C55235kw) kvVar.instance;
                kwVar3.f145429a |= 16;
                kwVar3.f145436h = str4;
            }
            jzVar2.mo58885m(C55235kw.f145427j, (C55235kw) kvVar.build());
        }
        if (jzVar2.mo58882j(C55225km.f145401f) && (kjVar = (C55222kj) ((C55225km) jzVar2.mo58881i(C55225km.f145401f)).toBuilder()) != null) {
            C55225km kmVar = (C55225km) kjVar.instance;
            if ((kmVar.f145403a & 2) != 0) {
                C55224kl klVar = kmVar.f145405c;
                if (klVar == null) {
                    klVar = C55224kl.f145394d;
                }
                C55223kk kkVar = (C55223kk) klVar.toBuilder();
                if (m176397n(kkVar)) {
                    kjVar.copyOnWrite();
                    C55225km kmVar2 = (C55225km) kjVar.instance;
                    C55224kl klVar2 = (C55224kl) kkVar.build();
                    klVar2.getClass();
                    kmVar2.f145405c = klVar2;
                    kmVar2.f145403a |= 2;
                } else {
                    kjVar.copyOnWrite();
                    C55225km kmVar3 = (C55225km) kjVar.instance;
                    kmVar3.f145405c = null;
                    kmVar3.f145403a &= -3;
                }
            }
            int size5 = ((C55225km) kjVar.instance).f145406d.size();
            if (size5 > 0) {
                C55223kk[] kkVarArr = new C55223kk[size5];
                for (int i9 = 0; i9 < size5; i9++) {
                    kkVarArr[i9] = (C55223kk) kjVar.mo54207a(i9).toBuilder();
                }
                kjVar.copyOnWrite();
                ((C55225km) kjVar.instance).f145406d = C55225km.emptyProtobufList();
                for (int i10 = 0; i10 < size5; i10++) {
                    if (m176397n(kkVarArr[i10])) {
                        C55224kl klVar3 = (C55224kl) kkVarArr[i10].build();
                        kjVar.copyOnWrite();
                        C55225km kmVar4 = (C55225km) kjVar.instance;
                        klVar3.getClass();
                        kmVar4.mo54208a();
                        kmVar4.f145406d.add(klVar3);
                    }
                }
            }
            jzVar2.mo58885m(C55225km.f145401f, (C55225km) kjVar.build());
        }
        if (jzVar2.mo58882j(C55297nd.f145671g) && (naVar = (C55294na) ((C55297nd) jzVar2.mo58881i(C55297nd.f145671g)).toBuilder()) != null) {
            C55297nd ndVar = (C55297nd) naVar.instance;
            if ((ndVar.f145673a & 1) != 0) {
                C55296nc ncVar = ndVar.f145674b;
                if (ncVar == null) {
                    ncVar = C55296nc.f145663e;
                }
                C55295nb nbVar = (C55295nb) ncVar.toBuilder();
                if (m176398o(nbVar)) {
                    naVar.copyOnWrite();
                    C55297nd ndVar2 = (C55297nd) naVar.instance;
                    C55296nc ncVar2 = (C55296nc) nbVar.build();
                    ncVar2.getClass();
                    ndVar2.f145674b = ncVar2;
                    ndVar2.f145673a |= 1;
                } else {
                    naVar.copyOnWrite();
                    C55297nd ndVar3 = (C55297nd) naVar.instance;
                    ndVar3.f145674b = null;
                    ndVar3.f145673a &= -2;
                }
            }
            int size6 = ((C55297nd) naVar.instance).f145675c.size();
            if (size6 > 0) {
                C55295nb[] nbVarArr = new C55295nb[size6];
                for (int i11 = 0; i11 < size6; i11++) {
                    nbVarArr[i11] = (C55295nb) naVar.mo54233a(i11).toBuilder();
                }
                naVar.copyOnWrite();
                ((C55297nd) naVar.instance).f145675c = C55297nd.emptyProtobufList();
                for (int i12 = 0; i12 < size6; i12++) {
                    if (m176398o(nbVarArr[i12])) {
                        C55296nc ncVar3 = (C55296nc) nbVarArr[i12].build();
                        naVar.copyOnWrite();
                        C55297nd ndVar4 = (C55297nd) naVar.instance;
                        ncVar3.getClass();
                        ndVar4.mo54234a();
                        ndVar4.f145675c.add(ncVar3);
                    }
                }
            }
            jzVar2.mo58885m(C55297nd.f145671g, (C55297nd) naVar.build());
        }
        if (jzVar2.mo58882j(C55251ll.f145500f) && (liVar = (C55248li) ((C55251ll) jzVar2.mo58881i(C55251ll.f145500f)).toBuilder()) != null) {
            int size7 = ((C55251ll) liVar.instance).f145503b.size();
            if (size7 > 0) {
                C55249lj[] ljVarArr = new C55249lj[size7];
                for (int i13 = 0; i13 < size7; i13++) {
                    ljVarArr[i13] = (C55249lj) liVar.mo54219a(i13).toBuilder();
                }
                liVar.copyOnWrite();
                ((C55251ll) liVar.instance).f145503b = C55251ll.emptyProtobufList();
                for (int i14 = 0; i14 < size7; i14++) {
                    C55249lj ljVar = ljVarArr[i14];
                    if (ljVar != null) {
                        C55250lk lkVar = (C55250lk) ljVar.instance;
                        if (!((lkVar.f145491a & 1) == 0 || (str3 = lkVar.f145492b) == null)) {
                            ljVar.copyOnWrite();
                            C55250lk lkVar2 = (C55250lk) ljVar.instance;
                            lkVar2.f145491a |= 1;
                            lkVar2.f145492b = str3;
                        }
                        C55250lk lkVar3 = (C55250lk) ljVar.instance;
                        if ((lkVar3.f145491a & 4) != 0) {
                            C55136he heVar8 = lkVar3.f145493c;
                            if (heVar8 == null) {
                                heVar8 = C55136he.f145130j;
                            }
                            C55135hd hdVar4 = (C55135hd) heVar8.toBuilder();
                            if (mo95132e(hdVar4)) {
                                ljVar.copyOnWrite();
                                C55250lk lkVar4 = (C55250lk) ljVar.instance;
                                C55136he heVar9 = (C55136he) hdVar4.build();
                                heVar9.getClass();
                                lkVar4.f145493c = heVar9;
                                lkVar4.f145491a |= 4;
                            } else {
                                ljVar.copyOnWrite();
                                C55250lk lkVar5 = (C55250lk) ljVar.instance;
                                lkVar5.f145493c = null;
                                lkVar5.f145491a &= -5;
                            }
                        }
                        C55250lk lkVar6 = (C55250lk) ljVarArr[i14].build();
                        liVar.copyOnWrite();
                        C55251ll llVar = (C55251ll) liVar.instance;
                        lkVar6.getClass();
                        llVar.mo54220a();
                        llVar.f145503b.add(lkVar6);
                    }
                }
            }
            jzVar2.mo58885m(C55251ll.f145500f, (C55251ll) liVar.build());
        }
        if (jzVar2.mo58882j(C55233ku.f145422d) && (ktVar = (C55232kt) ((C55233ku) jzVar2.mo58881i(C55233ku.f145422d)).toBuilder()) != null) {
            C55233ku kuVar = (C55233ku) ktVar.instance;
            if (!((kuVar.f145424a & 16) == 0 || (str2 = kuVar.f145425b) == null)) {
                ktVar.copyOnWrite();
                C55233ku kuVar2 = (C55233ku) ktVar.instance;
                kuVar2.f145424a |= 16;
                kuVar2.f145425b = str2;
            }
            jzVar2.mo58885m(C55233ku.f145422d, (C55233ku) ktVar.build());
        }
        if (jzVar2.mo58882j(C55257lr.f145522d) && (lqVar = (C55256lq) ((C55257lr) jzVar2.mo58881i(C55257lr.f145522d)).toBuilder()) != null) {
            C55257lr lrVar = (C55257lr) lqVar.instance;
            if (!((lrVar.f145524a & 8) == 0 || (str = lrVar.f145525b) == null)) {
                lqVar.copyOnWrite();
                C55257lr lrVar2 = (C55257lr) lqVar.instance;
                lrVar2.f145524a |= 8;
                lrVar2.f145525b = str;
            }
            jzVar2.mo58885m(C55257lr.f145522d, (C55257lr) lqVar.build());
        }
        if (jzVar2.mo58882j(C55259lt.f145527g) && (lsVar = (C55258ls) ((C55259lt) jzVar2.mo58881i(C55259lt.f145527g)).toBuilder()) != null) {
            C55259lt ltVar = (C55259lt) lsVar.instance;
            if ((ltVar.f145529a & 2) != 0) {
                C55136he heVar10 = ltVar.f145532d;
                if (heVar10 == null) {
                    heVar10 = C55136he.f145130j;
                }
                C55135hd hdVar5 = (C55135hd) heVar10.toBuilder();
                if (mo95132e(hdVar5)) {
                    lsVar.copyOnWrite();
                    C55259lt ltVar2 = (C55259lt) lsVar.instance;
                    C55136he heVar11 = (C55136he) hdVar5.build();
                    heVar11.getClass();
                    ltVar2.f145532d = heVar11;
                    ltVar2.f145529a |= 2;
                } else {
                    lsVar.copyOnWrite();
                    C55259lt ltVar3 = (C55259lt) lsVar.instance;
                    ltVar3.f145532d = null;
                    ltVar3.f145529a &= -3;
                }
            }
            jzVar2.mo58885m(C55259lt.f145527g, (C55259lt) lsVar.build());
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo95130c(C55238kz kzVar) {
        if (kzVar == null) {
            return false;
        }
        C55240la laVar = (C55240la) kzVar.instance;
        if ((laVar.f145451a & 2) != 0) {
            C55136he heVar = laVar.f145453c;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            C55135hd hdVar = (C55135hd) heVar.toBuilder();
            if (mo95132e(hdVar)) {
                kzVar.copyOnWrite();
                C55240la laVar2 = (C55240la) kzVar.instance;
                C55136he heVar2 = (C55136he) hdVar.build();
                heVar2.getClass();
                laVar2.f145453c = heVar2;
                laVar2.f145451a |= 2;
            } else {
                kzVar.copyOnWrite();
                C55240la laVar3 = (C55240la) kzVar.instance;
                laVar3.f145453c = null;
                laVar3.f145451a &= -3;
            }
        }
        C55240la laVar4 = (C55240la) kzVar.instance;
        if ((laVar4.f145451a & 256) == 0) {
            return true;
        }
        C55136he heVar3 = laVar4.f145460j;
        if (heVar3 == null) {
            heVar3 = C55136he.f145130j;
        }
        C55135hd hdVar2 = (C55135hd) heVar3.toBuilder();
        if (mo95132e(hdVar2)) {
            kzVar.copyOnWrite();
            C55240la laVar5 = (C55240la) kzVar.instance;
            C55136he heVar4 = (C55136he) hdVar2.build();
            heVar4.getClass();
            laVar5.f145460j = heVar4;
            laVar5.f145451a |= 256;
            return true;
        }
        kzVar.copyOnWrite();
        C55240la laVar6 = (C55240la) kzVar.instance;
        laVar6.f145460j = null;
        laVar6.f145451a &= -257;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo95131d(C55243ld ldVar) {
        if (ldVar == null) {
            return false;
        }
        int size = ((C55244le) ldVar.instance).f145470c.size();
        if (size > 0) {
            C55238kz[] kzVarArr = new C55238kz[size];
            for (int i = 0; i < size; i++) {
                kzVarArr[i] = (C55238kz) ldVar.mo54215a(i).toBuilder();
            }
            ldVar.copyOnWrite();
            ((C55244le) ldVar.instance).f145470c = C55244le.emptyProtobufList();
            for (int i2 = 0; i2 < size; i2++) {
                if (mo95130c(kzVarArr[i2])) {
                    C55240la laVar = (C55240la) kzVarArr[i2].build();
                    ldVar.copyOnWrite();
                    C55244le leVar = (C55244le) ldVar.instance;
                    laVar.getClass();
                    leVar.mo54217b();
                    leVar.f145470c.add(laVar);
                }
            }
        }
        int size2 = ((C55244le) ldVar.instance).f145469b.size();
        if (size2 > 0) {
            C55362po[] poVarArr = new C55362po[size2];
            for (int i3 = 0; i3 < size2; i3++) {
                poVarArr[i3] = (C55362po) ((C55365pr) ((C55244le) ldVar.instance).f145469b.get(i3)).toBuilder();
            }
            ldVar.copyOnWrite();
            ((C55244le) ldVar.instance).f145469b = C55244le.emptyProtobufList();
            for (int i4 = 0; i4 < size2; i4++) {
                if (mo95133f(poVarArr[i4])) {
                    C55365pr prVar = (C55365pr) poVarArr[i4].build();
                    ldVar.copyOnWrite();
                    C55244le leVar2 = (C55244le) ldVar.instance;
                    prVar.getClass();
                    leVar2.mo54216a();
                    leVar2.f145469b.add(prVar);
                }
            }
        }
        int size3 = ((C55244le) ldVar.instance).f145472e.size();
        if (size3 <= 0) {
            return true;
        }
        C55135hd[] hdVarArr = new C55135hd[size3];
        for (int i5 = 0; i5 < size3; i5++) {
            hdVarArr[i5] = (C55135hd) ((C55136he) ((C55244le) ldVar.instance).f145472e.get(i5)).toBuilder();
        }
        ldVar.copyOnWrite();
        ((C55244le) ldVar.instance).f145472e = C55244le.emptyProtobufList();
        for (int i6 = 0; i6 < size3; i6++) {
            if (mo95132e(hdVarArr[i6])) {
                C55136he heVar = (C55136he) hdVarArr[i6].build();
                ldVar.copyOnWrite();
                C55244le leVar3 = (C55244le) ldVar.instance;
                heVar.getClass();
                leVar3.mo54218c();
                leVar3.f145472e.add(heVar);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo95132e(C55135hd hdVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (hdVar == null || !this.f295524a.mo95136c(hdVar)) {
            return false;
        }
        int size = ((C55136he) hdVar.instance).f145138g.size();
        if (size > 0) {
            C55130gz[] gzVarArr = new C55130gz[size];
            for (int i = 0; i < size; i++) {
                gzVarArr[i] = (C55130gz) hdVar.mo54198a(i).toBuilder();
            }
            hdVar.copyOnWrite();
            ((C55136he) hdVar.instance).f145138g = C55136he.emptyProtobufList();
            for (int i2 = 0; i2 < size; i2++) {
                C55130gz gzVar = gzVarArr[i2];
                if (gzVar != null) {
                    C55134hc hcVar = (C55134hc) gzVar.instance;
                    if ((hcVar.f145121a & 16) != 0) {
                        C55138hg hgVar = hcVar.f145127g;
                        if (hgVar == null) {
                            hgVar = C55138hg.f145142g;
                        }
                        C55137hf hfVar = (C55137hf) hgVar.toBuilder();
                        if (hfVar == null) {
                            gzVar.copyOnWrite();
                            C55134hc hcVar2 = (C55134hc) gzVar.instance;
                            hcVar2.f145127g = null;
                            hcVar2.f145121a &= -17;
                        } else {
                            C55138hg hgVar2 = (C55138hg) hfVar.instance;
                            if (!((hgVar2.f145144a & 1) == 0 || (str4 = hgVar2.f145145b) == null)) {
                                hfVar.copyOnWrite();
                                C55138hg hgVar3 = (C55138hg) hfVar.instance;
                                hgVar3.f145144a |= 1;
                                hgVar3.f145145b = str4;
                            }
                            C55138hg hgVar4 = (C55138hg) hfVar.instance;
                            if (!((hgVar4.f145144a & 4) == 0 || (str3 = hgVar4.f145146c) == null)) {
                                hfVar.copyOnWrite();
                                C55138hg hgVar5 = (C55138hg) hfVar.instance;
                                hgVar5.f145144a |= 4;
                                hgVar5.f145146c = str3;
                            }
                            C55138hg hgVar6 = (C55138hg) hfVar.instance;
                            if (!((hgVar6.f145144a & 16) == 0 || (str2 = hgVar6.f145147d) == null)) {
                                hfVar.copyOnWrite();
                                C55138hg hgVar7 = (C55138hg) hfVar.instance;
                                hgVar7.f145144a |= 16;
                                hgVar7.f145147d = str2;
                            }
                            C55138hg hgVar8 = (C55138hg) hfVar.instance;
                            if (!((hgVar8.f145144a & 64) == 0 || (str = hgVar8.f145148e) == null)) {
                                hfVar.copyOnWrite();
                                C55138hg hgVar9 = (C55138hg) hfVar.instance;
                                hgVar9.f145144a |= 64;
                                hgVar9.f145148e = str;
                            }
                            for (int i3 = 0; i3 < ((C55138hg) hfVar.instance).f145149f.size(); i3++) {
                                String a = hfVar.mo54202a(i3);
                                if (a != null) {
                                    hfVar.mo54203b(i3, a);
                                }
                            }
                            gzVar.copyOnWrite();
                            C55134hc hcVar3 = (C55134hc) gzVar.instance;
                            C55138hg hgVar10 = (C55138hg) hfVar.build();
                            hgVar10.getClass();
                            hcVar3.f145127g = hgVar10;
                            hcVar3.f145121a |= 16;
                        }
                    }
                    C55134hc hcVar4 = (C55134hc) gzVarArr[i2].build();
                    hdVar.copyOnWrite();
                    C55136he heVar = (C55136he) hdVar.instance;
                    hcVar4.getClass();
                    heVar.mo54201a();
                    heVar.f145138g.add(hcVar4);
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo95133f(C55362po poVar) {
        C55262lw lwVar;
        if (poVar == null || !this.f295524a.mo95137d(poVar)) {
            return false;
        }
        if (poVar.mo58882j(C55263lx.f145543j) && (lwVar = (C55262lw) ((C55263lx) poVar.mo58881i(C55263lx.f145543j)).toBuilder()) != null) {
            C55263lx lxVar = (C55263lx) lwVar.instance;
            if ((lxVar.f145546a & 1) != 0) {
                C55136he heVar = lxVar.f145547b;
                if (heVar == null) {
                    heVar = C55136he.f145130j;
                }
                C55135hd hdVar = (C55135hd) heVar.toBuilder();
                if (mo95132e(hdVar)) {
                    lwVar.copyOnWrite();
                    C55263lx lxVar2 = (C55263lx) lwVar.instance;
                    C55136he heVar2 = (C55136he) hdVar.build();
                    heVar2.getClass();
                    lxVar2.f145547b = heVar2;
                    lxVar2.f145546a |= 1;
                } else {
                    lwVar.copyOnWrite();
                    C55263lx lxVar3 = (C55263lx) lwVar.instance;
                    lxVar3.f145547b = null;
                    lxVar3.f145546a &= -2;
                }
            }
            int size = ((C55263lx) lwVar.instance).f145551f.size();
            if (size > 0) {
                C55252lm[] lmVarArr = new C55252lm[size];
                for (int i = 0; i < size; i++) {
                    lmVarArr[i] = (C55252lm) ((C55253ln) ((C55263lx) lwVar.instance).f145551f.get(i)).toBuilder();
                }
                lwVar.copyOnWrite();
                ((C55263lx) lwVar.instance).f145551f = C55263lx.emptyProtobufList();
                for (int i2 = 0; i2 < size; i2++) {
                    C55252lm lmVar = lmVarArr[i2];
                    if (lmVar != null) {
                        int size2 = ((C55253ln) lmVar.instance).f145510b.size();
                        if (size2 > 0) {
                            C55238kz[] kzVarArr = new C55238kz[size2];
                            for (int i3 = 0; i3 < size2; i3++) {
                                kzVarArr[i3] = (C55238kz) ((C55240la) ((C55253ln) lmVar.instance).f145510b.get(i3)).toBuilder();
                            }
                            lmVar.copyOnWrite();
                            ((C55253ln) lmVar.instance).f145510b = C55253ln.emptyProtobufList();
                            for (int i4 = 0; i4 < size2; i4++) {
                                if (mo95130c(kzVarArr[i4])) {
                                    lmVar.mo54221a((C55240la) kzVarArr[i4].build());
                                }
                            }
                        }
                        C55253ln lnVar = (C55253ln) lmVarArr[i2].build();
                        lwVar.copyOnWrite();
                        C55263lx lxVar4 = (C55263lx) lwVar.instance;
                        lnVar.getClass();
                        C62971cq cqVar = lxVar4.f145551f;
                        if (!cqVar.mo58948c()) {
                            lxVar4.f145551f = C62942bv.mutableCopy(cqVar);
                        }
                        lxVar4.f145551f.add(lnVar);
                    }
                }
            }
            int size3 = ((C55263lx) lwVar.instance).f145552g.size();
            if (size3 > 0) {
                C55135hd[] hdVarArr = new C55135hd[size3];
                for (int i5 = 0; i5 < size3; i5++) {
                    hdVarArr[i5] = (C55135hd) ((C55136he) ((C55263lx) lwVar.instance).f145552g.get(i5)).toBuilder();
                }
                lwVar.copyOnWrite();
                ((C55263lx) lwVar.instance).f145552g = C55263lx.emptyProtobufList();
                for (int i6 = 0; i6 < size3; i6++) {
                    if (mo95132e(hdVarArr[i6])) {
                        C55136he heVar3 = (C55136he) hdVarArr[i6].build();
                        lwVar.copyOnWrite();
                        C55263lx lxVar5 = (C55263lx) lwVar.instance;
                        heVar3.getClass();
                        C62971cq cqVar2 = lxVar5.f145552g;
                        if (!cqVar2.mo58948c()) {
                            lxVar5.f145552g = C62942bv.mutableCopy(cqVar2);
                        }
                        lxVar5.f145552g.add(heVar3);
                    }
                }
            }
            poVar.mo58885m(C55263lx.f145543j, (C55263lx) lwVar.build());
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo95134g(C55302ni niVar) {
        String str;
        String str2;
        String str3;
        if (niVar == null) {
            return false;
        }
        int size = ((C55305nl) niVar.instance).f145692b.size();
        if (size > 0) {
            C55238kz[] kzVarArr = new C55238kz[size];
            for (int i = 0; i < size; i++) {
                kzVarArr[i] = (C55238kz) niVar.mo54235a(i).toBuilder();
            }
            niVar.copyOnWrite();
            ((C55305nl) niVar.instance).f145692b = C55305nl.emptyProtobufList();
            for (int i2 = 0; i2 < size; i2++) {
                if (mo95130c(kzVarArr[i2])) {
                    C55240la laVar = (C55240la) kzVarArr[i2].build();
                    niVar.copyOnWrite();
                    C55305nl nlVar = (C55305nl) niVar.instance;
                    laVar.getClass();
                    nlVar.mo54238a();
                    nlVar.f145692b.add(laVar);
                }
            }
        }
        int size2 = ((C55305nl) niVar.instance).f145693c.size();
        if (size2 > 0) {
            C55238kz[] kzVarArr2 = new C55238kz[size2];
            for (int i3 = 0; i3 < size2; i3++) {
                kzVarArr2[i3] = (C55238kz) niVar.mo54236b(i3).toBuilder();
            }
            niVar.copyOnWrite();
            ((C55305nl) niVar.instance).f145693c = C55305nl.emptyProtobufList();
            for (int i4 = 0; i4 < size2; i4++) {
                if (mo95130c(kzVarArr2[i4])) {
                    C55240la laVar2 = (C55240la) kzVarArr2[i4].build();
                    niVar.copyOnWrite();
                    C55305nl nlVar2 = (C55305nl) niVar.instance;
                    laVar2.getClass();
                    nlVar2.mo54239b();
                    nlVar2.f145693c.add(laVar2);
                }
            }
        }
        C55305nl nlVar3 = (C55305nl) niVar.instance;
        if ((nlVar3.f145691a & 1) != 0) {
            C55244le leVar = nlVar3.f145694d;
            if (leVar == null) {
                leVar = C55244le.f145466h;
            }
            C55243ld ldVar = (C55243ld) leVar.toBuilder();
            if (mo95131d(ldVar)) {
                niVar.copyOnWrite();
                C55305nl nlVar4 = (C55305nl) niVar.instance;
                C55244le leVar2 = (C55244le) ldVar.build();
                leVar2.getClass();
                nlVar4.f145694d = leVar2;
                nlVar4.f145691a |= 1;
            } else {
                niVar.copyOnWrite();
                C55305nl nlVar5 = (C55305nl) niVar.instance;
                nlVar5.f145694d = null;
                nlVar5.f145691a &= -2;
            }
        }
        C55305nl nlVar6 = (C55305nl) niVar.instance;
        if ((nlVar6.f145691a & 2) != 0) {
            C55244le leVar3 = nlVar6.f145695e;
            if (leVar3 == null) {
                leVar3 = C55244le.f145466h;
            }
            C55243ld ldVar2 = (C55243ld) leVar3.toBuilder();
            if (mo95131d(ldVar2)) {
                niVar.copyOnWrite();
                C55305nl nlVar7 = (C55305nl) niVar.instance;
                C55244le leVar4 = (C55244le) ldVar2.build();
                leVar4.getClass();
                nlVar7.f145695e = leVar4;
                nlVar7.f145691a |= 2;
            } else {
                niVar.copyOnWrite();
                C55305nl nlVar8 = (C55305nl) niVar.instance;
                nlVar8.f145695e = null;
                nlVar8.f145691a &= -3;
            }
        }
        C55305nl nlVar9 = (C55305nl) niVar.instance;
        if ((nlVar9.f145691a & 4) != 0) {
            C55244le leVar5 = nlVar9.f145696f;
            if (leVar5 == null) {
                leVar5 = C55244le.f145466h;
            }
            C55243ld ldVar3 = (C55243ld) leVar5.toBuilder();
            if (mo95131d(ldVar3)) {
                niVar.copyOnWrite();
                C55305nl nlVar10 = (C55305nl) niVar.instance;
                C55244le leVar6 = (C55244le) ldVar3.build();
                leVar6.getClass();
                nlVar10.f145696f = leVar6;
                nlVar10.f145691a |= 4;
            } else {
                niVar.copyOnWrite();
                C55305nl nlVar11 = (C55305nl) niVar.instance;
                nlVar11.f145696f = null;
                nlVar11.f145691a &= -5;
            }
        }
        C55305nl nlVar12 = (C55305nl) niVar.instance;
        if ((nlVar12.f145691a & 8) != 0) {
            C55244le leVar7 = nlVar12.f145697g;
            if (leVar7 == null) {
                leVar7 = C55244le.f145466h;
            }
            C55243ld ldVar4 = (C55243ld) leVar7.toBuilder();
            if (mo95131d(ldVar4)) {
                niVar.copyOnWrite();
                C55305nl nlVar13 = (C55305nl) niVar.instance;
                C55244le leVar8 = (C55244le) ldVar4.build();
                leVar8.getClass();
                nlVar13.f145697g = leVar8;
                nlVar13.f145691a |= 8;
            } else {
                niVar.copyOnWrite();
                C55305nl nlVar14 = (C55305nl) niVar.instance;
                nlVar14.f145697g = null;
                nlVar14.f145691a &= -9;
            }
        }
        C55305nl nlVar15 = (C55305nl) niVar.instance;
        if (!((nlVar15.f145691a & 64) == 0 || (str3 = nlVar15.f145699i) == null)) {
            niVar.copyOnWrite();
            C55305nl nlVar16 = (C55305nl) niVar.instance;
            nlVar16.f145691a |= 64;
            nlVar16.f145699i = str3;
        }
        C55305nl nlVar17 = (C55305nl) niVar.instance;
        if (!((nlVar17.f145691a & 4096) == 0 || (str2 = nlVar17.f145705o) == null)) {
            niVar.copyOnWrite();
            C55305nl nlVar18 = (C55305nl) niVar.instance;
            nlVar18.f145691a |= 4096;
            nlVar18.f145705o = str2;
        }
        C55305nl nlVar19 = (C55305nl) niVar.instance;
        if (!((nlVar19.f145691a & 512) == 0 || (str = nlVar19.f145701k) == null)) {
            niVar.copyOnWrite();
            C55305nl nlVar20 = (C55305nl) niVar.instance;
            nlVar20.f145691a |= 512;
            nlVar20.f145701k = str;
        }
        C55305nl nlVar21 = (C55305nl) niVar.instance;
        if ((nlVar21.f145691a & 256) != 0) {
            C55136he heVar = nlVar21.f145700j;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            C55135hd hdVar = (C55135hd) heVar.toBuilder();
            if (mo95132e(hdVar)) {
                niVar.copyOnWrite();
                C55305nl nlVar22 = (C55305nl) niVar.instance;
                C55136he heVar2 = (C55136he) hdVar.build();
                heVar2.getClass();
                nlVar22.f145700j = heVar2;
                nlVar22.f145691a |= 256;
            } else {
                niVar.copyOnWrite();
                C55305nl nlVar23 = (C55305nl) niVar.instance;
                nlVar23.f145700j = null;
                nlVar23.f145691a &= -257;
            }
        }
        C55305nl nlVar24 = (C55305nl) niVar.instance;
        if ((nlVar24.f145691a & 2048) != 0) {
            C55136he heVar3 = nlVar24.f145702l;
            if (heVar3 == null) {
                heVar3 = C55136he.f145130j;
            }
            C55135hd hdVar2 = (C55135hd) heVar3.toBuilder();
            if (mo95132e(hdVar2)) {
                niVar.copyOnWrite();
                C55305nl nlVar25 = (C55305nl) niVar.instance;
                C55136he heVar4 = (C55136he) hdVar2.build();
                heVar4.getClass();
                nlVar25.f145702l = heVar4;
                nlVar25.f145691a |= 2048;
            } else {
                niVar.copyOnWrite();
                C55305nl nlVar26 = (C55305nl) niVar.instance;
                nlVar26.f145702l = null;
                nlVar26.f145691a &= -2049;
            }
        }
        return true;
    }

    /* renamed from: j */
    static void m176393j(C55223kk kkVar, C55224kl klVar) {
        if (kkVar == null && klVar == null) {
            C56377j jVar = C56377j.f150344a;
            throw null;
        }
        kkVar.mo58884l(C56377j.f150347d);
        if (kkVar != null && klVar != null && (klVar.f145396a & 2) != 0) {
            String str = klVar.f145398c;
            kkVar.copyOnWrite();
            C55224kl klVar2 = (C55224kl) kkVar.instance;
            str.getClass();
            klVar2.f145396a |= 2;
            klVar2.f145398c = str;
        }
    }

    /* renamed from: l */
    static void m176395l(C55295nb nbVar, C55296nc ncVar) {
        if (nbVar == null && ncVar == null) {
            C56377j jVar = C56377j.f150344a;
            throw null;
        }
        nbVar.mo58884l(C56377j.f150348e);
        if (nbVar != null && ncVar != null && (ncVar.f145665a & 4) != 0) {
            String str = ncVar.f145668d;
            nbVar.copyOnWrite();
            C55296nc ncVar2 = (C55296nc) nbVar.instance;
            str.getClass();
            ncVar2.f145665a |= 4;
            ncVar2.f145668d = str;
        }
    }

    /* renamed from: k */
    static void m176394k(C55238kz kzVar, C55240la laVar) {
        if (kzVar == null && laVar == null) {
            C56377j jVar = C56377j.f150344a;
            throw null;
        }
        kzVar.mo58884l(C56377j.f150351h);
        if (!(kzVar == null || laVar == null || (laVar.f145451a & 2) == 0)) {
            C55136he heVar = laVar.f145453c;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            kzVar.copyOnWrite();
            C55240la laVar2 = (C55240la) kzVar.instance;
            heVar.getClass();
            laVar2.f145453c = heVar;
            laVar2.f145451a |= 2;
        }
        if (!(kzVar == null || laVar == null || (laVar.f145451a & 32) == 0)) {
            int i = laVar.f145457g;
            kzVar.copyOnWrite();
            C55240la laVar3 = (C55240la) kzVar.instance;
            laVar3.f145451a |= 32;
            laVar3.f145457g = i;
        }
        if (kzVar != null && laVar != null && (laVar.f145451a & 256) != 0) {
            C55136he heVar2 = laVar.f145460j;
            if (heVar2 == null) {
                heVar2 = C55136he.f145130j;
            }
            kzVar.copyOnWrite();
            C55240la laVar4 = (C55240la) kzVar.instance;
            heVar2.getClass();
            laVar4.f145460j = heVar2;
            laVar4.f145451a |= 256;
        }
    }

    /* renamed from: m */
    static void m176396m(C55302ni niVar, C55305nl nlVar) {
        if (niVar == null && nlVar == null) {
            C56377j jVar = C56377j.f150344a;
            throw null;
        }
        niVar.mo58884l(C56377j.f150350g);
        if (!(niVar == null || nlVar == null)) {
            for (int i = 0; i < ((C55305nl) niVar.instance).f145692b.size(); i++) {
                Iterator it = nlVar.f145692b.iterator();
                if (it.hasNext()) {
                    C55238kz kzVar = (C55238kz) niVar.mo54235a(i).toBuilder();
                    m176394k(kzVar, (C55240la) it.next());
                    niVar.mo54237c(i, kzVar);
                }
            }
        }
        if (!(niVar == null || nlVar == null)) {
            for (int i2 = 0; i2 < ((C55305nl) niVar.instance).f145693c.size(); i2++) {
                Iterator it2 = nlVar.f145693c.iterator();
                if (it2.hasNext()) {
                    C55238kz kzVar2 = (C55238kz) niVar.mo54236b(i2).toBuilder();
                    m176394k(kzVar2, (C55240la) it2.next());
                    niVar.copyOnWrite();
                    C55305nl nlVar2 = (C55305nl) niVar.instance;
                    C55240la laVar = (C55240la) kzVar2.build();
                    laVar.getClass();
                    nlVar2.mo54239b();
                    nlVar2.f145693c.set(i2, laVar);
                }
            }
        }
        if (!(niVar == null || nlVar == null || (nlVar.f145691a & 1) == 0)) {
            C55244le leVar = ((C55305nl) niVar.instance).f145694d;
            if (leVar == null) {
                leVar = C55244le.f145466h;
            }
            C55243ld ldVar = (C55243ld) leVar.toBuilder();
            C55244le leVar2 = nlVar.f145694d;
            if (leVar2 == null) {
                leVar2 = C55244le.f145466h;
            }
            m176391h(ldVar, leVar2);
            niVar.copyOnWrite();
            C55305nl nlVar3 = (C55305nl) niVar.instance;
            C55244le leVar3 = (C55244le) ldVar.build();
            leVar3.getClass();
            nlVar3.f145694d = leVar3;
            nlVar3.f145691a |= 1;
        }
        if (!(niVar == null || nlVar == null || (nlVar.f145691a & 2) == 0)) {
            C55244le leVar4 = ((C55305nl) niVar.instance).f145695e;
            if (leVar4 == null) {
                leVar4 = C55244le.f145466h;
            }
            C55243ld ldVar2 = (C55243ld) leVar4.toBuilder();
            C55244le leVar5 = nlVar.f145695e;
            if (leVar5 == null) {
                leVar5 = C55244le.f145466h;
            }
            m176391h(ldVar2, leVar5);
            niVar.copyOnWrite();
            C55305nl nlVar4 = (C55305nl) niVar.instance;
            C55244le leVar6 = (C55244le) ldVar2.build();
            leVar6.getClass();
            nlVar4.f145695e = leVar6;
            nlVar4.f145691a |= 2;
        }
        if (!(niVar == null || nlVar == null || (nlVar.f145691a & 4) == 0)) {
            C55244le leVar7 = ((C55305nl) niVar.instance).f145696f;
            if (leVar7 == null) {
                leVar7 = C55244le.f145466h;
            }
            C55243ld ldVar3 = (C55243ld) leVar7.toBuilder();
            C55244le leVar8 = nlVar.f145696f;
            if (leVar8 == null) {
                leVar8 = C55244le.f145466h;
            }
            m176391h(ldVar3, leVar8);
            niVar.copyOnWrite();
            C55305nl nlVar5 = (C55305nl) niVar.instance;
            C55244le leVar9 = (C55244le) ldVar3.build();
            leVar9.getClass();
            nlVar5.f145696f = leVar9;
            nlVar5.f145691a |= 4;
        }
        if (!(niVar == null || nlVar == null || (nlVar.f145691a & 8) == 0)) {
            C55244le leVar10 = ((C55305nl) niVar.instance).f145697g;
            if (leVar10 == null) {
                leVar10 = C55244le.f145466h;
            }
            C55243ld ldVar4 = (C55243ld) leVar10.toBuilder();
            C55244le leVar11 = nlVar.f145697g;
            if (leVar11 == null) {
                leVar11 = C55244le.f145466h;
            }
            m176391h(ldVar4, leVar11);
            niVar.copyOnWrite();
            C55305nl nlVar6 = (C55305nl) niVar.instance;
            C55244le leVar12 = (C55244le) ldVar4.build();
            leVar12.getClass();
            nlVar6.f145697g = leVar12;
            nlVar6.f145691a |= 8;
        }
        if (!(niVar == null || nlVar == null || (nlVar.f145691a & 64) == 0)) {
            String str = nlVar.f145699i;
            niVar.copyOnWrite();
            C55305nl nlVar7 = (C55305nl) niVar.instance;
            str.getClass();
            nlVar7.f145691a |= 64;
            nlVar7.f145699i = str;
        }
        if (!(niVar == null || nlVar == null || (nlVar.f145691a & 4096) == 0)) {
            String str2 = nlVar.f145705o;
            niVar.copyOnWrite();
            C55305nl nlVar8 = (C55305nl) niVar.instance;
            str2.getClass();
            nlVar8.f145691a |= 4096;
            nlVar8.f145705o = str2;
        }
        if (!(niVar == null || nlVar == null || (nlVar.f145691a & 512) == 0)) {
            String str3 = nlVar.f145701k;
            niVar.copyOnWrite();
            C55305nl nlVar9 = (C55305nl) niVar.instance;
            str3.getClass();
            nlVar9.f145691a |= 512;
            nlVar9.f145701k = str3;
        }
        if (!(niVar == null || nlVar == null || (nlVar.f145691a & 256) == 0)) {
            C55136he heVar = nlVar.f145700j;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            niVar.copyOnWrite();
            C55305nl nlVar10 = (C55305nl) niVar.instance;
            heVar.getClass();
            nlVar10.f145700j = heVar;
            nlVar10.f145691a |= 256;
        }
        if (niVar != null && nlVar != null && (nlVar.f145691a & 2048) != 0) {
            C55136he heVar2 = nlVar.f145702l;
            if (heVar2 == null) {
                heVar2 = C55136he.f145130j;
            }
            niVar.copyOnWrite();
            C55305nl nlVar11 = (C55305nl) niVar.instance;
            heVar2.getClass();
            nlVar11.f145702l = heVar2;
            nlVar11.f145691a |= 2048;
        }
    }

    /* renamed from: i */
    static void m176392i(C55211jz jzVar, C55213ka kaVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        if (jzVar == null && kaVar == null) {
            C56377j jVar = C56377j.f150344a;
            throw null;
        }
        jzVar.mo58884l(C56377j.f150345b);
        if (!(jzVar == null || kaVar == null || (kaVar.f145358a & 2) == 0)) {
            String str = kaVar.f145360c;
            jzVar.copyOnWrite();
            C55213ka kaVar2 = (C55213ka) jzVar.instance;
            str.getClass();
            kaVar2.f145358a |= 2;
            kaVar2.f145360c = str;
        }
        if (!(jzVar == null || kaVar == null || (kaVar.f145358a & 32) == 0)) {
            int i = kaVar.f145363f;
            jzVar.copyOnWrite();
            C55213ka kaVar3 = (C55213ka) jzVar.instance;
            kaVar3.f145358a |= 32;
            kaVar3.f145363f = i;
        }
        if (!(jzVar == null || kaVar == null || (kaVar.f145358a & 4) == 0)) {
            C55136he heVar = kaVar.f145361d;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            jzVar.copyOnWrite();
            C55213ka kaVar4 = (C55213ka) jzVar.instance;
            heVar.getClass();
            kaVar4.f145361d = heVar;
            kaVar4.f145358a |= 4;
        }
        if (!(jzVar == null || kaVar == null)) {
            C62940bt r1 = C62942bv.checkIsLite(C55290mx.f145636f);
            kaVar.mo58887l(r1);
            if (kaVar.f169962ag.mo58857o(r1.f169971d)) {
                C55287mu muVar = (C55287mu) ((C55290mx) jzVar.mo58881i(C55290mx.f145636f)).toBuilder();
                C62940bt r2 = C62942bv.checkIsLite(C55290mx.f145636f);
                kaVar.mo58887l(r2);
                Object l = kaVar.f169962ag.mo58854l(r2.f169971d);
                if (l == null) {
                    obj9 = r2.f169969b;
                } else {
                    obj9 = r2.mo58889c(l);
                }
                C55290mx mxVar = (C55290mx) obj9;
                if (!(muVar == null || mxVar == null || (mxVar.f145638a & 1) == 0)) {
                    String str2 = mxVar.f145639b;
                    muVar.copyOnWrite();
                    C55290mx mxVar2 = (C55290mx) muVar.instance;
                    str2.getClass();
                    mxVar2.f145638a |= 1;
                    mxVar2.f145639b = str2;
                }
                if (!(muVar == null || mxVar == null || (mxVar.f145638a & 2) == 0)) {
                    int a = C55289mw.m87654a(mxVar.f145640c);
                    if (a == 0) {
                        a = 1;
                    }
                    muVar.copyOnWrite();
                    C55290mx mxVar3 = (C55290mx) muVar.instance;
                    mxVar3.f145640c = a - 1;
                    mxVar3.f145638a |= 2;
                }
                if (!(muVar == null || mxVar == null || mxVar.f145641d.size() <= 0)) {
                    muVar.copyOnWrite();
                    ((C55290mx) muVar.instance).f145641d = C55290mx.emptyProtobufList();
                    C62971cq cqVar = mxVar.f145641d;
                    muVar.copyOnWrite();
                    C55290mx mxVar4 = (C55290mx) muVar.instance;
                    mxVar4.mo54232a();
                    C62947c.addAll((Iterable) cqVar, (List) mxVar4.f145641d);
                }
                jzVar.mo58885m(C55290mx.f145636f, (C55290mx) muVar.build());
            }
        }
        if (!(jzVar == null || kaVar == null)) {
            C62940bt r22 = C62942bv.checkIsLite(C55235kw.f145427j);
            kaVar.mo58887l(r22);
            if (kaVar.f169962ag.mo58857o(r22.f169971d)) {
                C55234kv kvVar = (C55234kv) ((C55235kw) jzVar.mo58881i(C55235kw.f145427j)).toBuilder();
                C62940bt r3 = C62942bv.checkIsLite(C55235kw.f145427j);
                kaVar.mo58887l(r3);
                Object l2 = kaVar.f169962ag.mo58854l(r3.f169971d);
                if (l2 == null) {
                    obj7 = r3.f169969b;
                } else {
                    obj7 = r3.mo58889c(l2);
                }
                C55235kw kwVar = (C55235kw) obj7;
                if (!(kvVar == null || kwVar == null)) {
                    for (int i2 = 0; i2 < ((C55235kw) kvVar.instance).f145431c.size(); i2++) {
                        Iterator it = kwVar.f145431c.iterator();
                        if (it.hasNext()) {
                            C55247lh lhVar = (C55247lh) it.next();
                            C55246lg lgVar = (C55246lg) kvVar.mo54209a(i2).toBuilder();
                            if (lgVar == null) {
                                lhVar.getClass();
                            }
                            lgVar.mo58884l(C56377j.f150346c);
                            if (!(lgVar == null || lhVar == null || (lhVar.f145479a & 1) == 0)) {
                                String str3 = lhVar.f145480b;
                                lgVar.copyOnWrite();
                                C55247lh lhVar2 = (C55247lh) lgVar.instance;
                                str3.getClass();
                                lhVar2.f145479a |= 1;
                                lhVar2.f145480b = str3;
                            }
                            if (!(lgVar == null || lhVar == null || (lhVar.f145479a & 4) == 0)) {
                                String str4 = lhVar.f145481c;
                                lgVar.copyOnWrite();
                                C55247lh lhVar3 = (C55247lh) lgVar.instance;
                                str4.getClass();
                                lhVar3.f145479a |= 4;
                                lhVar3.f145481c = str4;
                            }
                            if (!(lgVar == null || lhVar == null || (lhVar.f145479a & 16) == 0)) {
                                String str5 = lhVar.f145482d;
                                lgVar.copyOnWrite();
                                C55247lh lhVar4 = (C55247lh) lgVar.instance;
                                str5.getClass();
                                lhVar4.f145479a |= 16;
                                lhVar4.f145482d = str5;
                            }
                            if (!(lgVar == null || lhVar == null || (lhVar.f145479a & 128) == 0)) {
                                String str6 = lhVar.f145485g;
                                lgVar.copyOnWrite();
                                C55247lh lhVar5 = (C55247lh) lgVar.instance;
                                str6.getClass();
                                lhVar5.f145479a |= 128;
                                lhVar5.f145485g = str6;
                            }
                            if (!(lgVar == null || lhVar == null || (lhVar.f145479a & 512) == 0)) {
                                C55136he heVar2 = lhVar.f145487j;
                                if (heVar2 == null) {
                                    heVar2 = C55136he.f145130j;
                                }
                                lgVar.copyOnWrite();
                                C55247lh lhVar6 = (C55247lh) lgVar.instance;
                                heVar2.getClass();
                                lhVar6.f145487j = heVar2;
                                lhVar6.f145479a |= 512;
                            }
                            kvVar.copyOnWrite();
                            C55235kw kwVar2 = (C55235kw) kvVar.instance;
                            C55247lh lhVar7 = (C55247lh) lgVar.build();
                            lhVar7.getClass();
                            kwVar2.mo54213a();
                            kwVar2.f145431c.set(i2, lhVar7);
                        }
                    }
                }
                if (!(kvVar == null || kwVar == null)) {
                    for (int i3 = 0; i3 < ((C55235kw) kvVar.instance).f145434f.size(); i3++) {
                        Iterator it2 = kwVar.f145434f.iterator();
                        if (it2.hasNext()) {
                            C55029df dfVar = (C55029df) it2.next();
                            C55028de deVar = (C55028de) kvVar.mo54210b(i3).toBuilder();
                            if (!(deVar == null || dfVar == null)) {
                                C62940bt r7 = C62942bv.checkIsLite(C55035dl.f144791g);
                                dfVar.mo58887l(r7);
                                if (dfVar.f169962ag.mo58857o(r7.f169971d)) {
                                    C55030dg dgVar = (C55030dg) ((C55035dl) deVar.mo58881i(C55035dl.f144791g)).toBuilder();
                                    C62940bt r8 = C62942bv.checkIsLite(C55035dl.f144791g);
                                    dfVar.mo58887l(r8);
                                    Object l3 = dfVar.f169962ag.mo58854l(r8.f169971d);
                                    if (l3 == null) {
                                        obj8 = r8.f169969b;
                                    } else {
                                        obj8 = r8.mo58889c(l3);
                                    }
                                    C55035dl dlVar = (C55035dl) obj8;
                                    if (!(dgVar == null || dlVar == null)) {
                                        for (int i4 = 0; i4 < ((C55035dl) dgVar.instance).f144796d.size(); i4++) {
                                            Iterator it3 = dlVar.f144796d.iterator();
                                            if (it3.hasNext()) {
                                                C55032di diVar = (C55032di) it3.next();
                                                C55031dh dhVar = (C55031dh) dgVar.mo54170a(i4).toBuilder();
                                                if (dhVar == null) {
                                                    diVar.getClass();
                                                }
                                                dhVar.mo58884l(C56377j.f150352i);
                                                if (!(dhVar == null || diVar == null || (diVar.f144779a & 256) == 0)) {
                                                    C55136he heVar3 = diVar.f144787i;
                                                    if (heVar3 == null) {
                                                        heVar3 = C55136he.f145130j;
                                                    }
                                                    dhVar.copyOnWrite();
                                                    C55032di diVar2 = (C55032di) dhVar.instance;
                                                    heVar3.getClass();
                                                    diVar2.f144787i = heVar3;
                                                    diVar2.f144779a |= 256;
                                                }
                                                dgVar.mo54172c(i4, dhVar);
                                            }
                                        }
                                    }
                                    deVar.mo58885m(C55035dl.f144791g, (C55035dl) dgVar.build());
                                }
                            }
                            kvVar.copyOnWrite();
                            C55235kw kwVar3 = (C55235kw) kvVar.instance;
                            C55029df dfVar2 = (C55029df) deVar.build();
                            dfVar2.getClass();
                            kwVar3.mo54214b();
                            kwVar3.f145434f.set(i3, dfVar2);
                        }
                    }
                }
                if (!(kvVar == null || kwVar == null || (kwVar.f145429a & 16) == 0)) {
                    String str7 = kwVar.f145436h;
                    kvVar.copyOnWrite();
                    C55235kw kwVar4 = (C55235kw) kvVar.instance;
                    str7.getClass();
                    kwVar4.f145429a |= 16;
                    kwVar4.f145436h = str7;
                }
                jzVar.mo58885m(C55235kw.f145427j, (C55235kw) kvVar.build());
            }
        }
        if (!(jzVar == null || kaVar == null)) {
            C62940bt r23 = C62942bv.checkIsLite(C55225km.f145401f);
            kaVar.mo58887l(r23);
            if (kaVar.f169962ag.mo58857o(r23.f169971d)) {
                C55222kj kjVar = (C55222kj) ((C55225km) jzVar.mo58881i(C55225km.f145401f)).toBuilder();
                C62940bt r32 = C62942bv.checkIsLite(C55225km.f145401f);
                kaVar.mo58887l(r32);
                Object l4 = kaVar.f169962ag.mo58854l(r32.f169971d);
                if (l4 == null) {
                    obj6 = r32.f169969b;
                } else {
                    obj6 = r32.mo58889c(l4);
                }
                C55225km kmVar = (C55225km) obj6;
                if (!(kjVar == null || kmVar == null || (kmVar.f145403a & 2) == 0)) {
                    C55224kl klVar = ((C55225km) kjVar.instance).f145405c;
                    if (klVar == null) {
                        klVar = C55224kl.f145394d;
                    }
                    C55223kk kkVar = (C55223kk) klVar.toBuilder();
                    C55224kl klVar2 = kmVar.f145405c;
                    if (klVar2 == null) {
                        klVar2 = C55224kl.f145394d;
                    }
                    m176393j(kkVar, klVar2);
                    kjVar.copyOnWrite();
                    C55225km kmVar2 = (C55225km) kjVar.instance;
                    C55224kl klVar3 = (C55224kl) kkVar.build();
                    klVar3.getClass();
                    kmVar2.f145405c = klVar3;
                    kmVar2.f145403a |= 2;
                }
                if (!(kjVar == null || kmVar == null)) {
                    for (int i5 = 0; i5 < ((C55225km) kjVar.instance).f145406d.size(); i5++) {
                        Iterator it4 = kmVar.f145406d.iterator();
                        if (it4.hasNext()) {
                            C55223kk kkVar2 = (C55223kk) kjVar.mo54207a(i5).toBuilder();
                            m176393j(kkVar2, (C55224kl) it4.next());
                            kjVar.copyOnWrite();
                            C55225km kmVar3 = (C55225km) kjVar.instance;
                            C55224kl klVar4 = (C55224kl) kkVar2.build();
                            klVar4.getClass();
                            kmVar3.mo54208a();
                            kmVar3.f145406d.set(i5, klVar4);
                        }
                    }
                }
                jzVar.mo58885m(C55225km.f145401f, (C55225km) kjVar.build());
            }
        }
        if (!(jzVar == null || kaVar == null)) {
            C62940bt r24 = C62942bv.checkIsLite(C55297nd.f145671g);
            kaVar.mo58887l(r24);
            if (kaVar.f169962ag.mo58857o(r24.f169971d)) {
                C55294na naVar = (C55294na) ((C55297nd) jzVar.mo58881i(C55297nd.f145671g)).toBuilder();
                C62940bt r33 = C62942bv.checkIsLite(C55297nd.f145671g);
                kaVar.mo58887l(r33);
                Object l5 = kaVar.f169962ag.mo58854l(r33.f169971d);
                if (l5 == null) {
                    obj5 = r33.f169969b;
                } else {
                    obj5 = r33.mo58889c(l5);
                }
                C55297nd ndVar = (C55297nd) obj5;
                if (!(naVar == null || ndVar == null || (ndVar.f145673a & 1) == 0)) {
                    C55296nc ncVar = ((C55297nd) naVar.instance).f145674b;
                    if (ncVar == null) {
                        ncVar = C55296nc.f145663e;
                    }
                    C55295nb nbVar = (C55295nb) ncVar.toBuilder();
                    C55296nc ncVar2 = ndVar.f145674b;
                    if (ncVar2 == null) {
                        ncVar2 = C55296nc.f145663e;
                    }
                    m176395l(nbVar, ncVar2);
                    naVar.copyOnWrite();
                    C55297nd ndVar2 = (C55297nd) naVar.instance;
                    C55296nc ncVar3 = (C55296nc) nbVar.build();
                    ncVar3.getClass();
                    ndVar2.f145674b = ncVar3;
                    ndVar2.f145673a |= 1;
                }
                if (!(naVar == null || ndVar == null)) {
                    for (int i6 = 0; i6 < ((C55297nd) naVar.instance).f145675c.size(); i6++) {
                        Iterator it5 = ndVar.f145675c.iterator();
                        if (it5.hasNext()) {
                            C55295nb nbVar2 = (C55295nb) naVar.mo54233a(i6).toBuilder();
                            m176395l(nbVar2, (C55296nc) it5.next());
                            naVar.copyOnWrite();
                            C55297nd ndVar3 = (C55297nd) naVar.instance;
                            C55296nc ncVar4 = (C55296nc) nbVar2.build();
                            ncVar4.getClass();
                            ndVar3.mo54234a();
                            ndVar3.f145675c.set(i6, ncVar4);
                        }
                    }
                }
                jzVar.mo58885m(C55297nd.f145671g, (C55297nd) naVar.build());
            }
        }
        if (!(jzVar == null || kaVar == null)) {
            C62940bt r25 = C62942bv.checkIsLite(C55251ll.f145500f);
            kaVar.mo58887l(r25);
            if (kaVar.f169962ag.mo58857o(r25.f169971d)) {
                C55248li liVar = (C55248li) ((C55251ll) jzVar.mo58881i(C55251ll.f145500f)).toBuilder();
                C62940bt r34 = C62942bv.checkIsLite(C55251ll.f145500f);
                kaVar.mo58887l(r34);
                Object l6 = kaVar.f169962ag.mo58854l(r34.f169971d);
                if (l6 == null) {
                    obj4 = r34.f169969b;
                } else {
                    obj4 = r34.mo58889c(l6);
                }
                C55251ll llVar = (C55251ll) obj4;
                if (!(liVar == null || llVar == null)) {
                    for (int i7 = 0; i7 < ((C55251ll) liVar.instance).f145503b.size(); i7++) {
                        Iterator it6 = llVar.f145503b.iterator();
                        if (it6.hasNext()) {
                            C55250lk lkVar = (C55250lk) it6.next();
                            C55249lj ljVar = (C55249lj) liVar.mo54219a(i7).toBuilder();
                            if (ljVar == null) {
                                lkVar.getClass();
                            }
                            ljVar.mo58884l(C56377j.f150349f);
                            if (!(ljVar == null || lkVar == null || (lkVar.f145491a & 1) == 0)) {
                                String str8 = lkVar.f145492b;
                                ljVar.copyOnWrite();
                                C55250lk lkVar2 = (C55250lk) ljVar.instance;
                                str8.getClass();
                                lkVar2.f145491a |= 1;
                                lkVar2.f145492b = str8;
                            }
                            if (!(ljVar == null || lkVar == null || (lkVar.f145491a & 4) == 0)) {
                                C55136he heVar4 = lkVar.f145493c;
                                if (heVar4 == null) {
                                    heVar4 = C55136he.f145130j;
                                }
                                ljVar.copyOnWrite();
                                C55250lk lkVar3 = (C55250lk) ljVar.instance;
                                heVar4.getClass();
                                lkVar3.f145493c = heVar4;
                                lkVar3.f145491a |= 4;
                            }
                            liVar.copyOnWrite();
                            C55251ll llVar2 = (C55251ll) liVar.instance;
                            C55250lk lkVar4 = (C55250lk) ljVar.build();
                            lkVar4.getClass();
                            llVar2.mo54220a();
                            llVar2.f145503b.set(i7, lkVar4);
                        }
                    }
                }
                jzVar.mo58885m(C55251ll.f145500f, (C55251ll) liVar.build());
            }
        }
        if (!(jzVar == null || kaVar == null)) {
            C62940bt r0 = C62942bv.checkIsLite(C55233ku.f145422d);
            kaVar.mo58887l(r0);
            if (kaVar.f169962ag.mo58857o(r0.f169971d)) {
                C55232kt ktVar = (C55232kt) ((C55233ku) jzVar.mo58881i(C55233ku.f145422d)).toBuilder();
                C62940bt r12 = C62942bv.checkIsLite(C55233ku.f145422d);
                kaVar.mo58887l(r12);
                Object l7 = kaVar.f169962ag.mo58854l(r12.f169971d);
                if (l7 == null) {
                    obj3 = r12.f169969b;
                } else {
                    obj3 = r12.mo58889c(l7);
                }
                C55233ku kuVar = (C55233ku) obj3;
                if (!(ktVar == null || kuVar == null || (kuVar.f145424a & 16) == 0)) {
                    String str9 = kuVar.f145425b;
                    ktVar.copyOnWrite();
                    C55233ku kuVar2 = (C55233ku) ktVar.instance;
                    str9.getClass();
                    kuVar2.f145424a |= 16;
                    kuVar2.f145425b = str9;
                }
                jzVar.mo58885m(C55233ku.f145422d, (C55233ku) ktVar.build());
            }
        }
        if (!(jzVar == null || kaVar == null)) {
            C62940bt r02 = C62942bv.checkIsLite(C55257lr.f145522d);
            kaVar.mo58887l(r02);
            if (kaVar.f169962ag.mo58857o(r02.f169971d)) {
                C55256lq lqVar = (C55256lq) ((C55257lr) jzVar.mo58881i(C55257lr.f145522d)).toBuilder();
                C62940bt r13 = C62942bv.checkIsLite(C55257lr.f145522d);
                kaVar.mo58887l(r13);
                Object l8 = kaVar.f169962ag.mo58854l(r13.f169971d);
                if (l8 == null) {
                    obj2 = r13.f169969b;
                } else {
                    obj2 = r13.mo58889c(l8);
                }
                C55257lr lrVar = (C55257lr) obj2;
                if (!(lqVar == null || lrVar == null || (lrVar.f145524a & 8) == 0)) {
                    String str10 = lrVar.f145525b;
                    lqVar.copyOnWrite();
                    C55257lr lrVar2 = (C55257lr) lqVar.instance;
                    str10.getClass();
                    lrVar2.f145524a |= 8;
                    lrVar2.f145525b = str10;
                }
                jzVar.mo58885m(C55257lr.f145522d, (C55257lr) lqVar.build());
            }
        }
        if (jzVar != null && kaVar != null) {
            C62940bt r03 = C62942bv.checkIsLite(C55259lt.f145527g);
            kaVar.mo58887l(r03);
            if (kaVar.f169962ag.mo58857o(r03.f169971d)) {
                C55258ls lsVar = (C55258ls) ((C55259lt) jzVar.mo58881i(C55259lt.f145527g)).toBuilder();
                C62940bt r14 = C62942bv.checkIsLite(C55259lt.f145527g);
                kaVar.mo58887l(r14);
                Object l9 = kaVar.f169962ag.mo58854l(r14.f169971d);
                if (l9 == null) {
                    obj = r14.f169969b;
                } else {
                    obj = r14.mo58889c(l9);
                }
                C55259lt ltVar = (C55259lt) obj;
                if (!(lsVar == null || ltVar == null || (ltVar.f145529a & 2) == 0)) {
                    C55136he heVar5 = ltVar.f145532d;
                    if (heVar5 == null) {
                        heVar5 = C55136he.f145130j;
                    }
                    lsVar.copyOnWrite();
                    C55259lt ltVar2 = (C55259lt) lsVar.instance;
                    heVar5.getClass();
                    ltVar2.f145532d = heVar5;
                    ltVar2.f145529a |= 2;
                }
                if (!(lsVar == null || ltVar == null || (ltVar.f145529a & 4) == 0)) {
                    int i8 = ltVar.f145533e;
                    lsVar.copyOnWrite();
                    C55259lt ltVar3 = (C55259lt) lsVar.instance;
                    ltVar3.f145529a |= 4;
                    ltVar3.f145533e = i8;
                }
                jzVar.mo58885m(C55259lt.f145527g, (C55259lt) lsVar.build());
            }
        }
    }
}
