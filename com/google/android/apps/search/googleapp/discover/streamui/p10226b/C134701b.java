package com.google.android.apps.search.googleapp.discover.streamui.p10226b;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.b.b */
/* compiled from: PG */
public final class C134701b implements C68220f {
    /* renamed from: a */
    public static C134766q m218537a(Fragment fragment) {
        C69664n.m101061g(fragment, "fragment");
        try {
            C134766q qVar = (C134766q) new C134700a(fragment).mo5672a();
            C68225k.m98532d(qVar);
            return qVar;
        } catch (Exception e) {
            throw new IllegalStateException("Invalid use of TngDiscoverSurface binding. This binding should only be accessed for\ndependencies of DiscoverStreamFragmentPeer or a ViewModel created inside DSFP.\n\nHINT: if you are trying to test a dependency of DiscoverStreamFragmentPeer in isolation,\nuse DiscoverStreamFragmentArgsProvidingFragment as a base fragment instead of\nObservableFragment. See DiscoverStreamFragmentArgsProvidingFragment's kdoc for details.", e);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
