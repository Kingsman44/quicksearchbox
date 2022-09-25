package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C144355a();

    /* renamed from: a */
    String f390920a;

    /* renamed from: b */
    String f390921b;

    /* renamed from: c */
    String f390922c;

    /* renamed from: d */
    String f390923d;

    /* renamed from: e */
    String f390924e;

    /* renamed from: f */
    String f390925f;

    /* renamed from: g */
    String f390926g;

    /* renamed from: h */
    String f390927h;

    /* renamed from: i */
    String f390928i;

    /* renamed from: j */
    String f390929j;

    /* renamed from: k */
    String f390930k;

    /* renamed from: l */
    String f390931l;

    /* renamed from: m */
    boolean f390932m;

    /* renamed from: n */
    String f390933n;

    /* renamed from: o */
    String f390934o;

    UserAddress() {
    }

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.f390920a = str;
        this.f390921b = str2;
        this.f390922c = str3;
        this.f390923d = str4;
        this.f390924e = str5;
        this.f390925f = str6;
        this.f390926g = str7;
        this.f390927h = str8;
        this.f390928i = str9;
        this.f390929j = str10;
        this.f390930k = str11;
        this.f390931l = str12;
        this.f390932m = z;
        this.f390933n = str13;
        this.f390934o = str14;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f390920a);
        C143947c.m234106y(parcel, 3, this.f390921b);
        C143947c.m234106y(parcel, 4, this.f390922c);
        C143947c.m234106y(parcel, 5, this.f390923d);
        C143947c.m234106y(parcel, 6, this.f390924e);
        C143947c.m234106y(parcel, 7, this.f390925f);
        C143947c.m234106y(parcel, 8, this.f390926g);
        C143947c.m234106y(parcel, 9, this.f390927h);
        C143947c.m234106y(parcel, 10, this.f390928i);
        C143947c.m234106y(parcel, 11, this.f390929j);
        C143947c.m234106y(parcel, 12, this.f390930k);
        C143947c.m234106y(parcel, 13, this.f390931l);
        C143947c.m234084c(parcel, 14, this.f390932m);
        C143947c.m234106y(parcel, 15, this.f390933n);
        C143947c.m234106y(parcel, 16, this.f390934o);
        C143947c.m234083b(parcel, a);
    }
}
