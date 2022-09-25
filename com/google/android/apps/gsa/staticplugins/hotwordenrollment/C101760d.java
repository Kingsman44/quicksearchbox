package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.d */
/* compiled from: PG */
final class C101760d extends C102232u {

    /* renamed from: a */
    private final CharSequence f283850a;

    /* renamed from: b */
    private final TextView.BufferType f283851b;

    /* renamed from: c */
    private final CharSequence f283852c;

    /* renamed from: d */
    private final boolean f283853d;

    public C101760d(CharSequence charSequence, TextView.BufferType bufferType, CharSequence charSequence2, boolean z) {
        this.f283850a = charSequence;
        this.f283851b = bufferType;
        this.f283852c = charSequence2;
        this.f283853d = z;
    }

    /* renamed from: a */
    public final TextView.BufferType mo92539a() {
        return this.f283851b;
    }

    /* renamed from: b */
    public final CharSequence mo92540b() {
        return this.f283852c;
    }

    /* renamed from: c */
    public final CharSequence mo92541c() {
        return this.f283850a;
    }

    /* renamed from: d */
    public final boolean mo92542d() {
        return this.f283853d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C102232u) {
            C102232u uVar = (C102232u) obj;
            return this.f283850a.equals(uVar.mo92541c()) && this.f283851b.equals(uVar.mo92539a()) && this.f283852c.equals(uVar.mo92540b()) && this.f283853d == uVar.mo92542d();
        }
    }

    public final int hashCode() {
        return ((((((this.f283850a.hashCode() ^ 1000003) * 1000003) ^ this.f283851b.hashCode()) * 1000003) ^ this.f283852c.hashCode()) * 1000003) ^ (true != this.f283853d ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f283850a.toString();
        String obj2 = this.f283851b.toString();
        String obj3 = this.f283852c.toString();
        boolean z = this.f283853d;
        return "HeaderSpecs{title=" + obj + ", titleBufferType=" + obj2 + ", summary=" + obj3 + ", addSummaryMovement=" + z + "}";
    }
}
