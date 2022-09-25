package androidx.work;

import java.util.Set;
import p5462h.p5463a.C69498ao;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.h */
/* compiled from: PG */
public final class C4412h {

    /* renamed from: a */
    public static final C4412h f14080a = new C4412h((byte[]) null);

    /* renamed from: b */
    public final C4381ae f14081b;

    /* renamed from: c */
    public final boolean f14082c;

    /* renamed from: d */
    public final boolean f14083d;

    /* renamed from: e */
    public final boolean f14084e;

    /* renamed from: f */
    public final boolean f14085f;

    /* renamed from: g */
    public final long f14086g;

    /* renamed from: h */
    public final long f14087h;

    /* renamed from: i */
    public final Set f14088i;

    public C4412h() {
        this((byte[]) null);
    }

    public C4412h(C4381ae aeVar, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        C69664n.m101061g(aeVar, "requiredNetworkType");
        C69664n.m101061g(set, "contentUriTriggers");
        this.f14081b = aeVar;
        this.f14082c = z;
        this.f14083d = z2;
        this.f14084e = z3;
        this.f14085f = z4;
        this.f14086g = j;
        this.f14087h = j2;
        this.f14088i = set;
    }

    public /* synthetic */ C4412h(byte[] bArr) {
        this(C4381ae.NOT_REQUIRED, false, false, false, false, -1, -1, C69498ao.f185920a);
    }

    /* renamed from: a */
    public final boolean mo9355a() {
        return !this.f14088i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C69664n.m101066l(getClass(), obj.getClass())) {
            return false;
        }
        C4412h hVar = (C4412h) obj;
        if (this.f14082c == hVar.f14082c && this.f14083d == hVar.f14083d && this.f14084e == hVar.f14084e && this.f14085f == hVar.f14085f && this.f14086g == hVar.f14086g && this.f14087h == hVar.f14087h && this.f14081b == hVar.f14081b) {
            return C69664n.m101066l(this.f14088i, hVar.f14088i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f14081b.hashCode();
        boolean z = this.f14082c;
        boolean z2 = this.f14083d;
        boolean z3 = this.f14084e;
        boolean z4 = this.f14085f;
        long j = this.f14086g;
        long j2 = this.f14087h;
        return (((((((((((((hashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.f14088i.hashCode();
    }
}
