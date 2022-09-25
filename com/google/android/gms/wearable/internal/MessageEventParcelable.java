package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class MessageEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146466bx();

    /* renamed from: a */
    public final int f395609a;

    /* renamed from: b */
    public final String f395610b;

    /* renamed from: c */
    public final byte[] f395611c;

    /* renamed from: d */
    public final String f395612d;

    public MessageEventParcelable(int i, String str, byte[] bArr, String str2) {
        this.f395609a = i;
        this.f395610b = str;
        this.f395611c = bArr;
        this.f395612d = str2;
    }

    public final String toString() {
        int i = this.f395609a;
        String str = this.f395610b;
        byte[] bArr = this.f395611c;
        String obj = (bArr == null ? "null" : Integer.valueOf(bArr.length)).toString();
        return "MessageEventParcelable[" + i + "," + str + ", size=" + obj + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395609a);
        C143947c.m234106y(parcel, 3, this.f395610b);
        C143947c.m234094m(parcel, 4, this.f395611c);
        C143947c.m234106y(parcel, 5, this.f395612d);
        C143947c.m234083b(parcel, a);
    }
}
