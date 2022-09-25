package com.google.android.gms.kids;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetParentVerificationIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144430b();

    /* renamed from: a */
    public int f391019a;

    /* renamed from: b */
    public int f391020b;

    /* renamed from: c */
    public String f391021c;

    /* renamed from: d */
    public int f391022d;

    /* renamed from: e */
    public byte[] f391023e;

    /* renamed from: f */
    public byte[] f391024f;

    /* renamed from: g */
    public PendingIntent f391025g;

    public GetParentVerificationIntentRequest() {
    }

    public GetParentVerificationIntentRequest(int i, int i2, String str, int i3, byte[] bArr, byte[] bArr2, PendingIntent pendingIntent) {
        this.f391019a = i;
        this.f391020b = i2;
        this.f391021c = str;
        this.f391022d = i3;
        this.f391023e = bArr;
        this.f391024f = bArr2;
        this.f391025g = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetParentVerificationIntentRequest) {
            GetParentVerificationIntentRequest getParentVerificationIntentRequest = (GetParentVerificationIntentRequest) obj;
            return C143912ba.m233950b(Integer.valueOf(this.f391019a), Integer.valueOf(getParentVerificationIntentRequest.f391019a)) && C143912ba.m233950b(Integer.valueOf(this.f391020b), Integer.valueOf(getParentVerificationIntentRequest.f391020b)) && C143912ba.m233950b(this.f391021c, getParentVerificationIntentRequest.f391021c) && C143912ba.m233950b(Integer.valueOf(this.f391022d), Integer.valueOf(getParentVerificationIntentRequest.f391022d)) && Arrays.equals(this.f391023e, getParentVerificationIntentRequest.f391023e) && Arrays.equals(this.f391024f, getParentVerificationIntentRequest.f391024f) && C143912ba.m233950b(this.f391025g, getParentVerificationIntentRequest.f391025g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f391019a), Integer.valueOf(this.f391020b), this.f391021c, Integer.valueOf(this.f391022d), Integer.valueOf(Arrays.hashCode(this.f391023e)), Integer.valueOf(Arrays.hashCode(this.f391024f)), this.f391025g});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f391019a);
        C143947c.m234089h(parcel, 2, this.f391020b);
        C143947c.m234106y(parcel, 3, this.f391021c);
        C143947c.m234089h(parcel, 4, this.f391022d);
        C143947c.m234094m(parcel, 5, this.f391023e);
        C143947c.m234094m(parcel, 6, this.f391024f);
        C143947c.m234105x(parcel, 7, this.f391025g, i);
        C143947c.m234083b(parcel, a);
    }
}
