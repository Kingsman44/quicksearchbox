package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.search.Query;
import java.util.List;

/* compiled from: PG */
public class UpdateVoiceActionUiEventParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87689aq();

    /* renamed from: a */
    public final Query f236965a;

    /* renamed from: b */
    public final List f236966b;

    /* renamed from: c */
    public final CardDecision f236967c;

    public UpdateVoiceActionUiEventParcelable(Parcel parcel) {
        this.f236965a = (Query) parcel.readParcelable(Query.class.getClassLoader());
        this.f236966b = parcel.createTypedArrayList(ParcelableVoiceAction.CREATOR);
        this.f236967c = (CardDecision) parcel.readParcelable(CardDecision.class.getClassLoader());
    }

    public UpdateVoiceActionUiEventParcelable(Query query, List list, CardDecision cardDecision) {
        this.f236965a = query;
        this.f236966b = list;
        this.f236967c = cardDecision;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f236965a, i);
        parcel.writeTypedList(this.f236966b);
        parcel.writeParcelable(this.f236967c, i);
    }
}
