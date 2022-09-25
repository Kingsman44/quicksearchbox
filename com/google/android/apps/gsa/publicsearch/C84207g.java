package com.google.android.apps.gsa.publicsearch;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.publicsearch.g */
/* compiled from: PG */
public final class C84207g extends C8848a implements C84209i {
    public C84207g(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
    }

    /* renamed from: e */
    public final void mo77671e(byte[] bArr) {
        Parcel gA = mo17260gA();
        gA.writeByteArray(bArr);
        mo17263hf(1, gA);
    }

    /* renamed from: f */
    public final void mo77672f(byte[] bArr, SystemParcelableWrapper systemParcelableWrapper) {
        Parcel gA = mo17260gA();
        gA.writeByteArray(bArr);
        C8850c.m23497f(gA, systemParcelableWrapper);
        mo17263hf(2, gA);
    }

    /* renamed from: g */
    public final void mo77673g(C84206f fVar) {
        throw null;
    }
}
