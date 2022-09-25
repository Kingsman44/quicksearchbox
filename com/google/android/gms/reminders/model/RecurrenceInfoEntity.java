package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class RecurrenceInfoEntity extends AbstractSafeParcelable implements RecurrenceInfo {
    public static final Parcelable.Creator CREATOR = new C145848t();

    /* renamed from: a */
    public final RecurrenceEntity f394302a;

    /* renamed from: b */
    public final String f394303b;

    /* renamed from: c */
    public final Boolean f394304c;

    /* renamed from: d */
    public final Boolean f394305d;

    public RecurrenceInfoEntity(Recurrence recurrence, String str, Boolean bool, Boolean bool2, boolean z) {
        RecurrenceEntity recurrenceEntity;
        this.f394303b = str;
        this.f394304c = bool;
        this.f394305d = bool2;
        if (z) {
            this.f394302a = (RecurrenceEntity) recurrence;
            return;
        }
        if (recurrence == null) {
            recurrenceEntity = null;
        } else {
            recurrenceEntity = new RecurrenceEntity(recurrence);
        }
        this.f394302a = recurrenceEntity;
    }

    public RecurrenceInfoEntity(RecurrenceEntity recurrenceEntity, String str, Boolean bool, Boolean bool2) {
        this.f394302a = recurrenceEntity;
        this.f394303b = str;
        this.f394304c = bool;
        this.f394305d = bool2;
    }

    /* renamed from: b */
    public static int m237457b(RecurrenceInfo recurrenceInfo) {
        return Arrays.hashCode(new Object[]{recurrenceInfo.mo122039h(), recurrenceInfo.mo122042k(), recurrenceInfo.mo122041j(), recurrenceInfo.mo122040i()});
    }

    /* renamed from: c */
    public static boolean m237458c(RecurrenceInfo recurrenceInfo, RecurrenceInfo recurrenceInfo2) {
        return C143912ba.m233950b(recurrenceInfo.mo122039h(), recurrenceInfo2.mo122039h()) && C143912ba.m233950b(recurrenceInfo.mo122042k(), recurrenceInfo2.mo122042k()) && C143912ba.m233950b(recurrenceInfo.mo122041j(), recurrenceInfo2.mo122041j()) && C143912ba.m233950b(recurrenceInfo.mo122040i(), recurrenceInfo2.mo122040i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237458c(this, (RecurrenceInfo) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final Recurrence mo122039h() {
        return this.f394302a;
    }

    public final int hashCode() {
        return m237457b(this);
    }

    /* renamed from: i */
    public final Boolean mo122040i() {
        return this.f394305d;
    }

    /* renamed from: j */
    public final Boolean mo122041j() {
        return this.f394304c;
    }

    /* renamed from: k */
    public final String mo122042k() {
        return this.f394303b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145848t.m237599a(this, parcel, i);
    }

    public RecurrenceInfoEntity(RecurrenceInfo recurrenceInfo) {
        this(recurrenceInfo.mo122039h(), recurrenceInfo.mo122042k(), recurrenceInfo.mo122041j(), recurrenceInfo.mo122040i(), false);
    }
}
