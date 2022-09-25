package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.mdi.download.h.b.a */
/* compiled from: PG */
final class C29518a extends C29574u {

    /* renamed from: a */
    private final C28708an f79994a;

    /* renamed from: b */
    private final C58495hd f79995b;

    public C29518a(C28708an anVar, C58495hd hdVar) {
        if (anVar != null) {
            this.f79994a = anVar;
            this.f79995b = hdVar;
            return;
        }
        throw new NullPointerException("Null group");
    }

    /* renamed from: a */
    public final C28708an mo34757a() {
        return this.f79994a;
    }

    /* renamed from: b */
    public final C58495hd mo34758b() {
        return this.f79995b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29574u) {
            C29574u uVar = (C29574u) obj;
            return this.f79994a.equals(uVar.mo34757a()) && C58662ni.m90356o(this.f79995b, uVar.mo34758b());
        }
    }

    public final int hashCode() {
        return ((this.f79994a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f79995b.entrySet());
    }

    public final String toString() {
        String obj = this.f79994a.toString();
        String i = C58662ni.m90350i(this.f79995b);
        return "GroupAndInlineFileMap{group=" + obj + ", inlineFileMap=" + i + "}";
    }
}
