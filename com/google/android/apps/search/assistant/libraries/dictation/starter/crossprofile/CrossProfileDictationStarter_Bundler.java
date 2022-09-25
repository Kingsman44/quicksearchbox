package com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.CanStartDictationResponseWrapper;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.StartDictationArgsWrapper;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;

/* compiled from: PG */
public final class CrossProfileDictationStarter_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C119326e();

    public CrossProfileDictationStarter_Bundler() {
    }

    public CrossProfileDictationStarter_Bundler(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object mo86969a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("com.google.protos.assistant.api.client_op.text.StartDictationArgs".equals(bundlerType.f386875a)) {
            return ((StartDictationArgsWrapper) bundle.getParcelable(str)).f386937a;
        }
        if ("java.lang.Boolean".equals(bundlerType.f386875a)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if ("com.google.android.apps.search.assistant.libraries.dictation.proto.CanStartDictationResponse".equals(bundlerType.f386875a)) {
            return ((CanStartDictationResponseWrapper) bundle.getParcelable(str)).f386931a;
        }
        String str2 = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str2 + " cannot be read from Bundle");
    }

    /* renamed from: b */
    public final Object mo86970b(Parcel parcel, BundlerType bundlerType) {
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("com.google.protos.assistant.api.client_op.text.StartDictationArgs".equals(bundlerType.f386875a)) {
            return ((StartDictationArgsWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386937a;
        }
        if ("java.lang.Boolean".equals(bundlerType.f386875a)) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if ("com.google.android.apps.search.assistant.libraries.dictation.proto.CanStartDictationResponse".equals(bundlerType.f386875a)) {
            return ((CanStartDictationResponseWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386931a;
        } else {
            String str = bundlerType.f386875a;
            throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
        }
    }

    /* renamed from: c */
    public final void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.protos.assistant.api.client_op.text.StartDictationArgs".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new StartDictationArgsWrapper((C64735n) obj));
            } else if ("java.lang.Boolean".equals(bundlerType.f386875a)) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if ("com.google.android.apps.search.assistant.libraries.dictation.proto.CanStartDictationResponse".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new CanStartDictationResponseWrapper((C119282d) obj));
            } else {
                String str2 = bundlerType.f386875a;
                throw new IllegalArgumentException("Type " + str2 + " cannot be written to Bundle");
            }
        }
    }

    /* renamed from: d */
    public final void mo86972d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.protos.assistant.api.client_op.text.StartDictationArgs".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new StartDictationArgsWrapper((C64735n) obj), i);
            } else if ("java.lang.Boolean".equals(bundlerType.f386875a)) {
                parcel.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
            } else if ("com.google.android.apps.search.assistant.libraries.dictation.proto.CanStartDictationResponse".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new CanStartDictationResponseWrapper((C119282d) obj), i);
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
