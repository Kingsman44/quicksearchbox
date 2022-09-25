package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class CanStartDictationResponseWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142604d();

    /* renamed from: a */
    public C119282d f386931a;

    public CanStartDictationResponseWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386931a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386931a = (C119282d) C62942bv.parseFrom((C62942bv) C119282d.f332631e, bArr);
        } catch (C62974ct unused) {
        }
    }

    public CanStartDictationResponseWrapper(C119282d dVar) {
        this.f386931a = dVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C119282d dVar = this.f386931a;
        if (dVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = dVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
