package com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* compiled from: PG */
public abstract class DspModelInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18367m();

    /* renamed from: a */
    public abstract int mo23833a();

    /* renamed from: b */
    public abstract int mo23834b();

    /* renamed from: c */
    public abstract String mo23835c();

    /* renamed from: d */
    public abstract String mo23836d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract UUID mo23837e();

    public final String toString() {
        String c = mo23835c();
        int a = mo23833a();
        int b = mo23834b();
        String valueOf = String.valueOf(mo23837e());
        String d = mo23836d();
        return "DspModelInformation[locale=" + c + ", keyphrase=" + a + ", version=" + b + ", venderUuid=" + valueOf + ", modelUri=" + d + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mo23835c());
        parcel.writeInt(mo23833a());
        parcel.writeInt(mo23834b());
        parcel.writeString(mo23837e().toString());
        parcel.writeString(mo23836d());
    }
}
