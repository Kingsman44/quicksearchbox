package com.android.launcher3.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: PG */
public class ParcelableSparseArray extends SparseArray implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
            ClassLoader classLoader = parcelableSparseArray.getClass().getClassLoader();
            int readInt = parcel.readInt();
            for (int i = 0; i < readInt; i++) {
                parcelableSparseArray.put(parcel.readInt(), parcel.readParcelable(classLoader));
            }
            return parcelableSparseArray;
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return new ParcelableSparseArray[i];
        }
    };

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int size = size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(keyAt(i2));
            parcel.writeParcelable((Parcelable) valueAt(i2), 0);
        }
    }
}
