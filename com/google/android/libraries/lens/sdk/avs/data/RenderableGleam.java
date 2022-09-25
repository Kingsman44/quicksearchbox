package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public final class RenderableGleam implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C24878m();

    /* renamed from: a */
    public static final C58974d f67923a = C58974d.m91135i("RenderableGleam");

    /* renamed from: b */
    public C25308ap f67924b;

    public RenderableGleam(C25308ap apVar) {
        this.f67924b = apVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] byteArray = this.f67924b.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
