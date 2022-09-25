package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.am */
/* compiled from: PG */
public final class C80834am extends C80852bd {

    /* renamed from: a */
    public final C80851bc f221761a;

    /* renamed from: b */
    public final C58528ij f221762b;

    public C80834am(C80851bc bcVar, C58528ij ijVar) {
        if (bcVar != null) {
            this.f221761a = bcVar;
            if (ijVar != null) {
                this.f221762b = ijVar;
                return;
            }
            throw new NullPointerException("Null capabilities");
        }
        throw new NullPointerException("Null version");
    }

    /* renamed from: a */
    public final C80851bc mo74695a() {
        return this.f221761a;
    }

    /* renamed from: b */
    public final C58528ij mo74696b() {
        return this.f221762b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80852bd) {
            C80852bd bdVar = (C80852bd) obj;
            return this.f221761a.equals(bdVar.mo74695a()) && this.f221762b.equals(bdVar.mo74696b());
        }
    }

    public final int hashCode() {
        return ((this.f221761a.hashCode() ^ 1000003) * 1000003) ^ this.f221762b.hashCode();
    }

    public final String toString() {
        String obj = this.f221761a.toString();
        String obj2 = this.f221762b.toString();
        return "SystemUiConfiguration{version=" + obj + ", capabilities=" + obj2 + "}";
    }
}
