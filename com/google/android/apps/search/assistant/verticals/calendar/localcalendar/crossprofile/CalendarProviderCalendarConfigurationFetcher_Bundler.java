package com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131947b;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import com.google.android.enterprise.connectedapps.parcelablewrappers.generated.CalendarWrapper;
import java.util.List;

/* compiled from: PG */
public final class CalendarProviderCalendarConfigurationFetcher_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR = new C131983b();

    public CalendarProviderCalendarConfigurationFetcher_Bundler() {
    }

    public CalendarProviderCalendarConfigurationFetcher_Bundler(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object mo86969a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("com.google.android.apps.search.assistant.verticals.calendar.localcalendar.proto.Calendar".equals(bundlerType.f386875a)) {
            return ((CalendarWrapper) bundle.getParcelable("result")).f386930a;
        }
        if ("java.util.List".equals(bundlerType.f386875a)) {
            return ((ParcelableList) bundle.getParcelable("result")).f386916a;
        }
        String str2 = bundlerType.f386875a;
        throw new IllegalArgumentException("Type " + str2 + " cannot be read from Bundle");
    }

    /* renamed from: b */
    public final Object mo86970b(Parcel parcel, BundlerType bundlerType) {
        if ("java.lang.Void".equals(bundlerType.f386875a)) {
            return null;
        }
        if ("com.google.android.apps.search.assistant.verticals.calendar.localcalendar.proto.Calendar".equals(bundlerType.f386875a)) {
            return ((CalendarWrapper) parcel.readParcelable(Bundler.class.getClassLoader())).f386930a;
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
            if ("com.google.android.apps.search.assistant.verticals.calendar.localcalendar.proto.Calendar".equals(bundlerType.f386875a)) {
                bundle.putParcelable("result", new CalendarWrapper((C131947b) obj));
            } else if ("java.util.List".equals(bundlerType.f386875a)) {
                bundle.putParcelable("result", new ParcelableList(this, bundlerType, (List) obj));
            } else {
                String str2 = bundlerType.f386875a;
                throw new IllegalArgumentException("Type " + str2 + " cannot be written to Bundle");
            }
        }
    }

    /* renamed from: d */
    public final void mo86972d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        if (!"java.lang.Void".equals(bundlerType.f386875a)) {
            if ("com.google.android.apps.search.assistant.verticals.calendar.localcalendar.proto.Calendar".equals(bundlerType.f386875a)) {
                parcel.writeParcelable(new CalendarWrapper((C131947b) obj), i);
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
