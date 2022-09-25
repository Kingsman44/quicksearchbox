package com.google.android.libraries.geller.p1818f;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.geller.f.d */
/* compiled from: PG */
final class C21854d extends C21829bl {

    /* renamed from: a */
    private final boolean f60314a;

    /* renamed from: b */
    private final Boolean f60315b;

    /* renamed from: c */
    private final Integer f60316c;

    /* renamed from: d */
    private final C58485gu f60317d;

    public C21854d(boolean z, Boolean bool, Integer num, C58485gu guVar) {
        this.f60314a = z;
        this.f60315b = bool;
        this.f60316c = num;
        this.f60317d = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo27134a() {
        return this.f60317d;
    }

    /* renamed from: b */
    public final Boolean mo27135b() {
        return this.f60315b;
    }

    /* renamed from: c */
    public final Integer mo27136c() {
        return this.f60316c;
    }

    /* renamed from: d */
    public final boolean mo27137d() {
        return this.f60314a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21829bl) {
            C21829bl blVar = (C21829bl) obj;
            return this.f60314a == blVar.mo27137d() && this.f60315b.equals(blVar.mo27135b()) && this.f60316c.equals(blVar.mo27136c()) && C58597ky.m90218i(this.f60317d, blVar.mo27134a());
        }
    }

    public final int hashCode() {
        return (((((((true != this.f60314a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f60315b.hashCode()) * 1000003) ^ this.f60316c.hashCode()) * 1000003) ^ this.f60317d.hashCode();
    }

    public final String toString() {
        boolean z = this.f60314a;
        Boolean bool = this.f60315b;
        Integer num = this.f60316c;
        String obj = this.f60317d.toString();
        return "GellerSyncExperimentalParams{enableGellerReconSyncScheduling=" + z + ", enableGellerSyncRetry=" + bool + ", maximumRetryAttemptsCount=" + num + ", gellerRetryableErrorCodes=" + obj + "}";
    }
}
