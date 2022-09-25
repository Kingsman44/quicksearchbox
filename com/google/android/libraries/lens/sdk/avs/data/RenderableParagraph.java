package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.lens.common.text.C24137m;
import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public final class RenderableParagraph implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C24879n();

    /* renamed from: a */
    public static final C58974d f67925a = C58974d.m91135i("RenderableParagraph");

    /* renamed from: b */
    private C24137m f67926b;

    public RenderableParagraph(C24137m mVar) {
        this.f67926b = mVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] byteArray = this.f67926b.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
