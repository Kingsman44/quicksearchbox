package com.google.android.gms.mdh.internal;

import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.tasks.C146010af;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.mdh.internal.an */
/* compiled from: PG */
public final class C145047an {

    /* renamed from: a */
    public final List f392089a = new ArrayList();

    /* renamed from: b */
    public boolean f392090b;

    /* renamed from: c */
    public final C146010af f392091c;

    /* renamed from: d */
    public final /* synthetic */ C145050aq f392092d;

    /* renamed from: e */
    private final C145049ap f392093e;

    public C145047an(C145050aq aqVar, C146010af afVar, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter) {
        this.f392092d = aqVar;
        this.f392091c = afVar;
        this.f392093e = new C145049ap(aqVar, syncPolicy, timeSeriesFootprintsSubscriptionFilter);
    }

    /* renamed from: a */
    public final void mo120576a() {
        this.f392090b = true;
        this.f392092d.f392100c.mo119290u(1, this.f392093e).mo122493l(this.f392092d.f392098a, new C145046am(this));
    }
}
