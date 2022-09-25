package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.b */
/* compiled from: PG */
final class C83984b extends C84011f {

    /* renamed from: b */
    private final CharSequence f228781b;

    /* renamed from: c */
    private final View.OnClickListener f228782c;

    /* renamed from: d */
    private final boolean f228783d;

    /* renamed from: e */
    private final boolean f228784e;

    public C83984b(CharSequence charSequence, View.OnClickListener onClickListener, boolean z, boolean z2) {
        this.f228781b = charSequence;
        this.f228782c = onClickListener;
        this.f228783d = z;
        this.f228784e = z2;
    }

    /* renamed from: a */
    public final View.OnClickListener mo77415a() {
        return this.f228782c;
    }

    /* renamed from: b */
    public final CharSequence mo77416b() {
        return this.f228781b;
    }

    /* renamed from: c */
    public final boolean mo77417c() {
        return this.f228784e;
    }

    /* renamed from: d */
    public final boolean mo77418d() {
        return this.f228783d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84011f) {
            C84011f fVar = (C84011f) obj;
            return this.f228781b.equals(fVar.mo77416b()) && this.f228782c.equals(fVar.mo77415a()) && this.f228783d == fVar.mo77418d() && this.f228784e == fVar.mo77417c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f228781b.hashCode() ^ 1000003) * 1000003) ^ this.f228782c.hashCode()) * 1000003) ^ (true != this.f228783d ? 1237 : 1231)) * 1000003;
        if (true == this.f228784e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f228781b);
        String valueOf2 = String.valueOf(this.f228782c);
        boolean z = this.f228783d;
        boolean z2 = this.f228784e;
        return "ButtonSpec{text=" + valueOf + ", listener=" + valueOf2 + ", visible=" + z + ", neutralStyle=" + z2 + "}";
    }
}
