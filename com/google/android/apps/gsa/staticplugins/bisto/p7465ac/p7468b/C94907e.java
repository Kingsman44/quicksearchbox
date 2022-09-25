package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import com.google.assistant.p3739a.p3740a.C48089bw;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.e */
/* compiled from: PG */
final class C94907e extends C94928z {

    /* renamed from: a */
    private final int f265465a;

    /* renamed from: b */
    private final boolean f265466b;

    /* renamed from: c */
    private final int f265467c;

    /* renamed from: d */
    private final int f265468d;

    /* renamed from: e */
    private final Optional f265469e;

    /* renamed from: f */
    private final int f265470f;

    /* renamed from: g */
    private final int f265471g;

    public C94907e(int i, int i2, int i3, boolean z, int i4, int i5, Optional optional) {
        this.f265465a = i;
        this.f265470f = i2;
        this.f265471g = i3;
        this.f265466b = z;
        this.f265467c = i4;
        this.f265468d = i5;
        this.f265469e = optional;
    }

    /* renamed from: a */
    public final int mo88787a() {
        return this.f265465a;
    }

    /* renamed from: b */
    public final int mo88788b() {
        return this.f265468d;
    }

    /* renamed from: c */
    public final int mo88789c() {
        return this.f265467c;
    }

    /* renamed from: d */
    public final Optional mo88790d() {
        return this.f265469e;
    }

    /* renamed from: e */
    public final boolean mo88791e() {
        return this.f265466b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C94928z) {
            C94928z zVar = (C94928z) obj;
            return this.f265465a == zVar.mo88787a() && this.f265470f == zVar.mo88793f() && this.f265471g == zVar.mo88794g() && this.f265466b == zVar.mo88791e() && this.f265467c == zVar.mo88789c() && this.f265468d == zVar.mo88788b() && this.f265469e.equals(zVar.mo88790d());
        }
    }

    /* renamed from: f */
    public final int mo88793f() {
        return this.f265470f;
    }

    /* renamed from: g */
    public final int mo88794g() {
        return this.f265471g;
    }

    public final int hashCode() {
        return ((((((((((((this.f265465a ^ 1000003) * 1000003) ^ this.f265470f) * 1000003) ^ this.f265471g) * 1000003) ^ (true != this.f265466b ? 1237 : 1231)) * 1000003) ^ this.f265467c) * 1000003) ^ this.f265468d) * 1000003) ^ this.f265469e.hashCode();
    }

    public final String toString() {
        int i = this.f265465a;
        String num = Integer.toString(C48089bw.m85180a(this.f265470f));
        int i2 = this.f265471g;
        if (i2 != 1) {
            String num2 = Integer.toString(i2 - 2);
            boolean z = this.f265466b;
            int i3 = this.f265467c;
            int i4 = this.f265468d;
            String valueOf = String.valueOf(this.f265469e);
            return "QueryParameters{audioFormat=" + i + ", responseType=" + num + ", voiceMode=" + num2 + ", sendRecognizedText=" + z + ", sampleRate=" + i3 + ", numChannels=" + i4 + ", hotwordEvent=" + valueOf + "}";
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
