package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Locale;

/* compiled from: PG */
public class UsageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142803as();

    /* renamed from: a */
    public final DocumentId f387562a;

    /* renamed from: b */
    public final long f387563b;

    /* renamed from: c */
    public int f387564c;

    /* renamed from: d */
    public final String f387565d;

    /* renamed from: e */
    public final DocumentContents f387566e;

    /* renamed from: f */
    final boolean f387567f;

    /* renamed from: g */
    int f387568g;

    /* renamed from: h */
    int f387569h;

    /* renamed from: i */
    public final String f387570i;

    public UsageInfo(DocumentId documentId, long j) {
        this(documentId, j, 2, (String) null, (DocumentContents) null, false, -1, 0, (String) null);
    }

    public UsageInfo(DocumentId documentId, long j, int i, String str, DocumentContents documentContents, boolean z, int i2, int i3, String str2) {
        this.f387562a = documentId;
        this.f387563b = j;
        this.f387564c = i;
        this.f387565d = str;
        this.f387566e = documentContents;
        this.f387567f = z;
        this.f387568g = i2;
        this.f387569h = i3;
        this.f387570i = str2;
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[]{this.f387562a, Long.valueOf(this.f387563b), Integer.valueOf(this.f387564c), Integer.valueOf(this.f387569h)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f387562a, i);
        C143947c.m234090i(parcel, 2, this.f387563b);
        C143947c.m234089h(parcel, 3, this.f387564c);
        C143947c.m234106y(parcel, 4, this.f387565d);
        C143947c.m234105x(parcel, 5, this.f387566e, i);
        C143947c.m234084c(parcel, 6, this.f387567f);
        C143947c.m234089h(parcel, 7, this.f387568g);
        C143947c.m234089h(parcel, 8, this.f387569h);
        C143947c.m234106y(parcel, 9, this.f387570i);
        C143947c.m234083b(parcel, a);
    }
}
