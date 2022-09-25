package com.google.android.libraries.web.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.base.C43271v;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class Profile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C44066c();

    /* renamed from: a */
    public final String f114483a;

    /* renamed from: b */
    public final C43271v f114484b;

    /* renamed from: c */
    public final boolean f114485c;

    /* renamed from: d */
    public final AccountId f114486d;

    public Profile(String str, C43271v vVar, boolean z, AccountId accountId) {
        C69664n.m101061g(str, "name");
        C69664n.m101061g(vVar, "webImplementation");
        C69664n.m101061g(accountId, "accountId");
        this.f114483a = str;
        this.f114484b = vVar;
        this.f114485c = z;
        this.f114486d = accountId;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return C69664n.m101066l(this.f114483a, profile.f114483a) && this.f114484b == profile.f114484b && this.f114485c == profile.f114485c && C69664n.m101066l(this.f114486d, profile.f114486d);
    }

    public final int hashCode() {
        return (((((this.f114483a.hashCode() * 31) + this.f114484b.hashCode()) * 31) + (this.f114485c ? 1 : 0)) * 31) + this.f114486d.hashCode();
    }

    public final String toString() {
        String str = this.f114483a;
        C43271v vVar = this.f114484b;
        boolean z = this.f114485c;
        AccountId accountId = this.f114486d;
        return "Profile(name=" + str + ", webImplementation=" + vVar + ", isIncognito=" + z + ", accountId=" + accountId + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "out");
        parcel.writeString(this.f114483a);
        parcel.writeString(this.f114484b.name());
        parcel.writeInt(this.f114485c ? 1 : 0);
        parcel.writeParcelable(this.f114486d, i);
    }
}
