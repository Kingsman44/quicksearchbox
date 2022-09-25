package com.google.android.apps.gsa.search.shared.actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public class ParcelableVoiceAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87471n();

    /* renamed from: a */
    public final VoiceAction f236008a;

    public ParcelableVoiceAction(VoiceAction voiceAction) {
        this.f236008a = voiceAction;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        VoiceAction voiceAction = this.f236008a;
        return voiceAction == null ? "null" : voiceAction.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        VoiceAction voiceAction = this.f236008a;
        if (voiceAction == null) {
            parcel.writeString(BuildConfig.FLAVOR);
            return;
        }
        parcel.writeString(voiceAction.getClass().getName());
        this.f236008a.writeToParcel(parcel, i);
    }
}
