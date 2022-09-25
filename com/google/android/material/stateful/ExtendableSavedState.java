package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.p060c.C0984n;

/* compiled from: PG */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C44896a();

    /* renamed from: a */
    public final C0984n f117155a;

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f117155a = new C0984n(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f117155a.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String obj = this.f117155a.toString();
        return "ExtendableSavedState{" + hexString + " states=" + obj + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6116d, i);
        int i2 = this.f117155a.f3122d;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) this.f117155a.mo3702e(i3);
            bundleArr[i3] = (Bundle) this.f117155a.mo3708h(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f117155a = new C0984n(0);
    }
}
