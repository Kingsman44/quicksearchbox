package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class ExternalApplicationLinkEntity extends AbstractSafeParcelable implements ExternalApplicationLink {
    public static final Parcelable.Creator CREATOR = new C145836h();

    /* renamed from: a */
    public final Integer f394270a;

    /* renamed from: b */
    public final String f394271b;

    public ExternalApplicationLinkEntity(ExternalApplicationLink externalApplicationLink) {
        this(externalApplicationLink.mo122003h(), externalApplicationLink.mo122004i());
    }

    public ExternalApplicationLinkEntity(Integer num, String str) {
        this.f394270a = num;
        this.f394271b = str;
    }

    /* renamed from: b */
    public static int m237363b(ExternalApplicationLink externalApplicationLink) {
        return Arrays.hashCode(new Object[]{externalApplicationLink.mo122003h(), externalApplicationLink.mo122004i()});
    }

    /* renamed from: c */
    public static boolean m237364c(ExternalApplicationLink externalApplicationLink, ExternalApplicationLink externalApplicationLink2) {
        return C143912ba.m233950b(externalApplicationLink.mo122003h(), externalApplicationLink2.mo122003h()) && C143912ba.m233950b(externalApplicationLink.mo122004i(), externalApplicationLink2.mo122004i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExternalApplicationLink)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237364c(this, (ExternalApplicationLink) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final Integer mo122003h() {
        return this.f394270a;
    }

    public final int hashCode() {
        return m237363b(this);
    }

    /* renamed from: i */
    public final String mo122004i() {
        return this.f394271b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145836h.m237582a(this, parcel);
    }
}
