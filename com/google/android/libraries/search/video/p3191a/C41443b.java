package com.google.android.libraries.search.video.p3191a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.a.b */
/* compiled from: PG */
final class C41443b extends C41450i {

    /* renamed from: b */
    private final int f108241b;

    /* renamed from: c */
    private final boolean f108242c;

    /* renamed from: d */
    private final boolean f108243d;

    /* renamed from: e */
    private final boolean f108244e;

    /* renamed from: f */
    private final boolean f108245f;

    /* renamed from: g */
    private final boolean f108246g;

    /* renamed from: h */
    private final Optional f108247h;

    public C41443b(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Optional optional) {
        this.f108241b = i;
        this.f108242c = z;
        this.f108243d = z2;
        this.f108244e = z3;
        this.f108245f = z4;
        this.f108246g = z5;
        this.f108247h = optional;
    }

    /* renamed from: a */
    public final int mo43965a() {
        return this.f108241b;
    }

    /* renamed from: b */
    public final Optional mo43966b() {
        return this.f108247h;
    }

    /* renamed from: c */
    public final boolean mo43967c() {
        return this.f108242c;
    }

    /* renamed from: d */
    public final boolean mo43968d() {
        return this.f108244e;
    }

    /* renamed from: e */
    public final boolean mo43969e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41450i) {
            C41450i iVar = (C41450i) obj;
            return this.f108241b == iVar.mo43965a() && this.f108242c == iVar.mo43967c() && !iVar.mo43969e() && this.f108243d == iVar.mo43973h() && this.f108244e == iVar.mo43968d() && this.f108245f == iVar.mo43971f() && this.f108246g == iVar.mo43972g() && this.f108247h.equals(iVar.mo43966b());
        }
    }

    /* renamed from: f */
    public final boolean mo43971f() {
        return this.f108245f;
    }

    /* renamed from: g */
    public final boolean mo43972g() {
        return this.f108246g;
    }

    /* renamed from: h */
    public final boolean mo43973h() {
        return this.f108243d;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = (((((((((((this.f108241b ^ 1000003) * 1000003) ^ (true != this.f108242c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.f108243d ? 1237 : 1231)) * 1000003) ^ (true != this.f108244e ? 1237 : 1231)) * 1000003) ^ (true != this.f108245f ? 1237 : 1231)) * 1000003;
        if (true != this.f108246g) {
            i = 1237;
        }
        return ((i2 ^ i) * 1000003) ^ this.f108247h.hashCode();
    }

    public final String toString() {
        int i = this.f108241b;
        boolean z = this.f108242c;
        boolean z2 = this.f108243d;
        boolean z3 = this.f108244e;
        boolean z4 = this.f108245f;
        boolean z5 = this.f108246g;
        String valueOf = String.valueOf(this.f108247h);
        return "VideoOptions{lookaheadOffset=" + i + ", duploEnabled=" + z + ", tngLightboxEnabled=false, youTubePreloadingEnabled=" + z2 + ", noThumbnailForYoutubeVideosEnabled=" + z3 + ", unregistrationOfFragmentCallbacksEnabled=" + z4 + ", unregistrationOfThirdPartyWrapperCallbacksEnabled=" + z5 + ", veLogger=" + valueOf + "}";
    }
}
