package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;

/* compiled from: PG */
public class NowCardsScopeDataParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C105769g();

    /* renamed from: a */
    public final String f295117a;

    /* renamed from: b */
    public final CardRenderingContext f295118b;

    public NowCardsScopeDataParcelable(String str, CardRenderingContext cardRenderingContext) {
        this.f295117a = str;
        this.f295118b = cardRenderingContext;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f295117a);
        parcel.writeParcelable(this.f295118b, 0);
    }
}
