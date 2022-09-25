package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.aen */
/* compiled from: PG */
public final class aen extends C62934bn implements C63001dt {
    public aen() {
        super(ahg.f158704D);
    }

    /* renamed from: a */
    public final void mo56977a(agh agh) {
        copyOnWrite();
        ahg ahg = (ahg) this.instance;
        ahg ahg2 = ahg.f158704D;
        agh.getClass();
        C62971cq cqVar = ahg.f158717f;
        if (!cqVar.mo58948c()) {
            ahg.f158717f = C62942bv.mutableCopy(cqVar);
        }
        ahg.f158717f.add(agh);
    }

    /* renamed from: b */
    public final void mo56978b(ahc ahc) {
        copyOnWrite();
        ahg ahg = (ahg) this.instance;
        ahg ahg2 = ahg.f158704D;
        ahc.getClass();
        C62971cq cqVar = ahg.f158715d;
        if (!cqVar.mo58948c()) {
            ahg.f158715d = C62942bv.mutableCopy(cqVar);
        }
        ahg.f158715d.add(ahc);
    }

    /* renamed from: c */
    public final void mo56979c(ahd ahd) {
        copyOnWrite();
        ahg ahg = (ahg) this.instance;
        ahe ahe = (ahe) ahd.build();
        ahg ahg2 = ahg.f158704D;
        ahe.getClass();
        ahg.f158725n = ahe;
        ahg.f158712a |= 2048;
    }

    /* renamed from: d */
    public final void mo56980d(int i) {
        copyOnWrite();
        ahg ahg = (ahg) this.instance;
        ahg ahg2 = ahg.f158704D;
        C62961ch chVar = ahg.f158728q;
        if (!chVar.mo58948c()) {
            ahg.f158728q = C62942bv.mutableCopy(chVar);
        }
        ahg.f158728q.mo58916g(i - 1);
    }

    /* renamed from: e */
    public final void mo56981e(int i) {
        copyOnWrite();
        ahg ahg = (ahg) this.instance;
        ahg ahg2 = ahg.f158704D;
        ahg.f158731t = i - 1;
        ahg.f158712a |= 32768;
    }
}
