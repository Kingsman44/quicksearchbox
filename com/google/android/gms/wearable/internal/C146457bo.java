package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wearable.internal.bo */
/* compiled from: PG */
public final class C146457bo extends C146509i {

    /* renamed from: a */
    final /* synthetic */ String f395655a;

    /* renamed from: d */
    final /* synthetic */ byte[] f395656d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C146457bo(C143851w wVar, String str, byte[] bArr) {
        super(wVar);
        this.f395655a = str;
        this.f395656d = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return new C146458bp(status, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        String str = this.f395655a;
        byte[] bArr = this.f395656d;
        C146452bj bjVar = (C146452bj) ((C146499dc) bVar).mo119451G();
        C146495cz czVar = new C146495cz(this);
        Parcel gA = bjVar.mo17260gA();
        C8850c.m23499h(gA, czVar);
        gA.writeString(str);
        gA.writeString("/assistant/psk");
        gA.writeByteArray(bArr);
        bjVar.mo17262he(12, gA);
    }
}
