package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableEnumListUtils;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.g */
/* compiled from: PG */
final class C23262g implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ImmutableEnumListUtils.ListWrapper(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ImmutableEnumListUtils.ListWrapper[i];
    }
}
