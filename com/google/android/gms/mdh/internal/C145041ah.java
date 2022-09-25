package com.google.android.gms.mdh.internal;

import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21641f;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10952b.C147217a;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10952b.C147223g;

/* renamed from: com.google.android.gms.mdh.internal.ah */
/* compiled from: PG */
public final /* synthetic */ class C145041ah implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145043aj f392075a;

    /* renamed from: b */
    public final /* synthetic */ MdhFootprintListSafeParcelable f392076b;

    public /* synthetic */ C145041ah(C145043aj ajVar, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        this.f392075a = ajVar;
        this.f392076b = mdhFootprintListSafeParcelable;
    }

    public final void run() {
        C145043aj ajVar = this.f392075a;
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = this.f392076b;
        if (ajVar.f392080a) {
            C147223g gVar = ajVar.f392081b.f60001a;
            gVar.f397449b.mo90625b(C147217a.m240074b(new C21641f((MdhFootprint) mdhFootprintListSafeParcelable.f392054a.get(0)), gVar.f397448a));
        }
    }
}
