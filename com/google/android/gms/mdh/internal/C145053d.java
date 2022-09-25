package com.google.android.gms.mdh.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.p10813i.C144352a;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.mdh.internal.d */
/* compiled from: PG */
public final /* synthetic */ class C145053d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145060k f392110a;

    /* renamed from: b */
    public final /* synthetic */ LatestFootprintFilter f392111b;

    /* renamed from: c */
    public final /* synthetic */ C146010af f392112c;

    public /* synthetic */ C145053d(C145060k kVar, LatestFootprintFilter latestFootprintFilter, C146010af afVar) {
        this.f392110a = kVar;
        this.f392111b = latestFootprintFilter;
        this.f392112c = afVar;
    }

    public final void run() {
        C145060k kVar = this.f392110a;
        LatestFootprintFilter latestFootprintFilter = this.f392111b;
        C146010af afVar = this.f392112c;
        C145070u uVar = kVar.f392127b;
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145051b(kVar, latestFootprintFilter);
        dcVar.f389862c = new Feature[]{C144352a.f390909a};
        dcVar.f389863d = 7504;
        uVar.mo119290u(0, dcVar.mo119260a()).mo122493l(kVar.f392126a, new C145052c(afVar));
    }
}
