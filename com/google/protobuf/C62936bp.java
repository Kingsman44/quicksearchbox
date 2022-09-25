package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.protobuf.bp */
/* compiled from: PG */
public class C62936bp extends C62934bn implements C62938br {
    protected C62936bp(C62937bq bqVar) {
        super(bqVar);
    }

    /* renamed from: a */
    private final C62926bf mo16967a() {
        C62926bf bfVar = ((C62937bq) this.instance).f169962ag;
        if (!bfVar.f169889c) {
            return bfVar;
        }
        C62926bf d = bfVar.clone();
        ((C62937bq) this.instance).f169962ag = d;
        return d;
    }

    /* renamed from: b */
    private final void m95430b(C62940bt btVar) {
        if (btVar.f169968a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    /* access modifiers changed from: protected */
    public final void copyOnWriteInternal() {
        super.copyOnWriteInternal();
        C62937bq bqVar = (C62937bq) this.instance;
        bqVar.f169962ag = bqVar.f169962ag.clone();
    }

    /* renamed from: h */
    public final C62937bq buildPartial() {
        if (this.isBuilt) {
            return (C62937bq) this.instance;
        }
        ((C62937bq) this.instance).f169962ag.mo58849f();
        return (C62937bq) super.buildPartial();
    }

    /* renamed from: i */
    public final Object mo58881i(C62917ay ayVar) {
        C62937bq bqVar = (C62937bq) this.instance;
        C62940bt r3 = C62942bv.checkIsLite(ayVar);
        bqVar.mo58887l(r3);
        Object l = bqVar.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            return r3.f169969b;
        }
        return r3.mo58889c(l);
    }

    /* renamed from: j */
    public final boolean mo58882j(C62917ay ayVar) {
        C62937bq bqVar = (C62937bq) this.instance;
        C62940bt r2 = C62942bv.checkIsLite(ayVar);
        bqVar.mo58887l(r2);
        return bqVar.f169962ag.mo58857o(r2.f169971d);
    }

    /* renamed from: k */
    public final void mo58883k(C62917ay ayVar, Object obj) {
        C62940bt r3 = C62942bv.checkIsLite(ayVar);
        m95430b(r3);
        copyOnWrite();
        mo16967a().mo58855m(r3.f169971d, r3.mo58891e(obj));
    }

    /* renamed from: l */
    public final void mo58884l(C62917ay ayVar) {
        C62940bt r3 = C62942bv.checkIsLite(ayVar);
        m95430b(r3);
        copyOnWrite();
        C62926bf a = mo16967a();
        a.f169888b.remove(r3.f169971d);
        if (a.f169888b.isEmpty()) {
            a.f169890d = false;
        }
    }

    /* renamed from: m */
    public final void mo58885m(C62917ay ayVar, Object obj) {
        C62940bt r5 = C62942bv.checkIsLite(ayVar);
        m95430b(r5);
        copyOnWrite();
        C62926bf a = mo16967a();
        C62939bs bsVar = r5.f169971d;
        if (!bsVar.f169966d) {
            obj = r5.mo58891e(obj);
        } else if (bsVar.f169965c.f170203s == C63067ge.ENUM) {
            ArrayList arrayList = new ArrayList();
            for (Object e : (List) obj) {
                arrayList.add(r5.mo58891e(e));
            }
            obj = arrayList;
        }
        a.mo58856n(bsVar, obj);
    }
}
