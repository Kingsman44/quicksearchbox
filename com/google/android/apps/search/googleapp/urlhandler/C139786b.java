package com.google.android.apps.search.googleapp.urlhandler;

import android.databinding.C0118a;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60761r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.b */
/* compiled from: PG */
public final class C139786b {

    /* renamed from: a */
    private static final C59071e f379925a = C59071e.m91332i("com.google.android.apps.search.googleapp.urlhandler.b");

    /* renamed from: b */
    private final C136832c f379926b;

    public C139786b(C136832c cVar) {
        this.f379926b = cVar;
    }

    /* renamed from: a */
    public final Optional mo115236a(Uri uri) {
        if (!mo115237b(uri)) {
            return Optional.empty();
        }
        String queryParameter = uri.getQueryParameter("agsac");
        if (TextUtils.isEmpty(queryParameter)) {
            return Optional.empty();
        }
        try {
            try {
                return Optional.m71637of(Long.valueOf(C60761r.m92757c(Base64.decode(queryParameter, 11))));
            } catch (IllegalArgumentException unused) {
                C0118a.m108p(f379925a.mo56226d(), "Incomplete click id for URL", 41418, C38505d.f101864b, 165224809);
                return Optional.empty();
            }
        } catch (IllegalArgumentException unused2) {
            C0118a.m108p(f379925a.mo56226d(), "Invalid click id for URL", 41419, C38505d.f101864b, 165224809);
            return Optional.empty();
        }
    }

    /* renamed from: b */
    public final boolean mo115237b(Uri uri) {
        return this.f379926b.mo113398d(uri) || this.f379926b.mo113400f(uri);
    }
}
