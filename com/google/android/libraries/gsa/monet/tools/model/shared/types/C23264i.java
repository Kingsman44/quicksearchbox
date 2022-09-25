package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableListUtils;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.i */
/* compiled from: PG */
final class C23264i implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ImmutableListUtils.ListWrapper(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ImmutableListUtils.ListWrapper[i];
    }
}
