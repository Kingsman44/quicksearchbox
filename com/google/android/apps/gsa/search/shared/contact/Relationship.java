package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.base.C58838bb;
import java.util.Locale;

/* compiled from: PG */
public class Relationship implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87538z();

    /* renamed from: a */
    public final String f236405a;

    /* renamed from: b */
    public final String f236406b;

    /* renamed from: c */
    public final Locale f236407c;

    public Relationship(String str, String str2) {
        Locale locale = Locale.ENGLISH;
        this.f236407c = locale;
        boolean z = true;
        C58838bb.m90868c(str.length() > 0);
        C58838bb.m90868c(str2.length() <= 0 ? false : z);
        this.f236405a = str;
        this.f236406b = str2.toLowerCase(locale);
    }

    /* renamed from: a */
    public final String mo81589a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] split = str.split("\\s+");
        for (int i = 0; i < split.length; i++) {
            split[i] = String.valueOf(split[i].substring(0, 1).toUpperCase(this.f236407c)).concat(String.valueOf(split[i].substring(1)));
        }
        return TextUtils.join(" ", split);
    }

    /* renamed from: b */
    public final String mo81590b() {
        return this.f236406b.toLowerCase(this.f236407c);
    }

    /* renamed from: c */
    public final String mo81591c() {
        return mo81594e() ? this.f236406b : this.f236405a;
    }

    /* renamed from: d */
    public final String mo81592d() {
        if (mo81594e()) {
            return mo81589a(this.f236406b);
        }
        return mo81589a(this.f236405a);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo81594e() {
        return this.f236405a.equalsIgnoreCase(this.f236406b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Relationship) {
            return ((Relationship) obj).f236406b.equals(this.f236406b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f236406b.hashCode();
    }

    public final String toString() {
        String str = this.f236405a;
        String str2 = this.f236406b;
        return str + "/" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f236405a);
        parcel.writeString(this.f236406b);
    }
}
