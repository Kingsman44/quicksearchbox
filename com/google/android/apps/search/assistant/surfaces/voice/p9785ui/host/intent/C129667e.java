package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.NavigatorArgs$Transition;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.e */
/* compiled from: PG */
public final class C129667e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "parcel");
        return new NavigatorArgs$Transition.Data.Seamless(parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NavigatorArgs$Transition.Data.Seamless[i];
    }
}
