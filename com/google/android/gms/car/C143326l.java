package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.gms.car.p10760f.C143301p;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.car.l */
/* compiled from: PG */
public final /* synthetic */ class C143326l implements C143798cs {

    /* renamed from: a */
    public static final /* synthetic */ C143326l f388550a = new C143326l();

    private /* synthetic */ C143326l() {
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        int i = C143339x.f388564c;
        C143141by byVar = (C143141by) ((C143301p) obj).mo119451G();
        Parcel gT = byVar.mo17261gT(1, byVar.mo17260gA());
        ArrayList createTypedArrayList = gT.createTypedArrayList(CarCall.CREATOR);
        gT.recycle();
        ((C146010af) obj2).f394698a.mo122508v(createTypedArrayList);
    }
}
