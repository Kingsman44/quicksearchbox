package com.google.android.apps.gsa.shared.p7195y;

/* renamed from: com.google.android.apps.gsa.shared.y.m */
/* compiled from: PG */
final class C91221m extends C91192ax {

    /* renamed from: b */
    private final boolean f254616b;

    /* renamed from: c */
    private final boolean f254617c;

    /* renamed from: d */
    private final boolean f254618d;

    /* renamed from: e */
    private final C91230v f254619e;

    public C91221m(boolean z, boolean z2, boolean z3, C91230v vVar) {
        this.f254616b = z;
        this.f254617c = z2;
        this.f254618d = z3;
        this.f254619e = vVar;
    }

    /* renamed from: a */
    public final C91230v mo85438a() {
        return this.f254619e;
    }

    /* renamed from: b */
    public final boolean mo85439b() {
        return this.f254617c;
    }

    /* renamed from: c */
    public final boolean mo85440c() {
        return this.f254618d;
    }

    /* renamed from: d */
    public final boolean mo85441d() {
        return this.f254616b;
    }

    /* renamed from: e */
    public final boolean mo85442e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91192ax) {
            C91192ax axVar = (C91192ax) obj;
            return this.f254616b == axVar.mo85441d() && this.f254617c == axVar.mo85439b() && this.f254618d == axVar.mo85440c() && !axVar.mo85442e() && this.f254619e.equals(axVar.mo85438a());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((true != this.f254616b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f254617c ? 1237 : 1231)) * 1000003;
        if (true != this.f254618d) {
            i = 1237;
        }
        return ((((i2 ^ i) * 1000003) ^ 1237) * 1000003) ^ this.f254619e.hashCode();
    }

    public final String toString() {
        boolean z = this.f254616b;
        boolean z2 = this.f254617c;
        boolean z3 = this.f254618d;
        String valueOf = String.valueOf(this.f254619e);
        return "ImageLoaderSettings{autoStartAnimatedPlaceholder=" + z + ", autoFifeHandling=" + z2 + ", autoMapImageHandling=" + z3 + ", diskCacheDisabled=false, downsampleParameters=" + valueOf + "}";
    }
}
