package com.google.android.libraries.elements.internal;

import com.facebook.litho.C6388hm;

/* renamed from: com.google.android.libraries.elements.internal.f */
/* compiled from: PG */
public final class C21345f implements C6388hm {

    /* renamed from: a */
    private final float f59711a;

    public C21345f(float f) {
        this.f59711a = f;
    }

    /* renamed from: a */
    public final boolean mo13237a(int i, int i2, int i3) {
        int i4 = (int) (((float) ((i3 - i2) + 1)) * this.f59711a);
        return i >= i2 - i4 && i <= i3 + i4;
    }

    /* renamed from: b */
    public final boolean mo13238b(int i, int i2, int i3) {
        int i4 = (int) (((float) ((i3 - i2) + 1)) * this.f59711a);
        return i < i2 - i4 || i > i3 + i4;
    }
}
