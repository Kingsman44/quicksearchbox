package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.enterprise.connectedapps.google.parcelablewrappers.ParcelableDone;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableBitmap;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.SmartspaceUpdateInfoWrapper;

/* compiled from: PG */
public final class CrossProfileServiceManager_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C110605bi();

    public CrossProfileServiceManager_Bundler() {
    }

    public CrossProfileServiceManager_Bundler(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object mo86969a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("android.graphics.Bitmap".equals(bundlerType.f386875a)) {
            return ((ParcelableBitmap) bundle.getParcelable(str)).f386912a;
        }
        if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo".equals(bundlerType.f386875a)) {
            return ((SmartspaceUpdateInfoWrapper) bundle.getParcelable(str)).f386935a;
        }
        if ("android.content.Intent".equals(bundlerType.f386875a)) {
            return (Intent) bundle.getParcelable(str);
        }
        if ("com.google.android.apps.gsa.taskgraph.Done".equals(bundlerType.f386875a)) {
            ParcelableDone parcelableDone = (ParcelableDone) bundle.getParcelable(str);
            return C118826c.f331422a;
        }
        String str2 = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str2 + " cannot be read from Bundle");
    }

    /* renamed from: b */
    public final Object mo86970b(Parcel parcel, BundlerType bundlerType) {
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("android.graphics.Bitmap".equals(bundlerType.f386875a)) {
            return ((ParcelableBitmap) parcel.readParcelable(Bundler.class.getClassLoader())).f386912a;
        }
        if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo".equals(bundlerType.f386875a)) {
            return ((SmartspaceUpdateInfoWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386935a;
        }
        if ("android.content.Intent".equals(bundlerType.f386875a)) {
            return (Intent) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("com.google.android.apps.gsa.taskgraph.Done".equals(bundlerType.f386875a)) {
            ParcelableDone parcelableDone = (ParcelableDone) parcel.readParcelable(Bundler.class.getClassLoader());
            return C118826c.f331422a;
        }
        String str = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
    }

    /* renamed from: c */
    public final void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("android.graphics.Bitmap".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new ParcelableBitmap((Bitmap) obj));
            } else if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new SmartspaceUpdateInfoWrapper((C83741am) obj));
            } else if ("android.content.Intent".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, (Intent) obj);
            } else if ("com.google.android.apps.gsa.taskgraph.Done".equals(bundlerType.f386875a)) {
                C118826c cVar = (C118826c) obj;
                bundle.putParcelable(str, ParcelableDone.f386864a);
            } else {
                String str2 = bundlerType.f386875a;
                throw new IllegalArgumentException("Type " + str2 + " cannot be written to Bundle");
            }
        }
    }

    /* renamed from: d */
    public final void mo86972d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("android.graphics.Bitmap".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new ParcelableBitmap((Bitmap) obj), i);
            } else if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new SmartspaceUpdateInfoWrapper((C83741am) obj), i);
            } else if ("android.content.Intent".equals(bundlerType.f386875a)) {
                parcel.writeParcelable((Intent) obj, i);
            } else if ("com.google.android.apps.gsa.taskgraph.Done".equals(bundlerType.f386875a)) {
                C118826c cVar = (C118826c) obj;
                parcel.writeParcelable(ParcelableDone.f386864a, i);
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
