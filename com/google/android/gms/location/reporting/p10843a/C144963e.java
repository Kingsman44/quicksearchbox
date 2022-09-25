package com.google.android.gms.location.reporting.p10843a;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.location.reporting.ReportingState;

/* renamed from: com.google.android.gms.location.reporting.a.e */
/* compiled from: PG */
public final class C144963e implements C143711ad {

    /* renamed from: a */
    public final Status f391933a;

    /* renamed from: b */
    public final ReportingState f391934b;

    public C144963e(Status status, ReportingState reportingState) {
        this.f391933a = status;
        if (status.f389621g == 0) {
            C143919bh.m233958a(reportingState);
        }
        this.f391934b = reportingState;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f391933a;
    }

    /* renamed from: b */
    public final void mo120469b() {
        Status status = this.f391933a;
        if (status.f389621g != 0) {
            throw new IllegalStateException("Illegal to call this method when status is failure: ".concat(String.valueOf(String.valueOf(status))));
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f391933a);
        String valueOf2 = String.valueOf(this.f391934b);
        return "ReportingStateResultImpl{mStatus=" + valueOf + ", mReportingState=" + valueOf2 + "}";
    }
}
