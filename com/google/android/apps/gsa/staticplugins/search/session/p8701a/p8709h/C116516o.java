package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.gsa.p6484r.C84251f;
import com.google.android.apps.gsa.search.core.google.C85869b;
import com.google.android.apps.gsa.search.core.google.C85919cm;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6519al.p6729e.C85461a;
import com.google.android.apps.gsa.search.core.p6785d.C85762c;
import com.google.android.apps.gsa.search.core.p6785d.C85763d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.searchbox.p6943b.C88537a;
import com.google.android.apps.gsa.searchbox.p6943b.C88538b;
import com.google.android.apps.gsa.searchbox.p6943b.C88539c;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.logger.p7061g.C89917a;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90722af;
import com.google.android.apps.gsa.shared.util.C91041i;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135458d;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.gsa.util.p1935a.C23336a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.o */
/* compiled from: PG */
public final class C116516o implements C90991b, C85762c {

    /* renamed from: a */
    public static final C59071e f323062a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.a.h.o");

    /* renamed from: b */
    public final C85869b f323063b;

    /* renamed from: c */
    public final C85929cw f323064c;

    /* renamed from: d */
    public final C116735gk f323065d;

    /* renamed from: e */
    public final C85461a f323066e;

    /* renamed from: f */
    public final C86610af f323067f;

    /* renamed from: g */
    public final C22871g f323068g;

    /* renamed from: h */
    public final C68214a f323069h;

    /* renamed from: i */
    public final C68214a f323070i;

    /* renamed from: j */
    private final Context f323071j;

    /* renamed from: k */
    private final C116569ag f323072k;

    /* renamed from: l */
    private final C85919cm f323073l;

    /* renamed from: m */
    private final C85763d f323074m;

    /* renamed from: n */
    private final C86124t f323075n;

    /* renamed from: o */
    private final C22871g f323076o;

    /* renamed from: p */
    private final C68214a f323077p;

    /* renamed from: q */
    private final C68214a f323078q;

    /* renamed from: r */
    private final C21370a f323079r;

    /* renamed from: s */
    private final C89917a f323080s;

    public C116516o(Context context, C85869b bVar, C85929cw cwVar, C116735gk gkVar, C116569ag agVar, C85919cm cmVar, C85763d dVar, C85461a aVar, C86124t tVar, C86610af afVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C21370a aVar6, C89917a aVar7) {
        this.f323071j = context;
        this.f323063b = bVar;
        this.f323064c = cwVar;
        this.f323065d = gkVar;
        this.f323072k = agVar;
        this.f323073l = cmVar;
        this.f323074m = dVar;
        this.f323066e = aVar;
        this.f323075n = tVar;
        this.f323067f = afVar;
        this.f323068g = gVar;
        this.f323076o = gVar3;
        this.f323077p = aVar2;
        this.f323069h = aVar3;
        this.f323078q = aVar4;
        this.f323070i = aVar5;
        this.f323079r = aVar6;
        this.f323080s = aVar7;
        C22871g gVar4 = gVar2;
        C84251f.m134340b(new C116515n(this), gVar2);
    }

    /* renamed from: e */
    private final void m193258e() {
        this.f323076o.mo28212l("ShowToast", new C116514m(this));
        ((C89911f) this.f323078q.mo27525b()).mo83756b(new C90452a(29, C89885b.WEBVIEW_INVALID_URL_INTENT_VALUE)).mo83721a();
    }

    /* renamed from: a */
    public final void mo79414a(Uri uri, Uri uri2, long j) {
        Query o = this.f323064c.mo79574o(this.f323065d.f323784p, uri2.toString());
        if (o == null) {
            HashMap hashMap = new HashMap();
            if (uri != null) {
                hashMap.put("Referer", Uri.EMPTY.buildUpon().authority(uri.getAuthority()).scheme(uri2.getScheme()).build().toString());
            }
            mo102745c(new UriRequest(uri2, hashMap, (Map) null, (byte[]) null), Long.valueOf(j));
            return;
        }
        this.f323065d.mo80462q(o);
    }

    /* renamed from: b */
    public final void mo102744b(Uri uri, Uri uri2, Query query) {
        C22872h.m42743c(C86593a.class);
        this.f323074m.mo79415a();
        C58833ax b = C89917a.m146441b(uri);
        Objects.requireNonNull(this.f323080s);
        long longValue = ((Long) b.mo56108d(new C116511j())).longValue();
        C58881cr q = this.f323064c.mo79576q(uri);
        if (q != null) {
            this.f323074m.mo79417c(uri2, q, this, longValue);
            return;
        }
        Pair e = this.f323064c.mo79565e(uri, uri2, longValue);
        UriRequest uriRequest = (UriRequest) e.first;
        C58881cr crVar = (C58881cr) e.second;
        if (crVar != null) {
            this.f323073l.mo79549h(crVar);
        }
        if (!this.f323075n.mo79746e(C90085ej.f250213bo)) {
            String bk = query.mo84352bk();
            long a = this.f323075n.mo79743a(C90085ej.f250212bn);
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 1;
            agVar.f328822b = a;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328824d = 1;
            agVar2.f328821a |= 4;
            C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
            C62940bt btVar = C88539c.f239298a;
            C88537a aVar = (C88537a) C88538b.f239291f.createBuilder();
            aVar.copyOnWrite();
            C88538b bVar = (C88538b) aVar.instance;
            bk.getClass();
            bVar.f239293a |= 1;
            bVar.f239294b = bk;
            aVar.copyOnWrite();
            C88538b bVar2 = (C88538b) aVar.instance;
            bVar2.f239295c = 1;
            bVar2.f239293a |= 2;
            aVar.copyOnWrite();
            C88538b bVar3 = (C88538b) aVar.instance;
            bVar3.f239297e = 4;
            bVar3.f239293a |= 8;
            ajVar.mo58885m(btVar, (C88538b) aVar.build());
            afVar.copyOnWrite();
            C118472ag agVar3 = (C118472ag) afVar.instance;
            C118476ak akVar = (C118476ak) ajVar.build();
            akVar.getClass();
            agVar3.f328827g = akVar;
            agVar3.f328821a |= 32;
            ((C118561t) this.f323077p.mo27525b()).mo103754e(C118522by.REFRESH_SEARCH_HISTORY, (C118472ag) afVar.build());
        }
        mo102745c(uriRequest, Long.valueOf(longValue));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo102745c(UriRequest uriRequest, Long l) {
        try {
            Intent a = C23336a.m43768a(uriRequest.f236331a.toString());
            if (!C90722af.m148175c(this.f323071j, a, true)) {
                C59071e eVar = f323062a;
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(31864)).mo56386p("App Uri intent is not supported");
                String stringExtra = a.getStringExtra("browser_fallback_url");
                if (stringExtra != null) {
                    Intent a2 = C23336a.m43768a(stringExtra);
                    if (C90722af.m148175c(this.f323071j, a2, true)) {
                        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(31867)).mo56386p("Using the fallback url");
                        a = a2;
                    }
                }
                ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(31865)).mo56386p("No packages available to handle the URI");
                if (a == null || a.getPackage() == null) {
                    a = null;
                } else {
                    ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(31866)).mo56386p("Falling back to market intent");
                    String str = a.getPackage();
                    str.getClass();
                    String stringExtra2 = a.getStringExtra("market_referrer");
                    if (TextUtils.isEmpty(stringExtra2)) {
                        stringExtra2 = this.f323071j.getPackageName();
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str).appendQueryParameter("referrer", Uri.decode(stringExtra2)).build());
                    intent.addCategory("android.intent.category.BROWSABLE");
                    intent.setPackage("com.android.vending");
                    intent.addFlags(268435456);
                    a = intent;
                }
            }
            if (a == null) {
                m193258e();
                return;
            }
            C58495hd a3 = uriRequest.mo81502a();
            if (!a3.isEmpty()) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : a3.entrySet()) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
                a.putExtra("com.android.browser.headers", bundle);
            }
            a.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 1);
            a.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.ERROR_TOAST_ID", R.string.no_url_handler);
            a.putExtra("com.google.android.apps.gsa.customtabs.SOURCE", 1);
            C135459e eVar2 = (C135459e) C135462h.f369059n.createBuilder();
            C135461g gVar = C135461g.SRP;
            eVar2.copyOnWrite();
            C135462h hVar = (C135462h) eVar2.instance;
            hVar.f369064d = gVar.f369058p;
            hVar.f369061a |= 4;
            Query query = this.f323065d.f323784p;
            if (query != null) {
                String str2 = query.f252770i;
                eVar2.copyOnWrite();
                C135462h hVar2 = (C135462h) eVar2.instance;
                str2.getClass();
                hVar2.f369061a |= 2;
                hVar2.f369063c = str2;
            }
            C135458d.m219649b((C135462h) eVar2.build(), a);
            a.putExtra("com.google.android.googlequicksearchbox.extra.start_activity_elapsed_realtime_millis", this.f323079r.mo26871c());
            if ("android.intent.action.VIEW".equals(a.getAction())) {
                a.putExtra("com.google.android.gms.instantapps.DO_NOT_LAUNCH_INSTANT_APP", true);
            }
            if (!((C85923cq) this.f323069h.mo27525b()).mo79557h()) {
                Uri.Builder builder = new Uri.Builder();
                builder.encodedAuthority(((C85923cq) this.f323069h.mo27525b()).mo83211i());
                String scheme = uriRequest.f236331a.getScheme();
                if (scheme == null || !C58890d.m90990e(scheme, "http")) {
                    scheme = "https";
                }
                builder.scheme(scheme);
                a.putExtra("android.intent.extra.REFERRER", builder.build());
            }
            if (l != null) {
                a.putExtra("com.google.android.apps.gsa.shared.logger.RESULT_CLICK_ID", l.longValue());
            }
            String str3 = this.f323072k.f323272f;
            if (C91041i.m148716a(str3)) {
                List<ResolveInfo> queryIntentActivities = this.f323071j.getPackageManager().queryIntentActivities(a, 64);
                if (queryIntentActivities != null) {
                    if (!queryIntentActivities.isEmpty()) {
                        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            IntentFilter intentFilter = it.next().filter;
                            if (!(intentFilter == null || intentFilter.countDataAuthorities() == 0)) {
                                if (intentFilter.countDataPaths() != 0) {
                                    break;
                                }
                            }
                        }
                    }
                }
                a.setPackage(str3);
            }
            C89429a.m145468z(this.f323071j, a, false, str3);
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 564;
            String b = C39191a.m68623b(this.f323065d.f323783o.f252749G);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            if (!((C91097g) this.f323070i.mo27525b()).mo65089a(a)) {
                ((C89911f) this.f323078q.mo27525b()).mo83756b(new C90452a(29, C89885b.WEBVIEW_UNHANDLED_URL_INTENT_VALUE)).mo83721a();
            }
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f323062a.mo56225c()).mo56382g(e)).mo56372aa(31871)).mo56389s("Malformed URI: %s", uriRequest.f236331a);
            m193258e();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }
}
