package com.google.android.libraries.micore.learning.training.nflrunner;

/* renamed from: com.google.android.libraries.micore.learning.training.nflrunner.b */
/* compiled from: PG */
final class C29744b extends C29754l {

    /* renamed from: a */
    private final int f80579a;

    /* renamed from: b */
    private final int f80580b;

    /* renamed from: c */
    private final int f80581c;

    /* renamed from: d */
    private final int f80582d;

    /* renamed from: e */
    private final int f80583e;

    /* renamed from: f */
    private final boolean f80584f;

    /* renamed from: g */
    private final boolean f80585g;

    /* renamed from: h */
    private final boolean f80586h;

    /* renamed from: i */
    private final double f80587i;

    public C29744b(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, double d) {
        this.f80579a = i;
        this.f80580b = i2;
        this.f80581c = i3;
        this.f80582d = i4;
        this.f80583e = i5;
        this.f80584f = z;
        this.f80585g = z2;
        this.f80586h = z3;
        this.f80587i = d;
    }

    /* renamed from: a */
    public final double mo34911a() {
        return this.f80587i;
    }

    /* renamed from: b */
    public final int mo34912b() {
        return this.f80579a;
    }

    /* renamed from: c */
    public final int mo34913c() {
        return this.f80580b;
    }

    /* renamed from: d */
    public final int mo34914d() {
        return this.f80581c;
    }

    /* renamed from: e */
    public final int mo34915e() {
        return this.f80582d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29754l) {
            C29754l lVar = (C29754l) obj;
            return this.f80579a == lVar.mo34912b() && this.f80580b == lVar.mo34913c() && this.f80581c == lVar.mo34914d() && this.f80582d == lVar.mo34915e() && this.f80583e == lVar.mo34917f() && this.f80584f == lVar.mo34918g() && this.f80585g == lVar.mo34921i() && this.f80586h == lVar.mo34919h() && Double.doubleToLongBits(this.f80587i) == Double.doubleToLongBits(lVar.mo34911a());
        }
    }

    /* renamed from: f */
    public final int mo34917f() {
        return this.f80583e;
    }

    /* renamed from: g */
    public final boolean mo34918g() {
        return this.f80584f;
    }

    /* renamed from: h */
    public final boolean mo34919h() {
        return this.f80586h;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((((((((((this.f80579a ^ 1000003) * 1000003) ^ this.f80580b) * 1000003) ^ this.f80581c) * 1000003) ^ this.f80582d) * 1000003) ^ this.f80583e) * 1000003) ^ (true != this.f80584f ? 1237 : 1231)) * 1000003) ^ (true != this.f80585g ? 1237 : 1231)) * 1000003;
        if (true == this.f80586h) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f80587i) >>> 32) ^ Double.doubleToLongBits(this.f80587i)));
    }

    /* renamed from: i */
    public final boolean mo34921i() {
        return this.f80585g;
    }

    public final String toString() {
        int i = this.f80579a;
        int i2 = this.f80580b;
        int i3 = this.f80581c;
        int i4 = this.f80582d;
        int i5 = this.f80583e;
        boolean z = this.f80584f;
        boolean z2 = this.f80585g;
        boolean z3 = this.f80586h;
        double d = this.f80587i;
        return "HttpConfig{connectTimeoutMs=" + i + ", readTimeoutMs=" + i2 + ", requestBodyChunkSizeBytes=" + i3 + ", responseBodyChunkSizeBytes=" + i4 + ", responseBodyGzipBufferSizeBytes=" + i5 + ", callDisconnectWhenCancelled=" + z + ", supportAcceptEncodingHeader=" + z2 + ", estimateSentReceivedBytes=" + z3 + ", estimatedHttp2HeaderCompressionRatio=" + d + "}";
    }
}
