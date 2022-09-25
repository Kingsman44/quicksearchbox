package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C142884a();

    /* renamed from: a */
    final int f387686a;

    /* renamed from: b */
    public String f387687b;

    /* renamed from: c */
    public String f387688c;

    /* renamed from: d */
    public String f387689d;

    /* renamed from: e */
    public String f387690e;

    /* renamed from: f */
    public Uri f387691f;

    /* renamed from: g */
    public String f387692g;

    /* renamed from: h */
    public long f387693h;

    /* renamed from: i */
    public String f387694i;

    /* renamed from: j */
    List f387695j;

    /* renamed from: k */
    public String f387696k;

    /* renamed from: l */
    public String f387697l;

    /* renamed from: m */
    private Set f387698m = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.f387686a = i;
        this.f387687b = str;
        this.f387688c = str2;
        this.f387689d = str3;
        this.f387690e = str4;
        this.f387691f = uri;
        this.f387692g = str5;
        this.f387693h = j;
        this.f387694i = str6;
        this.f387695j = list;
        this.f387696k = str7;
        this.f387697l = str8;
    }

    /* renamed from: a */
    public final Set mo117797a() {
        HashSet hashSet = new HashSet(this.f387695j);
        hashSet.addAll(this.f387698m);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f387694i.equals(this.f387694i) && googleSignInAccount.mo117797a().equals(mo117797a());
    }

    public final int hashCode() {
        return ((this.f387694i.hashCode() + 527) * 31) + mo117797a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f387686a);
        C143947c.m234106y(parcel, 2, this.f387687b);
        C143947c.m234106y(parcel, 3, this.f387688c);
        C143947c.m234106y(parcel, 4, this.f387689d);
        C143947c.m234106y(parcel, 5, this.f387690e);
        C143947c.m234105x(parcel, 6, this.f387691f, i);
        C143947c.m234106y(parcel, 7, this.f387692g);
        C143947c.m234090i(parcel, 8, this.f387693h);
        C143947c.m234106y(parcel, 9, this.f387694i);
        C143947c.m234080C(parcel, 10, this.f387695j);
        C143947c.m234106y(parcel, 11, this.f387696k);
        C143947c.m234106y(parcel, 12, this.f387697l);
        C143947c.m234083b(parcel, a);
    }
}
