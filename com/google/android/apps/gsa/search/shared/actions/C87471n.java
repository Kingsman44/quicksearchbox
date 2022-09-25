package com.google.android.apps.gsa.search.shared.actions;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.n */
/* compiled from: PG */
final class C87471n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        if (TextUtils.isEmpty(readString)) {
            return new ParcelableVoiceAction((VoiceAction) null);
        }
        try {
            Class<?> cls = Class.forName(readString);
            C58838bb.m90883r(VoiceAction.class.isAssignableFrom(cls));
            Object obj = cls.getDeclaredField("CREATOR").get((Object) null);
            C58838bb.m90883r(obj instanceof Parcelable.Creator);
            return new ParcelableVoiceAction((VoiceAction) ((Parcelable.Creator) obj).createFromParcel(parcel));
        } catch (Exception e) {
            throw new RuntimeException("Can't unparcel VoiceAction: ".concat(String.valueOf(String.valueOf(parcel))), e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableVoiceAction[i];
    }
}
