package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class ClientStateWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142605e();

    /* renamed from: a */
    public C123777f f386932a;

    public ClientStateWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386932a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386932a = (C123777f) C62942bv.parseFrom((C62942bv) C123777f.f341922a, bArr);
        } catch (C62974ct unused) {
        }
    }

    public ClientStateWrapper(C123777f fVar) {
        this.f386932a = fVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C123777f fVar = this.f386932a;
        if (fVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = fVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
