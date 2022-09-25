package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p4152bb.p4153a.C55213ka;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.p */
/* compiled from: PG */
final class C87452p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LocationArgument((C55213ka) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55213ka.f145356g.getParserForType()), (Disambiguation) parcel.readParcelable(getClass().getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationArgument[i];
    }
}
