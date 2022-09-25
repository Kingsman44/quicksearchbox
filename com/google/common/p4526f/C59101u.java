package com.google.common.p4526f;

import com.google.common.p4526f.p4534f.C59081b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.f.u */
/* compiled from: PG */
final class C59101u {

    /* renamed from: a */
    public final int f157072a;

    /* renamed from: b */
    public final TimeUnit f157073b;

    /* renamed from: c */
    public int f157074c = -1;

    public C59101u(int i, TimeUnit timeUnit) {
        this.f157072a = i;
        C59081b.m91349a(timeUnit, "time unit");
        this.f157073b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59101u) {
            C59101u uVar = (C59101u) obj;
            if (this.f157072a == uVar.f157072a && this.f157073b == uVar.f157073b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f157072a * 37) ^ this.f157073b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f157072a);
        sb.append(' ');
        sb.append(this.f157073b);
        if (this.f157074c > 0) {
            sb.append(" [skipped: ");
            sb.append(this.f157074c);
            sb.append(']');
        }
        return sb.toString();
    }
}
