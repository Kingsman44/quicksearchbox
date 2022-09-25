package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.nlp.p4735b.p4736a.p4738b.C62833o;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.a */
/* compiled from: PG */
public final class C79045a extends C79058k {

    /* renamed from: a */
    public final C62833o f217375a;

    /* renamed from: b */
    public final Optional f217376b;

    public C79045a(C62833o oVar, Optional optional) {
        this.f217375a = oVar;
        this.f217376b = optional;
    }

    /* renamed from: a */
    public final C62833o mo73791a() {
        return this.f217375a;
    }

    /* renamed from: b */
    public final Optional mo73792b() {
        return this.f217376b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79058k) {
            C79058k kVar = (C79058k) obj;
            return this.f217375a.equals(kVar.mo73791a()) && this.f217376b.equals(kVar.mo73792b());
        }
    }

    public final int hashCode() {
        return ((this.f217375a.hashCode() ^ 1000003) * 1000003) ^ this.f217376b.hashCode();
    }

    public final String toString() {
        String obj = this.f217375a.toString();
        String valueOf = String.valueOf(this.f217376b);
        return "IntentAndPatternPackages{intentPackages=" + obj + ", patternPackages=" + valueOf + "}";
    }
}
