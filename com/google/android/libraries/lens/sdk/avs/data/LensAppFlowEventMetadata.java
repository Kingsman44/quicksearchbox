package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59898bg;

/* compiled from: PG */
public final class LensAppFlowEventMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C24872g();

    /* renamed from: a */
    public static final C58974d f67921a = C58974d.m91135i("LensAppFlowEventMetadata");

    /* renamed from: b */
    private C59898bg f67922b;

    public LensAppFlowEventMetadata(C59898bg bgVar) {
        this.f67922b = bgVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] byteArray = this.f67922b.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
