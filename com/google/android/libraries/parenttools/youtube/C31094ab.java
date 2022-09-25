package com.google.android.libraries.parenttools.youtube;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.parenttools.youtube.ab */
/* compiled from: PG */
final class C31094ab implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        C31095ac d = ParentToolsResult.m58007d();
        ((C31092a) d).f83756a = parcel.createByteArray();
        int readInt = parcel.readInt();
        int i = 1;
        if (readInt != 0) {
            i = readInt != 1 ? readInt != 2 ? 0 : 3 : 2;
        }
        d.mo36840c(i);
        return d.mo36838a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParentToolsResult[i];
    }
}
