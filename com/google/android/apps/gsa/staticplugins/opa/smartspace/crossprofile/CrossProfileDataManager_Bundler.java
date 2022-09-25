package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83809y;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7041h.C89770b;
import com.google.android.enterprise.connectedapps.google.parcelablewrappers.ParcelableDone;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableGuavaOptional;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableMap;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableSet;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.CalendarInfoWrapper;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.DismissalMetadataWrapper;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.SmartspaceUpdateInfoWrapper;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58714pg;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public final class CrossProfileDataManager_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C110659x();

    public CrossProfileDataManager_Bundler() {
    }

    public CrossProfileDataManager_Bundler(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object mo86969a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.DismissalMetadata".equals(bundlerType.f386875a)) {
            return ((DismissalMetadataWrapper) bundle.getParcelable(str)).f386933a;
        }
        if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo".equals(bundlerType.f386875a)) {
            return ((SmartspaceUpdateInfoWrapper) bundle.getParcelable(str)).f386935a;
        }
        if ("java.util.Set".equals(bundlerType.f386875a)) {
            return ((ParcelableSet) bundle.getParcelable(str)).f386925a;
        }
        if ("com.google.common.collect.ImmutableSet".equals(bundlerType.f386875a)) {
            return (C58528ij) bundle.getSerializable(str);
        }
        if ("long".equals(bundlerType.f386875a)) {
            return Long.valueOf(bundle.getLong(str));
        }
        if ("java.util.Map".equals(bundlerType.f386875a)) {
            return ((ParcelableMap) bundle.getParcelable(str)).f386919a;
        }
        if ("java.lang.Long".equals(bundlerType.f386875a)) {
            return Long.valueOf(bundle.getLong(str));
        }
        if ("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType".equals(bundlerType.f386875a)) {
            return (C50794cr) bundle.getSerializable(str);
        }
        if ("java.lang.String".equals(bundlerType.f386875a)) {
            return bundle.getString(str);
        }
        if ("com.google.android.apps.gsa.taskgraph.Done".equals(bundlerType.f386875a)) {
            ParcelableDone parcelableDone = (ParcelableDone) bundle.getParcelable(str);
            return C118826c.f331422a;
        } else if ("java.util.List".equals(bundlerType.f386875a)) {
            return ((ParcelableList) bundle.getParcelable(str)).f386916a;
        } else {
            if ("com.google.common.base.Optional".equals(bundlerType.f386875a)) {
                return ((ParcelableGuavaOptional) bundle.getParcelable(str)).f386913a;
            }
            if ("com.google.common.collect.Range".equals(bundlerType.f386875a)) {
                return (C58714pg) bundle.getSerializable(str);
            }
            if ("com.google.android.apps.gsa.shared.calendar.Calendar.CalendarInfo".equals(bundlerType.f386875a)) {
                return ((CalendarInfoWrapper) bundle.getParcelable(str)).f386929a;
            }
            String str2 = bundlerType.f386875a;
            throw new IllegalArgumentException("Type " + str2 + " cannot be read from Bundle");
        }
    }

    /* renamed from: b */
    public final Object mo86970b(Parcel parcel, BundlerType bundlerType) {
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.DismissalMetadata".equals(bundlerType.f386875a)) {
            return ((DismissalMetadataWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386933a;
        }
        if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo".equals(bundlerType.f386875a)) {
            return ((SmartspaceUpdateInfoWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386935a;
        }
        if ("java.util.Set".equals(bundlerType.f386875a)) {
            return ((ParcelableSet) parcel.readParcelable(Bundler.class.getClassLoader())).f386925a;
        }
        if ("com.google.common.collect.ImmutableSet".equals(bundlerType.f386875a)) {
            return (C58528ij) parcel.readSerializable();
        }
        if ("long".equals(bundlerType.f386875a)) {
            return Long.valueOf(parcel.readLong());
        }
        if ("java.util.Map".equals(bundlerType.f386875a)) {
            return ((ParcelableMap) parcel.readParcelable(Bundler.class.getClassLoader())).f386919a;
        }
        if ("java.lang.Long".equals(bundlerType.f386875a)) {
            return Long.valueOf(parcel.readLong());
        }
        if ("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType".equals(bundlerType.f386875a)) {
            return (C50794cr) parcel.readSerializable();
        }
        if ("java.lang.String".equals(bundlerType.f386875a)) {
            return parcel.readString();
        }
        if ("com.google.android.apps.gsa.taskgraph.Done".equals(bundlerType.f386875a)) {
            ParcelableDone parcelableDone = (ParcelableDone) parcel.readParcelable(Bundler.class.getClassLoader());
            return C118826c.f331422a;
        } else if ("java.util.List".equals(bundlerType.f386875a)) {
            return ((ParcelableList) parcel.readParcelable(Bundler.class.getClassLoader())).f386916a;
        } else {
            if ("com.google.common.base.Optional".equals(bundlerType.f386875a)) {
                return ((ParcelableGuavaOptional) parcel.readParcelable(Bundler.class.getClassLoader())).f386913a;
            }
            if ("com.google.common.collect.Range".equals(bundlerType.f386875a)) {
                return (C58714pg) parcel.readSerializable();
            }
            if ("com.google.android.apps.gsa.shared.calendar.Calendar.CalendarInfo".equals(bundlerType.f386875a)) {
                return ((CalendarInfoWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386929a;
            }
            String str = bundlerType.f386875a;
            throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
        }
    }

    /* renamed from: c */
    public final void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.DismissalMetadata".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new DismissalMetadataWrapper((C83809y) obj));
            } else if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new SmartspaceUpdateInfoWrapper((C83741am) obj));
            } else if ("java.util.Set".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new ParcelableSet(this, bundlerType, (Set) obj));
            } else if ("com.google.common.collect.ImmutableSet".equals(bundlerType.f386875a)) {
                bundle.putSerializable(str, (C58528ij) obj);
            } else if ("java.util.Map".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new ParcelableMap(this, bundlerType, (Map) obj));
            } else if ("java.lang.Long".equals(bundlerType.f386875a)) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if ("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType".equals(bundlerType.f386875a)) {
                bundle.putSerializable(str, (C50794cr) obj);
            } else if ("java.lang.String".equals(bundlerType.f386875a)) {
                bundle.putString(str, (String) obj);
            } else if ("com.google.android.apps.gsa.taskgraph.Done".equals(bundlerType.f386875a)) {
                C118826c cVar = (C118826c) obj;
                bundle.putParcelable(str, ParcelableDone.f386864a);
            } else if ("java.util.List".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new ParcelableList(this, bundlerType, (List) obj));
            } else if ("com.google.common.base.Optional".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new ParcelableGuavaOptional(this, bundlerType, (C58833ax) obj));
            } else if ("com.google.common.collect.Range".equals(bundlerType.f386875a)) {
                bundle.putSerializable(str, (C58714pg) obj);
            } else if ("com.google.android.apps.gsa.shared.calendar.Calendar.CalendarInfo".equals(bundlerType.f386875a)) {
                bundle.putParcelable(str, new CalendarInfoWrapper((C89770b) obj));
            } else {
                String str2 = bundlerType.f386875a;
                throw new IllegalArgumentException("Type " + str2 + " cannot be written to Bundle");
            }
        }
    }

    /* renamed from: d */
    public final void mo86972d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.DismissalMetadata".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new DismissalMetadataWrapper((C83809y) obj), i);
            } else if ("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new SmartspaceUpdateInfoWrapper((C83741am) obj), i);
            } else if ("java.util.Set".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new ParcelableSet(this, bundlerType, (Set) obj), i);
            } else if ("com.google.common.collect.ImmutableSet".equals(bundlerType.f386875a)) {
                parcel.writeSerializable((C58528ij) obj);
            } else if ("java.util.Map".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new ParcelableMap(this, bundlerType, (Map) obj), i);
            } else if ("java.lang.Long".equals(bundlerType.f386875a)) {
                parcel.writeLong(((Long) obj).longValue());
            } else if ("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType".equals(bundlerType.f386875a)) {
                parcel.writeSerializable((C50794cr) obj);
            } else if ("java.lang.String".equals(bundlerType.f386875a)) {
                parcel.writeString((String) obj);
            } else if ("com.google.android.apps.gsa.taskgraph.Done".equals(bundlerType.f386875a)) {
                C118826c cVar = (C118826c) obj;
                parcel.writeParcelable(ParcelableDone.f386864a, i);
            } else if ("java.util.List".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new ParcelableList(this, bundlerType, (List) obj), i);
            } else if ("com.google.common.base.Optional".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new ParcelableGuavaOptional(this, bundlerType, (C58833ax) obj), i);
            } else if ("com.google.common.collect.Range".equals(bundlerType.f386875a)) {
                parcel.writeSerializable((C58714pg) obj);
            } else if ("com.google.android.apps.gsa.shared.calendar.Calendar.CalendarInfo".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new CalendarInfoWrapper((C89770b) obj), i);
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
