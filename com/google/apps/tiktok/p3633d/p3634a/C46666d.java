package com.google.apps.tiktok.p3633d.p3634a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.apps.tiktok.d.a.d */
/* compiled from: PG */
final class C46666d extends C46677o {

    /* renamed from: a */
    private final C58485gu f121928a;

    /* renamed from: b */
    private final boolean f121929b;

    /* renamed from: c */
    private final long f121930c;

    /* renamed from: d */
    private final int f121931d;

    public C46666d(C58485gu guVar, boolean z, long j, int i) {
        this.f121928a = guVar;
        this.f121929b = z;
        this.f121930c = j;
        this.f121931d = i;
    }

    /* renamed from: a */
    public final long mo50697a() {
        return this.f121930c;
    }

    /* renamed from: b */
    public final C58485gu mo50698b() {
        return this.f121928a;
    }

    /* renamed from: c */
    public final boolean mo50699c() {
        return this.f121929b;
    }

    /* renamed from: d */
    public final int mo50700d() {
        return this.f121931d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46677o) {
            C46677o oVar = (C46677o) obj;
            return C58597ky.m90218i(this.f121928a, oVar.mo50698b()) && this.f121929b == oVar.mo50699c() && this.f121930c == oVar.mo50697a() && this.f121931d == oVar.mo50700d();
        }
    }

    public final int hashCode() {
        int hashCode = (this.f121928a.hashCode() ^ 1000003) * 1000003;
        int i = true != this.f121929b ? 1237 : 1231;
        long j = this.f121930c;
        return ((((hashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f121931d;
    }

    public final String toString() {
        String obj = this.f121928a.toString();
        boolean z = this.f121929b;
        long j = this.f121930c;
        String str = this.f121931d != 1 ? "NORMAL" : "MINI";
        return "DebugDataRequest{acceptTypes=" + obj + ", allowPii=" + z + ", timeLimitMs=" + j + ", size=" + str + "}";
    }
}
