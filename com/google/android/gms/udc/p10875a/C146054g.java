package com.google.android.gms.udc.p10875a;

import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.udc.a.g */
/* compiled from: PG */
public final class C146054g extends C146056i {

    /* renamed from: a */
    final /* synthetic */ UdcWriteLocalSettingsRequest f394783a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C146054g(C143851w wVar, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest) {
        super(wVar);
        this.f394783a = udcWriteLocalSettingsRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo122562j(C146050c cVar) {
        C146053f fVar = new C146053f(this);
        UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest = this.f394783a;
        Parcel gA = cVar.mo17260gA();
        C8850c.m23499h(gA, fVar);
        C8850c.m23497f(gA, udcWriteLocalSettingsRequest);
        cVar.mo17262he(10, gA);
    }
}
