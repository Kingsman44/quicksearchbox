package com.google.android.apps.gsa.search.core.carassistant;

import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.d */
/* compiled from: PG */
final class C85701d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        return new AutoValue_CarAssistantSessionManager_Config((amo) Enum.valueOf(amo.class, parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, (StatusBarNotification) parcel2.readParcelable(CarAssistantSessionManager.Config.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt(), parcel.readLong(), (HotwordDetectedEventData) parcel2.readParcelable(CarAssistantSessionManager.Config.class.getClassLoader()), parcel.readLong());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_CarAssistantSessionManager_Config[i];
    }
}
