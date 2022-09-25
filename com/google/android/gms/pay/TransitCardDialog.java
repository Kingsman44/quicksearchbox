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
public final class TransitCardDialog extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145593an();

    /* renamed from: a */
    public String f393714a;

    /* renamed from: b */
    public String f393715b;

    /* renamed from: c */
    public String f393716c;

    /* renamed from: d */
    public PendingIntent f393717d;

    /* renamed from: e */
    public String f393718e;

    /* renamed from: f */
    public PendingIntent f393719f;

    /* renamed from: g */
    public Bitmap f393720g;

    /* renamed from: h */
    public Bitmap[] f393721h;

    /* renamed from: i */
    public Animation f393722i;

    private TransitCardDialog() {
    }

    public TransitCardDialog(String str, String str2, String str3, PendingIntent pendingIntent, String str4, PendingIntent pendingIntent2, Bitmap bitmap, Bitmap[] bitmapArr, Animation animation) {
        this.f393714a = str;
        this.f393715b = str2;
        this.f393716c = str3;
        this.f393717d = pendingIntent;
        this.f393718e = str4;
        this.f393719f = pendingIntent2;
        this.f393720g = bitmap;
        this.f393721h = bitmapArr;
        this.f393722i = animation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransitCardDialog) {
            TransitCardDialog transitCardDialog = (TransitCardDialog) obj;
            return C143912ba.m233950b(this.f393714a, transitCardDialog.f393714a) && C143912ba.m233950b(this.f393715b, transitCardDialog.f393715b) && C143912ba.m233950b(this.f393716c, transitCardDialog.f393716c) && C143912ba.m233950b(this.f393717d, transitCardDialog.f393717d) && C143912ba.m233950b(this.f393718e, transitCardDialog.f393718e) && C143912ba.m233950b(this.f393719f, transitCardDialog.f393719f) && C143912ba.m233950b(this.f393720g, transitCardDialog.f393720g) && Arrays.equals(this.f393721h, transitCardDialog.f393721h) && C143912ba.m233950b(this.f393722i, transitCardDialog.f393722i);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393714a, this.f393715b, this.f393716c, this.f393717d, this.f393718e, this.f393719f, this.f393720g, Integer.valueOf(Arrays.hashCode(this.f393721h)), this.f393722i});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393714a);
        C143947c.m234106y(parcel, 2, this.f393715b);
        C143947c.m234106y(parcel, 3, this.f393716c);
        C143947c.m234105x(parcel, 4, this.f393717d, i);
        C143947c.m234106y(parcel, 5, this.f393718e);
        C143947c.m234105x(parcel, 6, this.f393719f, i);
        C143947c.m234105x(parcel, 7, this.f393720g, i);
        C143947c.m234079B(parcel, 8, this.f393721h, i);
        C143947c.m234105x(parcel, 9, this.f393722i, i);
        C143947c.m234083b(parcel, a);
    }
}
