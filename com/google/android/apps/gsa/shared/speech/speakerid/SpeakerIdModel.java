package com.google.android.apps.gsa.shared.speech.speakerid;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Arrays;

/* compiled from: PG */
public class SpeakerIdModel implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C90608a();

    /* renamed from: a */
    public final String f253283a;

    /* renamed from: b */
    public C58833ax f253284b = C58836b.f156633a;

    public SpeakerIdModel(Parcel parcel) {
        this.f253284b = C58833ax.m90833j(parcel.createByteArray());
        this.f253283a = parcel.readString();
    }

    public SpeakerIdModel(String str) {
        this.f253283a = str;
    }

    public SpeakerIdModel(String str, byte[] bArr) {
        this.f253283a = str;
        this.f253284b = C58833ax.m90833j(bArr);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        String str = ((SpeakerIdModel) obj).f253283a;
        String str2 = this.f253283a;
        if (str2 == null) {
            return str == null ? 0 : -1;
        }
        if (str == null) {
            return 1;
        }
        return str2.compareTo(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeakerIdModel)) {
            return false;
        }
        SpeakerIdModel speakerIdModel = (SpeakerIdModel) obj;
        String str = this.f253283a;
        if ((str == null || str.equals(speakerIdModel.f253283a) || speakerIdModel.f253283a == null) && this.f253284b.mo56113h() == speakerIdModel.f253284b.mo56113h()) {
            return !this.f253284b.mo56113h() || Arrays.equals((byte[]) this.f253284b.mo56107c(), (byte[]) speakerIdModel.f253284b.mo56107c());
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f253283a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        return this.f253284b.mo56113h() ? hashCode + Arrays.hashCode((byte[]) this.f253284b.mo56107c()) : hashCode;
    }

    public final String toString() {
        return "SpeakerIdModel [mSpeakerAccountName=" + this.f253283a + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray((byte[]) this.f253284b.mo56111f());
        parcel.writeString(this.f253283a);
    }
}
