package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;
import com.google.p4272br.C56449r;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.r */
/* compiled from: PG */
final class C79320r extends C79212bv {

    /* renamed from: a */
    private final C56449r f217822a;

    /* renamed from: b */
    private final C58495hd f217823b;

    public C79320r(C56449r rVar, C58495hd hdVar) {
        this.f217822a = rVar;
        this.f217823b = hdVar;
    }

    /* renamed from: a */
    public final C58495hd mo73835a() {
        return this.f217823b;
    }

    /* renamed from: b */
    public final C56449r mo73836b() {
        return this.f217822a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79212bv) {
            C79212bv bvVar = (C79212bv) obj;
            return this.f217822a.equals(bvVar.mo73836b()) && C58662ni.m90356o(this.f217823b, bvVar.mo73835a());
        }
    }

    public final int hashCode() {
        return ((this.f217822a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f217823b.entrySet());
    }

    public final String toString() {
        String str = this.f217822a.f150776a;
        String i = C58662ni.m90350i(this.f217823b);
        return "TeleportPrecompiledPattern{pattern=" + str + ", groupNameToTokenMap=" + i + "}";
    }
}
