package com.google.android.apps.search.podcasts.p10601r;

import android.net.Uri;
import com.google.common.base.C58890d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.l */
/* compiled from: PG */
public final class C140990l {
    /* renamed from: a */
    public static final boolean m228952a(Uri uri) {
        C69664n.m101061g(uri, "uri");
        String scheme = uri.getScheme();
        return scheme != null && C58890d.m90990e("http", scheme);
    }
}
