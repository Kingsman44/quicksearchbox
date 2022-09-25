package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public abstract class ValidationResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C46029cm();

    /* renamed from: a */
    private static ValidationResult f120799a;

    /* renamed from: d */
    public static ValidationResult m82127d() {
        ValidationResult validationResult;
        synchronized (ValidationResult.class) {
            if (f120799a == null) {
                f120799a = new AutoValue_ValidationResult(true, false, (Intent) null);
            }
            validationResult = f120799a;
        }
        return validationResult;
    }

    /* renamed from: a */
    public abstract Intent mo50106a();

    /* renamed from: b */
    public abstract boolean mo50107b();

    /* renamed from: c */
    public abstract boolean mo50108c();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mo50108c() ? 1 : 0);
        parcel.writeInt(mo50107b() ? 1 : 0);
        parcel.writeParcelable(mo50106a(), 0);
    }
}
