package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.Arrays;

/* compiled from: PG */
public final class ContactsConsentsDetailedStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145648c();

    /* renamed from: a */
    public final int f393891a;

    /* renamed from: b */
    public final Bundle f393892b;

    public ContactsConsentsDetailedStatus(int i, Bundle bundle) {
        this.f393891a = i;
        this.f393892b = bundle;
    }

    /* renamed from: a */
    public final C58495hd mo121691a() {
        C58490gz gzVar = new C58490gz(4);
        for (String str : this.f393892b.keySet()) {
            gzVar.mo55429h(new Account(str, "com.google"), Integer.valueOf(this.f393892b.getInt(str)));
        }
        return gzVar.mo55427f(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsDetailedStatus)) {
            return false;
        }
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) obj;
        return this.f393891a == contactsConsentsDetailedStatus.f393891a && C58832aw.m90831a(mo121691a(), contactsConsentsDetailedStatus.mo121691a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393891a), mo121691a()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393891a);
        C143947c.m234093l(parcel, 2, this.f393892b);
        C143947c.m234083b(parcel, a);
    }
}
