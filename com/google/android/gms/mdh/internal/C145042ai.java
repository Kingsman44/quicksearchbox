package com.google.android.gms.mdh.internal;

import com.google.android.apps.gsa.staticplugins.p7611bv.C97300w;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21641f;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21651p;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21654s;
import com.google.android.libraries.p10923ac.p10947c.C147208j;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10952b.C147217a;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10952b.C147223g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.mdh.internal.ai */
/* compiled from: PG */
public final /* synthetic */ class C145042ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145043aj f392077a;

    /* renamed from: b */
    public final /* synthetic */ TimeSeriesFootprintsSubscriptionFilter f392078b;

    /* renamed from: c */
    public final /* synthetic */ MdhFootprintListSafeParcelable f392079c;

    public /* synthetic */ C145042ai(C145043aj ajVar, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        this.f392077a = ajVar;
        this.f392078b = timeSeriesFootprintsSubscriptionFilter;
        this.f392079c = mdhFootprintListSafeParcelable;
    }

    public final void run() {
        C145043aj ajVar = this.f392077a;
        TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = this.f392078b;
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = this.f392079c;
        if (ajVar.f392080a) {
            C21651p pVar = ajVar.f392081b;
            List list = mdhFootprintListSafeParcelable.f392054a;
            C147223g gVar = pVar.f60001a;
            C21654s sVar = new C21654s(timeSeriesFootprintsSubscriptionFilter);
            Collection<C21641f> a = C21641f.m40758a(list);
            C58480gp e = C58485gu.m89837e();
            for (C21641f b : a) {
                e.mo55395g(C147217a.m240074b(b, gVar.f397448a));
            }
            C97300w wVar = gVar.f397449b;
            TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter2 = sVar.f60004a;
            C147208j.m240058d(timeSeriesFootprintsSubscriptionFilter2.f392044b, timeSeriesFootprintsSubscriptionFilter2.f392045c, timeSeriesFootprintsSubscriptionFilter2.f392046d);
            wVar.mo90626c(e.mo55394f());
        }
    }
}
