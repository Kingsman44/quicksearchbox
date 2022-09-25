package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9182e;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.e.a */
/* compiled from: PG */
final class C121263a extends C121269g {

    /* renamed from: a */
    private final C58485gu f336827a;

    /* renamed from: b */
    private final C58485gu f336828b;

    /* renamed from: c */
    private final C58528ij f336829c;

    public C121263a(C58485gu guVar, C58485gu guVar2, C58528ij ijVar) {
        if (guVar != null) {
            this.f336827a = guVar;
            if (guVar2 != null) {
                this.f336828b = guVar2;
                if (ijVar != null) {
                    this.f336829c = ijVar;
                    return;
                }
                throw new NullPointerException("Null getIncompleteSourcesBeforeFastTimeout");
            }
            throw new NullPointerException("Null delayedCandidates");
        }
        throw new NullPointerException("Null availableCandidates");
    }

    /* renamed from: a */
    public final C58485gu mo105100a() {
        return this.f336827a;
    }

    /* renamed from: b */
    public final C58485gu mo105101b() {
        return this.f336828b;
    }

    /* renamed from: c */
    public final C58528ij mo105102c() {
        return this.f336829c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C121269g) {
            C121269g gVar = (C121269g) obj;
            return C58597ky.m90218i(this.f336827a, gVar.mo105100a()) && C58597ky.m90218i(this.f336828b, gVar.mo105101b()) && this.f336829c.equals(gVar.mo105102c());
        }
    }

    public final int hashCode() {
        return ((((this.f336827a.hashCode() ^ 1000003) * 1000003) ^ this.f336828b.hashCode()) * 1000003) ^ ((C58733pz) this.f336829c).f156499d;
    }

    public final String toString() {
        String obj = this.f336827a.toString();
        String obj2 = this.f336828b.toString();
        String obj3 = this.f336829c.toString();
        return "CandidateFetchResults{availableCandidates=" + obj + ", delayedCandidates=" + obj2 + ", getIncompleteSourcesBeforeFastTimeout=" + obj3 + "}";
    }
}
