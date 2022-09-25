package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4552o.aky;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class SmartspaceUpdateSourceWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142609i();

    /* renamed from: a */
    public aky f386936a;

    public SmartspaceUpdateSourceWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386936a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386936a = (aky) C62942bv.parseFrom((C62942bv) aky.f158997e, bArr);
        } catch (C62974ct unused) {
        }
    }

    public SmartspaceUpdateSourceWrapper(aky aky) {
        this.f386936a = aky;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aky aky = this.f386936a;
        if (aky == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = aky.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
