package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.c */
/* compiled from: PG */
public final class C81485c extends C8848a implements C81487e {
    public C81485c(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.nga.shared.s3.aidl.ICloudFulfillmentCallback");
    }

    /* renamed from: e */
    public final void mo75106e(CloudFulfillmentData cloudFulfillmentData) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, cloudFulfillmentData);
        mo17263hf(1, gA);
    }

    /* renamed from: f */
    public final void mo75107f() {
        mo17263hf(2, mo17260gA());
    }
}
