package com.google.android.apps.education.bloom.mathview.render;

import com.evernote.android.state.BuildConfig;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.g */
/* compiled from: PG */
final class C9068g {

    /* renamed from: a */
    public static final C9067f f31293a = new C9067f();

    /* renamed from: b */
    public String f31294b;

    /* renamed from: c */
    public int f31295c;

    /* renamed from: d */
    public int f31296d;

    public C9068g() {
        this((byte[]) null);
    }

    public /* synthetic */ C9068g(byte[] bArr) {
        this.f31294b = BuildConfig.FLAVOR;
        this.f31295c = -1;
        this.f31296d = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9068g)) {
            return false;
        }
        C9068g gVar = (C9068g) obj;
        return C69664n.m101066l(this.f31294b, gVar.f31294b) && this.f31295c == gVar.f31295c && this.f31296d == gVar.f31296d;
    }

    public final int hashCode() {
        return (((this.f31294b.hashCode() * 31) + this.f31295c) * 31) + this.f31296d;
    }

    public final String toString() {
        String str = this.f31294b;
        int i = this.f31295c;
        int i2 = this.f31296d;
        return "CursorState(text=" + str + ", pos=" + i + ", lineHeight=" + i2 + ")";
    }
}
