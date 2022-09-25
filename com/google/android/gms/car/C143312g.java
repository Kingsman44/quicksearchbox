package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.gms.car.p10760f.C143301p;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.car.g */
/* compiled from: PG */
public final /* synthetic */ class C143312g implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f388543a;

    public /* synthetic */ C143312g(String str) {
        this.f388543a = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f388543a;
        int i = C143339x.f388564c;
        C143141by byVar = (C143141by) ((C143301p) obj).mo119451G();
        Parcel gA = byVar.mo17260gA();
        gA.writeString(str);
        byVar.mo17262he(19, gA);
        ((C146010af) obj2).f394698a.mo122508v((Object) null);
    }
}
