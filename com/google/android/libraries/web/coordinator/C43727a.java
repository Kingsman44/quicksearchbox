package com.google.android.libraries.web.coordinator;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.coordinator.internal.fragment.C43749h;
import com.google.android.libraries.web.coordinator.internal.fragment.C43757p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.coordinator.a */
/* compiled from: PG */
public final class C43727a {
    /* renamed from: a */
    public static final void m77221a(Fragment fragment, WebConfig webConfig) {
        C69664n.m101061g(webConfig, "config");
        C43757p.m77269d(fragment);
        C43749h.m77262c(fragment, webConfig);
    }

    /* renamed from: b */
    public static final void m77222b(Fragment fragment, Class cls) {
        C69664n.m101061g(cls, "configFactory");
        C43757p.m77269d(fragment);
        C43749h.m77261b(fragment, cls);
    }
}
