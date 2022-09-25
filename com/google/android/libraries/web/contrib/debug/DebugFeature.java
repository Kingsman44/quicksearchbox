package com.google.android.libraries.web.contrib.debug;

import com.google.android.libraries.web.contrib.debug.internal.DebugFeatureContract;
import com.google.android.libraries.web.contrib.debug.internal.DebugWebFragmentObserver;
import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.common.p4522b.C58528ij;

/* compiled from: PG */
public abstract class DebugFeature implements DebugFeatureContract {
    /* renamed from: g */
    public static C43471c m76710g() {
        C43469a aVar = new C43469a();
        aVar.f113555a = true;
        aVar.f113556b = (byte) (1 | aVar.f113556b);
        aVar.mo46552c(10);
        return aVar;
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        C44085c cVar = new C44085c();
        cVar.f114767d.add(DebugWebFragmentObserver.class);
        return cVar.mo47056a();
    }

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return DebugFeatureContract.class;
    }
}
