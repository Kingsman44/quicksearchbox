package com.google.android.libraries.web.weblayer.contrib.crashreport;

import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.C44086d;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.android.libraries.web.weblayer.contrib.crashreport.internal.CrashReportWebFragmentObserver;
import com.google.common.p4522b.C58528ij;

/* compiled from: PG */
public abstract class CrashReportFeature implements WebFeature {
    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        C44085c a = C44086d.m77839a();
        a.f114767d.add(CrashReportWebFragmentObserver.class);
        return a.mo47056a();
    }

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return CrashReportFeature.class;
    }
}
