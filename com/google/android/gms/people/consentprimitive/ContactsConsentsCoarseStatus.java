package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class ContactsConsentsCoarseStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145646a();

    /* renamed from: a */
    public final boolean f393875a;

    /* renamed from: b */
    public final boolean f393876b;

    /* renamed from: c */
    public final String f393877c;

    /* renamed from: d */
    public final boolean f393878d;

    /* renamed from: e */
    private final List f393879e;

    /* renamed from: f */
    private final List f393880f;

    /* renamed from: g */
    private final List f393881g;

    public ContactsConsentsCoarseStatus(boolean z, boolean z2, List list, List list2, String str, boolean z3, List list3) {
        this.f393875a = z;
        this.f393876b = z2;
        this.f393877c = str;
        this.f393879e = list;
        this.f393880f = list2;
        this.f393878d = z3;
        this.f393881g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsCoarseStatus)) {
            return false;
        }
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) obj;
        return this.f393875a == contactsConsentsCoarseStatus.f393875a && this.f393876b == contactsConsentsCoarseStatus.f393876b && C58832aw.m90831a(this.f393880f, contactsConsentsCoarseStatus.f393880f) && C58832aw.m90831a(this.f393879e, contactsConsentsCoarseStatus.f393879e) && C58832aw.m90831a(this.f393877c, contactsConsentsCoarseStatus.f393877c) && this.f393878d == contactsConsentsCoarseStatus.f393878d && C58832aw.m90831a(this.f393881g, contactsConsentsCoarseStatus.f393881g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f393875a), Boolean.valueOf(this.f393876b), this.f393879e, this.f393880f, this.f393877c, Boolean.valueOf(this.f393878d), this.f393881g});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C58485gu guVar;
        C58485gu guVar2;
        C58485gu guVar3;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f393875a);
        C143947c.m234084c(parcel, 2, this.f393876b);
        List list = this.f393879e;
        if (list == null) {
            guVar = C58485gu.m89845m();
        } else {
            guVar = C58485gu.m89842j(list);
        }
        C143947c.m234080C(parcel, 3, guVar);
        List list2 = this.f393880f;
        if (list2 == null) {
            guVar2 = C58485gu.m89845m();
        } else {
            guVar2 = C58485gu.m89842j(list2);
        }
        C143947c.m234080C(parcel, 4, guVar2);
        C143947c.m234106y(parcel, 5, this.f393877c);
        C143947c.m234084c(parcel, 6, this.f393878d);
        List list3 = this.f393881g;
        if (list3 == null) {
            guVar3 = C58485gu.m89845m();
        } else {
            guVar3 = C58485gu.m89842j(list3);
        }
        C143947c.m234080C(parcel, 7, guVar3);
        C143947c.m234083b(parcel, a);
    }
}
