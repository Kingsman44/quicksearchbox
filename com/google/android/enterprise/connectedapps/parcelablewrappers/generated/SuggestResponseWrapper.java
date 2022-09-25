package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class SuggestResponseWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142612l();

    /* renamed from: a */
    public C138678v f386939a;

    public SuggestResponseWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386939a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386939a = (C138678v) C62942bv.parseFrom((C62942bv) C138678v.f377195e, bArr);
        } catch (C62974ct unused) {
        }
    }

    public SuggestResponseWrapper(C138678v vVar) {
        this.f386939a = vVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C138678v vVar = this.f386939a;
        if (vVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = vVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
