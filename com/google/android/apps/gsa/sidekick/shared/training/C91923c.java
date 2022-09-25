package com.google.android.apps.gsa.sidekick.shared.training;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p375ai.p378b.C7918ou;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.training.c */
/* compiled from: PG */
final class C91923c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new QuestionKey((C7918ou) ProtoLiteParcelable.m147136g(parcel, C7918ou.f27824h));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new QuestionKey[i];
    }
}
