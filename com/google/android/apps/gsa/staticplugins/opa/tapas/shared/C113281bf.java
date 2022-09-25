package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.bf */
/* compiled from: PG */
public final class C113281bf extends C113426fg {

    /* renamed from: a */
    private final String f313727a = "com.google.android.youtube";

    /* renamed from: b */
    private final String f313728b;

    /* renamed from: c */
    private final Optional f313729c;

    /* renamed from: d */
    private final Optional f313730d;

    public C113281bf(String str, Optional optional, Optional optional2) {
        this.f313728b = str;
        this.f313729c = optional;
        this.f313730d = optional2;
    }

    /* renamed from: a */
    public final Optional mo100076a() {
        return this.f313729c;
    }

    /* renamed from: b */
    public final Optional mo100077b() {
        return this.f313730d;
    }

    /* renamed from: c */
    public final String mo100078c() {
        return this.f313727a;
    }

    /* renamed from: d */
    public final String mo100079d() {
        return this.f313728b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113426fg) {
            C113426fg fgVar = (C113426fg) obj;
            return this.f313727a.equals(fgVar.mo100078c()) && this.f313728b.equals(fgVar.mo100079d()) && this.f313729c.equals(fgVar.mo100076a()) && this.f313730d.equals(fgVar.mo100077b());
        }
    }

    public final int hashCode() {
        return ((((((this.f313727a.hashCode() ^ 1000003) * 1000003) ^ this.f313728b.hashCode()) * 1000003) ^ this.f313729c.hashCode()) * 1000003) ^ this.f313730d.hashCode();
    }

    public final String toString() {
        String str = this.f313727a;
        String str2 = this.f313728b;
        String valueOf = String.valueOf(this.f313729c);
        String valueOf2 = String.valueOf(this.f313730d);
        return "VideoSuggestionParams{appPackageName=" + str + ", deeplinkUrl=" + str2 + ", subtitle=" + valueOf + ", thumbnailUrl=" + valueOf2 + "}";
    }
}
