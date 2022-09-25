package com.google.android.libraries.kids.platform.kidonboarding.p1988b;

import android.net.Uri;
import com.google.p4109av.p4114c.p4115a.p4116a.C54618k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.b.b */
/* compiled from: PG */
public final class C24042b {
    /* renamed from: a */
    public static final void m44639a(C54618k kVar, Uri.Builder builder) {
        C69664n.m101061g(kVar, "params");
        C69664n.m101061g(builder, "uriBuilder");
        if ((kVar.f143392a & 1) != 0) {
            builder.appendQueryParameter("ec", kVar.f143395d);
        }
        if (kVar.f143397f) {
            builder.appendQueryParameter("color_scheme", "dark");
        }
    }
}
