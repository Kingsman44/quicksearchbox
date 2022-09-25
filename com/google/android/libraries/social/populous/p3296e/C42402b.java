package com.google.android.libraries.social.populous.p3296e;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
import com.google.android.libraries.social.populous.core.C42264aq;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.e.b */
/* compiled from: PG */
final class C42402b extends C42500d {

    /* renamed from: a */
    private final C58485gu f111206a;

    /* renamed from: b */
    private final C58833ax f111207b;

    /* renamed from: c */
    private final C42264aq f111208c;

    /* renamed from: d */
    private final int f111209d;

    /* renamed from: e */
    private final int f111210e;

    /* renamed from: f */
    private final C42549n f111211f;

    /* renamed from: g */
    private final Long f111212g;

    /* renamed from: h */
    private final boolean f111213h;

    /* renamed from: i */
    private final Integer f111214i;

    /* renamed from: j */
    private final AutocompletionCallbackMetadata f111215j;

    /* renamed from: k */
    private final int f111216k;

    public C42402b(C58485gu guVar, C58833ax axVar, C42264aq aqVar, int i, int i2, C42549n nVar, Long l, boolean z, Integer num, int i3, AutocompletionCallbackMetadata autocompletionCallbackMetadata) {
        this.f111206a = guVar;
        this.f111207b = axVar;
        this.f111208c = aqVar;
        this.f111209d = i;
        this.f111210e = i2;
        this.f111211f = nVar;
        this.f111212g = l;
        this.f111213h = z;
        this.f111214i = num;
        this.f111216k = i3;
        this.f111215j = autocompletionCallbackMetadata;
    }

    /* renamed from: a */
    public final int mo45377a() {
        return this.f111209d;
    }

    /* renamed from: b */
    public final int mo45378b() {
        return this.f111210e;
    }

    /* renamed from: c */
    public final AutocompletionCallbackMetadata mo45379c() {
        return this.f111215j;
    }

    /* renamed from: d */
    public final C42264aq mo45380d() {
        return this.f111208c;
    }

    /* renamed from: e */
    public final C42549n mo45381e() {
        return this.f111211f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        r1 = r4.f111212g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r1 = r4.f111214i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f111208c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.p3296e.C42500d
            r2 = 0
            if (r1 == 0) goto L_0x00a2
            com.google.android.libraries.social.populous.e.d r5 = (com.google.android.libraries.social.populous.p3296e.C42500d) r5
            com.google.common.b.gu r1 = r4.f111206a
            com.google.common.b.gu r3 = r5.mo45384g()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x00a2
            com.google.common.base.ax r1 = r4.f111207b
            com.google.common.base.ax r3 = r5.mo45383f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
            com.google.android.libraries.social.populous.core.aq r1 = r4.f111208c
            if (r1 != 0) goto L_0x002e
            com.google.android.libraries.social.populous.core.aq r1 = r5.mo45380d()
            if (r1 != 0) goto L_0x00a2
            goto L_0x0038
        L_0x002e:
            com.google.android.libraries.social.populous.core.aq r3 = r5.mo45380d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
        L_0x0038:
            int r1 = r4.f111209d
            int r3 = r5.mo45377a()
            if (r1 != r3) goto L_0x00a2
            int r1 = r4.f111210e
            int r3 = r5.mo45378b()
            if (r1 != r3) goto L_0x00a2
            com.google.android.libraries.social.populous.e.n r1 = r4.f111211f
            com.google.android.libraries.social.populous.e.n r3 = r5.mo45381e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
            java.lang.Long r1 = r4.f111212g
            if (r1 != 0) goto L_0x005f
            java.lang.Long r1 = r5.mo45387i()
            if (r1 != 0) goto L_0x00a2
            goto L_0x0069
        L_0x005f:
            java.lang.Long r3 = r5.mo45387i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
        L_0x0069:
            boolean r1 = r4.f111213h
            boolean r3 = r5.mo45389k()
            if (r1 != r3) goto L_0x00a2
            java.lang.Integer r1 = r4.f111214i
            if (r1 != 0) goto L_0x007c
            java.lang.Integer r1 = r5.mo45385h()
            if (r1 != 0) goto L_0x00a2
            goto L_0x0087
        L_0x007c:
            java.lang.Integer r3 = r5.mo45385h()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0087
            goto L_0x00a2
        L_0x0087:
            int r1 = r4.f111216k
            int r3 = r5.mo45390l()
            if (r1 != r3) goto L_0x00a2
            com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata r1 = r4.f111215j
            com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata r3 = r5.mo45379c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
            boolean r5 = r5.mo45388j()
            if (r5 != 0) goto L_0x00a2
            return r0
        L_0x00a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.p3296e.C42402b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C58833ax mo45383f() {
        return this.f111207b;
    }

    /* renamed from: g */
    public final C58485gu mo45384g() {
        return this.f111206a;
    }

    /* renamed from: h */
    public final Integer mo45385h() {
        return this.f111214i;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((this.f111206a.hashCode() ^ 1000003) * 1000003) ^ this.f111207b.hashCode()) * 1000003;
        C42264aq aqVar = this.f111208c;
        int i3 = 0;
        if (aqVar == null) {
            i = 0;
        } else {
            i = aqVar.hashCode();
        }
        int hashCode2 = (((((((hashCode ^ i) * 1000003) ^ this.f111209d) * 1000003) ^ this.f111210e) * 1000003) ^ this.f111211f.hashCode()) * 1000003;
        Long l = this.f111212g;
        if (l == null) {
            i2 = 0;
        } else {
            i2 = l.hashCode();
        }
        int i4 = (((hashCode2 ^ i2) * 1000003) ^ (true != this.f111213h ? 1237 : 1231)) * 1000003;
        Integer num = this.f111214i;
        if (num != null) {
            i3 = num.hashCode();
        }
        return ((((((i4 ^ i3) * 1000003) ^ this.f111216k) * 1000003) ^ this.f111215j.hashCode()) * 1000003) ^ 1237;
    }

    /* renamed from: i */
    public final Long mo45387i() {
        return this.f111212g;
    }

    /* renamed from: j */
    public final boolean mo45388j() {
        return false;
    }

    /* renamed from: k */
    public final boolean mo45389k() {
        return this.f111213h;
    }

    /* renamed from: l */
    public final int mo45390l() {
        return this.f111216k;
    }

    public final String toString() {
        String obj = this.f111206a.toString();
        String valueOf = String.valueOf(this.f111207b);
        String valueOf2 = String.valueOf(this.f111208c);
        int i = this.f111209d;
        int i2 = this.f111210e;
        String obj2 = this.f111211f.toString();
        Long l = this.f111212g;
        boolean z = this.f111213h;
        Integer num = this.f111214i;
        String num2 = Integer.toString(this.f111216k - 1);
        String obj3 = this.f111215j.toString();
        return "CallbackInfo{results=" + obj + ", leanResult=" + valueOf + ", callbackError=" + valueOf2 + ", callbackNumber=" + i + ", positionOffset=" + i2 + ", queryState=" + obj2 + ", cacheLastUpdatedTime=" + l + ", isLastCallback=" + z + ", topNAffinityVersion=" + num + ", resultsSourceType=" + num2 + ", metadata=" + obj3 + ", containsPartialResults=false}";
    }
}
