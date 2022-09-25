package com.google.android.apps.gsa.shared.speech;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;

/* compiled from: PG */
public class HotwordDetectedEventData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90535d();

    /* renamed from: a */
    public final HotwordResult f253053a;

    /* renamed from: b */
    public final Uri f253054b;

    public HotwordDetectedEventData(Parcel parcel) {
        this.f253053a = (HotwordResult) parcel.readParcelable(HotwordResult.class.getClassLoader());
        this.f253054b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public HotwordDetectedEventData(HotwordResult hotwordResult, Uri uri) {
        this.f253053a = hotwordResult;
        this.f253054b = uri;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f253053a, i);
        parcel.writeParcelable(this.f253054b, i);
    }
}
