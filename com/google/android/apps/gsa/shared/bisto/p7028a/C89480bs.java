package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.p10712d.C142324bc;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bs */
/* compiled from: PG */
abstract class C89480bs implements C89482bu {
    /* renamed from: a */
    public abstract long mo83345a();

    /* renamed from: b */
    public abstract C142324bc mo83346b();

    /* renamed from: c */
    public abstract String mo83347c();

    /* renamed from: d */
    public abstract String mo83348d();

    /* renamed from: e */
    public final String mo83424e() {
        return String.format(Locale.US, "DCI: modelId=%s, locale=%s, timestamp=%d, sizeof(info)=%d", new Object[]{mo83348d(), mo83347c(), Long.valueOf(mo83345a()), Integer.valueOf(mo83346b().getSerializedSize())});
    }

    public final String toString() {
        return mo83424e();
    }
}
