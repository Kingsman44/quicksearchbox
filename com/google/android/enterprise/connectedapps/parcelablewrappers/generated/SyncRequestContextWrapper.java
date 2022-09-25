package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class SyncRequestContextWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142613m();

    /* renamed from: a */
    public C123755bv f386940a;

    public SyncRequestContextWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386940a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386940a = (C123755bv) C62942bv.parseFrom((C62942bv) C123755bv.f341837o, bArr);
        } catch (C62974ct unused) {
        }
    }

    public SyncRequestContextWrapper(C123755bv bvVar) {
        this.f386940a = bvVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C123755bv bvVar = this.f386940a;
        if (bvVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = bvVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
