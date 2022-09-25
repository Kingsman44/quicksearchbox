package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.speech.helper.p7281b.C92308d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class AuthTokenWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142601a();

    /* renamed from: a */
    public C92308d f386928a;

    public AuthTokenWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386928a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386928a = (C92308d) C62942bv.parseFrom((C62942bv) C92308d.f257402e, bArr);
        } catch (C62974ct unused) {
        }
    }

    public AuthTokenWrapper(C92308d dVar) {
        this.f386928a = dVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C92308d dVar = this.f386928a;
        if (dVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = dVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
