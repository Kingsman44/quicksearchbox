package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;

/* compiled from: PG */
public final class CrossProfileAlwaysOnAdapterController_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C101739g();

    public CrossProfileAlwaysOnAdapterController_Bundler() {
    }

    public CrossProfileAlwaysOnAdapterController_Bundler(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object mo86969a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("boolean".equals(bundlerType.f386875a)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if ("com.google.android.apps.gsa.shared.speech.dumper.EventForDump".equals(bundlerType.f386875a)) {
            return (EventForDump) bundle.getParcelable(str);
        }
        String str2 = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str2 + " cannot be read from Bundle");
    }

    /* renamed from: b */
    public final Object mo86970b(Parcel parcel, BundlerType bundlerType) {
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("boolean".equals(bundlerType.f386875a)) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if ("com.google.android.apps.gsa.shared.speech.dumper.EventForDump".equals(bundlerType.f386875a)) {
            return (EventForDump) parcel.readParcelable(Bundler.class.getClassLoader());
        } else {
            String str = bundlerType.f386875a;
            throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
        }
    }

    /* renamed from: c */
    public final void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.android.apps.gsa.shared.speech.dumper.EventForDump".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, (EventForDump) obj);
                return;
            }
            String str2 = bundlerType.f386875a;
            throw new IllegalArgumentException("Type " + str2 + " cannot be written to Bundle");
        }
    }

    /* renamed from: d */
    public final void mo86972d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.android.apps.gsa.shared.speech.dumper.EventForDump".equals(bundlerType.f386875a)) {
                parcel.writeParcelable((EventForDump) obj, i);
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
