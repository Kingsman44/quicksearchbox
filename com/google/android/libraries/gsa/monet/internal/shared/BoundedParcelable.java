package com.google.android.libraries.gsa.monet.internal.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.p1893c.C23095a;

/* compiled from: PG */
public final class BoundedParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23031a();

    /* renamed from: a */
    public final Parcelable f63359a;

    /* renamed from: b */
    private final int f63360b;

    public BoundedParcelable(Parcelable parcelable, int i) {
        this.f63359a = parcelable;
        this.f63360b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f63360b);
        if (this.f63359a != null) {
            int dataSize = parcel.dataSize();
            int dataPosition = parcel.dataPosition();
            parcel.writeByte((byte) 1);
            parcel.writeParcelable(this.f63359a, i);
            int dataPosition2 = parcel.dataPosition() - dataPosition;
            int i2 = this.f63360b;
            if (i2 >= 0 && dataPosition2 > i2) {
                C23095a.m43281d("BoundedParcelable", "Discarding Monet data because it is too large %d > %d.", Integer.valueOf(dataPosition2), Integer.valueOf(i2));
                parcel.setDataSize(dataSize);
                parcel.setDataPosition(dataPosition);
                parcel.writeByte((byte) 0);
                return;
            }
            return;
        }
        parcel.writeByte((byte) 0);
    }
}
