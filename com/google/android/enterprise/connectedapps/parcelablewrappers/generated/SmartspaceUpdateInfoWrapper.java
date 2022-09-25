package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class SmartspaceUpdateInfoWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142608h();

    /* renamed from: a */
    public C83741am f386935a;

    public SmartspaceUpdateInfoWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386935a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386935a = (C83741am) C62942bv.parseFrom((C62942bv) C83741am.f228248e, bArr);
        } catch (C62974ct unused) {
        }
    }

    public SmartspaceUpdateInfoWrapper(C83741am amVar) {
        this.f386935a = amVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C83741am amVar = this.f386935a;
        if (amVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = amVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
