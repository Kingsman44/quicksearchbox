package com.google.android.apps.gsa.nga.engine.p6029g;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.g.e */
/* compiled from: PG */
public abstract class C76089e {
    /* renamed from: a */
    public abstract C76090f mo72008a();

    /* renamed from: b */
    public abstract void mo72009b(C58485gu guVar);

    /* renamed from: c */
    public abstract void mo72010c(C120124o oVar);

    /* renamed from: d */
    public abstract void mo72011d(boolean z);

    /* renamed from: e */
    public abstract void mo72012e(boolean z);

    /* renamed from: f */
    public abstract void mo72013f(Optional optional);

    /* renamed from: g */
    public abstract void mo72014g(Locale locale);

    /* renamed from: h */
    public final C76090f mo72045h() {
        C76090f a = mo72008a();
        if (a.mo72042g()) {
            C58838bb.m90884s(a.mo72041f(), "Nga on device can be enabled only if Nga is enabled.");
        }
        return a;
    }
}
