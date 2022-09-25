package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.base.C58832aw;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class ContactsConsentsConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145647b();

    /* renamed from: a */
    public final boolean f393882a;

    /* renamed from: b */
    public final boolean f393883b;

    /* renamed from: c */
    public final boolean f393884c;

    /* renamed from: d */
    public final Account f393885d;

    /* renamed from: e */
    public final boolean f393886e;

    /* renamed from: f */
    public final boolean f393887f;

    /* renamed from: g */
    public final String f393888g;

    /* renamed from: h */
    public final List f393889h;

    /* renamed from: i */
    public final boolean f393890i;

    public ContactsConsentsConfig(boolean z, boolean z2, boolean z3, Account account, boolean z4, boolean z5, String str, List list, boolean z6) {
        this.f393882a = z;
        this.f393883b = z2;
        this.f393884c = z3;
        this.f393885d = account;
        this.f393886e = z4;
        this.f393887f = z5;
        this.f393888g = str;
        this.f393889h = list;
        this.f393890i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsConfig)) {
            return false;
        }
        ContactsConsentsConfig contactsConsentsConfig = (ContactsConsentsConfig) obj;
        return this.f393882a == contactsConsentsConfig.f393882a && this.f393883b == contactsConsentsConfig.f393883b && this.f393884c == contactsConsentsConfig.f393884c && this.f393886e == contactsConsentsConfig.f393886e && this.f393887f == contactsConsentsConfig.f393887f && this.f393890i == contactsConsentsConfig.f393890i && C58832aw.m90831a(this.f393885d, contactsConsentsConfig.f393885d) && C58832aw.m90831a(this.f393888g, contactsConsentsConfig.f393888g) && C58832aw.m90831a(this.f393889h, contactsConsentsConfig.f393889h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f393882a), Boolean.valueOf(this.f393883b), Boolean.valueOf(this.f393884c), this.f393885d, Boolean.valueOf(this.f393886e), Boolean.valueOf(this.f393890i), Boolean.valueOf(this.f393887f), this.f393888g, this.f393889h});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f393882a);
        C143947c.m234084c(parcel, 2, this.f393883b);
        C143947c.m234084c(parcel, 3, this.f393884c);
        C143947c.m234105x(parcel, 4, this.f393885d, i);
        C143947c.m234084c(parcel, 5, this.f393886e);
        C143947c.m234084c(parcel, 6, this.f393887f);
        C143947c.m234106y(parcel, 7, this.f393888g);
        C143947c.m234080C(parcel, 8, this.f393889h);
        C143947c.m234084c(parcel, 9, this.f393890i);
        C143947c.m234083b(parcel, a);
    }
}
