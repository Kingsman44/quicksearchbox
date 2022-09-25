package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;

/* compiled from: PG */
public final class CrossProfileIntentBroadcaster_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C101750q();

    public CrossProfileIntentBroadcaster_Bundler() {
    }

    public CrossProfileIntentBroadcaster_Bundler(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object mo86969a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("android.content.Intent".equals(bundlerType.f386875a)) {
            return (Intent) bundle.getParcelable(str);
        }
        if ("java.lang.String".equals(bundlerType.f386875a)) {
            return bundle.getString(str);
        }
        String str2 = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str2 + " cannot be read from Bundle");
    }

    /* renamed from: b */
    public final Object mo86970b(Parcel parcel, BundlerType bundlerType) {
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("android.content.Intent".equals(bundlerType.f386875a)) {
            return (Intent) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.lang.String".equals(bundlerType.f386875a)) {
            return parcel.readString();
        }
        String str = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
    }

    /* renamed from: c */
    public final void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("android.content.Intent".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, (Intent) obj);
            } else if ("java.lang.String".equals(bundlerType.f386875a)) {
                bundle.putString(str, (String) obj);
            } else {
                String str2 = bundlerType.f386875a;
                throw new IllegalArgumentException("Type " + str2 + " cannot be written to Bundle");
            }
        }
    }

    /* renamed from: d */
    public final void mo86972d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("android.content.Intent".equals(bundlerType.f386875a)) {
                parcel.writeParcelable((Intent) obj, i);
            } else if ("java.lang.String".equals(bundlerType.f386875a)) {
                parcel.writeString((String) obj);
            } else {
                String str = bundlerType.f386875a;
                throw new IllegalArgumentException("Type " + str + " cannot be written to Parcel");
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
