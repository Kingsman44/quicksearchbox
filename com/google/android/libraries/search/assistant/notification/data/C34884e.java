package com.google.android.libraries.search.assistant.notification.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.e */
/* compiled from: PG */
final class C34884e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(AutoValue_MessageNotification.CREATOR);
        createTypedArrayList.getClass();
        return new AutoValue_BundledMessageNotification(C58485gu.m89842j(createTypedArrayList));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_BundledMessageNotification[i];
    }
}
