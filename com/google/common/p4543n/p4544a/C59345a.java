package com.google.common.p4543n.p4544a;

import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.common.n.a.a */
/* compiled from: PG */
public final class C59345a {

    /* renamed from: a */
    private final long f157535a;

    /* renamed from: b */
    private final C59346b f157536b;

    /* renamed from: c */
    private final int f157537c = 0;

    /* renamed from: d */
    private final int f157538d;

    public C59345a(long j, C59346b bVar) {
        this.f157535a = j;
        bVar.getClass();
        this.f157536b = bVar;
        this.f157538d = 2;
    }

    /* renamed from: a */
    public static C59345a m92235a(long j, C59346b bVar) {
        return new C59345a(j, bVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59345a) {
            C59345a aVar = (C59345a) obj;
            if (this.f157535a == aVar.f157535a && this.f157538d == aVar.f157538d) {
                int i = aVar.f157537c;
                if (!C58832aw.m90831a((Object) null, (Object) null) || !C58832aw.m90831a(this.f157536b, aVar.f157536b)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f157535a), Integer.valueOf(this.f157538d), null, this.f157536b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f157535a);
        sb.append(' ');
        C59346b bVar = this.f157536b;
        if (bVar != C59346b.UNIT) {
            sb.append(bVar.name().toLowerCase());
        }
        sb.append((this.f157538d != 1 ? "BYTE" : "BIT").toLowerCase());
        if (this.f157535a != -1) {
            sb.append('s');
        }
        return sb.toString();
    }
}
