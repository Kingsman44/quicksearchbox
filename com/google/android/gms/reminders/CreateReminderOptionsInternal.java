package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class CreateReminderOptionsInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145774c();

    /* renamed from: a */
    public static final CreateReminderOptionsInternal f394109a = new CreateReminderOptionsInternal((String) null, (String) null, false);

    /* renamed from: b */
    public final String f394110b;

    /* renamed from: c */
    public final String f394111c;

    /* renamed from: d */
    public final boolean f394112d;

    public CreateReminderOptionsInternal(String str, String str2, boolean z) {
        this.f394110b = str;
        this.f394111c = str2;
        this.f394112d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f394110b);
        C143947c.m234106y(parcel, 3, this.f394111c);
        C143947c.m234084c(parcel, 4, this.f394112d);
        C143947c.m234083b(parcel, a);
    }
}
