package com.google.android.libraries.notifications.platform.registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.search.C90507o;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public abstract class AccountRepresentation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C30152b();

    /* renamed from: a */
    public abstract C30151a mo35537a();

    /* renamed from: b */
    public abstract String mo35538b();

    /* renamed from: c */
    public final String mo35539c() {
        C30151a a = mo35537a();
        C30151a aVar = C30151a.GAIA;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return mo35538b();
        }
        if (ordinal == 1) {
            return C90507o.f253014d;
        }
        throw new C69677g();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "dest");
        parcel.writeInt(mo35537a().ordinal());
        parcel.writeString(mo35539c());
    }
}
