package com.google.frameworks.client.p4624a.p4625a;

import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59090j;
import com.google.common.p4526f.C59095o;
import com.google.common.p4526f.p4528b.C59015aj;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4537i.C59294s;
import com.google.common.p4552o.p4566l.C60109aa;
import com.google.common.p4552o.p4566l.C60110ab;
import com.google.common.p4552o.p4566l.C60115ag;
import com.google.common.p4552o.p4566l.C60120al;
import com.google.common.p4552o.p4566l.C60219s;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.p4552o.p4568n.C60287a;
import com.google.frameworks.client.p4624a.p4625a.p4626a.C61285a;
import com.google.frameworks.client.p4624a.p4629b.C61304a;
import com.google.frameworks.client.p4624a.p4629b.C61305b;
import com.google.frameworks.client.p4624a.p4629b.C61308e;
import com.google.frameworks.client.p4624a.p4629b.C61309f;
import com.google.frameworks.client.p4624a.p4629b.C61310g;
import com.google.frameworks.client.p4624a.p4629b.C61312i;
import com.google.frameworks.client.p4624a.p4629b.C61313j;
import com.google.frameworks.client.p4624a.p4629b.C61315l;
import com.google.frameworks.client.p4624a.p4629b.C61316m;
import com.google.frameworks.client.p4624a.p4629b.C61317n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.nio.charset.Charset;
import java.util.logging.Level;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.frameworks.client.a.a.c */
/* compiled from: PG */
public final class C61302c {

    /* renamed from: a */
    private static final C60220t f165797a;

    /* renamed from: b */
    private static final Charset f165798b = Charset.forName("UTF-8");

    /* renamed from: c */
    private final C61309f f165799c;

    /* renamed from: d */
    private final C61315l f165800d;

    static {
        C60219s sVar = (C60219s) C60220t.f162931e.createBuilder();
        sVar.copyOnWrite();
        C60220t tVar = (C60220t) sVar.instance;
        tVar.f162933a |= 1;
        tVar.f162934b = 0;
        sVar.copyOnWrite();
        C60220t tVar2 = (C60220t) sVar.instance;
        tVar2.f162933a |= 2;
        tVar2.f162935c = 0;
        sVar.copyOnWrite();
        C60220t tVar3 = (C60220t) sVar.instance;
        tVar3.f162933a |= 4;
        tVar3.f162936d = 0;
        f165797a = (C60220t) sVar.build();
    }

    public C61302c(String str, int i, String str2) {
        C61308e eVar = (C61308e) C61309f.f165809e.createBuilder();
        eVar.copyOnWrite();
        C61309f fVar = (C61309f) eVar.instance;
        str.getClass();
        fVar.f165811a |= 2;
        fVar.f165813c = str;
        eVar.copyOnWrite();
        C61309f fVar2 = (C61309f) eVar.instance;
        fVar2.f165811a |= 1;
        fVar2.f165812b = i;
        if (str2 != null) {
            eVar.copyOnWrite();
            C61309f fVar3 = (C61309f) eVar.instance;
            fVar3.f165811a |= 4;
            fVar3.f165814d = str2;
        }
        this.f165799c = (C61309f) eVar.build();
        C61313j jVar = (C61313j) C61315l.f165828c.createBuilder();
        jVar.copyOnWrite();
        C61315l lVar = (C61315l) jVar.instance;
        lVar.f165831b = 0;
        lVar.f165830a |= 1;
        this.f165800d = (C61315l) jVar.build();
    }

    /* renamed from: a */
    public static int m93813a(String str) {
        return C59294s.m92134d().mo56759a(str, f165798b).mo56771a();
    }

    /* renamed from: b */
    public static Object m93814b(C59031f fVar, C58976aa aaVar) {
        return fVar.mo56305h().mo56312d(aaVar);
    }

    /* renamed from: d */
    private final C61310g m93815d(C60110ab abVar, int i, Object... objArr) {
        C61310g gVar = (C61310g) C61312i.f165816i.createBuilder();
        gVar.copyOnWrite();
        C61312i iVar = (C61312i) gVar.instance;
        iVar.f165819b = i - 1;
        iVar.f165818a |= 1;
        C61304a aVar = (C61304a) C61305b.f165801d.createBuilder();
        C61309f fVar = this.f165799c;
        aVar.copyOnWrite();
        C61305b bVar = (C61305b) aVar.instance;
        fVar.getClass();
        bVar.f165804b = fVar;
        bVar.f165803a |= 1;
        C61315l lVar = this.f165800d;
        aVar.copyOnWrite();
        C61305b bVar2 = (C61305b) aVar.instance;
        lVar.getClass();
        bVar2.f165805c = lVar;
        bVar2.f165803a |= 2;
        C61305b bVar3 = (C61305b) aVar.build();
        gVar.copyOnWrite();
        C61312i iVar2 = (C61312i) gVar.instance;
        bVar3.getClass();
        iVar2.f165822e = bVar3;
        iVar2.f165818a |= 16;
        gVar.copyOnWrite();
        C61312i iVar3 = (C61312i) gVar.instance;
        iVar3.f165823f = abVar;
        iVar3.f165818a |= 32;
        if (i == 2) {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                C61301b bVar4 = objArr[i2];
                if (bVar4 != null) {
                    if (!(bVar4 instanceof C61301b)) {
                        C61303d dVar = (C61303d) bVar4.getClass().getAnnotation(C61303d.class);
                        if (dVar != null) {
                            if (dVar.mo57901a() == C61284a.NEW_COLLECTION_USER_DATA) {
                            }
                        }
                    } else if (bVar4.f165795a == C61284a.NEW_COLLECTION_USER_DATA) {
                    }
                    C61316m mVar = (C61316m) C61317n.f165832d.createBuilder();
                    mVar.copyOnWrite();
                    C61317n nVar = (C61317n) mVar.instance;
                    nVar.f165834a |= 1;
                    nVar.f165835b = i2;
                    String obj = bVar4.toString();
                    mVar.copyOnWrite();
                    C61317n nVar2 = (C61317n) mVar.instance;
                    obj.getClass();
                    nVar2.f165834a |= 2;
                    nVar2.f165836c = obj;
                    C61317n nVar3 = (C61317n) mVar.build();
                    gVar.copyOnWrite();
                    C61312i iVar4 = (C61312i) gVar.instance;
                    nVar3.getClass();
                    C62971cq cqVar = iVar4.f165825h;
                    if (!cqVar.mo58948c()) {
                        iVar4.f165825h = C62942bv.mutableCopy(cqVar);
                    }
                    iVar4.f165825h.add(nVar3);
                }
            }
        }
        return gVar;
    }

    /* renamed from: c */
    public final C61310g mo57900c(C59031f fVar, int i, boolean z) {
        String str;
        C60110ab abVar;
        C61310g gVar;
        C71207aq aqVar;
        C59015aj i2 = fVar.mo56306i();
        if (i2 != null) {
            str = i2.f156911b;
        } else {
            Object j = fVar.mo56307j();
            if (j instanceof String) {
                str = (String) j;
            } else {
                str = j != null ? j.getClass().getName() : "null";
            }
        }
        Throwable th = i == 2 ? (Throwable) m93814b(fVar, C59090j.f157047a) : null;
        if (!C58837ba.m90859h(str) || th != null) {
            C59095o e = fVar.mo56304e();
            Level l = fVar.mo56309l();
            String b = e.mo56239b();
            String d = e.mo56241d();
            int a = e.mo56238a();
            C60109aa aaVar = (C60109aa) C60110ab.f162553j.createBuilder();
            C60220t tVar = f165797a;
            aaVar.copyOnWrite();
            C60110ab abVar2 = (C60110ab) aaVar.instance;
            tVar.getClass();
            abVar2.f162556b = tVar;
            abVar2.f162555a |= 1;
            String name = Thread.currentThread().getName();
            aaVar.copyOnWrite();
            C60110ab abVar3 = (C60110ab) aaVar.instance;
            name.getClass();
            abVar3.f162555a |= 2;
            abVar3.f162557c = name;
            int intValue = l.intValue();
            aaVar.copyOnWrite();
            C60110ab abVar4 = (C60110ab) aaVar.instance;
            abVar4.f162555a |= 4;
            abVar4.f162558d = intValue;
            aaVar.copyOnWrite();
            C60110ab abVar5 = (C60110ab) aaVar.instance;
            b.getClass();
            abVar5.f162555a |= 8;
            abVar5.f162559e = b;
            aaVar.copyOnWrite();
            C60110ab abVar6 = (C60110ab) aaVar.instance;
            d.getClass();
            abVar6.f162555a |= 16;
            abVar6.f162560f = d;
            aaVar.copyOnWrite();
            C60110ab abVar7 = (C60110ab) aaVar.instance;
            abVar7.f162555a |= 32;
            abVar7.f162561g = a;
            if (str != null) {
                aaVar.copyOnWrite();
                C60110ab abVar8 = (C60110ab) aaVar.instance;
                abVar8.f162555a |= 256;
                abVar8.f162562h = str;
            }
            if (th != null) {
                C60115ag b2 = C60287a.m92559b(th);
                aaVar.copyOnWrite();
                C60110ab abVar9 = (C60110ab) aaVar.instance;
                C60120al alVar = (C60120al) b2.build();
                alVar.getClass();
                abVar9.f162563i = alVar;
                abVar9.f162555a |= 1024;
            }
            abVar = (C60110ab) aaVar.build();
        } else {
            abVar = null;
        }
        if (abVar == null) {
            return null;
        }
        if (fVar.mo56306i() != null) {
            gVar = m93815d(abVar, i, fVar.mo56302X());
        } else {
            gVar = m93815d(abVar, i, new Object[0]);
        }
        if (i == 2 && z && (aqVar = (C71207aq) m93814b(fVar, C61285a.f165761b)) != null) {
            gVar.copyOnWrite();
            C61312i iVar = (C61312i) gVar.instance;
            C61312i iVar2 = C61312i.f165816i;
            iVar.f165821d = aqVar;
            iVar.f165818a |= 4;
        }
        return gVar;
    }
}
