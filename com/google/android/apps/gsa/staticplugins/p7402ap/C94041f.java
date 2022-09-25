package com.google.android.apps.gsa.staticplugins.p7402ap;

import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6536ah.C84683a;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.ap.f */
/* compiled from: PG */
public final class C94041f extends C86734a implements C84683a {

    /* renamed from: a */
    public final C87242k f262682a;

    /* renamed from: b */
    public final C84466a f262683b;

    /* renamed from: c */
    private final C22871g f262684c;

    /* renamed from: f */
    private final C85923cq f262685f;

    public C94041f(C22871g gVar, C85923cq cqVar, C84466a aVar, C87242k kVar) {
        super(C118575h.WORKER_ELEMENTS, "elements");
        this.f262684c = gVar;
        this.f262685f = cqVar;
        this.f262683b = aVar;
        this.f262682a = kVar;
    }

    /* renamed from: c */
    private final C60870cx m155241c(Uri uri) {
        return this.f262684c.mo28202b("Interaction Logging", new C94040e(this, uri));
    }

    /* renamed from: a */
    public final C60870cx mo78417a(String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(this.f262685f.mo83212j()).encodedAuthority(this.f262685f.mo83211i()).appendPath("url");
        builder.appendQueryParameter("ved", str);
        builder.appendQueryParameter("sa", "T");
        builder.appendQueryParameter("url", str2);
        return m155241c(builder.build());
    }

    /* renamed from: b */
    public final C60870cx mo78418b(String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(this.f262685f.mo83212j()).encodedAuthority(this.f262685f.mo83211i()).appendPath("gen_204");
        builder.appendQueryParameter("atyp", "i");
        builder.appendQueryParameter("vet", str);
        builder.appendQueryParameter("ei", str2);
        return m155241c(builder.build());
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
