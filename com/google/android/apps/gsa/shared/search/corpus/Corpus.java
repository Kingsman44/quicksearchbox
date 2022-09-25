package com.google.android.apps.gsa.shared.search.corpus;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.p395al.p408c.p414c.p416b.C8494d;
import com.google.p395al.p408c.p414c.p416b.C8497g;
import com.google.p395al.p417d.C8600b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class Corpus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90493a();

    /* renamed from: a */
    private final Uri f252911a;

    /* renamed from: b */
    private final String f252912b;

    /* renamed from: c */
    private final boolean f252913c;

    /* renamed from: e */
    public final String f252914e;

    /* renamed from: f */
    public final C8600b f252915f;

    /* renamed from: g */
    public final Uri f252916g;

    /* renamed from: h */
    public final Map f252917h;

    /* renamed from: i */
    public final int f252918i;

    public Corpus(Parcel parcel) {
        this.f252914e = parcel.readString();
        C8600b a = C8600b.m23279a(parcel.readInt());
        this.f252915f = a == null ? C8600b.NO_MODES : a;
        this.f252917h = C90772bp.m148314v(parcel.readBundle());
        this.f252911a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f252916g = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f252912b = parcel.readString();
        int i = 1;
        this.f252913c = parcel.readByte() != 0;
        int a2 = C8494d.m23269a(parcel.readInt());
        this.f252918i = a2 != 0 ? a2 : i;
    }

    public Corpus(String str, C8600b bVar, int i, Uri uri, Uri uri2, Map map, String str2, boolean z) {
        this.f252914e = str;
        this.f252915f = bVar;
        this.f252918i = i;
        this.f252911a = uri;
        this.f252916g = uri2;
        this.f252917h = map;
        this.f252912b = str2;
        this.f252913c = z;
    }

    /* renamed from: c */
    public static Map m147520c(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8497g gVar = (C8497g) it.next();
            hashMap.put(gVar.f29490a, gVar.f29491b);
        }
        return hashMap;
    }

    /* renamed from: b */
    public boolean mo79406b() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Corpus) {
            return TextUtils.equals(this.f252914e, ((Corpus) obj).f252914e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f252914e.hashCode();
    }

    public String toString() {
        String str = this.f252914e;
        return "Corpus[" + str + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f252914e);
        parcel.writeInt(this.f252915f.f29816af);
        parcel.writeBundle(C90772bp.m148300h(this.f252917h));
        parcel.writeParcelable(this.f252911a, i);
        parcel.writeParcelable(this.f252916g, i);
        parcel.writeString(this.f252912b);
        parcel.writeByte(this.f252913c ? (byte) 1 : 0);
        int i2 = this.f252918i;
        if (i2 != 0) {
            parcel.writeInt(i2);
            return;
        }
        throw null;
    }
}
