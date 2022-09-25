package com.google.android.libraries.componentview.p1699f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.componentview.components.base.p1687a.C19953c;
import com.google.android.libraries.componentview.components.base.p1687a.C19982e;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.services.application.C20579bf;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20608ch;
import com.google.android.libraries.componentview.services.application.C20609ci;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.android.libraries.componentview.services.application.C20613d;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.android.libraries.componentview.services.application.C20617h;
import com.google.android.libraries.componentview.services.application.NavigationParams;
import com.google.android.libraries.componentview.services.p1701a.C20533b;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import com.google.p4271bq.C56429h;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.f.l */
/* compiled from: PG */
public final class C20524l {

    /* renamed from: a */
    public final C20609ci f57655a;

    /* renamed from: b */
    public final C20601ca f57656b;

    /* renamed from: c */
    public final C20579bf f57657c;

    /* renamed from: d */
    private final C20610cj f57658d;

    /* renamed from: e */
    private final Executor f57659e;

    /* renamed from: f */
    private final Context f57660f;

    /* renamed from: g */
    private final C20533b f57661g;

    public C20524l(C20609ci ciVar, C20601ca caVar, C20610cj cjVar, C20579bf bfVar, Executor executor, Context context, C20533b bVar) {
        this.f57655a = ciVar;
        this.f57656b = caVar;
        this.f57658d = cjVar;
        this.f57657c = bfVar;
        this.f57659e = executor;
        this.f57660f = context;
        this.f57661g = bVar;
    }

    /* renamed from: d */
    private final Intent m38502d(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (z) {
                parseUri.addCategory("android.intent.category.BROWSABLE");
            }
            return parseUri;
        } catch (URISyntaxException e) {
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.INVALID_URI);
            eVar.f57822b = "MalformedURLException encountered in canUriBeHandled";
            eVar.f57821a = e;
            C20520h.m38498c("NavigationHelper", eVar.mo25531a(), this.f57656b, new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    private final void m38503e(C19983f fVar, NavigationParams navigationParams, Intent intent) {
        int a = C19982e.m37786a(fVar.f56007d);
        if (a == 0 || a == 1) {
            this.f57655a.mo21040b(intent);
        } else {
            this.f57655a.mo21039a(fVar.f56006c, navigationParams);
        }
    }

    /* renamed from: f */
    private static final String m38504f(String str, String str2) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("ved", str2);
        return buildUpon.toString();
    }

    /* renamed from: g */
    private static final C19983f m38505g(C19983f fVar, C56429h hVar) {
        int a;
        if (hVar == null || (hVar.f150549a & 64) == 0 || (a = C19982e.m37786a(fVar.f56007d)) == 0 || a != 2 || (fVar.f56004a & 2) == 0) {
            return fVar;
        }
        Uri parse = Uri.parse(fVar.f56006c);
        try {
            if (!"intent".equals(parse.getScheme())) {
                return fVar;
            }
            Intent parseUri = Intent.parseUri(parse.toString(), 1);
            parseUri.putExtra("ved", hVar.f150556h);
            C60214n nVar = hVar.f150550b;
            if (nVar == null) {
                nVar = C60214n.f162914g;
            }
            ProtoParsers.m95531n(parseUri, "clickTrackingCgi", nVar);
            C19953c cVar = (C19953c) C19983f.f56002g.createBuilder(fVar);
            String uri = parseUri.toUri(1);
            cVar.copyOnWrite();
            C19983f fVar2 = (C19983f) cVar.instance;
            uri.getClass();
            fVar2.f56004a = 2 | fVar2.f56004a;
            fVar2.f56006c = uri;
            return (C19983f) cVar.build();
        } catch (URISyntaxException e) {
            Object[] objArr = {e};
            C20520h.m38497b(6, "NavigationHelper", (Throwable) null, "Failed to parse uri: ".concat(String.valueOf(String.valueOf(parse))), objArr);
            return fVar;
        }
    }

    /* renamed from: a */
    public final void mo25439a(String str, C19983f fVar, C56429h hVar) {
        Uri uri;
        if (hVar == null || hVar.f150556h.isEmpty()) {
            uri = Uri.parse(str);
        } else {
            uri = Uri.parse(m38504f(str, hVar.f150556h));
        }
        C60856cj.m92911t(C60922j.m93045h(C60922j.m93044g(this.f57657c.mo25516a(), new C20521i(this, uri.getAuthority() != null ? uri.getAuthority().toLowerCase(Locale.US) : null, "/aclk".equalsIgnoreCase(uri.getPath()), uri), this.f57659e), new C20522j(this, uri), this.f57659e), new C20523k(this, hVar, fVar), this.f57659e);
    }

    /* renamed from: b */
    public final void mo25440b(C19983f fVar, C56429h hVar) {
        int a;
        if (fVar == null) {
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.NAVIGATION_WITH_NULL_ACTION);
            eVar.f57822b = "executeNavigationAction called with null action";
            C20520h.m38498c("NavigationHelper", eVar.mo25531a(), this.f57656b, new Object[0]);
            return;
        }
        int a2 = C19982e.m37786a(fVar.f56007d);
        if (a2 != 0 && a2 == 3) {
            mo25439a(fVar.f56005b, fVar, hVar);
            return;
        }
        long nextLong = this.f57661g.f57684a.nextLong();
        if (hVar != null && hVar.f150551c && ((a = C19982e.m37786a(fVar.f56007d)) == 0 || a != 2)) {
            if (!fVar.f56008e.isEmpty()) {
                C20520h.m38497b(3, "NavigationHelper", (Throwable) null, "Ping Url: %s", fVar.f56008e);
                this.f57656b.mo25488c(m38504f(fVar.f56008e, hVar.f150556h));
            } else if (fVar.f56005b.isEmpty() || (hVar.f150549a & 64) == 0) {
                C20520h.m38497b(3, "NavigationHelper", (Throwable) null, "App Click Url: %s", fVar.f56006c);
                C20601ca caVar = this.f57656b;
                C20613d dVar = new C20613d();
                dVar.mo25529b(fVar.f56006c);
                dVar.mo25530c(hVar.f150556h);
                dVar.f57816c = hVar.f150555g;
                dVar.f57817d = hVar.f150558j;
                dVar.f57820g = Long.valueOf(nextLong);
                caVar.mo21037a(dVar.mo25528a());
            } else {
                C20520h.m38497b(3, "NavigationHelper", (Throwable) null, "Web Click Url: %s", fVar.f56005b);
                C20601ca caVar2 = this.f57656b;
                C20613d dVar2 = new C20613d();
                dVar2.mo25529b(fVar.f56005b);
                dVar2.mo25530c(hVar.f150556h);
                dVar2.f57816c = hVar.f150555g;
                dVar2.f57817d = hVar.f150558j;
                dVar2.f57820g = Long.valueOf(nextLong);
                caVar2.mo21037a(dVar2.mo25528a());
            }
        }
        C20608ch c = NavigationParams.m38563c();
        int a3 = C19982e.m37786a(fVar.f56007d);
        c.mo25556b(a3 != 0 && a3 == 2);
        ((C20617h) c).f57836a = Long.valueOf(nextLong);
        NavigationParams a4 = c.mo25555a();
        C19983f g = m38505g(fVar, hVar);
        Intent d = m38502d(g.f56006c, g.f56009f);
        if (d != null && !this.f57660f.getPackageManager().queryIntentActivities(d, 0).isEmpty()) {
            m38503e(g, a4, d);
        } else if (!g.f56005b.isEmpty()) {
            String str = g.f56005b;
            if (a4.mo25468b() && hVar != null && !hVar.f150556h.isEmpty()) {
                str = m38504f(str, hVar.f150556h);
            }
            C20520h.m38497b(3, "NavigationHelper", (Throwable) null, "Navigating to Url: %s", str);
            this.f57655a.mo21039a(str, a4);
        } else if (d == null || TextUtils.isEmpty(d.getStringExtra("browser_fallback_url"))) {
            C20614e eVar2 = new C20614e();
            eVar2.mo25535e(C19742a.EMPTY_RESOURCE);
            eVar2.f57822b = "No way to handle action: ".concat(String.valueOf(g.toString()));
            C20520h.m38498c("NavigationHelper", eVar2.mo25531a(), this.f57656b, new Object[0]);
        } else {
            m38503e(g, a4, d);
        }
        mo25441c();
    }

    /* renamed from: c */
    public final void mo25441c() {
        this.f57658d.mo25491a("navigateTo", (Map) null);
    }
}
