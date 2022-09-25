package com.google.android.apps.gsa.search.shared.api;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.google.android.apps.gsa.shared.p6968aa.C89033bd;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.search.shared.api.b */
/* compiled from: PG */
public final class C87504b implements C90964a {

    /* renamed from: a */
    public static final C59071e f236336a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.api.b");

    /* renamed from: b */
    public final UriRequest f236337b;

    /* renamed from: c */
    public final C89033bd f236338c;

    /* renamed from: d */
    private final C58881cr f236339d;

    /* renamed from: e */
    private final ConcurrentMap f236340e = new ConcurrentHashMap();

    public C87504b(UriRequest uriRequest, C89033bd bdVar, C58881cr crVar) {
        this.f236337b = uriRequest;
        this.f236339d = crVar;
        this.f236338c = bdVar;
    }

    /* renamed from: a */
    public final WebResourceResponse mo81511a() {
        InputStream inputStream = (InputStream) this.f236339d.mo6453a();
        if (inputStream == null) {
            C59104x b = f236336a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Velvet.WebPage");
            ((C59052c) ((C59052c) b).mo56372aa(9589)).mo56386p("Missing input stream. This is a fake WebPage. Use WebView network instead.");
            return null;
        }
        C89033bd bdVar = this.f236338c;
        String str = bdVar.f241307b;
        String str2 = bdVar.f241308c;
        if (TextUtils.isEmpty(str)) {
            C59104x d = f236336a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Velvet.WebPage");
            ((C59052c) ((C59052c) d).mo56372aa(9588)).mo56389s("Missing MIME type. Defaulting to %s", "text/html");
            str = "text/html";
        }
        if (TextUtils.isEmpty(str2)) {
            C59104x d2 = f236336a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Velvet.WebPage");
            ((C59052c) ((C59052c) d2).mo56372aa(9587)).mo56389s("Missing charset. Defaulting to %s", "utf-8");
            str2 = "utf-8";
        }
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* renamed from: b */
    public final InputStream mo81512b() {
        return (InputStream) this.f236339d.mo6453a();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WebPage");
        fVar.mo85279c("content type").mo85276a(C90752i.m148229c(String.valueOf(this.f236338c)));
        fVar.mo85279c("content supplier").mo85276a(C90752i.m148233g(String.valueOf(this.f236339d)));
        for (Map.Entry entry : this.f236340e.entrySet()) {
            fVar.mo85288o("Resource URL: ".concat(String.valueOf((String) entry.getKey())), (C90964a) entry.getValue());
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f236338c);
        return "WebPage{" + valueOf + "}";
    }
}
