package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
public class UserAttributeParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145492kb();

    /* renamed from: a */
    public final int f392540a;

    /* renamed from: b */
    public final String f392541b;

    /* renamed from: c */
    public final long f392542c;

    /* renamed from: d */
    public final Long f392543d;

    /* renamed from: e */
    public final String f392544e;

    /* renamed from: f */
    public final String f392545f;

    /* renamed from: g */
    public final Double f392546g;

    public UserAttributeParcel(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f392540a = i;
        this.f392541b = str;
        this.f392542c = j;
        this.f392543d = l;
        if (i == 1) {
            this.f392546g = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f392546g = d;
        }
        this.f392544e = str2;
        this.f392545f = str3;
    }

    /* renamed from: a */
    public final Object mo120761a() {
        Long l = this.f392543d;
        if (l != null) {
            return l;
        }
        Double d = this.f392546g;
        if (d != null) {
            return d;
        }
        String str = this.f392544e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145492kb.m236480a(this, parcel);
    }

    public UserAttributeParcel(C145493kc kcVar) {
        this(kcVar.f393383c, kcVar.f393384d, kcVar.f393385e, kcVar.f393382b);
    }

    public UserAttributeParcel(String str, long j, Object obj, String str2) {
        C143919bh.m233969l(str);
        this.f392540a = 2;
        this.f392541b = str;
        this.f392542c = j;
        this.f392545f = str2;
        if (obj == null) {
            this.f392543d = null;
            this.f392546g = null;
            this.f392544e = null;
        } else if (obj instanceof Long) {
            this.f392543d = (Long) obj;
            this.f392546g = null;
            this.f392544e = null;
        } else if (obj instanceof String) {
            this.f392543d = null;
            this.f392546g = null;
            this.f392544e = (String) obj;
        } else if (obj instanceof Double) {
            this.f392543d = null;
            this.f392546g = (Double) obj;
            this.f392544e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
