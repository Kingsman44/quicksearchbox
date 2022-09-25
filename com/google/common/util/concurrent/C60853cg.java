package com.google.common.util.concurrent;

import p3186j$.util.Objects;

/* renamed from: com.google.common.util.concurrent.cg */
/* compiled from: PG */
public final class C60853cg extends C60873d {

    /* renamed from: a */
    private C60854ch f164941a;

    public C60853cg(C60854ch chVar) {
        this.f164941a = chVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        this.f164941a = null;
    }

    public final boolean cancel(boolean z) {
        C60854ch chVar = this.f164941a;
        if (!super.cancel(z)) {
            return false;
        }
        C60854ch chVar2 = (C60854ch) Objects.requireNonNull(chVar);
        chVar2.f164942a = true;
        if (!z) {
            chVar2.f164943b = false;
        }
        chVar2.mo57337a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        C60854ch chVar = this.f164941a;
        if (chVar == null) {
            return null;
        }
        return "inputCount=[" + chVar.f164945d.length + "], remaining=[" + chVar.f164944c.get() + "]";
    }
}
