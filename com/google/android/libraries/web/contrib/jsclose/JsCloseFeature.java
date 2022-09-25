package com.google.android.libraries.web.contrib.jsclose;

import com.google.android.libraries.web.contrib.jsclose.internal.JsCloseWebFragmentObserver;
import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.common.p4522b.C58528ij;

/* compiled from: PG */
public abstract class JsCloseFeature implements JsCloseFeatureContract {
    /* renamed from: d */
    public static WebFeature m77046d(Class cls) {
        C44085c cVar = new C44085c();
        cVar.mo47057b(C43671c.class, cls);
        cVar.f114767d.add(JsCloseWebFragmentObserver.class);
        return new AutoValue_JsCloseFeature(cVar.mo47056a());
    }

    /* renamed from: a */
    public abstract WebFeatureConfig mo41576a();

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return JsCloseFeatureContract.class;
    }
}
