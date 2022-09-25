package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;

/* compiled from: PG */
public final class StartDictationArgsWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142610j();

    /* renamed from: a */
    public C64735n f386937a;

    public StartDictationArgsWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386937a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386937a = (C64735n) C62942bv.parseFrom((C62942bv) C64735n.f175467n, bArr);
        } catch (C62974ct unused) {
        }
    }

    public StartDictationArgsWrapper(C64735n nVar) {
        this.f386937a = nVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C64735n nVar = this.f386937a;
        if (nVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = nVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
