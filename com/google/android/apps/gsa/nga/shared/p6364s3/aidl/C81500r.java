package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.r */
/* compiled from: PG */
public final class C81500r extends C8848a implements C81502t {
    public C81500r(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.nga.shared.s3.aidl.IVoiceStreamReadCallback");
    }

    /* renamed from: e */
    public final void mo75110e() {
        mo17263hf(2, mo17260gA());
    }

    /* renamed from: f */
    public final void mo75111f(byte[] bArr) {
        Parcel gA = mo17260gA();
        gA.writeByteArray(bArr);
        mo17263hf(1, gA);
    }
}
