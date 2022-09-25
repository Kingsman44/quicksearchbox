package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class UpdateRecurrenceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145856o();

    /* renamed from: a */
    public static final UpdateRecurrenceOptions f394129a = new C145855n().mo122233a();

    /* renamed from: b */
    public final int f394130b;

    /* renamed from: c */
    public final boolean f394131c;

    /* renamed from: d */
    public final Long f394132d;

    public UpdateRecurrenceOptions(Integer num, Boolean bool, Long l) {
        int i;
        boolean z = false;
        boolean z2 = true;
        if (!(num == null || num.intValue() == 0 || num.intValue() == 1)) {
            z2 = false;
        }
        C143919bh.m233960c(z2, "Invalid update mode");
        if (num == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        this.f394130b = i;
        this.f394131c = bool != null ? bool.booleanValue() : z;
        this.f394132d = l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f394130b);
        C143947c.m234084c(parcel, 3, this.f394131c);
        C143947c.m234104w(parcel, 4, this.f394132d);
        C143947c.m234083b(parcel, a);
    }
}
