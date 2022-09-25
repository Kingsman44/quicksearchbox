package com.android.p247a.p249b.p250a.p251a;

import com.android.p247a.p249b.p250a.C4997h;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: com.android.a.b.a.a.a */
/* compiled from: PG */
public final class C4986a {

    /* renamed from: a */
    public final X509Certificate f15806a;

    /* renamed from: b */
    public final C4997h f15807b;

    /* renamed from: c */
    public final C4997h f15808c;

    /* renamed from: d */
    public final byte[] f15809d;

    /* renamed from: e */
    public final int f15810e;

    public C4986a(X509Certificate x509Certificate, C4997h hVar, C4997h hVar2, byte[] bArr, int i) {
        this.f15806a = x509Certificate;
        this.f15807b = hVar;
        this.f15808c = hVar2;
        this.f15809d = bArr;
        this.f15810e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4986a)) {
            return false;
        }
        C4986a aVar = (C4986a) obj;
        return this.f15806a.equals(aVar.f15806a) && this.f15807b == aVar.f15807b && this.f15808c == aVar.f15808c && Arrays.equals(this.f15809d, aVar.f15809d) && this.f15810e == aVar.f15810e;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f15806a.hashCode() + 31) * 31;
        C4997h hVar = this.f15807b;
        int i2 = 0;
        if (hVar == null) {
            i = 0;
        } else {
            i = hVar.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        C4997h hVar2 = this.f15808c;
        if (hVar2 != null) {
            i2 = hVar2.hashCode();
        }
        return ((((i3 + i2) * 31) + Arrays.hashCode(this.f15809d)) * 31) + this.f15810e;
    }
}
