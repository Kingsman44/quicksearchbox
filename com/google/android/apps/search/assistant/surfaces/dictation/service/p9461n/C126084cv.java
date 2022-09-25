package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cv */
/* compiled from: PG */
public final class C126084cv {

    /* renamed from: a */
    public final boolean f347484a;

    /* renamed from: b */
    public final boolean f347485b;

    /* renamed from: c */
    public final boolean f347486c;

    /* renamed from: d */
    public final boolean f347487d;

    public C126084cv() {
        this(false, false, false, false);
    }

    public C126084cv(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f347484a = z;
        this.f347485b = z2;
        this.f347486c = z3;
        this.f347487d = z4;
    }

    /* renamed from: a */
    public static /* synthetic */ C126084cv m206171a(C126084cv cvVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = cvVar.f347484a;
        }
        boolean z3 = false;
        boolean z4 = (i & 2) != 0 ? cvVar.f347485b : false;
        if ((i & 4) != 0) {
            z3 = cvVar.f347486c;
        }
        return new C126084cv(z, z4, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C126084cv)) {
            return false;
        }
        C126084cv cvVar = (C126084cv) obj;
        return this.f347484a == cvVar.f347484a && this.f347485b == cvVar.f347485b && this.f347486c == cvVar.f347486c && this.f347487d == cvVar.f347487d;
    }

    public final int hashCode() {
        return ((((((this.f347484a ? 1 : 0) * true) + (this.f347485b ? 1 : 0)) * 31) + (this.f347486c ? 1 : 0)) * 31) + (this.f347487d ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.f347484a;
        boolean z2 = this.f347485b;
        boolean z3 = this.f347486c;
        boolean z4 = this.f347487d;
        return "InputFieldState(hasTextBeforeCaret=" + z + ", hasTextAfterCaret=" + z2 + ", hasSelectedText=" + z3 + ", acceptsUndo=" + z4 + ")";
    }
}
