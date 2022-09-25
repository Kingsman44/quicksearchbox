package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class SuggestRequestWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142611k();

    /* renamed from: a */
    public C138133o f386938a;

    public SuggestRequestWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386938a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386938a = (C138133o) C62942bv.parseFrom((C62942bv) C138133o.f375822o, bArr);
        } catch (C62974ct unused) {
        }
    }

    public SuggestRequestWrapper(C138133o oVar) {
        this.f386938a = oVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C138133o oVar = this.f386938a;
        if (oVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = oVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
