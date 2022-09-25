package com.google.android.gms.people.internal;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class MatrixCursorParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C145669f();

    /* renamed from: a */
    private final Cursor f393897a;

    /* renamed from: b */
    private final int f393898b;

    public MatrixCursorParcelable(Cursor cursor) {
        this.f393897a = cursor;
        this.f393898b = cursor == null ? 0 : cursor.getCount();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Cursor cursor = this.f393897a;
        if (cursor != null) {
            try {
                int columnCount = cursor.getColumnCount();
                parcel.writeInt(columnCount);
                parcel.writeStringArray(this.f393897a.getColumnNames());
                parcel.writeInt(this.f393898b);
                this.f393897a.moveToPosition(-1);
                while (this.f393897a.moveToNext()) {
                    Object[] objArr = new Object[columnCount];
                    for (int i2 = 0; i2 < columnCount; i2++) {
                        int type = this.f393897a.getType(i2);
                        if (type == 0) {
                            objArr[i2] = null;
                        } else if (type == 1) {
                            objArr[i2] = Integer.valueOf(this.f393897a.getInt(i2));
                        } else if (type == 2) {
                            objArr[i2] = Float.valueOf(this.f393897a.getFloat(i2));
                        } else if (type == 3) {
                            objArr[i2] = this.f393897a.getString(i2);
                        } else if (type == 4) {
                            objArr[i2] = this.f393897a.getBlob(i2);
                        }
                    }
                    parcel.writeArray(objArr);
                }
            } finally {
                this.f393897a.close();
            }
        } else {
            parcel.writeInt(0);
            parcel.writeStringArray(new String[0]);
            parcel.writeInt(0);
        }
    }
}
