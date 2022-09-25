package com.google.android.apps.gsa.search.shared.actions.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.base.C58832aw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class PromptSegment implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87492n();

    /* renamed from: a */
    public final String f236271a;

    /* renamed from: b */
    public final TtsRequest f236272b;

    /* renamed from: c */
    public final ImageInfo f236273c;

    /* renamed from: d */
    public final List f236274d;

    public PromptSegment(Parcel parcel) {
        this.f236271a = parcel.readString();
        this.f236272b = (TtsRequest) parcel.readParcelable(TtsRequest.class.getClassLoader());
        this.f236273c = (ImageInfo) parcel.readParcelable(ImageInfo.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.f236274d = arrayList;
        parcel.readTypedList(arrayList, Suggestion.CREATOR);
    }

    public PromptSegment(String str, TtsRequest ttsRequest, ImageInfo imageInfo, List list) {
        this.f236271a = str;
        this.f236272b = ttsRequest;
        this.f236273c = imageInfo;
        this.f236274d = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PromptSegment promptSegment = (PromptSegment) obj;
            return TextUtils.equals(this.f236271a, promptSegment.f236271a) && C58832aw.m90831a(this.f236272b, promptSegment.f236272b) && C58832aw.m90831a(this.f236273c, promptSegment.f236273c) && C58832aw.m90831a(this.f236274d, promptSegment.f236274d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f236271a, this.f236272b, this.f236273c, this.f236274d});
    }

    public final String toString() {
        String str = this.f236271a;
        String valueOf = String.valueOf(this.f236272b);
        String valueOf2 = String.valueOf(this.f236273c);
        String valueOf3 = String.valueOf(this.f236274d);
        return "PromptSegment[DisplayPrompt: " + str + ", VocalizedPrompt: " + valueOf + ", ImageInfo: " + valueOf2 + ", Suggestions: " + valueOf3 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f236271a);
        parcel.writeParcelable(this.f236272b, 0);
        parcel.writeParcelable(this.f236273c, 0);
        parcel.writeTypedList(this.f236274d);
    }
}
