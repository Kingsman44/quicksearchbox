package com.google.android.libraries.elements.p1714d.p1724f;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.youtube.elements.C66061aw;
import com.google.protos.youtube.elements.C66063ay;
import com.google.protos.youtube.elements.C66124bc;
import com.google.protos.youtube.elements.C66126be;
import com.google.protos.youtube.elements.C66128bg;
import com.google.protos.youtube.elements.C66172cq;
import java.util.concurrent.Callable;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.p5519k.C70115c;

/* renamed from: com.google.android.libraries.elements.d.f.e */
/* compiled from: PG */
public final /* synthetic */ class C21097e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C66061aw f59131a;

    /* renamed from: b */
    public final /* synthetic */ C21232ab f59132b;

    public /* synthetic */ C21097e(C66061aw awVar, C21232ab abVar) {
        this.f59131a = awVar;
        this.f59132b = abVar;
    }

    public final Object call() {
        C66124bc bcVar;
        C66172cq cqVar;
        int i;
        int i2;
        int i3;
        Object obj;
        Object obj2;
        C66061aw awVar = this.f59131a;
        C21232ab abVar = this.f59132b;
        C66128bg bgVar = awVar.f179653c;
        if (bgVar == null) {
            bgVar = C66128bg.f179829a;
        }
        C21279bv d = C21279bv.m40120d(bgVar);
        if ((awVar.f179651a & 16) == 0) {
            return new C70115c(d);
        }
        C66063ay ayVar = awVar.f179654d;
        if (ayVar == null) {
            ayVar = C66063ay.f179656a;
        }
        C62940bt r3 = C62942bv.checkIsLite(C66124bc.f179819d);
        ayVar.mo58887l(r3);
        if (ayVar.f169962ag.mo58857o(r3.f169971d)) {
            C62940bt r32 = C62942bv.checkIsLite(C66124bc.f179819d);
            ayVar.mo58887l(r32);
            Object l = ayVar.f169962ag.mo58854l(r32.f169971d);
            if (l == null) {
                obj2 = r32.f169969b;
            } else {
                obj2 = r32.mo58889c(l);
            }
            bcVar = (C66124bc) obj2;
        } else {
            bcVar = null;
        }
        C62940bt r5 = C62942bv.checkIsLite(C66172cq.f179942d);
        ayVar.mo58887l(r5);
        if (ayVar.f169962ag.mo58857o(r5.f169971d)) {
            C62940bt r52 = C62942bv.checkIsLite(C66172cq.f179942d);
            ayVar.mo58887l(r52);
            Object l2 = ayVar.f169962ag.mo58854l(r52.f169971d);
            if (l2 == null) {
                obj = r52.f169969b;
            } else {
                obj = r52.mo58889c(l2);
            }
            cqVar = (C66172cq) obj;
        } else {
            cqVar = null;
        }
        if (bcVar == null && cqVar == null) {
            return new C70115c(d);
        }
        if (bcVar == null || cqVar == null || (i2 = bcVar.f179822b) == (i3 = cqVar.f179944a)) {
            C58490gz gzVar = new C58490gz(4);
            if (bcVar != null) {
                i = bcVar.f179822b;
                C58490gz gzVar2 = new C58490gz(4);
                for (C66126be beVar : bcVar.f179821a) {
                    if ((beVar.f179826a & 1) != 0) {
                        gzVar2.mo55429h(beVar.f179827b, Integer.valueOf(beVar.f179828c));
                    }
                }
                gzVar.mo55433l(gzVar2.mo55427f(true));
            } else {
                i = 0;
            }
            if (cqVar != null) {
                i = cqVar.f179944a;
                gzVar.mo55433l(C58495hd.m89900n("/environment", Integer.valueOf(cqVar.f179945b)));
            }
            return C21101i.m39636a(C21099g.m39633a(d), i, gzVar.mo55427f(true), abVar, (C70120l) null);
        }
        throw new C21260bc("ComponentType localEntitiesConfig.resultField=" + i2 + ", environmentEntitiesConfig.resultField=" + i3);
    }
}
