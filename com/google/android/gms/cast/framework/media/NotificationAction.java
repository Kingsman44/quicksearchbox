package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class NotificationAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143536w();

    /* renamed from: a */
    public final String f389040a;

    /* renamed from: b */
    public final int f389041b;

    /* renamed from: c */
    public final String f389042c;

    public NotificationAction(String str, int i, String str2) {
        this.f389040a = str;
        this.f389041b = i;
        this.f389042c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f389040a);
        C143947c.m234089h(parcel, 3, this.f389041b);
        C143947c.m234106y(parcel, 4, this.f389042c);
        C143947c.m234083b(parcel, a);
    }
}
