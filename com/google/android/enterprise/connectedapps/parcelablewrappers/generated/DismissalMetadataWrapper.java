package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.opa.smartspace.C83809y;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class DismissalMetadataWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142606f();

    /* renamed from: a */
    public C83809y f386933a;

    public DismissalMetadataWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386933a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386933a = (C83809y) C62942bv.parseFrom((C62942bv) C83809y.f228409d, bArr);
        } catch (C62974ct unused) {
        }
    }

    public DismissalMetadataWrapper(C83809y yVar) {
        this.f386933a = yVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C83809y yVar = this.f386933a;
        if (yVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = yVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
