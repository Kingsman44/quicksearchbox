package com.google.android.gms.cast.framework.media.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.media.internal.e */
/* compiled from: PG */
public final class C143512e extends C8848a implements C143513f {
    public C143512e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    /* renamed from: e */
    public final Bitmap mo118814e(Uri uri) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, uri);
        Parcel gT = mo17261gT(1, gA);
        Bitmap bitmap = (Bitmap) C8850c.m23492a(gT, Bitmap.CREATOR);
        gT.recycle();
        return bitmap;
    }
}
