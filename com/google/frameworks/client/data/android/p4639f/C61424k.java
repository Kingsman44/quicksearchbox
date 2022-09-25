package com.google.frameworks.client.data.android.p4639f;

import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.RequestFinishedInfo;

/* renamed from: com.google.frameworks.client.data.android.f.k */
/* compiled from: PG */
public final class C61424k implements C68220f {
    /* renamed from: a */
    public static void m94052a(ExperimentalCronetEngine experimentalCronetEngine, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            experimentalCronetEngine.addRequestFinishedListener((RequestFinishedInfo.Listener) it.next());
        }
        C68225k.m98532d(experimentalCronetEngine);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
