package com.google.android.libraries.search.assistant.p2705n;

import com.google.android.libraries.search.assistant.p2705n.p2708b.C34833a;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62939bs;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62957cd;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.n.a */
/* compiled from: PG */
public abstract class C34819a {
    /* renamed from: b */
    public static C34819a m63579b(C34834b bVar) {
        Object obj;
        C34833a aVar = (C34833a) C34834b.f92401c.createBuilder();
        int i = bVar.f92404b;
        aVar.copyOnWrite();
        C34834b bVar2 = (C34834b) aVar.instance;
        bVar2.f92403a |= 1;
        bVar2.f92404b = i;
        C62940bt c = C62921ba.m95368a().mo58830c(C34834b.f92401c, bVar.f92404b);
        if (c != null && m63581f(c)) {
            C62940bt r2 = C62942bv.checkIsLite(c);
            bVar.mo58887l(r2);
            Object l = bVar.f169962ag.mo58854l(r2.f169971d);
            if (l == null) {
                obj = r2.f169969b;
            } else {
                obj = r2.mo58889c(l);
            }
            aVar.mo58885m(c, obj);
        }
        return new C34836d((C34834b) aVar.build());
    }

    /* renamed from: c */
    public static C34819a m63580c(C62917ay ayVar, C62957cd cdVar) {
        C58838bb.m90868c(m63581f(ayVar));
        C34833a aVar = (C34833a) C34834b.f92401c.createBuilder();
        int i = ((C62940bt) ayVar).f169971d.f169964b;
        aVar.copyOnWrite();
        C34834b bVar = (C34834b) aVar.instance;
        bVar.f92403a |= 1;
        bVar.f92404b = i;
        aVar.mo58885m(ayVar, cdVar);
        return new C34836d((C34834b) aVar.build());
    }

    /* renamed from: f */
    private static boolean m63581f(C62917ay ayVar) {
        C62939bs bsVar = ((C62940bt) ayVar).f169971d;
        return !bsVar.f169966d && bsVar.f169965c == C63066gd.ENUM;
    }

    /* renamed from: a */
    public final int mo39520a() {
        Object obj;
        C62940bt c = C62921ba.m95368a().mo58830c(C34834b.f92401c, mo39521d().f92404b);
        if (c == null || !m63581f(c)) {
            return 0;
        }
        C34834b d = mo39521d();
        C62940bt r0 = C62942bv.checkIsLite(c);
        d.mo58887l(r0);
        Object l = d.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C62957cd cdVar = (C62957cd) obj;
        cdVar.getClass();
        return cdVar.getNumber();
    }

    /* renamed from: d */
    public abstract C34834b mo39521d();

    /* renamed from: e */
    public final String mo39522e() {
        int i = mo39521d().f92404b;
        return "apa-" + i;
    }
}
