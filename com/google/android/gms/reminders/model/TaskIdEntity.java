package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class TaskIdEntity extends AbstractSafeParcelable implements TaskId {
    public static final Parcelable.Creator CREATOR = new C145824ad();

    /* renamed from: a */
    public final String f394332a;

    /* renamed from: b */
    public final String f394333b;

    public TaskIdEntity(TaskId taskId) {
        this(taskId.mo122058h(), taskId.mo122059i());
    }

    public TaskIdEntity(String str, String str2) {
        this.f394332a = str;
        this.f394333b = str2;
    }

    /* renamed from: b */
    public static int m237526b(TaskId taskId) {
        return Arrays.hashCode(new Object[]{taskId.mo122058h(), taskId.mo122059i()});
    }

    /* renamed from: c */
    public static boolean m237527c(TaskId taskId, TaskId taskId2) {
        return C143912ba.m233950b(taskId.mo122058h(), taskId2.mo122058h()) && C143912ba.m233950b(taskId.mo122059i(), taskId2.mo122059i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TaskId)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237527c(this, (TaskId) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final String mo122058h() {
        return this.f394332a;
    }

    public final int hashCode() {
        return m237526b(this);
    }

    /* renamed from: i */
    public final String mo122059i() {
        return this.f394333b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145824ad.m237567a(this, parcel);
    }
}
