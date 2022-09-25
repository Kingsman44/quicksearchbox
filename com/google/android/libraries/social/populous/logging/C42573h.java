package com.google.android.libraries.social.populous.logging;

import com.google.common.base.C58872ci;

/* renamed from: com.google.android.libraries.social.populous.logging.h */
/* compiled from: PG */
public final class C42573h extends C42589x {

    /* renamed from: a */
    public C58872ci f111717a;

    /* renamed from: b */
    public Integer f111718b;

    /* renamed from: c */
    public int f111719c;

    /* renamed from: d */
    public int f111720d;

    /* renamed from: e */
    private int f111721e;

    /* renamed from: f */
    private byte f111722f;

    /* renamed from: g */
    private int f111723g;

    /* renamed from: a */
    public final C42590y mo45650a() {
        int i;
        int i2;
        int i3;
        if (this.f111722f == 1 && (i = this.f111719c) != 0 && (i2 = this.f111720d) != 0 && (i3 = this.f111723g) != 0) {
            return new C42574i(this.f111717a, this.f111718b, this.f111721e, i, i2, i3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f111722f == 0) {
            sb.append(" itemCount");
        }
        if (this.f111719c == 0) {
            sb.append(" cacheStatusAtQuery");
        }
        if (this.f111720d == 0) {
            sb.append(" cacheStatusAtResult");
        }
        if (this.f111723g == 0) {
            sb.append(" dataSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo45651b(int i) {
        this.f111721e = i;
        this.f111722f = 1;
    }

    /* renamed from: c */
    public final void mo45652c(int i) {
        if (i != 0) {
            this.f111723g = i;
            return;
        }
        throw new NullPointerException("Null dataSource");
    }
}
