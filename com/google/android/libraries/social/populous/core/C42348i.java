package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.social.populous.core.i */
/* compiled from: PG */
public final class C42348i extends C42323cv {

    /* renamed from: a */
    public C58833ax f111072a = C58836b.f156633a;

    /* renamed from: b */
    public PersonFieldMetadata f111073b;

    /* renamed from: c */
    private int f111074c;

    /* renamed from: d */
    private String f111075d;

    /* renamed from: e */
    private boolean f111076e;

    /* renamed from: f */
    private byte f111077f;

    /* renamed from: a */
    public final Photo mo45305a() {
        if (this.f111077f == 3 && this.f111075d != null && this.f111073b != null) {
            return new AutoValue_Photo(this.f111074c, this.f111075d, this.f111072a, this.f111073b, this.f111076e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f111077f & 1) == 0) {
            sb.append(" source");
        }
        if (this.f111075d == null) {
            sb.append(" value");
        }
        if (this.f111073b == null) {
            sb.append(" metadata");
        }
        if ((this.f111077f & 2) == 0) {
            sb.append(" isDefault");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo45306b(boolean z) {
        this.f111076e = z;
        this.f111077f = (byte) (this.f111077f | 2);
    }

    /* renamed from: c */
    public final void mo45307c(int i) {
        this.f111074c = i;
        this.f111077f = (byte) (this.f111077f | 1);
    }

    /* renamed from: d */
    public final void mo45308d(String str) {
        if (str != null) {
            this.f111075d = str;
            return;
        }
        throw new NullPointerException("Null value");
    }
}
