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
public final class PayGlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145582ac();

    /* renamed from: a */
    public int f393680a;

    /* renamed from: b */
    public String f393681b;

    /* renamed from: c */
    public Bitmap f393682c;

    /* renamed from: d */
    public String f393683d;

    /* renamed from: e */
    public String f393684e;

    /* renamed from: f */
    public String f393685f;

    /* renamed from: g */
    public Bitmap f393686g;

    /* renamed from: h */
    public PendingIntent f393687h;

    /* renamed from: i */
    public int f393688i;

    private PayGlobalActionCard() {
    }

    public PayGlobalActionCard(int i, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent, int i2) {
        this.f393680a = i;
        this.f393681b = str;
        this.f393682c = bitmap;
        this.f393683d = str2;
        this.f393684e = str3;
        this.f393685f = str4;
        this.f393686g = bitmap2;
        this.f393687h = pendingIntent;
        this.f393688i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayGlobalActionCard) {
            PayGlobalActionCard payGlobalActionCard = (PayGlobalActionCard) obj;
            return C143912ba.m233950b(Integer.valueOf(this.f393680a), Integer.valueOf(payGlobalActionCard.f393680a)) && C143912ba.m233950b(this.f393681b, payGlobalActionCard.f393681b) && C143912ba.m233950b(this.f393682c, payGlobalActionCard.f393682c) && C143912ba.m233950b(this.f393683d, payGlobalActionCard.f393683d) && C143912ba.m233950b(this.f393684e, payGlobalActionCard.f393684e) && C143912ba.m233950b(this.f393685f, payGlobalActionCard.f393685f) && C143912ba.m233950b(this.f393686g, payGlobalActionCard.f393686g) && C143912ba.m233950b(this.f393687h, payGlobalActionCard.f393687h) && C143912ba.m233950b(Integer.valueOf(this.f393688i), Integer.valueOf(payGlobalActionCard.f393688i));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393680a), this.f393681b, this.f393682c, this.f393683d, this.f393684e, this.f393685f, this.f393686g, this.f393687h, Integer.valueOf(this.f393688i)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393680a);
        C143947c.m234106y(parcel, 2, this.f393681b);
        C143947c.m234105x(parcel, 3, this.f393682c, i);
        C143947c.m234106y(parcel, 4, this.f393683d);
        C143947c.m234106y(parcel, 5, this.f393684e);
        C143947c.m234105x(parcel, 6, this.f393686g, i);
        C143947c.m234105x(parcel, 7, this.f393687h, i);
        C143947c.m234106y(parcel, 8, this.f393685f);
        C143947c.m234089h(parcel, 9, this.f393688i);
        C143947c.m234083b(parcel, a);
    }
}
