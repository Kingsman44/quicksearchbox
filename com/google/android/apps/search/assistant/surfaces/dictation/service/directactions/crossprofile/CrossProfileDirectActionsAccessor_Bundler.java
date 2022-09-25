package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile;

import android.app.DirectAction;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import java.util.List;

/* compiled from: PG */
public final class CrossProfileDirectActionsAccessor_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C125336n();

    public CrossProfileDirectActionsAccessor_Bundler() {
    }

    public CrossProfileDirectActionsAccessor_Bundler(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object mo86969a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("android.os.Bundle".equals(bundlerType.f386875a)) {
            return (Bundle) bundle.getParcelable(str);
        }
        if ("java.lang.String".equals(bundlerType.f386875a)) {
            return bundle.getString(str);
        }
        if ("android.app.DirectAction".equals(bundlerType.f386875a)) {
            return (DirectAction) bundle.getParcelable(str);
        }
        if ("java.util.List".equals(bundlerType.f386875a)) {
            return ((ParcelableList) bundle.getParcelable(str)).f386916a;
        }
        String str2 = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str2 + " cannot be read from Bundle");
    }

    /* renamed from: b */
    public final Object mo86970b(Parcel parcel, BundlerType bundlerType) {
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("android.os.Bundle".equals(bundlerType.f386875a)) {
            return (Bundle) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.lang.String".equals(bundlerType.f386875a)) {
            return parcel.readString();
        }
        if ("android.app.DirectAction".equals(bundlerType.f386875a)) {
            return (DirectAction) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.util.List".equals(bundlerType.f386875a)) {
            return ((ParcelableList) parcel.readParcelable(Bundler.class.getClassLoader())).f386916a;
        }
        String str = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
    }

    /* renamed from: c */
    public final void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("android.os.Bundle".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, (Bundle) obj);
            } else if ("java.lang.String".equals(bundlerType.f386875a)) {
                bundle.putString(str, (String) obj);
            } else if ("android.app.DirectAction".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, (DirectAction) obj);
            } else if ("java.util.List".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new ParcelableList(this, bundlerType, (List) obj));
            } else {
                String str2 = bundlerType.f386875a;
                throw new IllegalArgumentException("Type " + str2 + " cannot be written to Bundle");
            }
        }
    }

    /* renamed from: d */
    public final void mo86972d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("android.os.Bundle".equals(bundlerType.f386875a)) {
                parcel.writeParcelable((Bundle) obj, i);
            } else if ("java.lang.String".equals(bundlerType.f386875a)) {
                parcel.writeString((String) obj);
            } else if ("android.app.DirectAction".equals(bundlerType.f386875a)) {
                parcel.writeParcelable((DirectAction) obj, i);
            } else if ("java.util.List".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new ParcelableList(this, bundlerType, (List) obj), i);
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
