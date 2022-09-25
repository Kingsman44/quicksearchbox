package com.google.android.libraries.social.populous.logging;

import com.google.common.base.C58872ci;

/* renamed from: com.google.android.libraries.social.populous.logging.i */
/* compiled from: PG */
final class C42574i extends C42590y {

    /* renamed from: a */
    private final C58872ci f111724a;

    /* renamed from: b */
    private final Integer f111725b;

    /* renamed from: c */
    private final int f111726c;

    /* renamed from: d */
    private final int f111727d;

    /* renamed from: e */
    private final int f111728e;

    /* renamed from: f */
    private final int f111729f;

    public C42574i(C58872ci ciVar, Integer num, int i, int i2, int i3, int i4) {
        this.f111724a = ciVar;
        this.f111725b = num;
        this.f111726c = i;
        this.f111727d = i2;
        this.f111728e = i3;
        this.f111729f = i4;
    }

    /* renamed from: a */
    public final int mo45653a() {
        return this.f111726c;
    }

    /* renamed from: b */
    public final C58872ci mo45654b() {
        return this.f111724a;
    }

    /* renamed from: c */
    public final Integer mo45655c() {
        return this.f111725b;
    }

    /* renamed from: d */
    public final int mo45656d() {
        return this.f111727d;
    }

    /* renamed from: e */
    public final int mo45657e() {
        return this.f111728e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42590y) {
            C42590y yVar = (C42590y) obj;
            C58872ci ciVar = this.f111724a;
            if (ciVar != null ? ciVar.equals(yVar.mo45654b()) : yVar.mo45654b() == null) {
                Integer num = this.f111725b;
                if (num != null ? num.equals(yVar.mo45655c()) : yVar.mo45655c() == null) {
                    return this.f111726c == yVar.mo45653a() && this.f111727d == yVar.mo45656d() && this.f111728e == yVar.mo45657e() && this.f111729f == yVar.mo45659f();
                }
            }
        }
    }

    /* renamed from: f */
    public final int mo45659f() {
        return this.f111729f;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f111724a);
        Integer num = this.f111725b;
        int i = this.f111726c;
        String num2 = Integer.toString(this.f111727d - 1);
        String num3 = Integer.toString(this.f111728e - 1);
        String num4 = Integer.toString(this.f111729f - 1);
        return "MetricApiResultDetails{latency=" + valueOf + ", resultIndex=" + num + ", itemCount=" + i + ", cacheStatusAtQuery=" + num2 + ", cacheStatusAtResult=" + num3 + ", dataSource=" + num4 + "}";
    }

    public final int hashCode() {
        int i;
        C58872ci ciVar = this.f111724a;
        int i2 = 0;
        if (ciVar == null) {
            i = 0;
        } else {
            i = ciVar.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        Integer num = this.f111725b;
        if (num != null) {
            i2 = num.hashCode();
        }
        return ((((((((i3 ^ i2) * 1000003) ^ this.f111726c) * 1000003) ^ this.f111727d) * 1000003) ^ this.f111728e) * 1000003) ^ this.f111729f;
    }
}
