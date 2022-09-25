package com.google.android.libraries.web.contrib.logging;

import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.common.p4522b.C58528ij;

/* compiled from: PG */
public abstract class LoggingFeature implements LoggingFeatureContract {
    /* renamed from: d */
    public static LoggingFeature m77099d(Class cls) {
        C44085c cVar = new C44085c();
        cVar.mo47057b(C43712o.class, cls);
        return new AutoValue_LoggingFeature(cVar.mo47056a());
    }

    /* renamed from: a */
    public abstract WebFeatureConfig mo41576a();

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return LoggingFeatureContract.class;
    }
}
