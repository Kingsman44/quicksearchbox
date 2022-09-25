package com.google.android.apps.education.bloom.mathview.render;

import android.graphics.Path;
import android.graphics.RectF;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.d */
/* compiled from: PG */
final class C9065d {

    /* renamed from: a */
    public static final C9056c f31289a = new C9056c();

    /* renamed from: b */
    public final Path f31290b;

    /* renamed from: c */
    public final RectF f31291c;

    public C9065d() {
        this((byte[]) null);
    }

    public /* synthetic */ C9065d(byte[] bArr) {
        Path path = new Path();
        RectF rectF = new RectF();
        this.f31290b = path;
        this.f31291c = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9065d)) {
            return false;
        }
        C9065d dVar = (C9065d) obj;
        return C69664n.m101066l(this.f31290b, dVar.f31290b) && C69664n.m101066l(this.f31291c, dVar.f31291c);
    }

    public final int hashCode() {
        return (this.f31290b.hashCode() * 31) + this.f31291c.hashCode();
    }

    public final String toString() {
        Path path = this.f31290b;
        RectF rectF = this.f31291c;
        return "CursorPath(path=" + path + ", bounds=" + rectF + ")";
    }
}
