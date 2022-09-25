package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.assistant.p3825an.p3830c.p3831a.C49263ai;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.bc */
/* compiled from: PG */
final class C10343bc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C10338ay ayVar = new C10338ay();
        ayVar.mo18449c(parcel.readInt());
        ayVar.mo18450d(C49263ai.m85396b(parcel.readInt()));
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        ayVar.f35021a = Optional.m71637of(C63088z.m96139A(createByteArray));
        return ayVar.mo18447a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataType$UpdateResult[i];
    }
}
