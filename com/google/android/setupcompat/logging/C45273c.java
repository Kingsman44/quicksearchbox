package com.google.android.setupcompat.logging;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.setupcompat.internal.C45258f;
import com.google.android.setupcompat.internal.C45259g;
import com.google.android.setupcompat.internal.C45263k;

/* renamed from: com.google.android.setupcompat.logging.c */
/* compiled from: PG */
public final class C45273c {
    /* renamed from: a */
    public static void m80657a(Context context, CustomEvent customEvent) {
        C45259g.m80634c(context, "Context cannot be null.");
        C45263k a = C45263k.m80635a(context);
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("CustomEvent_version", 1);
        bundle2.putLong("CustomEvent_timestamp", customEvent.f118248a);
        bundle2.putBundle("CustomEvent_metricKey", MetricKey.m80651a(customEvent.f118249b));
        bundle2.putBundle("CustomEvent_bundleValues", C45258f.m80626a(new PersistableBundle(customEvent.f118250c)));
        bundle2.putBundle("CustomEvent_pii_bundleValues", C45258f.m80626a(customEvent.f118251d));
        bundle.putParcelable("CustomEvent_bundle", bundle2);
        a.mo49146f(1, bundle);
    }
}
