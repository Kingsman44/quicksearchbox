package com.google.android.libraries.search.location.web;

import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.C44086d;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.android.libraries.web.webview.contrib.geolocationpermission.AutoValue_GeolocationPermissionFeature;
import com.google.android.libraries.web.webview.contrib.geolocationpermission.C44373f;
import com.google.android.libraries.web.webview.contrib.geolocationpermission.GeolocationPermissionCallbacks;
import com.google.android.libraries.web.webview.contrib.geolocationpermission.GeolocationPermissionWebFragmentObserver;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;

/* compiled from: PG */
public abstract class SearchLocationFeature implements WebFeature {
    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        C44085c b = C44086d.m77840b();
        b.f114768e.add(C38723f.class);
        return b.mo47056a();
    }

    /* renamed from: b */
    public final C58528ij mo41577b() {
        C44085c b = C44086d.m77840b();
        b.f114767d.add(GeolocationPermissionWebFragmentObserver.class);
        b.mo47057b(GeolocationPermissionCallbacks.class, C38720c.class);
        b.f114768e.add(C44373f.class);
        return new C58759qy(new AutoValue_GeolocationPermissionFeature(b.mo47056a()));
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return SearchLocationFeature.class;
    }
}
