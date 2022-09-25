package com.google.android.gms.audit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class LogAuditRecordsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142838g();

    /* renamed from: a */
    public final int f387624a;

    /* renamed from: b */
    public final int f387625b;

    /* renamed from: c */
    public final String f387626c;

    /* renamed from: d */
    public final byte[][] f387627d;

    /* renamed from: e */
    public final byte[] f387628e;

    /* renamed from: f */
    public final byte[] f387629f;

    public LogAuditRecordsRequest(int i, int i2, String str, byte[][] bArr, byte[] bArr2, byte[] bArr3) {
        this.f387624a = i;
        this.f387625b = i2;
        this.f387626c = str;
        this.f387627d = bArr;
        this.f387628e = bArr2;
        this.f387629f = bArr3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f387624a);
        C143947c.m234089h(parcel, 2, this.f387625b);
        C143947c.m234106y(parcel, 3, this.f387626c);
        C143947c.m234095n(parcel, 4, this.f387627d);
        C143947c.m234094m(parcel, 5, this.f387628e);
        C143947c.m234094m(parcel, 6, this.f387629f);
        C143947c.m234083b(parcel, a);
    }
}
