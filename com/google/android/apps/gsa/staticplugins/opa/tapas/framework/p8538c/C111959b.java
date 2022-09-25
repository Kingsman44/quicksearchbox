package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.b */
/* compiled from: PG */
final class C111959b extends C111985p {

    /* renamed from: a */
    private final C58485gu f311034a;

    /* renamed from: b */
    private final C58485gu f311035b;

    /* renamed from: c */
    private final C58528ij f311036c;

    public C111959b(C58485gu guVar, C58485gu guVar2, C58528ij ijVar) {
        if (guVar != null) {
            this.f311034a = guVar;
            if (guVar2 != null) {
                this.f311035b = guVar2;
                if (ijVar != null) {
                    this.f311036c = ijVar;
                    return;
                }
                throw new NullPointerException("Null getIncompleteSourcesBeforeFastTimeout");
            }
            throw new NullPointerException("Null delayedCandidates");
        }
        throw new NullPointerException("Null availableCandidates");
    }

    /* renamed from: a */
    public final C58485gu mo99311a() {
        return this.f311034a;
    }

    /* renamed from: b */
    public final C58485gu mo99312b() {
        return this.f311035b;
    }

    /* renamed from: c */
    public final C58528ij mo99313c() {
        return this.f311036c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111985p) {
            C111985p pVar = (C111985p) obj;
            return C58597ky.m90218i(this.f311034a, pVar.mo99311a()) && C58597ky.m90218i(this.f311035b, pVar.mo99312b()) && this.f311036c.equals(pVar.mo99313c());
        }
    }

    public final int hashCode() {
        return ((((this.f311034a.hashCode() ^ 1000003) * 1000003) ^ this.f311035b.hashCode()) * 1000003) ^ this.f311036c.hashCode();
    }

    public final String toString() {
        String obj = this.f311034a.toString();
        String obj2 = this.f311035b.toString();
        String obj3 = this.f311036c.toString();
        return "CandidateFetchResults{availableCandidates=" + obj + ", delayedCandidates=" + obj2 + ", getIncompleteSourcesBeforeFastTimeout=" + obj3 + "}";
    }
}
