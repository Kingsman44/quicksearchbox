package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.apps.gsa.search.core.google.C85869b;
import com.google.android.apps.gsa.search.core.google.C85919cm;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6519al.p6729e.C85461a;
import com.google.android.apps.gsa.search.core.p6785d.C85763d;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.logger.p7061g.C89917a;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90722af;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114214b;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114215c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.gsa.util.p1935a.C23336a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.net.URISyntaxException;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.n */
/* compiled from: PG */
public final class C114235n {

    /* renamed from: a */
    public static final C59071e f316773a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.webview.n");

    /* renamed from: b */
    public final C85869b f316774b;

    /* renamed from: c */
    public final C85461a f316775c;

    /* renamed from: d */
    public final C114214b f316776d;

    /* renamed from: e */
    public final C22871g f316777e;

    /* renamed from: f */
    private final Context f316778f;

    /* renamed from: g */
    private final C91097g f316779g;

    /* renamed from: h */
    private final C85763d f316780h;

    /* renamed from: i */
    private final C85919cm f316781i;

    /* renamed from: j */
    private final C89917a f316782j;

    /* renamed from: k */
    private final C68214a f316783k;

    /* renamed from: l */
    private final C68214a f316784l;

    /* renamed from: m */
    private final C68214a f316785m;

    public C114235n(Context context, C91097g gVar, C85869b bVar, C85763d dVar, C85461a aVar, C85919cm cmVar, C89917a aVar2, C114215c cVar, C68214a aVar3, C68214a aVar4, C68214a aVar5, C22871g gVar2) {
        this.f316778f = context;
        this.f316779g = gVar;
        this.f316774b = bVar;
        this.f316780h = dVar;
        this.f316775c = aVar;
        this.f316781i = cmVar;
        this.f316782j = aVar2;
        this.f316776d = cVar.mo101265a(gVar);
        this.f316783k = aVar3;
        this.f316784l = aVar4;
        this.f316785m = aVar5;
        this.f316777e = gVar2;
    }

    /* renamed from: c */
    private final void m189499c(int i) {
        ((C89911f) this.f316783k.mo27525b()).mo83756b(new C90452a(29, i)).mo83721a();
    }

    /* renamed from: a */
    public final void mo101271a(Uri uri, Uri uri2, Query query) {
        C22872h.m42743c(C86593a.class);
        this.f316780h.mo79415a();
        C58833ax b = C89917a.m146441b(uri);
        Objects.requireNonNull(this.f316782j);
        long longValue = ((Long) b.mo56108d(new C114231j())).longValue();
        C58881cr q = ((C85929cw) this.f316784l.mo27525b()).mo79576q(uri);
        if (q != null) {
            this.f316780h.mo79417c(uri2, q, new C114232k(this, query), longValue);
            return;
        }
        Pair e = ((C85929cw) this.f316784l.mo27525b()).mo79565e(uri, uri2, longValue);
        UriRequest uriRequest = (UriRequest) e.first;
        C58881cr crVar = (C58881cr) e.second;
        if (crVar != null) {
            this.f316781i.mo79549h(crVar);
        }
        mo101272b(uriRequest, Long.valueOf(longValue));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo101272b(UriRequest uriRequest, Long l) {
        try {
            Intent a = C23336a.m43768a(uriRequest.f236331a.toString());
            if (!C90722af.m148175c(this.f316778f, a, true)) {
                ((C59052c) ((C59052c) f316773a.mo56225c()).mo56372aa(28778)).mo56386p("URI parsing returned no activities.");
                m189499c(C89885b.WEBVIEW_INVALID_URL_INTENT_VALUE);
                return;
            }
            C58495hd a2 = uriRequest.mo81502a();
            if (!a2.isEmpty()) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : a2.entrySet()) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
                a.putExtra("com.android.browser.headers", bundle);
            }
            a.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 1);
            a.putExtra("com.google.android.apps.gsa.customtabs.SOURCE", 7);
            if (!((C85923cq) this.f316785m.mo27525b()).mo79557h()) {
                Uri.Builder builder = new Uri.Builder();
                builder.encodedAuthority(((C85923cq) this.f316785m.mo27525b()).mo83211i());
                String scheme = uriRequest.f236331a.getScheme();
                if (scheme == null || !C58890d.m90990e(scheme, "http")) {
                    scheme = "https";
                }
                builder.scheme(scheme);
                a.putExtra("android.intent.extra.REFERRER", builder.build());
            }
            a.putExtra("com.google.android.apps.gsa.shared.logger.RESULT_CLICK_ID", l.longValue());
            C89429a.m145468z(this.f316778f, a, false, (String) null);
            if (!this.f316779g.mo65089a(a)) {
                m189499c(C89885b.WEBVIEW_UNHANDLED_URL_INTENT_VALUE);
            }
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f316773a.mo56225c()).mo56382g(e)).mo56372aa(28777)).mo56386p("URI parsing failed.");
            m189499c(C89885b.WEBVIEW_INVALID_URL_INTENT_VALUE);
        }
    }
}
