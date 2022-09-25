package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.gms.car.p10760f.C143301p;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.car.q */
/* compiled from: PG */
public final /* synthetic */ class C143332q implements C143798cs {

    /* renamed from: a */
    public static final /* synthetic */ C143332q f388555a = new C143332q();

    private /* synthetic */ C143332q() {
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143141by byVar = (C143141by) ((C143301p) obj).mo119451G();
        Parcel gT = byVar.mo17261gT(5, byVar.mo17260gA());
        int readInt = gT.readInt();
        gT.recycle();
        ((C146010af) obj2).f394698a.mo122508v(Integer.valueOf(readInt));
    }
}
