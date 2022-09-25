package com.google.android.libraries.p1963i.p1968d;

/* renamed from: com.google.android.libraries.i.d.c */
/* compiled from: PG */
public final class C23890c extends C23894g {

    /* renamed from: a */
    public final String f65365a;

    /* renamed from: b */
    public final int f65366b;

    /* renamed from: c */
    public final boolean f65367c;

    public C23890c(String str, int i, boolean z) {
        this.f65365a = str;
        this.f65366b = i;
        this.f65367c = z;
    }

    /* renamed from: a */
    public final int mo29296a() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public final int mo29297b() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public final int mo29298c() {
        return this.f65366b;
    }

    /* renamed from: d */
    public final String mo29299d() {
        return this.f65365a;
    }

    /* renamed from: e */
    public final boolean mo29300e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23894g) {
            C23894g gVar = (C23894g) obj;
            return this.f65365a.equals(gVar.mo29299d()) && this.f65366b == gVar.mo29298c() && gVar.mo29297b() == Integer.MAX_VALUE && gVar.mo29296a() == Integer.MAX_VALUE && gVar.mo29300e() && this.f65367c == gVar.mo29302f();
        }
    }

    /* renamed from: f */
    public final boolean mo29302f() {
        return this.f65367c;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.f65365a.hashCode() ^ 1000003) * 1000003) ^ this.f65366b) * 1000003) ^ Integer.MAX_VALUE) * 1000003) ^ Integer.MAX_VALUE) * 1000003) ^ 1231) * 1000003;
        if (true != this.f65367c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f65365a;
        int i = this.f65366b;
        boolean z = this.f65367c;
        return "ThreadPoolConfig{name=" + str + ", numThreads=" + i + ", maxThreadSize=2147483647, maxQueueSize=2147483647, enableStats=true, enabledMetrics=" + z + "}";
    }
}
