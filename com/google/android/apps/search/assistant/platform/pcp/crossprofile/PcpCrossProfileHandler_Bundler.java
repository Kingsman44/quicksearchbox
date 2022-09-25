package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableOptional;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableSet;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.ClientStateWrapper;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.ProactiveDataListWrapper;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.SyncRequestContextWrapper;
import com.google.apps.tiktok.account.AccountId;
import java.util.List;
import java.util.Set;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class PcpCrossProfileHandler_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C123678n();

    public PcpCrossProfileHandler_Bundler() {
    }

    public PcpCrossProfileHandler_Bundler(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object mo86969a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("com.google.android.apps.search.assistant.platform.pcp.f.f".equals(bundlerType.f386875a)) {
            return ((ClientStateWrapper) bundle.getParcelable(str)).f386932a;
        }
        if ("com.google.apps.tiktok.account.AccountId".equals(bundlerType.f386875a)) {
            return (AccountId) bundle.getParcelable(str);
        }
        if ("java.util.Optional".equals(bundlerType.f386875a)) {
            return ((ParcelableOptional) bundle.getParcelable(str)).f386922a;
        }
        if ("com.google.android.apps.search.assistant.platform.pcp.proto.SyncRequestContext".equals(bundlerType.f386875a)) {
            return ((SyncRequestContextWrapper) bundle.getParcelable(str)).f386940a;
        }
        if ("java.util.Set".equals(bundlerType.f386875a)) {
            return ((ParcelableSet) bundle.getParcelable(str)).f386925a;
        }
        if ("com.google.android.apps.search.assistant.platform.pcp.proto.ProactiveDataList".equals(bundlerType.f386875a)) {
            return ((ProactiveDataListWrapper) bundle.getParcelable(str)).f386934a;
        }
        if ("java.lang.Integer".equals(bundlerType.f386875a)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        if ("int".equals(bundlerType.f386875a)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        if ("long".equals(bundlerType.f386875a)) {
            return Long.valueOf(bundle.getLong(str));
        }
        if ("boolean".equals(bundlerType.f386875a)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if ("java.lang.String".equals(bundlerType.f386875a)) {
            return bundle.getString(str);
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
        if ("com.google.android.apps.search.assistant.platform.pcp.f.f".equals(bundlerType.f386875a)) {
            return ((ClientStateWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386932a;
        }
        if ("com.google.apps.tiktok.account.AccountId".equals(bundlerType.f386875a)) {
            return (AccountId) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.util.Optional".equals(bundlerType.f386875a)) {
            return ((ParcelableOptional) parcel.readParcelable(Bundler.class.getClassLoader())).f386922a;
        }
        if ("com.google.android.apps.search.assistant.platform.pcp.proto.SyncRequestContext".equals(bundlerType.f386875a)) {
            return ((SyncRequestContextWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386940a;
        }
        if ("java.util.Set".equals(bundlerType.f386875a)) {
            return ((ParcelableSet) parcel.readParcelable(Bundler.class.getClassLoader())).f386925a;
        }
        if ("com.google.android.apps.search.assistant.platform.pcp.proto.ProactiveDataList".equals(bundlerType.f386875a)) {
            return ((ProactiveDataListWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386934a;
        }
        if ("java.lang.Integer".equals(bundlerType.f386875a)) {
            return Integer.valueOf(parcel.readInt());
        }
        if ("int".equals(bundlerType.f386875a)) {
            return Integer.valueOf(parcel.readInt());
        }
        if ("long".equals(bundlerType.f386875a)) {
            return Long.valueOf(parcel.readLong());
        }
        if ("boolean".equals(bundlerType.f386875a)) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if ("java.lang.String".equals(bundlerType.f386875a)) {
            return parcel.readString();
        } else {
            if ("java.util.List".equals(bundlerType.f386875a)) {
                return ((ParcelableList) parcel.readParcelable(Bundler.class.getClassLoader())).f386916a;
            }
            String str = bundlerType.f386875a;
            throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
        }
    }

    /* renamed from: c */
    public final void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.android.apps.search.assistant.platform.pcp.f.f".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new ClientStateWrapper((C123777f) obj));
            } else if ("com.google.apps.tiktok.account.AccountId".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, (AccountId) obj);
            } else if ("java.util.Optional".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new ParcelableOptional(this, bundlerType, (Optional) obj));
            } else if ("com.google.android.apps.search.assistant.platform.pcp.proto.SyncRequestContext".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new SyncRequestContextWrapper((C123755bv) obj));
            } else if ("java.util.Set".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new ParcelableSet(this, bundlerType, (Set) obj));
            } else if ("com.google.android.apps.search.assistant.platform.pcp.proto.ProactiveDataList".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new ProactiveDataListWrapper((C123746bm) obj));
            } else if ("java.lang.Integer".equals(bundlerType.f386875a)) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if ("java.lang.String".equals(bundlerType.f386875a)) {
                bundle.putString(str, (String) obj);
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
            if ("com.google.android.apps.search.assistant.platform.pcp.f.f".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new ClientStateWrapper((C123777f) obj), i);
            } else if ("com.google.apps.tiktok.account.AccountId".equals(bundlerType.f386875a)) {
                parcel.writeParcelable((AccountId) obj, i);
            } else if ("java.util.Optional".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new ParcelableOptional(this, bundlerType, (Optional) obj), i);
            } else if ("com.google.android.apps.search.assistant.platform.pcp.proto.SyncRequestContext".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new SyncRequestContextWrapper((C123755bv) obj), i);
            } else if ("java.util.Set".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new ParcelableSet(this, bundlerType, (Set) obj), i);
            } else if ("com.google.android.apps.search.assistant.platform.pcp.proto.ProactiveDataList".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new ProactiveDataListWrapper((C123746bm) obj), i);
            } else if ("java.lang.Integer".equals(bundlerType.f386875a)) {
                parcel.writeInt(((Integer) obj).intValue());
            } else if ("java.lang.String".equals(bundlerType.f386875a)) {
                parcel.writeString((String) obj);
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
