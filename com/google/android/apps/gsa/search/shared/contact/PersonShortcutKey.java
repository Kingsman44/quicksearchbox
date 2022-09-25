package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public class PersonShortcutKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87537y();

    /* renamed from: e */
    public final C87515c f236402e;

    /* renamed from: f */
    public final String f236403f;

    /* renamed from: g */
    public final String f236404g;

    public PersonShortcutKey(C87515c cVar, String str, String str2) {
        this.f236402e = cVar;
        this.f236403f = str;
        this.f236404g = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PersonShortcutKey personShortcutKey = (PersonShortcutKey) obj;
            return this.f236402e == personShortcutKey.f236402e && TextUtils.equals(this.f236404g, personShortcutKey.f236404g) && TextUtils.equals(this.f236403f, personShortcutKey.f236403f);
        }
    }

    public int hashCode() {
        int hashCode = ((this.f236402e.hashCode() * 31) + this.f236403f.hashCode()) * 31;
        String str = this.f236404g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str;
        String valueOf = String.valueOf(this.f236402e);
        String str2 = this.f236403f;
        String str3 = this.f236404g;
        if (str3 == null) {
            str = BuildConfig.FLAVOR;
        } else {
            str = " : ".concat(str3);
        }
        return "PersonShortcutKey : " + valueOf + " : " + str2 + str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f236402e.name());
        parcel.writeString(this.f236403f);
        parcel.writeString(this.f236404g);
    }
}
