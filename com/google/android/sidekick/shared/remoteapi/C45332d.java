package com.google.android.sidekick.shared.remoteapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C7927pc;
import java.util.HashMap;

/* renamed from: com.google.android.sidekick.shared.remoteapi.d */
/* compiled from: PG */
final class C45332d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        HashMap hashMap = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return new TrainingQuestion(hashMap, (C7927pc) ProtoLiteParcelable.m147135f(parcel, C7927pc.f27849l), (C7918ou) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C7918ou.f27824h.getParserForType()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TrainingQuestion[i];
    }
}
