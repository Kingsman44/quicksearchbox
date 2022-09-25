package com.google.android.apps.search.googleapp.amp.silk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.amp.silk.AutoValue_SilkAmpApiImplOpenHelperFragmentPeer_LoadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput */
/* compiled from: PG */
final class C133462x51e0c516 extends C133461xf241a23a {
    public static final Parcelable.Creator CREATOR = new C133466b();

    public C133462x51e0c516(int i, String str, ProtoParsers.ParcelableProto parcelableProto, ProtoParsers.ParcelableProto parcelableProto2) {
        super(i, str, parcelableProto, parcelableProto2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(C133465a.m216642a(this.f363664d));
        if (this.f363661a == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f363661a);
        }
        parcel.writeParcelable(this.f363662b, i);
        parcel.writeParcelable(this.f363663c, i);
    }
}
