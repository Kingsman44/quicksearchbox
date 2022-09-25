package com.google.android.apps.gsa.staticplugins.nga.p8087s;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.b */
/* compiled from: PG */
final class C103794b extends C103810r {

    /* renamed from: a */
    private final C58528ij f289012a;

    /* renamed from: b */
    private final C58495hd f289013b;

    public C103794b(C58528ij ijVar, C58495hd hdVar) {
        this.f289012a = ijVar;
        this.f289013b = hdVar;
    }

    /* renamed from: a */
    public final C58495hd mo93852a() {
        return this.f289013b;
    }

    /* renamed from: b */
    public final C58528ij mo93853b() {
        return this.f289012a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103810r) {
            C103810r rVar = (C103810r) obj;
            return this.f289012a.equals(rVar.mo93853b()) && C58662ni.m90356o(this.f289013b, rVar.mo93852a());
        }
    }

    public final int hashCode() {
        return ((this.f289012a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f289013b.entrySet());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f289012a);
        String i = C58662ni.m90350i(this.f289013b);
        return "NgaSettingsSyncRequest{preferences=" + valueOf + ", perAccountPreferences=" + i + "}";
    }
}
