package com.google.android.gms.udc.p10875a;

import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.udc.a.e */
/* compiled from: PG */
final class C146052e extends C146056i {

    /* renamed from: a */
    final /* synthetic */ UdcCacheRequest f394781a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C146052e(C143851w wVar, UdcCacheRequest udcCacheRequest) {
        super(wVar);
        this.f394781a = udcCacheRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ C143711ad mo117683c(Status status) {
        return new C146058k(status, (UdcCacheResponse) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo122562j(C146050c cVar) {
        C146051d dVar = new C146051d(this);
        UdcCacheRequest udcCacheRequest = this.f394781a;
        Parcel gA = cVar.mo17260gA();
        C8850c.m23499h(gA, dVar);
        C8850c.m23497f(gA, udcCacheRequest);
        cVar.mo17262he(8, gA);
    }
}
