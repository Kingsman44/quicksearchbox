package com.google.android.libraries.p590as.p591a;

import com.google.common.base.C58833ax;
import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.android.libraries.as.a.g */
/* compiled from: PG */
final class C10773g extends C10776j {

    /* renamed from: b */
    private final C67451at f35769b;

    /* renamed from: c */
    private final C58833ax f35770c;

    /* renamed from: d */
    private final C58833ax f35771d;

    /* renamed from: e */
    private final C58833ax f35772e;

    public C10773g(C67451at atVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f35769b = atVar;
        this.f35770c = axVar;
        this.f35771d = axVar2;
        this.f35772e = axVar3;
    }

    /* renamed from: a */
    public final C58833ax mo19260a() {
        return this.f35772e;
    }

    /* renamed from: b */
    public final C58833ax mo19261b() {
        return this.f35770c;
    }

    /* renamed from: c */
    public final C58833ax mo19262c() {
        return this.f35771d;
    }

    /* renamed from: d */
    public final C67451at mo19263d() {
        return this.f35769b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10776j) {
            C10776j jVar = (C10776j) obj;
            return this.f35769b.equals(jVar.mo19263d()) && this.f35770c.equals(jVar.mo19261b()) && this.f35771d.equals(jVar.mo19262c()) && this.f35772e.equals(jVar.mo19260a());
        }
    }

    public final int hashCode() {
        return ((((((this.f35769b.hashCode() ^ 1000003) * 1000003) ^ this.f35770c.hashCode()) * 1000003) ^ this.f35771d.hashCode()) * 1000003) ^ this.f35772e.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f35769b.f183321p);
        String valueOf = String.valueOf(this.f35770c);
        String valueOf2 = String.valueOf(this.f35771d);
        String valueOf3 = String.valueOf(this.f35772e);
        return "CodecConfig{format=" + num + ", outputBitRate=" + valueOf + ", sampleRateHz=" + valueOf2 + ", channelCount=" + valueOf3 + "}";
    }
}
