package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* compiled from: PG */
public final class ContactsConsentsStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145649d();

    /* renamed from: a */
    public final ContactsConsentsCoarseStatus f393893a;

    /* renamed from: b */
    public final ContactsConsentsDetailedStatus f393894b;

    /* renamed from: c */
    public final ContactsConsentsConfig f393895c;

    public ContactsConsentsStatus(ContactsConsentsCoarseStatus contactsConsentsCoarseStatus, ContactsConsentsDetailedStatus contactsConsentsDetailedStatus, ContactsConsentsConfig contactsConsentsConfig) {
        this.f393893a = contactsConsentsCoarseStatus;
        this.f393894b = contactsConsentsDetailedStatus;
        this.f393895c = contactsConsentsConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsStatus)) {
            return false;
        }
        ContactsConsentsStatus contactsConsentsStatus = (ContactsConsentsStatus) obj;
        return C58832aw.m90831a(this.f393893a, contactsConsentsStatus.f393893a) && C58832aw.m90831a(this.f393894b, contactsConsentsStatus.f393894b) && C58832aw.m90831a(this.f393895c, contactsConsentsStatus.f393895c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393893a, this.f393894b, this.f393895c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393893a, i);
        C143947c.m234105x(parcel, 2, this.f393894b, i);
        C143947c.m234105x(parcel, 3, this.f393895c, i);
        C143947c.m234083b(parcel, a);
    }
}
