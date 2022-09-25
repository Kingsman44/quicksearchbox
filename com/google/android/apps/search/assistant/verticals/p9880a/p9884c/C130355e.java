package com.google.android.apps.search.assistant.verticals.p9880a.p9884c;

import com.google.assistant.p3931f.p3939c.C52829f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.c.e */
/* compiled from: PG */
final class C130355e extends C130348b {

    /* renamed from: a */
    private final C52829f f357265a;

    /* renamed from: b */
    private final Optional f357266b;

    /* renamed from: c */
    private final Optional f357267c;

    /* renamed from: d */
    private final Optional f357268d;

    public C130355e(C52829f fVar, Optional optional, Optional optional2, Optional optional3) {
        this.f357265a = fVar;
        this.f357266b = optional;
        this.f357267c = optional2;
        this.f357268d = optional3;
    }

    /* renamed from: b */
    public final C52829f mo109678b() {
        return this.f357265a;
    }

    /* renamed from: c */
    public final Optional mo109679c() {
        return this.f357267c;
    }

    /* renamed from: d */
    public final Optional mo109680d() {
        return this.f357266b;
    }

    /* renamed from: e */
    public final Optional mo109681e() {
        return this.f357268d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130348b) {
            C130348b bVar = (C130348b) obj;
            return this.f357265a.equals(bVar.mo109678b()) && this.f357266b.equals(bVar.mo109680d()) && this.f357267c.equals(bVar.mo109679c()) && this.f357268d.equals(bVar.mo109681e());
        }
    }

    public final int hashCode() {
        return ((((((this.f357265a.hashCode() ^ 1000003) * 1000003) ^ this.f357266b.hashCode()) * 1000003) ^ this.f357267c.hashCode()) * 1000003) ^ this.f357268d.hashCode();
    }

    public final String toString() {
        String obj = this.f357265a.toString();
        String valueOf = String.valueOf(this.f357266b);
        String valueOf2 = String.valueOf(this.f357267c);
        String valueOf3 = String.valueOf(this.f357268d);
        return "AppControlData{appActionsContext=" + obj + ", appPackageName=" + valueOf + ", activityClassName=" + valueOf2 + ", directAction=" + valueOf3 + "}";
    }
}
