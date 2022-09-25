package com.google.android.gms.mdh.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21651p;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.mdh.internal.aj */
/* compiled from: PG */
public final class C145043aj extends C145065p {

    /* renamed from: a */
    public volatile boolean f392080a = true;

    /* renamed from: b */
    public final C21651p f392081b;

    /* renamed from: c */
    private final Executor f392082c;

    public C145043aj(Executor executor, C21651p pVar) {
        this.f392082c = executor;
        this.f392081b = pVar;
    }

    /* renamed from: a */
    public final void mo120571a(C143773bu buVar, long j) {
        if (this.f392080a) {
            this.f392082c.execute(new C145039af(this, j));
        }
        buVar.mo117762a(Status.f389615a);
    }

    /* renamed from: b */
    public final void mo120572b(C143773bu buVar, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        if (this.f392080a) {
            this.f392082c.execute(new C145041ah(this, mdhFootprintListSafeParcelable));
        }
        buVar.mo117762a(Status.f389615a);
    }

    /* renamed from: c */
    public final void mo120573c(C143773bu buVar, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        if (this.f392080a) {
            this.f392082c.execute(new C145042ai(this, timeSeriesFootprintsSubscriptionFilter, mdhFootprintListSafeParcelable));
        }
        buVar.mo117762a(Status.f389615a);
    }

    /* renamed from: d */
    public final void mo120574d(C143773bu buVar, SyncStatus syncStatus) {
        if (this.f392080a) {
            this.f392082c.execute(new C145040ag(this, syncStatus));
        }
        buVar.mo117762a(Status.f389615a);
    }
}
