package com.google.frameworks.client.data.android;

import com.google.common.p4522b.C58585km;

/* renamed from: com.google.frameworks.client.data.android.ag */
/* compiled from: PG */
public final class C61365ag {

    /* renamed from: a */
    public final String f165938a;

    /* renamed from: b */
    public final boolean f165939b;

    /* renamed from: c */
    public final C58585km f165940c;

    /* renamed from: d */
    public final C61364af f165941d;

    /* renamed from: e */
    public final boolean f165942e;

    /* renamed from: f */
    public final int f165943f = 3;

    /* renamed from: g */
    public final String f165944g;

    public C61365ag(C61363ae aeVar) {
        this.f165938a = aeVar.f165930a;
        this.f165939b = aeVar.f165935f;
        this.f165940c = aeVar.f165931b.mo55417a();
        this.f165941d = aeVar.f165932c;
        this.f165942e = aeVar.f165933d;
        this.f165944g = aeVar.f165934e;
    }

    public final String toString() {
        String obj = super.toString();
        String str = this.f165938a;
        String valueOf = String.valueOf(this.f165940c);
        boolean z = this.f165942e;
        String str2 = this.f165944g;
        String valueOf2 = String.valueOf(this.f165941d);
        return obj + ": url=" + str + ", headers=" + valueOf + ", allowRedirect=" + z + ", priority=3, httpMethod=" + str2 + ", postBodyData=" + valueOf2;
    }
}
