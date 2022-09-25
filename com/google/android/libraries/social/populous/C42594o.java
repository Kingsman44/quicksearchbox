package com.google.android.libraries.social.populous;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.social.populous.o */
/* compiled from: PG */
final class C42594o extends C42199bd {

    /* renamed from: a */
    private final boolean f111765a;

    /* renamed from: b */
    private final C58528ij f111766b;

    /* renamed from: c */
    private final C58485gu f111767c;

    /* renamed from: d */
    private final Integer f111768d;

    /* renamed from: e */
    private final int f111769e;

    public C42594o(boolean z, C58528ij ijVar, C58485gu guVar, int i, Integer num) {
        this.f111765a = z;
        this.f111766b = ijVar;
        this.f111767c = guVar;
        this.f111769e = i;
        this.f111768d = num;
    }

    /* renamed from: a */
    public final C58485gu mo44889a() {
        return this.f111767c;
    }

    /* renamed from: b */
    public final C58528ij mo44890b() {
        return this.f111766b;
    }

    /* renamed from: c */
    public final Integer mo44891c() {
        return this.f111768d;
    }

    /* renamed from: d */
    public final boolean mo44892d() {
        return this.f111765a;
    }

    /* renamed from: e */
    public final int mo44893e() {
        return this.f111769e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42199bd) {
            C42199bd bdVar = (C42199bd) obj;
            return this.f111765a == bdVar.mo44892d() && this.f111766b.equals(bdVar.mo44890b()) && C58597ky.m90218i(this.f111767c, bdVar.mo44889a()) && this.f111769e == bdVar.mo44893e() && this.f111768d.equals(bdVar.mo44891c());
        }
    }

    public final int hashCode() {
        return (((((((((true != this.f111765a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f111766b.hashCode()) * 1000003) ^ this.f111767c.hashCode()) * 1000003) ^ this.f111769e) * 1000003) ^ this.f111768d.hashCode();
    }

    public final String toString() {
        boolean z = this.f111765a;
        String obj = this.f111766b.toString();
        String obj2 = this.f111767c.toString();
        int i = this.f111769e;
        String str = i != 1 ? i != 2 ? "DID_NOT_WAIT_FOR_NETWORK_CALL" : "WAITED_FOR_NETWORK_CALL" : "UNKNOWN";
        Integer num = this.f111768d;
        return "PeopleLookupMetadata{isLastCallback=" + z + ", notFoundIds=" + obj + ", errors=" + obj2 + ", callbackDelayStatus=" + str + ", numberSentToNetwork=" + num + "}";
    }
}
