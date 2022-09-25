package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class ProactiveDataListWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142607g();

    /* renamed from: a */
    public C123746bm f386934a;

    public ProactiveDataListWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386934a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386934a = (C123746bm) C62942bv.parseFrom((C62942bv) C123746bm.f341818b, bArr);
        } catch (C62974ct unused) {
        }
    }

    public ProactiveDataListWrapper(C123746bm bmVar) {
        this.f386934a = bmVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C123746bm bmVar = this.f386934a;
        if (bmVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = bmVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
