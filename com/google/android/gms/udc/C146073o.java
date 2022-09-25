package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;

/* renamed from: com.google.android.gms.udc.o */
/* compiled from: PG */
public final class C146073o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        UdcWriteLocalSettingsRequest.SettingChange[] settingChangeArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                settingChangeArr = (UdcWriteLocalSettingsRequest.SettingChange[]) C143946b.m234047D(parcel, readInt, UdcWriteLocalSettingsRequest.SettingChange.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new UdcWriteLocalSettingsRequest(settingChangeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UdcWriteLocalSettingsRequest[i];
    }
}
