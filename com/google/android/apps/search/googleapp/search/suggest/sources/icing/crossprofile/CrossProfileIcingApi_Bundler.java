package com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.SuggestRequestWrapper;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.SuggestResponseWrapper;

/* compiled from: PG */
public final class CrossProfileIcingApi_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C138514c();

    public CrossProfileIcingApi_Bundler() {
    }

    public CrossProfileIcingApi_Bundler(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object mo86969a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("com.google.android.apps.search.googleapp.search.suggest.SuggestResponseProto.SuggestResponse".equals(bundlerType.f386875a)) {
            return ((SuggestResponseWrapper) bundle.getParcelable(str)).f386939a;
        }
        if ("android.content.Intent".equals(bundlerType.f386875a)) {
            return (Intent) bundle.getParcelable(str);
        }
        if ("java.lang.String".equals(bundlerType.f386875a)) {
            return bundle.getString(str);
        }
        if ("com.google.android.apps.search.googleapp.search.suggest.SuggestRequestProto.SuggestRequest".equals(bundlerType.f386875a)) {
            return ((SuggestRequestWrapper) bundle.getParcelable(str)).f386938a;
        }
        String str2 = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str2 + " cannot be read from Bundle");
    }

    /* renamed from: b */
    public final Object mo86970b(Parcel parcel, BundlerType bundlerType) {
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("com.google.android.apps.search.googleapp.search.suggest.SuggestResponseProto.SuggestResponse".equals(bundlerType.f386875a)) {
            return ((SuggestResponseWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386939a;
        }
        if ("android.content.Intent".equals(bundlerType.f386875a)) {
            return (Intent) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.lang.String".equals(bundlerType.f386875a)) {
            return parcel.readString();
        }
        if ("com.google.android.apps.search.googleapp.search.suggest.SuggestRequestProto.SuggestRequest".equals(bundlerType.f386875a)) {
            return ((SuggestRequestWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386938a;
        }
        String str = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
    }

    /* renamed from: c */
    public final void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.android.apps.search.googleapp.search.suggest.SuggestResponseProto.SuggestResponse".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new SuggestResponseWrapper((C138678v) obj));
            } else if ("android.content.Intent".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, (Intent) obj);
            } else if ("java.lang.String".equals(bundlerType.f386875a)) {
                bundle.putString(str, (String) obj);
            } else if ("com.google.android.apps.search.googleapp.search.suggest.SuggestRequestProto.SuggestRequest".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new SuggestRequestWrapper((C138133o) obj));
            } else {
                String str2 = bundlerType.f386875a;
                throw new IllegalArgumentException("Type " + str2 + " cannot be written to Bundle");
            }
        }
    }

    /* renamed from: d */
    public final void mo86972d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.android.apps.search.googleapp.search.suggest.SuggestResponseProto.SuggestResponse".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new SuggestResponseWrapper((C138678v) obj), i);
            } else if ("android.content.Intent".equals(bundlerType.f386875a)) {
                parcel.writeParcelable((Intent) obj, i);
            } else if ("java.lang.String".equals(bundlerType.f386875a)) {
                parcel.writeString((String) obj);
            } else if ("com.google.android.apps.search.googleapp.search.suggest.SuggestRequestProto.SuggestRequest".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new SuggestRequestWrapper((C138133o) obj), i);
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
