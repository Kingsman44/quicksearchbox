package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zg */
/* compiled from: PG */
public final class C7467zg implements C7242qy {
    public static final Parcelable.Creator CREATOR = new C7464zd();

    /* renamed from: a */
    public final String f24550a;

    /* renamed from: b */
    public final String f24551b;

    /* renamed from: c */
    public final List f24552c;

    public C7467zg(Parcel parcel) {
        this.f24550a = parcel.readString();
        this.f24551b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((C7466zf) parcel.readParcelable(C7466zf.class.getClassLoader()));
        }
        this.f24552c = Collections.unmodifiableList(arrayList);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7467zg zgVar = (C7467zg) obj;
            return TextUtils.equals(this.f24550a, zgVar.f24550a) && TextUtils.equals(this.f24551b, zgVar.f24551b) && this.f24552c.equals(zgVar.f24552c);
        }
    }

    public final int hashCode() {
        String str = this.f24550a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24551b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f24552c.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.f24550a;
        if (str2 != null) {
            String str3 = this.f24551b;
            StringBuilder sb = new StringBuilder(str2.length() + 5 + String.valueOf(str3).length());
            sb.append(" [");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.append("]");
            str = sb.toString();
        } else {
            str = BuildConfig.FLAVOR;
        }
        return str.length() != 0 ? "HlsTrackMetadataEntry".concat(str) : new String("HlsTrackMetadataEntry");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24550a);
        parcel.writeString(this.f24551b);
        int size = this.f24552c.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) this.f24552c.get(i2), 0);
        }
    }

    public C7467zg(String str, String str2, List list) {
        this.f24550a = str;
        this.f24551b = str2;
        this.f24552c = Collections.unmodifiableList(new ArrayList(list));
    }
}
