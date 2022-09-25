package com.google.android.libraries.lens.view.flags;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4522b.C58495hd;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.lens.view.flags.m */
/* compiled from: PG */
final class C26255m implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        C58495hd j = ConfigFlagsImpl.m48448j(ConfigFlagsImpl.m48447i(parcel), C26245c.f71381a);
        C58495hd j2 = ConfigFlagsImpl.m48448j(ConfigFlagsImpl.m48447i(parcel), C26249g.f71385a);
        C58495hd j3 = ConfigFlagsImpl.m48448j(ConfigFlagsImpl.m48447i(parcel), C26250h.f71386a);
        C58495hd j4 = ConfigFlagsImpl.m48448j(ConfigFlagsImpl.m48447i(parcel), C26251i.f71387a);
        C58495hd j5 = ConfigFlagsImpl.m48448j(ConfigFlagsImpl.m48447i(parcel), C26252j.f71388a);
        ArrayList readArrayList = parcel2.readArrayList((ClassLoader) null);
        readArrayList.getClass();
        ArrayList readArrayList2 = parcel2.readArrayList((ClassLoader) null);
        readArrayList2.getClass();
        String readString = parcel.readString();
        boolean z = true;
        boolean z2 = parcel.readInt() != 0;
        if (parcel.readInt() == 0) {
            z = false;
        }
        return new ConfigFlagsImpl(j, j2, j3, j4, j5, readArrayList, readArrayList2, readString, z2, z, parcel.readLong());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConfigFlagsImpl[i];
    }
}
