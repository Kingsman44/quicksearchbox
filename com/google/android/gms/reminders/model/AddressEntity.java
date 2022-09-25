package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class AddressEntity extends AbstractSafeParcelable implements Address {
    public static final Parcelable.Creator CREATOR = new C145820a();

    /* renamed from: a */
    public final String f394245a;

    /* renamed from: b */
    public final String f394246b;

    /* renamed from: c */
    public final String f394247c;

    /* renamed from: d */
    public final String f394248d;

    /* renamed from: e */
    public final String f394249e;

    /* renamed from: f */
    public final String f394250f;

    /* renamed from: g */
    public final String f394251g;

    /* renamed from: h */
    public final String f394252h;

    public AddressEntity(Address address) {
        this(address.mo121968h(), address.mo121969i(), address.mo121972l(), address.mo121973m(), address.mo121975o(), address.mo121974n(), address.mo121971k(), address.mo121970j());
    }

    public AddressEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f394245a = str;
        this.f394246b = str2;
        this.f394247c = str3;
        this.f394248d = str4;
        this.f394249e = str5;
        this.f394250f = str6;
        this.f394251g = str7;
        this.f394252h = str8;
    }

    /* renamed from: b */
    public static int m237299b(Address address) {
        return Arrays.hashCode(new Object[]{address.mo121968h(), address.mo121969i(), address.mo121972l(), address.mo121973m(), address.mo121975o(), address.mo121974n(), address.mo121971k(), address.mo121970j()});
    }

    /* renamed from: c */
    public static boolean m237300c(Address address, Address address2) {
        return C143912ba.m233950b(address.mo121968h(), address2.mo121968h()) && C143912ba.m233950b(address.mo121969i(), address2.mo121969i()) && C143912ba.m233950b(address.mo121972l(), address2.mo121972l()) && C143912ba.m233950b(address.mo121973m(), address2.mo121973m()) && C143912ba.m233950b(address.mo121975o(), address2.mo121975o()) && C143912ba.m233950b(address.mo121974n(), address2.mo121974n()) && C143912ba.m233950b(address.mo121971k(), address2.mo121971k()) && C143912ba.m233950b(address.mo121970j(), address2.mo121970j());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237300c(this, (Address) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final String mo121968h() {
        return this.f394245a;
    }

    public final int hashCode() {
        return m237299b(this);
    }

    /* renamed from: i */
    public final String mo121969i() {
        return this.f394246b;
    }

    /* renamed from: j */
    public final String mo121970j() {
        return this.f394252h;
    }

    /* renamed from: k */
    public final String mo121971k() {
        return this.f394251g;
    }

    /* renamed from: l */
    public final String mo121972l() {
        return this.f394247c;
    }

    /* renamed from: m */
    public final String mo121973m() {
        return this.f394248d;
    }

    /* renamed from: n */
    public final String mo121974n() {
        return this.f394250f;
    }

    /* renamed from: o */
    public final String mo121975o() {
        return this.f394249e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145820a.m237556a(this, parcel);
    }
}
