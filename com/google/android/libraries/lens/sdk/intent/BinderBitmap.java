package com.google.android.libraries.lens.sdk.intent;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class BinderBitmap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C24937a();

    /* renamed from: a */
    public final Bitmap f68053a;

    /* renamed from: b */
    private final Bundle f68054b;

    /* renamed from: c */
    private final C24940b f68055c;

    public BinderBitmap(Bitmap bitmap) {
        this.f68053a = bitmap;
        C24940b bVar = new C24940b(bitmap);
        this.f68055c = bVar;
        Bundle bundle = new Bundle();
        this.f68054b = bundle;
        bundle.putBinder("binder", bVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f68054b);
    }

    /* JADX WARNING: type inference failed for: r6v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BinderBitmap(android.os.Parcel r6) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f68055c = r0
            java.lang.Class r1 = r5.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Bundle r6 = r6.readBundle(r1)
            r5.f68054b = r6
            java.lang.String r1 = "binder"
            android.os.IBinder r6 = r6.getBinder(r1)
            if (r6 == 0) goto L_0x0053
            android.os.Parcel r1 = android.os.Parcel.obtain()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r3 = 1
            r4 = 0
            r6.transact(r3, r1, r2, r4)     // Catch:{ RemoteException -> 0x002a }
            goto L_0x0032
        L_0x002a:
            r6 = move-exception
            java.lang.String r3 = "Binder transaction failed."
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.google.android.libraries.lens.sdk.p2038a.C24841p.m45972c(r6, r3, r4)
        L_0x0032:
            r2.readException()
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            java.lang.ClassLoader r6 = r6.getClassLoader()
            android.os.Bundle r6 = r2.readBundle(r6)
            if (r6 == 0) goto L_0x004a
            java.lang.String r0 = "bitmap"
            android.os.Parcelable r6 = r6.getParcelable(r0)
            r0 = r6
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
        L_0x004a:
            r1.recycle()
            r2.recycle()
            r5.f68053a = r0
            return
        L_0x0053:
            r5.f68053a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.sdk.intent.BinderBitmap.<init>(android.os.Parcel):void");
    }
}
