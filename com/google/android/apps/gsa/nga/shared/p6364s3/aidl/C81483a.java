package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80498f;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.a */
/* compiled from: PG */
final class C81483a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C58833ax j = C58833ax.m90833j((HotwordTriggeringInfo) parcel.readParcelable(getClass().getClassLoader()));
        C58833ax j2 = C58833ax.m90833j((VoiceInputInfo) parcel.readParcelable(getClass().getClassLoader()));
        C80498f fVar = (C80498f) ProtoLiteParcelable.m147136g(parcel, C80498f.f220974e);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new CloudFulfillmentData(j, j2, fVar, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CloudFulfillmentData[i];
    }
}
