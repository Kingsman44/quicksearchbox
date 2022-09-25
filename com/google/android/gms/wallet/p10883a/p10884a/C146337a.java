package com.google.android.gms.wallet.p10883a.p10884a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.C146376q;
import com.google.android.gms.wallet.firstparty.C146358f;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.p10883a.C146336a;
import com.google.android.gms.wallet.p10883a.C146342f;
import com.google.android.gms.wallet.p10883a.C146343g;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wallet.a.a.a */
/* compiled from: PG */
public final class C146337a extends C146376q {

    /* renamed from: a */
    final /* synthetic */ GetClientTokenRequest f395346a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C146337a(C143851w wVar, GetClientTokenRequest getClientTokenRequest) {
        super(wVar);
        this.f395346a = getClientTokenRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return new C146358f(status, new GetClientTokenResponse(new byte[0]));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ void mo117681h(C143717b bVar) {
        C146343g gVar = (C146343g) bVar;
        GetClientTokenRequest getClientTokenRequest = this.f395346a;
        C146342f fVar = new C146342f(this);
        Bundle m = gVar.mo122928m();
        try {
            C146336a aVar = (C146336a) gVar.mo119451G();
            Parcel gA = aVar.mo17260gA();
            C8850c.m23497f(gA, getClientTokenRequest);
            C8850c.m23497f(gA, m);
            C8850c.m23499h(gA, fVar);
            aVar.mo17263hf(15, gA);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting client token", e);
            fVar.mo122925a(Status.f389617c, new GetClientTokenResponse(new byte[0]));
        }
    }
}
