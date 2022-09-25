package com.google.android.libraries.web.contrib.debug;

/* renamed from: com.google.android.libraries.web.contrib.debug.$AutoValue_DebugFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_DebugFeature extends DebugFeature {

    /* renamed from: a */
    public final C43474f f113552a;

    /* renamed from: b */
    public final boolean f113553b;

    /* renamed from: c */
    public final int f113554c;

    public C$AutoValue_DebugFeature(C43474f fVar, boolean z, int i) {
        if (fVar != null) {
            this.f113552a = fVar;
            this.f113553b = z;
            this.f113554c = i;
            return;
        }
        throw new NullPointerException("Null debugKey");
    }

    /* renamed from: d */
    public final int mo46542d() {
        return this.f113554c;
    }

    /* renamed from: e */
    public final C43474f mo46543e() {
        return this.f113552a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DebugFeature) {
            DebugFeature debugFeature = (DebugFeature) obj;
            return this.f113552a.equals(debugFeature.mo46543e()) && this.f113553b == debugFeature.mo46545f() && this.f113554c == debugFeature.mo46542d();
        }
    }

    /* renamed from: f */
    public final boolean mo46545f() {
        return this.f113553b;
    }

    public final int hashCode() {
        return ((((this.f113552a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f113553b ? 1237 : 1231)) * 1000003) ^ this.f113554c;
    }

    public final String toString() {
        String obj = this.f113552a.toString();
        boolean z = this.f113553b;
        int i = this.f113554c;
        return "DebugFeature{debugKey=" + obj + ", isFragmentDumpEnabled=" + z + ", webStateCapacity=" + i + "}";
    }
}
