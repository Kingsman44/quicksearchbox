package com.google.android.libraries.web.localassets;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.account.AccountId;
import java.io.File;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* compiled from: PG */
public final class AccountStorageWebDirectory implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C43902a();

    /* renamed from: a */
    public final String f114365a;

    /* renamed from: b */
    public final String f114366b;

    /* renamed from: c */
    private final String f114367c;

    /* renamed from: d */
    private final AccountId f114368d;

    public AccountStorageWebDirectory(String str, AccountId accountId) {
        C69664n.m101061g(str, "name");
        C69664n.m101061g(accountId, "accountId");
        this.f114367c = str;
        this.f114368d = accountId;
        if (str.length() == 0) {
            throw new IllegalStateException("Name cannot be empty.");
        } else if (!C69764m.m101205y(str, "/", false)) {
            int a = accountId.mo50068a();
            this.f114365a = "files/accounts/" + a + "/" + str + "/";
            String str2 = C43903b.f114369a;
            String str3 = File.separator;
            this.f114366b = str2 + str3 + str;
        } else {
            throw new IllegalStateException("Name should define a single directory.");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountStorageWebDirectory)) {
            return false;
        }
        AccountStorageWebDirectory accountStorageWebDirectory = (AccountStorageWebDirectory) obj;
        return C69664n.m101066l(this.f114367c, accountStorageWebDirectory.f114367c) && C69664n.m101066l(this.f114368d, accountStorageWebDirectory.f114368d);
    }

    public final int hashCode() {
        return (this.f114367c.hashCode() * 31) + this.f114368d.hashCode();
    }

    public final String toString() {
        String str = this.f114367c;
        AccountId accountId = this.f114368d;
        return "AccountStorageWebDirectory(name=" + str + ", accountId=" + accountId + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "out");
        parcel.writeString(this.f114367c);
        parcel.writeParcelable(this.f114368d, i);
    }
}
