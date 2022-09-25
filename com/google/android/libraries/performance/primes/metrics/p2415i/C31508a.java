package com.google.android.libraries.performance.primes.metrics.p2415i;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.performance.primes.metrics.i.a */
/* compiled from: PG */
public final class C31508a extends C31518k {

    /* renamed from: a */
    public int f84849a;

    /* renamed from: b */
    public float f84850b;

    /* renamed from: c */
    public C58833ax f84851c = C58836b.f156633a;

    /* renamed from: d */
    public byte f84852d;

    /* renamed from: e */
    public int f84853e;

    /* renamed from: a */
    public final C31519l mo37200a() {
        int i;
        if (this.f84852d == 3 && (i = this.f84853e) != 0) {
            return new C31509b(i, this.f84849a, this.f84850b, this.f84851c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f84853e == 0) {
            sb.append(" enablement");
        }
        if ((this.f84852d & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.f84852d & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
