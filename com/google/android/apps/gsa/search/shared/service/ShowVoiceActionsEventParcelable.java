package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.search.Query;
import java.util.List;

/* compiled from: PG */
public class ShowVoiceActionsEventParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87687ao();

    /* renamed from: a */
    public final Query f236960a;

    /* renamed from: b */
    public final List f236961b;

    /* renamed from: c */
    public final CardDecision f236962c;

    public ShowVoiceActionsEventParcelable(Parcel parcel) {
        this.f236960a = (Query) parcel.readParcelable(Query.class.getClassLoader());
        this.f236961b = parcel.createTypedArrayList(ParcelableVoiceAction.CREATOR);
        this.f236962c = (CardDecision) parcel.readParcelable(CardDecision.class.getClassLoader());
    }

    public ShowVoiceActionsEventParcelable(Query query, List list, CardDecision cardDecision) {
        this.f236960a = query;
        this.f236961b = list;
        this.f236962c = cardDecision;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f236960a, i);
        parcel.writeTypedList(this.f236961b);
        parcel.writeParcelable(this.f236962c, i);
    }
}
