package com.google.android.libraries.search.silk.web.homescreenshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.homescreenshortcuts.a */
/* compiled from: PG */
final class C40799a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkHomescreenShortcutsFeature((WebFeatureConfig) parcel.readParcelable(SilkHomescreenShortcutsFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkHomescreenShortcutsFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkHomescreenShortcutsFeature[i];
    }
}
