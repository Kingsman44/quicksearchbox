package com.google.android.setupcompat.logging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.google.android.setupcompat.internal.C45258f;
import com.google.android.setupcompat.internal.C45259g;
import com.google.android.setupcompat.internal.C45269q;
import com.google.android.setupcompat.p3550b.C45246c;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class CustomEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C45270a();

    /* renamed from: a */
    public final long f118248a;

    /* renamed from: b */
    public final MetricKey f118249b;

    /* renamed from: c */
    public final PersistableBundle f118250c;

    /* renamed from: d */
    public final PersistableBundle f118251d;

    public CustomEvent(long j, MetricKey metricKey, PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        C45259g.m80632a(j >= 0, "Timestamp cannot be negative.");
        C45259g.m80634c(metricKey, "MetricKey cannot be null.");
        C45259g.m80634c(persistableBundle, "Bundle cannot be null.");
        C45259g.m80632a(!persistableBundle.isEmpty(), "Bundle cannot be empty.");
        C45259g.m80634c(persistableBundle2, "piiValues cannot be null.");
        for (String str : persistableBundle.keySet()) {
            C45269q.m80649a(str, "bundle key", 3, 50);
            Object obj = persistableBundle.get(str);
            if (obj instanceof String) {
                C45259g.m80632a(((String) obj).length() <= 50, String.format("Maximum length of string value for key='%s' cannot exceed %s.", new Object[]{str, 50}));
            }
        }
        this.f118248a = j;
        this.f118249b = metricKey;
        this.f118250c = new PersistableBundle(persistableBundle);
        this.f118251d = new PersistableBundle(persistableBundle2);
    }

    /* renamed from: a */
    public static CustomEvent m80650a(MetricKey metricKey, PersistableBundle persistableBundle) {
        PersistableBundle persistableBundle2 = PersistableBundle.EMPTY;
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        C45258f.m80629d(persistableBundle);
        C45258f.m80629d(persistableBundle2);
        return new CustomEvent(millis, metricKey, persistableBundle, persistableBundle2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomEvent)) {
            return false;
        }
        CustomEvent customEvent = (CustomEvent) obj;
        return this.f118248a == customEvent.f118248a && C45246c.m80602a(this.f118249b, customEvent.f118249b) && C45258f.m80628c(this.f118250c, customEvent.f118250c) && C45258f.m80628c(this.f118251d, customEvent.f118251d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f118248a), this.f118249b, this.f118250c, this.f118251d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f118248a);
        parcel.writeParcelable(this.f118249b, i);
        parcel.writePersistableBundle(this.f118250c);
        parcel.writePersistableBundle(this.f118251d);
    }
}
