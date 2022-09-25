package com.google.android.setupcompat.logging;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.setupcompat.internal.C45259g;
import com.google.android.setupcompat.internal.C45269q;
import com.google.android.setupcompat.p3550b.C45246c;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: PG */
public final class MetricKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C45272b();

    /* renamed from: a */
    private static final Pattern f118252a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");

    /* renamed from: b */
    private final String f118253b;

    /* renamed from: c */
    private final String f118254c;

    static {
        Pattern.compile("^([a-z]+[.])+[A-Z][a-zA-Z0-9]+");
        Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
    }

    public MetricKey(String str, String str2) {
        this.f118253b = str;
        this.f118254c = str2;
    }

    /* renamed from: a */
    public static Bundle m80651a(MetricKey metricKey) {
        C45259g.m80634c(metricKey, "MetricKey cannot be null.");
        Bundle bundle = new Bundle();
        bundle.putInt("MetricKey_version", 1);
        bundle.putString("MetricKey_name", metricKey.f118253b);
        bundle.putString("MetricKey_screenName", metricKey.f118254c);
        return bundle;
    }

    /* renamed from: b */
    public static MetricKey m80652b(String str, Activity activity) {
        String className = activity.getComponentName().getClassName();
        C45269q.m80649a(str, "MetricKey.name", 5, 30);
        C45259g.m80632a(f118252a.matcher(str).matches(), "Invalid MetricKey, only alpha numeric characters are allowed.");
        return new MetricKey(str, className);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricKey)) {
            return false;
        }
        MetricKey metricKey = (MetricKey) obj;
        return C45246c.m80602a(this.f118253b, metricKey.f118253b) && C45246c.m80602a(this.f118254c, metricKey.f118254c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f118253b, this.f118254c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f118253b);
        parcel.writeString(this.f118254c);
    }
}
