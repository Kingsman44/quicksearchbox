package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;

/* compiled from: PG */
public final class CrossProfileValidationManager_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C110623bz();

    public CrossProfileValidationManager_Bundler() {
    }

    public CrossProfileValidationManager_Bundler(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object mo86969a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("java.lang.Boolean".equals(bundlerType.f386875a)) {
            return Boolean.valueOf(bundle.getBoolean("result"));
        }
        String str2 = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str2 + " cannot be read from Bundle");
    }

    /* renamed from: b */
    public final Object mo86970b(Parcel parcel, BundlerType bundlerType) {
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("java.lang.Boolean".equals(bundlerType.f386875a)) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        String str = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
    }

    /* renamed from: c */
    public final void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("java.lang.Boolean".equals(bundlerType.f386875a)) {
                bundle.putBoolean("result", ((Boolean) obj).booleanValue());
                return;
            }
            String str2 = bundlerType.f386875a;
            throw new IllegalArgumentException("Type " + str2 + " cannot be written to Bundle");
        }
    }

    /* renamed from: d */
    public final void mo86972d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("java.lang.Boolean".equals(bundlerType.f386875a)) {
                parcel.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            }
            String str = bundlerType.f386875a;
            throw new IllegalArgumentException("Type " + str + " cannot be written to Parcel");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
