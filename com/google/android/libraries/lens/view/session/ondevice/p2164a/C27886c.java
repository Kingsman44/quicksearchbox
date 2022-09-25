package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.c */
/* compiled from: PG */
final class C27886c extends C27850ag {

    /* renamed from: a */
    public final C56280cg f75993a;

    /* renamed from: b */
    public final boolean f75994b;

    public C27886c(C56280cg cgVar, boolean z) {
        if (cgVar != null) {
            this.f75993a = cgVar;
            this.f75994b = z;
            return;
        }
        throw new NullPointerException("Null filters");
    }

    /* renamed from: a */
    public final C56280cg mo33328a() {
        return this.f75993a;
    }

    /* renamed from: b */
    public final boolean mo33329b() {
        return this.f75994b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27850ag) {
            C27850ag agVar = (C27850ag) obj;
            return this.f75993a.equals(agVar.mo33328a()) && this.f75994b == agVar.mo33329b();
        }
    }

    public final int hashCode() {
        return ((this.f75993a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f75994b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f75993a.toString();
        boolean z = this.f75994b;
        return "Context{filters=" + obj + ", isConnected=" + z + "}";
    }
}
