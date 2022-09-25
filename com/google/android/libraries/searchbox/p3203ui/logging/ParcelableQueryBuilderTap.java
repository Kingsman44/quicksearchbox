package com.google.android.libraries.searchbox.p3203ui.logging;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.searchbox.ui.logging.ParcelableQueryBuilderTap */
/* compiled from: PG */
public abstract class ParcelableQueryBuilderTap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41707b();

    /* renamed from: a */
    public abstract int mo44297a();

    /* renamed from: b */
    public abstract int mo44298b();

    /* renamed from: c */
    public abstract int[] mo44299c();

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(mo44299c());
        parcel.writeInt(mo44298b());
        parcel.writeInt(mo44297a());
    }
}
