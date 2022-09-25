package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a */
/* compiled from: PG */
public final class C78277a extends C78507j {

    /* renamed from: b */
    private final boolean f215556b;

    /* renamed from: c */
    private final C58528ij f215557c;

    public C78277a(boolean z, C58528ij ijVar) {
        this.f215556b = z;
        if (ijVar != null) {
            this.f215557c = ijVar;
            return;
        }
        throw new NullPointerException("Null clickedUrls");
    }

    /* renamed from: a */
    public final C58528ij mo73276a() {
        return this.f215557c;
    }

    /* renamed from: b */
    public final boolean mo73277b() {
        return this.f215556b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78507j) {
            C78507j jVar = (C78507j) obj;
            return this.f215556b == jVar.mo73277b() && this.f215557c.equals(jVar.mo73276a());
        }
    }

    public final int hashCode() {
        return (((true != this.f215556b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f215557c.hashCode();
    }

    public final String toString() {
        boolean z = this.f215556b;
        String obj = this.f215557c.toString();
        return "LegalNoticeState{isTimeout=" + z + ", clickedUrls=" + obj + "}";
    }
}
