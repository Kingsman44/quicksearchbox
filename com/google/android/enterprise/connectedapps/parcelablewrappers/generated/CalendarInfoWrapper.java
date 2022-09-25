package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.p7041h.C89770b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class CalendarInfoWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142602b();

    /* renamed from: a */
    public C89770b f386929a;

    public CalendarInfoWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386929a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386929a = (C89770b) C62942bv.parseFrom((C62942bv) C89770b.f242968h, bArr);
        } catch (C62974ct unused) {
        }
    }

    public CalendarInfoWrapper(C89770b bVar) {
        this.f386929a = bVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89770b bVar = this.f386929a;
        if (bVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = bVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
