package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.libraries.logging.C28292j;
import com.google.common.p4552o.C60321oe;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.z */
/* compiled from: PG */
public final class C78571z extends C78525ah {

    /* renamed from: a */
    private final C28292j f216329a;

    /* renamed from: b */
    private final C60321oe f216330b;

    public C78571z(C28292j jVar, C60321oe oeVar) {
        this.f216329a = jVar;
        if (oeVar != null) {
            this.f216330b = oeVar;
            return;
        }
        throw new NullPointerException("Null impressionVeProto");
    }

    /* renamed from: a */
    public final C28292j mo73456a() {
        return this.f216329a;
    }

    /* renamed from: b */
    public final C60321oe mo73457b() {
        return this.f216330b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78525ah) {
            C78525ah ahVar = (C78525ah) obj;
            return this.f216329a.equals(ahVar.mo73456a()) && this.f216330b.equals(ahVar.mo73457b());
        }
    }

    public final int hashCode() {
        return ((this.f216329a.hashCode() ^ 1000003) * 1000003) ^ this.f216330b.hashCode();
    }

    public final String toString() {
        String obj = this.f216329a.toString();
        String obj2 = this.f216330b.toString();
        return "VeData{ve=" + obj + ", impressionVeProto=" + obj2 + "}";
    }
}
