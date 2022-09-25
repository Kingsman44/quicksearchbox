package com.google.android.gms.people.internal;

import android.database.MatrixCursor;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.people.internal.f */
/* compiled from: PG */
final class C145669f implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        int readInt2 = parcel.readInt();
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        if (readInt == 0 && readInt2 == 0) {
            matrixCursor = null;
        } else {
            for (int i = 0; i < readInt2; i++) {
                matrixCursor.addRow(parcel.readArray(Object.class.getClassLoader()));
            }
        }
        return new MatrixCursorParcelable(matrixCursor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MatrixCursorParcelable[i];
    }
}
