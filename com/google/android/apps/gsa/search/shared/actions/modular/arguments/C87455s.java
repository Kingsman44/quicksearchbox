package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p4152bb.p4153a.C55213ka;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.s */
/* compiled from: PG */
final class C87455s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        PersonArgument personArgument = new PersonArgument((C55213ka) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55213ka.f145356g.getParserForType()), (PersonDisambiguation) parcel.readParcelable(getClass().getClassLoader()));
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        personArgument.f236199j = z;
        return personArgument;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PersonArgument[i];
    }
}
