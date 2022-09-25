package com.google.android.apps.gsa.search.shared.actions.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.p4152bb.p4153a.C55367pt;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.s */
/* compiled from: PG */
final class C87497s implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        C63010eb parserForType = C55367pt.f145890g.getParserForType();
        try {
            byte[] createByteArray = parcel.createByteArray();
            createByteArray.getClass();
            return new Suggestion(readString, (C55367pt) ((MessageLite) parserForType.mo59010i(createByteArray)));
        } catch (C62974ct e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Suggestion[i];
    }
}
