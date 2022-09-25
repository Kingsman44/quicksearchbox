package com.google.android.apps.gsa.search.shared.actions.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
public class ImageInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87485g();

    /* renamed from: a */
    public final String f236269a;

    public ImageInfo(String str) {
        this.f236269a = str;
    }

    /* renamed from: a */
    public static boolean m141972a(ImageInfo imageInfo) {
        return imageInfo == null || TextUtils.isEmpty(imageInfo.f236269a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f236269a, ((ImageInfo) obj).f236269a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f236269a});
    }

    public final String toString() {
        String str = this.f236269a;
        return "ImageInfo[ImageUrl: " + str + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f236269a);
    }
}
