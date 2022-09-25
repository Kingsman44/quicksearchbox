package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.g */
/* compiled from: PG */
final class C105769g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new NowCardsScopeDataParcelable(parcel.readString(), (CardRenderingContext) parcel.readParcelable(CardRenderingContext.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NowCardsScopeDataParcelable[0];
    }
}
