package com.google.android.enterprise.connectedapps.parcelablewrappers.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131947b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class CalendarWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142603c();

    /* renamed from: a */
    public C131947b f386930a;

    public CalendarWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386930a = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            this.f386930a = (C131947b) C62942bv.parseFrom((C62942bv) C131947b.f360260j, bArr);
        } catch (C62974ct unused) {
        }
    }

    public CalendarWrapper(C131947b bVar) {
        this.f386930a = bVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C131947b bVar = this.f386930a;
        if (bVar == null) {
            parcel.writeInt(-1);
            return;
        }
        byte[] byteArray = bVar.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
