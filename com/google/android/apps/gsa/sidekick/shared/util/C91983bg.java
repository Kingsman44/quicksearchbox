package com.google.android.apps.gsa.sidekick.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7752iq;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.bg */
/* compiled from: PG */
final class C91983bg implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        C7752iq iqVar = (C7752iq) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C7752iq.f27124E.getParserForType());
        iqVar.getClass();
        return new WrappedExecutedUserAction(iqVar, (C7709ha) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C7709ha.f26910f.getParserForType()), true);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WrappedExecutedUserAction[i];
    }
}
