package com.google.android.gms.car;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.car.e */
/* compiled from: PG */
public final class C143208e extends C143197dn {

    /* renamed from: a */
    public final int f388311a;

    public C143208e(int i) {
        this.f388311a = i;
    }

    /* renamed from: a */
    public final ConnectionResult mo118219a() {
        return null;
    }

    /* renamed from: b */
    public final int mo118220b() {
        return this.f388311a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C143197dn) {
            C143197dn dnVar = (C143197dn) obj;
            return this.f388311a == dnVar.mo118220b() && dnVar.mo118219a() == null;
        }
    }

    public final int hashCode() {
        return (this.f388311a ^ 1000003) * 1000003;
    }
}
