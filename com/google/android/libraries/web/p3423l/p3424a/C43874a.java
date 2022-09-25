package com.google.android.libraries.web.p3423l.p3424a;

import android.net.Uri;
import com.google.android.libraries.web.base.C43234b;
import com.google.android.libraries.web.p3423l.C43873a;
import com.google.android.libraries.web.shared.C44076a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.web.l.a.a */
/* compiled from: PG */
public final class C43874a implements C43873a {

    /* renamed from: a */
    private final C43234b f114331a;

    public C43874a(C43234b bVar) {
        this.f114331a = bVar;
    }

    /* renamed from: a */
    public final boolean mo46765a(Uri uri) {
        C69664n.m101061g(uri, "uri");
        if (C69664n.m101066l("about:blank", uri.toString())) {
            return true;
        }
        String authority = uri.getAuthority();
        if (authority == null || C69764m.m101184A(authority, '\\') || C69764m.m101184A(authority, '@')) {
            return false;
        }
        if (uri.getPort() != -1) {
            authority = authority.substring(0, C69764m.m101191H(authority, ":"));
            C69664n.m101060f(authority, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (this.f114331a.f112982a && C69664n.m101066l(authority, "localhost")) {
            return true;
        }
        if (!C44076a.m77823f(uri) || (!C69664n.m101066l(authority, "google.com") && !C69764m.m101230i(authority, ".google.com") && !C69764m.m101230i(authority, ".google.com.hk") && !C69664n.m101066l(authority, "gstatic.com") && !C69764m.m101230i(authority, ".gstatic.com") && !C69764m.m101230i(authority, ".c.googlers.com") && !C69764m.m101230i(authority, ".google") && !C69664n.m101066l(authority, "youtube.com") && !C69764m.m101230i(authority, ".youtube.com") && !C69664n.m101066l(authority, "youtu.be") && !C69764m.m101230i(authority, ".youtube") && !C69664n.m101066l(authority, "appassets.androidplatform.net"))) {
            return false;
        }
        return true;
    }
}
