package com.google.android.apps.education.bloom.mathview.render.comm;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.comm.h */
/* compiled from: PG */
public final class C9064h {
    /* renamed from: a */
    public static final void m23604a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("selectionStart must be >= 0");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("selectionEnd must be >= 0");
        } else if (i > i2) {
            throw new IllegalArgumentException("`selectionStart(" + i + ")` must be <= `selectionEnd(" + i2 + ")`");
        }
    }
}
