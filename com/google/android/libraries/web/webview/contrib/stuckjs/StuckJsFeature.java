package com.google.android.libraries.web.webview.contrib.stuckjs;

import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.C44086d;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.common.p4522b.C58528ij;

/* compiled from: PG */
public abstract class StuckJsFeature implements WebFeature {
    /* renamed from: e */
    public static WebFeature m78405e() {
        return new AutoValue_StuckJsFeature(20);
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        C44085c b = C44086d.m77840b();
        b.f114768e.add(C44393e.class);
        return b.mo47056a();
    }

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return StuckJsFeature.class;
    }

    /* renamed from: d */
    public abstract int mo47283d();
}
