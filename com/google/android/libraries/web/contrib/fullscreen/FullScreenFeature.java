package com.google.android.libraries.web.contrib.fullscreen;

import com.google.android.libraries.web.contrib.fullscreen.internal.FullScreenWebFragmentObserver;
import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.common.p4522b.C58528ij;

/* compiled from: PG */
public abstract class FullScreenFeature implements WebFeature {

    /* renamed from: a */
    public static final WebFeature f113728a = new AutoValue_FullScreenFeature();

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        C44085c cVar = new C44085c();
        cVar.f114767d.add(FullScreenWebFragmentObserver.class);
        return cVar.mo47056a();
    }

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return FullScreenFeature.class;
    }
}
