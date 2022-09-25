package com.google.android.gms.pay.p10853b;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.pay.GetPassesRequest;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.pay.b.e */
/* compiled from: PG */
public final /* synthetic */ class C145599e implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ GetPassesRequest f393723a;

    public /* synthetic */ C145599e(GetPassesRequest getPassesRequest) {
        this.f393723a = getPassesRequest;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        GetPassesRequest getPassesRequest = this.f393723a;
        C145595a aVar = (C145595a) ((C145603i) obj).mo119451G();
        C145600f fVar = new C145600f((C146010af) obj2);
        Parcel gA = aVar.mo17260gA();
        C8850c.m23497f(gA, getPassesRequest);
        C8850c.m23499h(gA, fVar);
        aVar.mo17262he(82, gA);
    }
}
