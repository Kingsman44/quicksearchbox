package com.google.android.libraries.surveys.internal.model;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.surveys.internal.model.c */
/* compiled from: PG */
final class C43070c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new SurveyDataImpl(parcel);
        } catch (C62974ct e) {
            throw new BadParcelableException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SurveyDataImpl[i];
    }
}
