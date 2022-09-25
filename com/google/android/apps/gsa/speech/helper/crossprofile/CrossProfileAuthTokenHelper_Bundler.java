package com.google.android.apps.gsa.speech.helper.crossprofile;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.speech.helper.p7281b.C92308d;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableSet;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.AuthTokenWrapper;
import java.util.Set;

/* compiled from: PG */
public final class CrossProfileAuthTokenHelper_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C92317b();

    public CrossProfileAuthTokenHelper_Bundler() {
    }

    public CrossProfileAuthTokenHelper_Bundler(byte[] bArr) {
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
        if ("android.accounts.Account".equals(bundlerType.f386875a)) {
            return (Account) bundle.getParcelable(str);
        }
        if ("com.google.android.apps.gsa.speech.helper.proto.AuthToken".equals(bundlerType.f386875a)) {
            return ((AuthTokenWrapper) bundle.getParcelable(str)).f386928a;
        }
        if ("java.util.Set".equals(bundlerType.f386875a)) {
            return ((ParcelableSet) bundle.getParcelable(str)).f386925a;
        }
        if ("java.lang.String".equals(bundlerType.f386875a)) {
            return bundle.getString(str);
        }
        if ("long".equals(bundlerType.f386875a)) {
            return Long.valueOf(bundle.getLong(str));
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
        } else if ("android.accounts.Account".equals(bundlerType.f386875a)) {
            return (Account) parcel.readParcelable(Bundler.class.getClassLoader());
        } else {
            if ("com.google.android.apps.gsa.speech.helper.proto.AuthToken".equals(bundlerType.f386875a)) {
                return ((AuthTokenWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386928a;
            }
            if ("java.util.Set".equals(bundlerType.f386875a)) {
                return ((ParcelableSet) parcel.readParcelable(Bundler.class.getClassLoader())).f386925a;
            }
            if ("java.lang.String".equals(bundlerType.f386875a)) {
                return parcel.readString();
            }
            if ("long".equals(bundlerType.f386875a)) {
                return Long.valueOf(parcel.readLong());
            }
            String str = bundlerType.f386875a;
            throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
        }
    }

    /* renamed from: c */
    public final void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("android.accounts.Account".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, (Account) obj);
            } else if ("com.google.android.apps.gsa.speech.helper.proto.AuthToken".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new AuthTokenWrapper((C92308d) obj));
            } else if ("java.util.Set".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new ParcelableSet(this, bundlerType, (Set) obj));
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
            if ("android.accounts.Account".equals(bundlerType.f386875a)) {
                parcel.writeParcelable((Account) obj, i);
            } else if ("com.google.android.apps.gsa.speech.helper.proto.AuthToken".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new AuthTokenWrapper((C92308d) obj), i);
            } else if ("java.util.Set".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new ParcelableSet(this, bundlerType, (Set) obj), i);
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
