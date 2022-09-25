package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.p10717f.p10718a.C142624a;
import java.util.Arrays;

/* compiled from: PG */
public class ContextManagerClientInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144073o();

    /* renamed from: a */
    public final String f390309a;

    /* renamed from: b */
    public final String f390310b;

    /* renamed from: c */
    public final int f390311c;

    /* renamed from: d */
    public final String f390312d;

    /* renamed from: e */
    public final int f390313e;

    /* renamed from: f */
    public final int f390314f;

    /* renamed from: g */
    public final String f390315g;

    /* renamed from: h */
    public final String f390316h;

    /* renamed from: i */
    public final int f390317i;

    /* renamed from: j */
    public final int f390318j;

    /* renamed from: k */
    public final String f390319k;

    /* renamed from: l */
    private C142624a f390320l;

    public ContextManagerClientInfo(String str, String str2, int i, String str3, int i2, int i3, String str4, String str5, int i4, int i5, String str6) {
        this.f390309a = str;
        this.f390310b = str2;
        this.f390311c = i;
        this.f390312d = str3;
        this.f390313e = i2;
        this.f390314f = i3;
        this.f390315g = str4;
        this.f390316h = str5;
        this.f390317i = i4;
        this.f390318j = i5;
        this.f390319k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextManagerClientInfo)) {
            return false;
        }
        ContextManagerClientInfo contextManagerClientInfo = (ContextManagerClientInfo) obj;
        return this.f390311c == contextManagerClientInfo.f390311c && this.f390313e == contextManagerClientInfo.f390313e && this.f390314f == contextManagerClientInfo.f390314f && this.f390317i == contextManagerClientInfo.f390317i && TextUtils.equals(this.f390309a, contextManagerClientInfo.f390309a) && TextUtils.equals(this.f390310b, contextManagerClientInfo.f390310b) && TextUtils.equals(this.f390312d, contextManagerClientInfo.f390312d) && TextUtils.equals(this.f390315g, contextManagerClientInfo.f390315g) && TextUtils.equals(this.f390316h, contextManagerClientInfo.f390316h) && TextUtils.equals(this.f390319k, contextManagerClientInfo.f390319k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f390309a, this.f390310b, Integer.valueOf(this.f390311c), this.f390312d, Integer.valueOf(this.f390313e), Integer.valueOf(this.f390314f), this.f390315g, this.f390316h, Integer.valueOf(this.f390317i)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f390309a);
        C143947c.m234106y(parcel, 3, this.f390310b);
        C143947c.m234089h(parcel, 4, this.f390311c);
        C143947c.m234106y(parcel, 5, this.f390312d);
        C143947c.m234089h(parcel, 6, this.f390313e);
        C143947c.m234089h(parcel, 7, this.f390314f);
        C143947c.m234106y(parcel, 8, this.f390315g);
        C143947c.m234106y(parcel, 9, this.f390316h);
        C143947c.m234089h(parcel, 10, this.f390317i);
        C143947c.m234089h(parcel, 11, this.f390318j);
        C143947c.m234106y(parcel, 12, this.f390319k);
        C143947c.m234083b(parcel, a);
    }

    public final String toString() {
        C142624a aVar;
        if (this.f390309a == null) {
            aVar = null;
        } else {
            if (this.f390320l == null) {
                this.f390320l = new C142624a(this.f390309a);
            }
            aVar = this.f390320l;
        }
        String valueOf = String.valueOf(aVar);
        String str = this.f390310b;
        int i = this.f390311c;
        String str2 = this.f390312d;
        int i2 = this.f390313e;
        String num = Integer.toString(this.f390314f);
        String str3 = this.f390315g;
        String str4 = this.f390316h;
        int i3 = this.f390318j;
        String str5 = this.f390319k;
        return "(accnt=" + valueOf + ", " + str + "(" + i + "):" + str2 + ", vrsn=" + i2 + ", " + num + ", 3pPkg = " + str3 + " ,  3pMdlId = " + str4 + " ,  pid = " + i3 + " ,  featureId = " + str5 + ")";
    }
}
