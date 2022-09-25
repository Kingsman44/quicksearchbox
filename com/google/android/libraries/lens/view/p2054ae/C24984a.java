package com.google.android.libraries.lens.view.p2054ae;

import com.google.p4017at.p4056g.p4057a.p4058a.C54002bj;

/* renamed from: com.google.android.libraries.lens.view.ae.a */
/* compiled from: PG */
final class C24984a extends C25027z {

    /* renamed from: a */
    private final C54002bj f68147a;

    /* renamed from: b */
    private final boolean f68148b;

    public C24984a(C54002bj bjVar, boolean z) {
        if (bjVar != null) {
            this.f68147a = bjVar;
            this.f68148b = z;
            return;
        }
        throw new NullPointerException("Null request");
    }

    /* renamed from: a */
    public final C54002bj mo30203a() {
        return this.f68147a;
    }

    /* renamed from: b */
    public final boolean mo30204b() {
        return this.f68148b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25027z) {
            C25027z zVar = (C25027z) obj;
            return this.f68147a.equals(zVar.mo30203a()) && this.f68148b == zVar.mo30204b();
        }
    }

    public final int hashCode() {
        return ((this.f68147a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f68148b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f68147a.toString();
        boolean z = this.f68148b;
        return "QueuedRequest{request=" + obj + ", isInteractionRequest=" + z + "}";
    }
}
