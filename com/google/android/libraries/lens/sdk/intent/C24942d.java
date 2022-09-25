package com.google.android.libraries.lens.sdk.intent;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.Future;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.libraries.lens.sdk.intent.d */
/* compiled from: PG */
public final class C24942d extends Binder {

    /* renamed from: a */
    protected final Context f68068a;

    /* renamed from: b */
    public Integer f68069b;

    /* renamed from: c */
    public final Future f68070c = new C24941c(this);

    public C24942d(Context context) {
        this.f68068a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static byte[] m46158a(byte[] bArr) {
        if (r0 == 0) {
            return bArr;
        }
        int i = -2078137563;
        for (byte b : bArr) {
            i = (i ^ b) * 435;
        }
        return Long.toHexString(((long) i) & 4294967295L).getBytes(StandardCharsets.UTF_8);
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        byte[] byteArray;
        if (parcel == null) {
            return super.onTransact(i, (Parcel) null, parcel2, i2);
        }
        Bundle readBundle = parcel.readBundle(Bundle.class.getClassLoader());
        if (i == 1) {
            if (!(readBundle == null || (byteArray = readBundle.getByteArray("challenge")) == null || parcel2 == null)) {
                byte[] a = m46158a(byteArray);
                Bundle bundle = new Bundle();
                bundle.putInt("version", 1);
                bundle.putByteArray("challenge_reply", a);
                bundle.putString("caller_package", this.f68068a.getApplicationContext().getPackageName());
                parcel2.writeNoException();
                parcel2.writeBundle(bundle);
            }
            return true;
        } else if (i != 2) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            if (readBundle != null) {
                synchronized (this.f68070c) {
                    this.f68069b = Integer.valueOf(readBundle.getInt("activity_result"));
                    this.f68070c.notifyAll();
                }
            }
            return true;
        }
    }
}
