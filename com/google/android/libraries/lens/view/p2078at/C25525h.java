package com.google.android.libraries.lens.view.p2078at;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.lens.view.at.h */
/* compiled from: PG */
public final class C25525h extends C25507am {

    /* renamed from: a */
    public final C25503ai f69510a;

    /* renamed from: b */
    public final C58485gu f69511b;

    /* renamed from: c */
    public final int f69512c;

    /* renamed from: d */
    public final long f69513d;

    public C25525h(C25503ai aiVar, C58485gu guVar, int i, long j) {
        if (aiVar != null) {
            this.f69510a = aiVar;
            if (guVar != null) {
                this.f69511b = guVar;
                this.f69512c = i;
                this.f69513d = j;
                return;
            }
            throw new NullPointerException("Null requestedPermissions");
        }
        throw new NullPointerException("Null permissionsCallback");
    }

    /* renamed from: a */
    public final int mo30539a() {
        return this.f69512c;
    }

    /* renamed from: b */
    public final long mo30540b() {
        return this.f69513d;
    }

    /* renamed from: c */
    public final C25503ai mo30541c() {
        return this.f69510a;
    }

    /* renamed from: d */
    public final C58485gu mo30542d() {
        return this.f69511b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25507am) {
            C25507am amVar = (C25507am) obj;
            return this.f69510a.equals(amVar.mo30541c()) && C58597ky.m90218i(this.f69511b, amVar.mo30542d()) && this.f69512c == amVar.mo30539a() && this.f69513d == amVar.mo30540b();
        }
    }

    public final int hashCode() {
        int hashCode = this.f69510a.hashCode();
        int hashCode2 = this.f69511b.hashCode();
        int i = this.f69512c;
        long j = this.f69513d;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String obj = this.f69510a.toString();
        String obj2 = this.f69511b.toString();
        int i = this.f69512c;
        long j = this.f69513d;
        return "PendingRequest{permissionsCallback=" + obj + ", requestedPermissions=" + obj2 + ", requesterVeTypeId=" + i + ", requestTime=" + j + "}";
    }
}
