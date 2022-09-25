package com.google.android.libraries.searchbox.p3203ui.logging;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.searchbox.ui.logging.b */
/* compiled from: PG */
final class C41707b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        C41706a aVar = new C41706a();
        aVar.mo44308d((int[]) parcel.readSerializable());
        aVar.mo44307c(readInt);
        aVar.mo44306b(readInt2);
        return aVar.mo44305a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableQueryBuilderTap[i];
    }
}
