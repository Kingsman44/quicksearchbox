package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.SmartspaceUpdateSourceWrapper;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4552o.aky;

/* compiled from: PG */
public final class CrossProfileLoggingManager_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C110585aq();

    public CrossProfileLoggingManager_Bundler() {
    }

    public CrossProfileLoggingManager_Bundler(byte[] bArr) {
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
        if ("com.google.common.logging.OpaSmartspaceProto.SmartspaceEvent.SmartspaceUpdateSource".equals(bundlerType.f386875a)) {
            return ((SmartspaceUpdateSourceWrapper) bundle.getParcelable(str)).f386936a;
        }
        if ("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType".equals(bundlerType.f386875a)) {
            return (C50794cr) bundle.getSerializable(str);
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
        } else if ("com.google.common.logging.OpaSmartspaceProto.SmartspaceEvent.SmartspaceUpdateSource".equals(bundlerType.f386875a)) {
            return ((SmartspaceUpdateSourceWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386936a;
        } else {
            if ("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType".equals(bundlerType.f386875a)) {
                return (C50794cr) parcel.readSerializable();
            }
            String str = bundlerType.f386875a;
            throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
        }
    }

    /* renamed from: c */
    public final void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.common.logging.OpaSmartspaceProto.SmartspaceEvent.SmartspaceUpdateSource".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new SmartspaceUpdateSourceWrapper((aky) obj));
            } else if ("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType".equals(bundlerType.f386875a)) {
                bundle.putSerializable(str, (C50794cr) obj);
            } else {
                String str2 = bundlerType.f386875a;
                throw new IllegalArgumentException("Type " + str2 + " cannot be written to Bundle");
            }
        }
    }

    /* renamed from: d */
    public final void mo86972d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.common.logging.OpaSmartspaceProto.SmartspaceEvent.SmartspaceUpdateSource".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new SmartspaceUpdateSourceWrapper((aky) obj), i);
            } else if ("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType".equals(bundlerType.f386875a)) {
                parcel.writeSerializable((C50794cr) obj);
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
