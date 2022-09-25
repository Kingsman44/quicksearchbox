package com.google.android.apps.gsa.shared.speech;

import com.google.common.base.C58833ax;
import com.google.speech.p5224k.p5225a.C67229g;

/* compiled from: PG */
final class AutoValue_HotwordResultMetadata extends HotwordResultMetadata {

    /* renamed from: a */
    private final float f253037a;

    /* renamed from: b */
    private final float f253038b;

    /* renamed from: c */
    private final float f253039c;

    /* renamed from: d */
    private final float f253040d;

    /* renamed from: e */
    private final boolean f253041e;

    /* renamed from: f */
    private final boolean f253042f;

    /* renamed from: g */
    private final boolean f253043g;

    /* renamed from: h */
    private final long f253044h;

    /* renamed from: i */
    private final C67229g f253045i;

    /* renamed from: j */
    private final C58833ax f253046j;

    /* renamed from: k */
    private final C58833ax f253047k;

    /* renamed from: l */
    private final int f253048l;

    /* renamed from: m */
    private final boolean f253049m;

    /* renamed from: n */
    private final boolean f253050n;

    /* renamed from: o */
    private final boolean f253051o;

    /* renamed from: p */
    private final long f253052p;

    public AutoValue_HotwordResultMetadata(float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, long j, C67229g gVar, C58833ax axVar, C58833ax axVar2, int i, boolean z4, boolean z5, boolean z6, long j2) {
        this.f253037a = f;
        this.f253038b = f2;
        this.f253039c = f3;
        this.f253040d = f4;
        this.f253041e = z;
        this.f253042f = z2;
        this.f253043g = z3;
        this.f253044h = j;
        this.f253045i = gVar;
        this.f253046j = axVar;
        this.f253047k = axVar2;
        this.f253048l = i;
        this.f253049m = z4;
        this.f253050n = z5;
        this.f253051o = z6;
        this.f253052p = j2;
    }

    /* renamed from: a */
    public final float mo84597a() {
        return this.f253037a;
    }

    /* renamed from: b */
    public final float mo84598b() {
        return this.f253038b;
    }

    /* renamed from: c */
    public final float mo84599c() {
        return this.f253039c;
    }

    /* renamed from: d */
    public final float mo84600d() {
        return this.f253040d;
    }

    /* renamed from: e */
    public final int mo84601e() {
        return this.f253048l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HotwordResultMetadata) {
            HotwordResultMetadata hotwordResultMetadata = (HotwordResultMetadata) obj;
            return Float.floatToIntBits(this.f253037a) == Float.floatToIntBits(hotwordResultMetadata.mo84597a()) && Float.floatToIntBits(this.f253038b) == Float.floatToIntBits(hotwordResultMetadata.mo84598b()) && Float.floatToIntBits(this.f253039c) == Float.floatToIntBits(hotwordResultMetadata.mo84599c()) && Float.floatToIntBits(this.f253040d) == Float.floatToIntBits(hotwordResultMetadata.mo84600d()) && this.f253041e == hotwordResultMetadata.mo84613o() && this.f253042f == hotwordResultMetadata.mo84614p() && this.f253043g == hotwordResultMetadata.mo84609k() && this.f253044h == hotwordResultMetadata.mo84604g() && this.f253045i.equals(hotwordResultMetadata.mo84608j()) && this.f253046j.equals(hotwordResultMetadata.mo84607i()) && this.f253047k.equals(hotwordResultMetadata.mo84605h()) && this.f253048l == hotwordResultMetadata.mo84601e() && this.f253049m == hotwordResultMetadata.mo84610l() && this.f253050n == hotwordResultMetadata.mo84612n() && this.f253051o == hotwordResultMetadata.mo84611m() && this.f253052p == hotwordResultMetadata.mo84603f();
        }
    }

    /* renamed from: f */
    public final long mo84603f() {
        return this.f253052p;
    }

    /* renamed from: g */
    public final long mo84604g() {
        return this.f253044h;
    }

    /* renamed from: h */
    public final C58833ax mo84605h() {
        return this.f253047k;
    }

    public final int hashCode() {
        int i = 1237;
        int floatToIntBits = (((((((((((Float.floatToIntBits(this.f253037a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f253038b)) * 1000003) ^ Float.floatToIntBits(this.f253039c)) * 1000003) ^ Float.floatToIntBits(this.f253040d)) * 1000003) ^ (true != this.f253041e ? 1237 : 1231)) * 1000003) ^ (true != this.f253042f ? 1237 : 1231)) * 1000003;
        int i2 = true != this.f253043g ? 1237 : 1231;
        long j = this.f253044h;
        int hashCode = (((((((((((((((floatToIntBits ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f253045i.hashCode()) * 1000003) ^ this.f253046j.hashCode()) * 1000003) ^ this.f253047k.hashCode()) * 1000003) ^ this.f253048l) * 1000003) ^ (true != this.f253049m ? 1237 : 1231)) * 1000003) ^ (true != this.f253050n ? 1237 : 1231)) * 1000003;
        if (true == this.f253051o) {
            i = 1231;
        }
        long j2 = this.f253052p;
        return ((hashCode ^ i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    /* renamed from: i */
    public final C58833ax mo84607i() {
        return this.f253046j;
    }

    /* renamed from: j */
    public final C67229g mo84608j() {
        return this.f253045i;
    }

    /* renamed from: k */
    public final boolean mo84609k() {
        return this.f253043g;
    }

    /* renamed from: l */
    public final boolean mo84610l() {
        return this.f253049m;
    }

    /* renamed from: m */
    public final boolean mo84611m() {
        return this.f253051o;
    }

    /* renamed from: n */
    public final boolean mo84612n() {
        return this.f253050n;
    }

    /* renamed from: o */
    public final boolean mo84613o() {
        return this.f253041e;
    }

    /* renamed from: p */
    public final boolean mo84614p() {
        return this.f253042f;
    }

    public final String toString() {
        float f = this.f253037a;
        float f2 = this.f253038b;
        float f3 = this.f253039c;
        float f4 = this.f253040d;
        boolean z = this.f253041e;
        boolean z2 = this.f253042f;
        boolean z3 = this.f253043g;
        long j = this.f253044h;
        String num = Integer.toString(this.f253045i.f182718e);
        String valueOf = String.valueOf(this.f253046j);
        String valueOf2 = String.valueOf(this.f253047k);
        int i = this.f253048l;
        boolean z4 = this.f253049m;
        boolean z5 = this.f253050n;
        return "HotwordResultMetadata{backgroundPower=" + f + ", hotwordPower=" + f2 + ", hotwordScore=" + f3 + ", speakerIdScore=" + f4 + ", isVoiceUnlocked=" + z + ", screenOn=" + z2 + ", fromHotword=" + z3 + ", triggerTimeMs=" + j + ", alwaysOnHotwordDetectorType=" + num + ", hotwordModelId=" + valueOf + ", deviceId=" + valueOf2 + ", sampleRate=" + i + ", isLowConfidenceTrigger=" + z4 + ", isSpeakerAuthenticated=" + z5 + ", isNearMiss=" + this.f253051o + ", nearMissTimeMs=" + this.f253052p + "}";
    }
}
