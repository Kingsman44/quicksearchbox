package com.google.android.libraries.social.populous;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.social.populous.q */
/* compiled from: PG */
final class C42596q extends C42201bf {

    /* renamed from: b */
    private final boolean f111776b;

    /* renamed from: c */
    private final boolean f111777c;

    /* renamed from: d */
    private final C58485gu f111778d;

    /* renamed from: e */
    private final C58485gu f111779e;

    /* renamed from: f */
    private final int f111780f;

    public C42596q(boolean z, boolean z2, int i, C58485gu guVar, C58485gu guVar2) {
        this.f111776b = z;
        this.f111777c = z2;
        this.f111780f = i;
        this.f111778d = guVar;
        this.f111779e = guVar2;
    }

    /* renamed from: a */
    public final C58485gu mo44897a() {
        return this.f111778d;
    }

    /* renamed from: b */
    public final C58485gu mo44898b() {
        return this.f111779e;
    }

    @Deprecated
    /* renamed from: c */
    public final boolean mo44899c() {
        return this.f111777c;
    }

    @Deprecated
    /* renamed from: d */
    public final boolean mo44900d() {
        return this.f111776b;
    }

    /* renamed from: e */
    public final int mo44901e() {
        return this.f111780f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42201bf) {
            C42201bf bfVar = (C42201bf) obj;
            if (this.f111776b == bfVar.mo44900d() && this.f111777c == bfVar.mo44899c()) {
                int i = this.f111780f;
                int e = bfVar.mo44901e();
                if (i != 0) {
                    return i == e && C58597ky.m90218i(this.f111778d, bfVar.mo44897a()) && C58597ky.m90218i(this.f111779e, bfVar.mo44898b());
                }
                throw null;
            }
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f111776b ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f111777c) {
            i = 1231;
        }
        int i3 = (i2 ^ i) * 1000003;
        int i4 = this.f111780f;
        if (i4 != 0) {
            return ((((i3 ^ i4) * 1000003) ^ this.f111778d.hashCode()) * 1000003) ^ this.f111779e.hashCode();
        }
        throw null;
    }

    public final String toString() {
        boolean z = this.f111776b;
        boolean z2 = this.f111777c;
        int i = this.f111780f;
        String str = i != 1 ? i != 2 ? "null" : "MATCH_LOOKUP_ID" : "FULL";
        String valueOf = String.valueOf(this.f111778d);
        String valueOf2 = String.valueOf(this.f111779e);
        return "PeopleLookupOptions{returnContactsWithProfileIdOnly=" + z + ", restrictLookupToCache=" + z2 + ", personMask=" + str + ", highPriorityCustomDataProviderIds=" + valueOf + ", lowPriorityCustomDataProviderIds=" + valueOf2 + "}";
    }
}
