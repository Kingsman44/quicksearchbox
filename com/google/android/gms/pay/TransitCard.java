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
public final class TransitCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145592am();

    /* renamed from: a */
    public int f393706a;

    /* renamed from: b */
    public String f393707b;

    /* renamed from: c */
    public Bitmap f393708c;

    /* renamed from: d */
    public Bitmap f393709d;

    /* renamed from: e */
    public String f393710e;

    /* renamed from: f */
    public String f393711f;

    /* renamed from: g */
    public PendingIntent f393712g;

    /* renamed from: h */
    public TransitCardDialog f393713h;

    private TransitCard() {
    }

    public TransitCard(int i, String str, Bitmap bitmap, Bitmap bitmap2, String str2, String str3, PendingIntent pendingIntent, TransitCardDialog transitCardDialog) {
        this.f393706a = i;
        this.f393707b = str;
        this.f393708c = bitmap;
        this.f393709d = bitmap2;
        this.f393710e = str2;
        this.f393711f = str3;
        this.f393712g = pendingIntent;
        this.f393713h = transitCardDialog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransitCard) {
            TransitCard transitCard = (TransitCard) obj;
            return C143912ba.m233950b(Integer.valueOf(this.f393706a), Integer.valueOf(transitCard.f393706a)) && C143912ba.m233950b(this.f393707b, transitCard.f393707b) && C143912ba.m233950b(this.f393708c, transitCard.f393708c) && C143912ba.m233950b(this.f393709d, transitCard.f393709d) && C143912ba.m233950b(this.f393710e, transitCard.f393710e) && C143912ba.m233950b(this.f393711f, transitCard.f393711f) && C143912ba.m233950b(this.f393712g, transitCard.f393712g) && C143912ba.m233950b(this.f393713h, transitCard.f393713h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393706a), this.f393707b, this.f393708c, this.f393709d, this.f393710e, this.f393711f, this.f393712g, this.f393713h});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393706a);
        C143947c.m234106y(parcel, 2, this.f393707b);
        C143947c.m234105x(parcel, 3, this.f393708c, i);
        C143947c.m234105x(parcel, 4, this.f393709d, i);
        C143947c.m234106y(parcel, 5, this.f393710e);
        C143947c.m234106y(parcel, 6, this.f393711f);
        C143947c.m234105x(parcel, 7, this.f393712g, i);
        C143947c.m234105x(parcel, 8, this.f393713h, i);
        C143947c.m234083b(parcel, a);
    }
}
