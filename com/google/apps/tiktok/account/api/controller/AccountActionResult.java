package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AccountActionResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C45962a();

    /* renamed from: a */
    public final AccountId f120752a;

    /* renamed from: b */
    public final C46215j f120753b;

    /* renamed from: c */
    public final ValidationResult f120754c;

    /* renamed from: d */
    public final Intent f120755d;

    public AccountActionResult(Parcel parcel) {
        this.f120752a = (AccountId) parcel.readParcelable(AccountId.class.getClassLoader());
        try {
            this.f120753b = (C46215j) ProtoParsers.m95518a(parcel, C46215j.f121154k, C62921ba.m95368a());
            this.f120754c = (ValidationResult) parcel.readParcelable(ValidationResult.class.getClassLoader());
            this.f120755d = (Intent) parcel.readParcelable(ValidationResult.class.getClassLoader());
        } catch (C62974ct e) {
            throw new IllegalStateException("Failed to convert AccountInfo to Parcelable!", e);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f120752a, 0);
        ProtoParsers.m95530m(parcel, this.f120753b);
        parcel.writeParcelable(this.f120754c, 0);
        parcel.writeParcelable(this.f120755d, 0);
    }

    public AccountActionResult(AccountId accountId, C46215j jVar, ValidationResult validationResult, Intent intent) {
        this.f120752a = accountId;
        jVar.getClass();
        this.f120753b = jVar;
        this.f120754c = validationResult;
        this.f120755d = intent;
    }
}
