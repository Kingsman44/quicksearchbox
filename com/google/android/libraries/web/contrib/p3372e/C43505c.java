package com.google.android.libraries.web.contrib.p3372e;

import android.webkit.WebResourceResponse;
import com.google.android.libraries.web.base.C43253d;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43256g;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.web.contrib.e.c */
/* compiled from: PG */
public final class C43505c {
    /* renamed from: a */
    public static void m76763a(C43255f fVar, C43506d dVar) {
        C44082a aVar = C44082a.f114755a;
        WebResourceResponse webResourceResponse = new WebResourceResponse("text/html", "utf-8", dVar.f113616a);
        C43503a aVar2 = dVar.f113617b;
        Objects.requireNonNull(aVar2);
        ((C43253d) fVar).f113028a = new C43256g(aVar, webResourceResponse, new C43504b(aVar2));
    }
}
