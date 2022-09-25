package com.google.android.libraries.assistant.pcp.p1546d;

import com.google.assistant.p3803ag.p3809c.C49046el;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.d.b */
/* compiled from: PG */
public final class C18574b extends C18577e {

    /* renamed from: a */
    private final C18579g f52597a;

    /* renamed from: b */
    private final C49046el f52598b;

    /* renamed from: c */
    private final Optional f52599c;

    /* renamed from: d */
    private final Optional f52600d;

    public C18574b(C18579g gVar, C49046el elVar, Optional optional, Optional optional2) {
        this.f52597a = gVar;
        this.f52598b = elVar;
        this.f52599c = optional;
        this.f52600d = optional2;
    }

    /* renamed from: a */
    public final C18579g mo24063a() {
        return this.f52597a;
    }

    /* renamed from: b */
    public final C49046el mo24064b() {
        return this.f52598b;
    }

    /* renamed from: c */
    public final Optional mo24065c() {
        return this.f52599c;
    }

    /* renamed from: d */
    public final Optional mo24066d() {
        return this.f52600d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18577e) {
            C18577e eVar = (C18577e) obj;
            return this.f52597a.equals(eVar.mo24063a()) && this.f52598b.equals(eVar.mo24064b()) && this.f52599c.equals(eVar.mo24065c()) && this.f52600d.equals(eVar.mo24066d());
        }
    }

    public final int hashCode() {
        return ((((((this.f52597a.hashCode() ^ 1000003) * 1000003) ^ this.f52598b.hashCode()) * 1000003) ^ this.f52599c.hashCode()) * 1000003) ^ this.f52600d.hashCode();
    }

    public final String toString() {
        String obj = this.f52597a.toString();
        String obj2 = this.f52598b.toString();
        String valueOf = String.valueOf(this.f52599c);
        String valueOf2 = String.valueOf(this.f52600d);
        return "FeatureInfo{featureType=" + obj + ", featureConfig=" + obj2 + ", lastFeatureUpdate=" + valueOf + ", proactiveDataSourceId=" + valueOf2 + "}";
    }
}
