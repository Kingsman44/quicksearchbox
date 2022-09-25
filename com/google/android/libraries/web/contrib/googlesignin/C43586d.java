package com.google.android.libraries.web.contrib.googlesignin;

import com.google.android.libraries.web.contrib.googlesignin.internal.GoogleSignInWebFragmentObserver;
import com.google.android.libraries.web.contrib.googlesignin.internal.weblayer.GoogleAccountWebFragmentObserver;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44042e;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.contrib.googlesignin.d */
/* compiled from: PG */
public abstract class C43586d {

    /* renamed from: b */
    public Class f113776b;

    /* renamed from: c */
    public Class f113777c;

    /* renamed from: a */
    public abstract GoogleSignInFeature mo46637a();

    /* renamed from: b */
    public abstract void mo46638b(WebFeatureConfig webFeatureConfig);

    /* renamed from: c */
    public final GoogleSignInFeature mo46642c() {
        C44085c cVar = new C44085c();
        cVar.f114767d.add(GoogleSignInWebFragmentObserver.class);
        Class cls = this.f113776b;
        if (cls != null) {
            cVar.mo47057b(C43585c.class, cls);
            cVar.f114767d.add(GoogleAccountWebFragmentObserver.class);
        }
        Class cls2 = this.f113777c;
        if (cls2 != null) {
            cVar.mo47057b(C44042e.class, cls2);
        }
        mo46638b(cVar.mo47056a());
        return mo46637a();
    }
}
