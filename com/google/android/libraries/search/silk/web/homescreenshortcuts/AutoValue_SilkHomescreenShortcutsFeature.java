package com.google.android.libraries.search.silk.web.homescreenshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
final class AutoValue_SilkHomescreenShortcutsFeature extends C$AutoValue_SilkHomescreenShortcutsFeature {
    public static final Parcelable.Creator CREATOR = new C40799a();

    public AutoValue_SilkHomescreenShortcutsFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        super(webFeatureConfig, parcelableProto);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f106946a, i);
        parcel.writeParcelable(this.f106947b, i);
    }
}
