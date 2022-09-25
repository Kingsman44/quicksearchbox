package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.gms.car.p10760f.C143301p;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.car.n */
/* compiled from: PG */
public final /* synthetic */ class C143329n implements C143798cs {

    /* renamed from: a */
    public static final /* synthetic */ C143329n f388552a = new C143329n();

    private /* synthetic */ C143329n() {
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143141by byVar = (C143141by) ((C143301p) obj).mo119451G();
        Parcel gT = byVar.mo17261gT(4, byVar.mo17260gA());
        int readInt = gT.readInt();
        gT.recycle();
        ((C146010af) obj2).f394698a.mo122508v(Integer.valueOf(readInt));
    }
}
