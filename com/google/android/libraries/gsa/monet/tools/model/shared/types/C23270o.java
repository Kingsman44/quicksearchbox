package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ProtoListUtils;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.o */
/* compiled from: PG */
final class C23270o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        classLoader.getClass();
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            arrayList.add((ProtoParcelable) parcel.readValue(classLoader));
        }
        return new ProtoListUtils.ListWrapper(arrayList, (byte[]) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProtoListUtils.ListWrapper[i];
    }
}
