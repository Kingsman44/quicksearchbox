package com.google.android.libraries.web.contrib.p3390j.p3391a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.shared.p3444d.C44089a;
import java.util.Set;

/* renamed from: com.google.android.libraries.web.contrib.j.a.f */
/* compiled from: PG */
public final class C43638f {

    /* renamed from: a */
    public final Set f113885a;

    public C43638f(C44089a aVar, C43269t tVar) {
        this.f113885a = aVar.mo47063c(tVar.mo46387e(C43635c.class));
    }

    /* renamed from: a */
    public static void m77011a(C43636d dVar, Uri uri) {
        String host = uri.getHost();
        if (!TextUtils.isEmpty(host)) {
            dVar.mo46658b(host);
            return;
        }
        dVar.mo46658b(uri.toString());
        dVar.mo46659c(TextUtils.TruncateAt.END);
    }
}
