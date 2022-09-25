package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class PassInstance extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145622t();

    /* renamed from: a */
    public PassType f393659a;

    /* renamed from: b */
    public String f393660b;

    /* renamed from: c */
    public String f393661c;

    /* renamed from: d */
    public String f393662d;

    /* renamed from: e */
    public Bitmap f393663e;

    /* renamed from: f */
    public String f393664f;

    /* renamed from: g */
    public PendingIntent f393665g;

    /* renamed from: h */
    public String f393666h;

    /* renamed from: i */
    public Bitmap f393667i;

    /* renamed from: j */
    public int f393668j;

    private PassInstance() {
        this.f393668j = 14343392;
    }

    public PassInstance(PassType passType, String str, String str2, String str3, Bitmap bitmap, String str4, PendingIntent pendingIntent, String str5, Bitmap bitmap2, int i) {
        this.f393659a = passType;
        this.f393660b = str;
        this.f393661c = str2;
        this.f393662d = str3;
        this.f393663e = bitmap;
        this.f393664f = str4;
        this.f393665g = pendingIntent;
        this.f393666h = str5;
        this.f393667i = bitmap2;
        this.f393668j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PassInstance) {
            PassInstance passInstance = (PassInstance) obj;
            return C143912ba.m233950b(this.f393659a, passInstance.f393659a) && C143912ba.m233950b(this.f393660b, passInstance.f393660b) && C143912ba.m233950b(this.f393661c, passInstance.f393661c) && C143912ba.m233950b(this.f393662d, passInstance.f393662d) && C143912ba.m233950b(this.f393663e, passInstance.f393663e) && C143912ba.m233950b(this.f393664f, passInstance.f393664f) && C143912ba.m233950b(this.f393665g, passInstance.f393665g) && C143912ba.m233950b(this.f393666h, passInstance.f393666h) && C143912ba.m233950b(this.f393667i, passInstance.f393667i) && C143912ba.m233950b(Integer.valueOf(this.f393668j), Integer.valueOf(passInstance.f393668j));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393659a, this.f393660b, this.f393661c, this.f393662d, this.f393663e, this.f393664f, this.f393665g, this.f393666h, this.f393667i, Integer.valueOf(this.f393668j)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393659a, i);
        C143947c.m234106y(parcel, 2, this.f393660b);
        C143947c.m234106y(parcel, 3, this.f393661c);
        C143947c.m234106y(parcel, 4, this.f393662d);
        C143947c.m234105x(parcel, 5, this.f393663e, i);
        C143947c.m234106y(parcel, 6, this.f393664f);
        C143947c.m234105x(parcel, 7, this.f393665g, i);
        C143947c.m234106y(parcel, 8, this.f393666h);
        C143947c.m234105x(parcel, 9, this.f393667i, i);
        C143947c.m234089h(parcel, 10, this.f393668j);
        C143947c.m234083b(parcel, a);
    }
}
