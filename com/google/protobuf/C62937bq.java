package com.google.protobuf;

/* renamed from: com.google.protobuf.bq */
/* compiled from: PG */
public abstract class C62937bq extends C62942bv implements C62938br {

    /* renamed from: ag */
    public C62926bf f169962ag = C62926bf.f169887a;

    /* renamed from: i */
    public final Object mo58881i(C62917ay ayVar) {
        C62940bt r3 = C62942bv.checkIsLite(ayVar);
        mo58887l(r3);
        Object l = this.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            return r3.f169969b;
        }
        return r3.mo58889c(l);
    }

    /* renamed from: j */
    public final boolean mo58882j(C62917ay ayVar) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C62926bf mo58886k() {
        C62926bf bfVar = this.f169962ag;
        if (bfVar.f169889c) {
            this.f169962ag = bfVar.clone();
        }
        return this.f169962ag;
    }

    /* renamed from: l */
    public final void mo58887l(C62940bt btVar) {
        if (btVar.f169968a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
