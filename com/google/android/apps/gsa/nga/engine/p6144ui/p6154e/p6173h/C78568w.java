package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80568b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.w */
/* compiled from: PG */
public final class C78568w extends C78276a {

    /* renamed from: b */
    public final C80568b f216317b;

    /* renamed from: c */
    public final C58485gu f216318c;

    public C78568w(C80568b bVar, C58485gu guVar) {
        if (bVar != null) {
            this.f216317b = bVar;
            if (guVar != null) {
                this.f216318c = guVar;
                return;
            }
            throw new NullPointerException("Null chips");
        }
        throw new NullPointerException("Null presentation");
    }

    /* renamed from: b */
    public final C80568b mo73274b() {
        return this.f216317b;
    }

    /* renamed from: c */
    public final C58485gu mo73275c() {
        return this.f216318c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78276a) {
            C78276a aVar = (C78276a) obj;
            return this.f216317b.equals(aVar.mo73274b()) && C58597ky.m90218i(this.f216318c, aVar.mo73275c());
        }
    }

    public final int hashCode() {
        return ((this.f216317b.hashCode() ^ 1000003) * 1000003) ^ this.f216318c.hashCode();
    }

    public final String toString() {
        String obj = this.f216317b.toString();
        String obj2 = this.f216318c.toString();
        return "AfterExecutionSuggestions{presentation=" + obj + ", chips=" + obj2 + "}";
    }
}
