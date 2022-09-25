package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.widget.ImageView;
import android.widget.TextView;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.af */
/* compiled from: PG */
final class C112726af extends C112924ho {

    /* renamed from: a */
    private final TextView f312488a;

    /* renamed from: b */
    private final ImageView f312489b;

    /* renamed from: c */
    private final String f312490c;

    /* renamed from: d */
    private final Optional f312491d;

    /* renamed from: e */
    private final Optional f312492e;

    public C112726af(TextView textView, ImageView imageView, String str, Optional optional, Optional optional2) {
        this.f312488a = textView;
        this.f312489b = imageView;
        this.f312490c = str;
        this.f312491d = optional;
        this.f312492e = optional2;
    }

    /* renamed from: a */
    public final ImageView mo99703a() {
        return this.f312489b;
    }

    /* renamed from: b */
    public final TextView mo99704b() {
        return this.f312488a;
    }

    /* renamed from: c */
    public final Optional mo99705c() {
        return this.f312492e;
    }

    /* renamed from: d */
    public final Optional mo99706d() {
        return this.f312491d;
    }

    /* renamed from: e */
    public final String mo99707e() {
        return this.f312490c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C112924ho) {
            C112924ho hoVar = (C112924ho) obj;
            return this.f312488a.equals(hoVar.mo99704b()) && this.f312489b.equals(hoVar.mo99703a()) && this.f312490c.equals(hoVar.mo99707e()) && this.f312491d.equals(hoVar.mo99706d()) && this.f312492e.equals(hoVar.mo99705c());
        }
    }

    public final int hashCode() {
        return ((((((((this.f312488a.hashCode() ^ 1000003) * 1000003) ^ this.f312489b.hashCode()) * 1000003) ^ this.f312490c.hashCode()) * 1000003) ^ this.f312491d.hashCode()) * 1000003) ^ this.f312492e.hashCode();
    }

    public final String toString() {
        String obj = this.f312488a.toString();
        String obj2 = this.f312489b.toString();
        String str = this.f312490c;
        String valueOf = String.valueOf(this.f312491d);
        String valueOf2 = String.valueOf(this.f312492e);
        return "RenderParams{textView=" + obj + ", iconView=" + obj2 + ", primaryText=" + str + ", secondaryText=" + valueOf + ", iconSource=" + valueOf2 + "}";
    }
}
