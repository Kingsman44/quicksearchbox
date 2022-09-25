package com.google.android.libraries.search.video.players;

import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.players.b */
/* compiled from: PG */
final class C41567b extends C41588s {

    /* renamed from: a */
    public final String f108663a;

    /* renamed from: b */
    public final Duration f108664b;

    /* renamed from: c */
    public final boolean f108665c;

    /* renamed from: d */
    public final float f108666d;

    /* renamed from: e */
    public final Optional f108667e;

    /* renamed from: f */
    public final Optional f108668f;

    /* renamed from: g */
    public final boolean f108669g;

    /* renamed from: h */
    public final boolean f108670h;

    /* renamed from: i */
    public final boolean f108671i;

    public C41567b(String str, Duration duration, boolean z, float f, Optional optional, Optional optional2, boolean z2, boolean z3, boolean z4) {
        if (str != null) {
            this.f108663a = str;
            if (duration != null) {
                this.f108664b = duration;
                this.f108665c = z;
                this.f108666d = f;
                if (optional != null) {
                    this.f108667e = optional;
                    if (optional2 != null) {
                        this.f108668f = optional2;
                        this.f108669g = z2;
                        this.f108670h = z3;
                        this.f108671i = z4;
                        return;
                    }
                    throw new NullPointerException("Null subtitle");
                }
                throw new NullPointerException("Null adTagUri");
            }
            throw new NullPointerException("Null startTime");
        }
        throw new NullPointerException("Null url");
    }

    /* renamed from: a */
    public final float mo44112a() {
        return this.f108666d;
    }

    /* renamed from: b */
    public final Duration mo44113b() {
        return this.f108664b;
    }

    /* renamed from: c */
    public final Optional mo44114c() {
        return this.f108667e;
    }

    /* renamed from: d */
    public final Optional mo44115d() {
        return this.f108668f;
    }

    /* renamed from: e */
    public final String mo44116e() {
        return this.f108663a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41588s) {
            C41588s sVar = (C41588s) obj;
            return this.f108663a.equals(sVar.mo44116e()) && this.f108664b.equals(sVar.mo44113b()) && this.f108665c == sVar.mo44118f() && Float.floatToIntBits(this.f108666d) == Float.floatToIntBits(sVar.mo44112a()) && this.f108667e.equals(sVar.mo44114c()) && this.f108668f.equals(sVar.mo44115d()) && this.f108669g == sVar.mo44119g() && this.f108670h == sVar.mo44122i() && this.f108671i == sVar.mo44120h();
        }
    }

    /* renamed from: f */
    public final boolean mo44118f() {
        return this.f108665c;
    }

    /* renamed from: g */
    public final boolean mo44119g() {
        return this.f108669g;
    }

    /* renamed from: h */
    public final boolean mo44120h() {
        return this.f108671i;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((this.f108663a.hashCode() ^ 1000003) * 1000003) ^ this.f108664b.hashCode()) * 1000003) ^ (true != this.f108665c ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f108666d)) * 1000003) ^ this.f108667e.hashCode()) * 1000003) ^ this.f108668f.hashCode()) * 1000003) ^ (true != this.f108669g ? 1237 : 1231)) * 1000003) ^ (true != this.f108670h ? 1237 : 1231)) * 1000003;
        if (true == this.f108671i) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final boolean mo44122i() {
        return this.f108670h;
    }

    public final String toString() {
        String str = this.f108663a;
        String obj = this.f108664b.toString();
        boolean z = this.f108665c;
        float f = this.f108666d;
        String obj2 = this.f108667e.toString();
        String obj3 = this.f108668f.toString();
        boolean z2 = this.f108669g;
        boolean z3 = this.f108670h;
        boolean z4 = this.f108671i;
        return "ThirdPartyWrapperVideo{url=" + str + ", startTime=" + obj + ", autoplayMuted=" + z + ", aspectRatio=" + f + ", adTagUri=" + obj2 + ", subtitle=" + obj3 + ", enableControls=" + z2 + ", hideVideoOnPause=" + z3 + ", hideVideoOnEnd=" + z4 + "}";
    }
}
