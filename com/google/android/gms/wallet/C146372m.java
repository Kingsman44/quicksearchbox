package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.wallet.p10883a.C146336a;
import com.google.android.gms.wallet.p10883a.C146341e;
import com.google.android.gms.wallet.p10883a.C146343g;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wallet.m */
/* compiled from: PG */
public final /* synthetic */ class C146372m implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ IsReadyToPayRequest f395390a;

    public /* synthetic */ C146372m(IsReadyToPayRequest isReadyToPayRequest) {
        this.f395390a = isReadyToPayRequest;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        IsReadyToPayRequest isReadyToPayRequest = this.f395390a;
        C146343g gVar = (C146343g) obj;
        C146341e eVar = new C146341e((C146010af) obj2);
        try {
            C146336a aVar = (C146336a) gVar.mo119451G();
            Bundle m = gVar.mo122928m();
            Parcel gA = aVar.mo17260gA();
            C8850c.m23497f(gA, isReadyToPayRequest);
            C8850c.m23497f(gA, m);
            C8850c.m23499h(gA, eVar);
            aVar.mo17263hf(14, gA);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            eVar.mo122926b(Status.f389617c, false);
        }
    }
}
