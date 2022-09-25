package com.google.android.gms.usagereporting.p10876a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* renamed from: com.google.android.gms.usagereporting.a.k */
/* compiled from: PG */
final class C146085k extends C146083i {

    /* renamed from: a */
    private final C143825n f394806a;

    public C146085k(C143825n nVar) {
        this.f394806a = nVar;
    }

    /* renamed from: a */
    public final void mo122592a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        if (!status.mo119097c()) {
            this.f394806a.mo117682i(new C146080f(status, (UsageReportingOptInOptions) null));
        } else {
            this.f394806a.mo117682i(new C146080f(Status.f389615a, usageReportingOptInOptions));
        }
    }
}
