package com.google.android.libraries.phenotype.client.stable;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import java.util.List;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.phenotype.client.stable.bt */
/* compiled from: PG */
public final class C31728bt {

    /* renamed from: a */
    private final String f85293a;

    /* renamed from: b */
    private final Set f85294b;

    /* renamed from: c */
    private final boolean f85295c;

    /* renamed from: d */
    private final boolean f85296d;

    public C31728bt(String str) {
        this(str, C58733pz.f156496a, false, false);
    }

    private C31728bt(String str, Set set, boolean z, boolean z2) {
        this.f85293a = str;
        this.f85294b = set;
        this.f85295c = z;
        this.f85296d = z2;
    }

    /* renamed from: a */
    public final C31718bj mo37339a(String str, long j) {
        String str2 = this.f85293a;
        Long valueOf = Long.valueOf(j);
        boolean z = this.f85295c;
        boolean z2 = this.f85296d;
        C58528ij F = C58528ij.m90006F(this.f85294b);
        C31725bq bqVar = C31725bq.f85291a;
        Class<Long> cls = Long.class;
        Objects.requireNonNull(cls);
        return new C31718bj(str2, str, valueOf, new C31743j(z, z2, F, bqVar, new C31726br(cls)));
    }

    /* renamed from: b */
    public final C31718bj mo37340b(String str, String str2) {
        String str3 = this.f85293a;
        boolean z = this.f85295c;
        boolean z2 = this.f85296d;
        C58528ij F = C58528ij.m90006F(this.f85294b);
        C31722bn bnVar = C31722bn.f85288a;
        Class<String> cls = String.class;
        Objects.requireNonNull(cls);
        return new C31718bj(str3, str, str2, new C31743j(z, z2, F, bnVar, new C31721bm(cls)));
    }

    /* renamed from: c */
    public final C31718bj mo37341c(String str, boolean z) {
        String str2 = this.f85293a;
        Boolean valueOf = Boolean.valueOf(z);
        boolean z2 = this.f85295c;
        boolean z3 = this.f85296d;
        C58528ij F = C58528ij.m90006F(this.f85294b);
        C31723bo boVar = C31723bo.f85289a;
        Class<Boolean> cls = Boolean.class;
        Objects.requireNonNull(cls);
        return new C31718bj(str2, str, valueOf, new C31743j(z2, z3, F, boVar, new C31724bp(cls)));
    }

    /* renamed from: d */
    public final C31718bj mo37342d(String str, Object obj, C31727bs bsVar) {
        return new C31718bj(this.f85293a, str, obj, new C31743j(this.f85295c, this.f85296d, C58528ij.m90006F(this.f85294b), new C31719bk(bsVar), new C31720bl(bsVar)));
    }

    /* renamed from: e */
    public final C31728bt mo37343e() {
        return new C31728bt(this.f85293a, this.f85294b, true, this.f85296d);
    }

    /* renamed from: f */
    public final C31728bt mo37344f() {
        return new C31728bt(this.f85293a, this.f85294b, this.f85295c, true);
    }

    /* renamed from: g */
    public final C31728bt mo37345g(List list) {
        return new C31728bt(this.f85293a, C58528ij.m90006F(list), this.f85295c, this.f85296d);
    }
}
