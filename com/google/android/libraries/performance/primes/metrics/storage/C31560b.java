package com.google.android.libraries.performance.primes.metrics.storage;

import com.google.android.libraries.performance.primes.metrics.C31294b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.performance.primes.metrics.storage.b */
/* compiled from: PG */
public final class C31560b extends C31567i {

    /* renamed from: a */
    private final int f84981a;

    /* renamed from: b */
    private final C58485gu f84982b;

    /* renamed from: c */
    private final int f84983c;

    public C31560b(int i, int i2, C58485gu guVar) {
        this.f84983c = i;
        this.f84981a = i2;
        this.f84982b = guVar;
    }

    /* renamed from: c */
    public final int mo37249c() {
        return this.f84981a;
    }

    /* renamed from: d */
    public final C58485gu mo37250d() {
        return this.f84982b;
    }

    /* renamed from: e */
    public final boolean mo37251e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31567i) {
            C31567i iVar = (C31567i) obj;
            return this.f84983c == iVar.mo37253f() && this.f84981a == iVar.mo37249c() && C58597ky.m90218i(this.f84982b, iVar.mo37250d()) && !iVar.mo37251e();
        }
    }

    /* renamed from: f */
    public final int mo37253f() {
        return this.f84983c;
    }

    public final int hashCode() {
        return ((((((this.f84983c ^ 1000003) * 1000003) ^ this.f84981a) * 1000003) ^ this.f84982b.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        int i = this.f84983c;
        int i2 = this.f84981a;
        String valueOf = String.valueOf(this.f84982b);
        return "DirStatsConfigurations{enablement=" + C31294b.m58339a(i) + ", maxFolderDepth=" + i2 + ", listPathMatchers=" + valueOf + ", includeDeviceEncryptedStorage=false}";
    }
}
