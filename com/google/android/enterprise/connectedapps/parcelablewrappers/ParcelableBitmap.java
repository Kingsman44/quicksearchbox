package com.google.android.enterprise.connectedapps.parcelablewrappers;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class ParcelableBitmap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142595a();

    /* renamed from: a */
    public final Bitmap f386912a;

    public ParcelableBitmap(Bitmap bitmap) {
        this.f386912a = bitmap;
    }

    public ParcelableBitmap(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            this.f386912a = null;
            return;
        }
        Bitmap.Config valueOf = Bitmap.Config.valueOf(readString);
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int[] iArr = new int[(readInt * readInt2)];
        parcel.readIntArray(iArr);
        this.f386912a = Bitmap.createBitmap(iArr, readInt, readInt2, valueOf);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bitmap bitmap = this.f386912a;
        if (bitmap == null) {
            parcel.writeString((String) null);
            return;
        }
        Bitmap.Config config = bitmap.getConfig();
        int width = this.f386912a.getWidth();
        int height = this.f386912a.getHeight();
        Bitmap bitmap2 = this.f386912a;
        int[] iArr = new int[(bitmap2.getHeight() * bitmap2.getWidth())];
        bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        parcel.writeString(config.toString());
        parcel.writeInt(width);
        parcel.writeInt(height);
        parcel.writeIntArray(iArr);
    }
}
