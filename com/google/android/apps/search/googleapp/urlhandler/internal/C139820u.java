package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8867w.p8879i.C118803d;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.customtabs.p10150b.C133674b;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133678ac;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133691m;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133697s;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133699u;
import com.google.android.apps.search.googleapp.customtabs.p10152d.C133705a;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133710ab;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133711ac;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133712ad;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133731q;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133739y;
import com.google.android.apps.search.googleapp.customtabs.p10155e.C133758a;
import com.google.android.apps.search.googleapp.customtabs.p10155e.C133759b;
import com.google.android.apps.search.googleapp.customtabs.p10155e.C133763f;
import com.google.android.apps.search.googleapp.customtabs.p10155e.C133764g;
import com.google.android.apps.search.googleapp.customtabs.p10155e.C133765h;
import com.google.android.apps.search.googleapp.customtabs.p10155e.C133767j;
import com.google.android.apps.search.googleapp.customtabs.p10155e.C133768k;
import com.google.android.apps.search.googleapp.customtabs.p10155e.C133769l;
import com.google.android.apps.search.googleapp.customtabs.p10156f.C133770a;
import com.google.android.apps.search.googleapp.customtabs.p10156f.C133771b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135457c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135465k;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135475u;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.apps.search.googleapp.p10117aa.p10120c.C133116a;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.apps.search.googleapp.p10335j.C136373d;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.p10539y.p10540a.C139883a;
import com.google.android.apps.search.googleapp.urlhandler.C139797h;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139788a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.apps.search.googleapp.urlhandler.p10531c.C139792b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58893dc;
import com.google.common.base.C58894dd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60492rx;
import com.google.common.p4552o.C60494rz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.u */
/* compiled from: PG */
public final class C139820u {

    /* renamed from: a */
    public static final /* synthetic */ int f380042a = 0;

    /* renamed from: b */
    private static final C59071e f380043b = C59071e.m91332i("com.google.android.apps.search.googleapp.urlhandler.internal.u");

    /* renamed from: c */
    private static final C58528ij f380044c = new C58759qy("com.google.android.apps.gsa.staticplugins.opa.errorui.UdcPuntCardActivity");

    /* renamed from: d */
    private final C133678ac f380045d;

    /* renamed from: e */
    private final C133769l f380046e;

    /* renamed from: f */
    private final C133691m f380047f;

    /* renamed from: g */
    private final C139792b f380048g;

    /* renamed from: h */
    private final PackageManager f380049h;

    /* renamed from: i */
    private final C60888db f380050i;

    /* renamed from: j */
    private final C60888db f380051j;

    /* renamed from: k */
    private final Context f380052k;

    /* renamed from: l */
    private final C135457c f380053l;

    /* renamed from: m */
    private final C135475u f380054m;

    /* renamed from: n */
    private final C136832c f380055n;

    /* renamed from: o */
    private final C136373d f380056o;

    /* renamed from: p */
    private final C136370a f380057p;

    /* renamed from: q */
    private final C139802d f380058q;

    /* renamed from: r */
    private final boolean f380059r;

    /* renamed from: s */
    private final boolean f380060s;

    /* renamed from: t */
    private final boolean f380061t;

    /* renamed from: u */
    private final boolean f380062u;

    /* renamed from: v */
    private final boolean f380063v;

    /* renamed from: w */
    private final C133110a f380064w;

    /* renamed from: x */
    private final C118803d f380065x;

    public C139820u(C133678ac acVar, C133769l lVar, C133691m mVar, C139792b bVar, PackageManager packageManager, C60888db dbVar, C60888db dbVar2, Context context, C135475u uVar, C135457c cVar, C118803d dVar, C136832c cVar2, C136373d dVar2, C136370a aVar, C139802d dVar3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C133110a aVar2) {
        this.f380045d = acVar;
        this.f380046e = lVar;
        this.f380047f = mVar;
        this.f380048g = bVar;
        this.f380049h = packageManager;
        this.f380050i = dbVar;
        this.f380051j = dbVar2;
        this.f380052k = context;
        this.f380053l = cVar;
        this.f380054m = uVar;
        this.f380065x = dVar;
        this.f380055n = cVar2;
        this.f380056o = dVar2;
        this.f380057p = aVar;
        this.f380058q = dVar3;
        this.f380059r = z;
        this.f380060s = z2;
        this.f380061t = z3;
        this.f380062u = z4;
        this.f380063v = z5;
        this.f380064w = aVar2;
    }

    /* renamed from: d */
    public static void m227326d(Intent intent, C139811l lVar) {
        intent.putExtra("android.intent.extra.REFERRER", m227328f(lVar));
        if (lVar.f380014d) {
            intent.addFlags(268435456);
        }
    }

    /* renamed from: e */
    public static boolean m227327e(ResolveInfo resolveInfo, Set set) {
        if (resolveInfo.activityInfo == null) {
            return false;
        }
        return set.contains(resolveInfo.activityInfo.packageName);
    }

    /* renamed from: f */
    private static Uri m227328f(C139811l lVar) {
        C139823j jVar = lVar.f380012b;
        if (jVar == null) {
            jVar = C139823j.f380066m;
        }
        String str = jVar.f380077j;
        return str.isEmpty() ? C139797h.f379947a : Uri.parse(str);
    }

    /* renamed from: g */
    private static Uri m227329g(Uri uri, C139811l lVar) {
        C139823j jVar = lVar.f380012b;
        if (jVar == null) {
            jVar = C139823j.f380066m;
        }
        String str = jVar.f380073f;
        return str.isEmpty() ? uri : Uri.parse(str);
    }

    /* renamed from: h */
    private final UrlIntentResult m227330h(Uri uri, C139811l lVar) {
        C135461g gVar;
        Intent intent;
        if (this.f380059r) {
            uri = m227329g(uri, lVar);
        }
        C135459e eVar = (C135459e) C135462h.f369059n.createBuilder();
        String uri2 = uri.toString();
        eVar.copyOnWrite();
        C135462h hVar = (C135462h) eVar.instance;
        uri2.getClass();
        hVar.f369061a |= 1;
        hVar.f369062b = uri2;
        C139823j jVar = lVar.f380012b;
        if (jVar == null) {
            jVar = C139823j.f380066m;
        }
        String str = jVar.f380075h;
        eVar.copyOnWrite();
        C135462h hVar2 = (C135462h) eVar.instance;
        str.getClass();
        hVar2.f369061a |= 2;
        hVar2.f369063c = str;
        boolean a = this.f380057p.mo112949a();
        eVar.copyOnWrite();
        C135462h hVar3 = (C135462h) eVar.instance;
        hVar3.f369061a |= 128;
        hVar3.f369069i = a;
        C139788a aVar = (C139788a) C139789b.f379928d.createBuilder();
        aVar.copyOnWrite();
        C139789b bVar = (C139789b) aVar.instance;
        bVar.f379930a |= 2;
        bVar.f379932c = true;
        C139823j jVar2 = lVar.f380012b;
        if (jVar2 == null) {
            jVar2 = C139823j.f380066m;
        }
        long j = jVar2.f380071d;
        aVar.copyOnWrite();
        C139789b bVar2 = (C139789b) aVar.instance;
        bVar2.f379930a |= 1;
        bVar2.f379931b = j;
        eVar.copyOnWrite();
        C135462h hVar4 = (C135462h) eVar.instance;
        C139789b bVar3 = (C139789b) aVar.build();
        bVar3.getClass();
        hVar4.f369066f = bVar3;
        hVar4.f369061a |= 16;
        C139823j jVar3 = lVar.f380012b;
        if (jVar3 == null) {
            jVar3 = C139823j.f380066m;
        }
        C139851q a2 = C139851q.m227396a(jVar3.f380069b);
        if (a2 == null) {
            a2 = C139851q.UNKNOWN;
        }
        C135461g gVar2 = C135461g.UNKNOWN;
        switch (a2.ordinal()) {
            case 0:
                gVar = C135461g.UNKNOWN;
                break;
            case 1:
                gVar = C135461g.SRP;
                break;
            case 2:
                gVar = C135461g.SUGGEST;
                break;
            case 3:
                gVar = C135461g.NOW;
                break;
            case 4:
                gVar = C135461g.AMP;
                break;
            case 5:
                gVar = C135461g.AMP_NOW;
                break;
            case 6:
                gVar = C135461g.COLLECTIONS;
                break;
            case 7:
                gVar = C135461g.DOODLE;
                break;
            case 8:
                gVar = C135461g.MENU;
                break;
            case 9:
                gVar = C135461g.TABS_MANAGER;
                break;
            case 10:
                gVar = C135461g.SETTINGS;
                break;
            case 11:
                gVar = C135461g.PROMO_MANAGER;
                break;
            default:
                throw new AssertionError("Invalid source: " + a2.f380143m);
        }
        eVar.copyOnWrite();
        C135462h hVar5 = (C135462h) eVar.instance;
        hVar5.f369064d = gVar.f369058p;
        hVar5.f369061a |= 4;
        String uri3 = m227328f(lVar).toString();
        eVar.copyOnWrite();
        C135462h hVar6 = (C135462h) eVar.instance;
        uri3.getClass();
        hVar6.f369061a |= 64;
        hVar6.f369068h = uri3;
        boolean l = m227334l(uri, lVar);
        eVar.copyOnWrite();
        C135462h hVar7 = (C135462h) eVar.instance;
        hVar7.f369061a |= 512;
        hVar7.f369071k = l;
        if (this.f380064w.mo110978a()) {
            C139823j jVar4 = lVar.f380012b;
            if (jVar4 == null) {
                jVar4 = C139823j.f380066m;
            }
            String str2 = jVar4.f380072e;
            if (str2.isEmpty()) {
                str2 = C133116a.m216079a();
            }
            eVar.copyOnWrite();
            C135462h hVar8 = (C135462h) eVar.instance;
            str2.getClass();
            hVar8.f369061a |= 8;
            hVar8.f369065e = str2;
        }
        C135462h hVar9 = (C135462h) eVar.build();
        boolean z = lVar.f380015e;
        if (!this.f380057p.mo112949a() || z) {
            intent = this.f380053l.mo112350b(uri, (C135459e) hVar9.toBuilder());
        } else {
            intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
            C136128i l2 = C136129j.m221208l();
            l2.mo112776k(C139779t.GOOGLE_APP_BROWSER);
            l2.mo112772g(Optional.m71637of(hVar9.f369065e));
            C135459e eVar2 = (C135459e) hVar9.toBuilder();
            eVar2.copyOnWrite();
            C135462h hVar10 = (C135462h) eVar2.instance;
            hVar10.f369061a |= 1024;
            hVar10.f369072l = true;
            l2.mo112770e(Optional.m71637of((C135462h) eVar2.build()));
            C136127h.m221196a(intent, l2.mo112766a());
        }
        m227326d(intent, lVar);
        C139821v m = UrlIntentResult.m227288m();
        ProtoParsers.InternalDontUse internalDontUse = new ProtoParsers.InternalDontUse((byte[]) null, lVar);
        C139799a aVar2 = (C139799a) m;
        aVar2.f379960a = internalDontUse;
        m.mo115290j(intent);
        m.mo115277h(false);
        m.mo115278i(false);
        aVar2.f379964e = 1;
        m.mo115271b(((C135462h) eVar.instance).f369071k);
        return m.mo115270a();
    }

    /* renamed from: i */
    private final C60870cx m227331i(Uri uri, String str, C135465k kVar, C60492rx rxVar, C139811l lVar, C133697s sVar, C133674b bVar) {
        C133731q qVar;
        C60870cx cxVar;
        long j;
        boolean z = false;
        boolean z2 = str != null && sVar.equals(C133697s.AVAILABLE);
        C58893dc.m90999d(z2 || kVar.f369076b, "CCT or GAB must be available", new Object[0]);
        if (!z2 || kVar.f369076b) {
            return C60856cj.m92900i(m227330h(uri, lVar));
        }
        Uri g = m227329g(uri, lVar);
        C133770a aVar = (C133770a) C133771b.f364368e.createBuilder();
        C139823j jVar = lVar.f380012b;
        if (jVar == null) {
            jVar = C139823j.f380066m;
        }
        C139851q a = C139851q.m227396a(jVar.f380069b);
        if (a == null) {
            a = C139851q.UNKNOWN;
        }
        C60494rz a2 = C139803e.m227311a(a);
        aVar.copyOnWrite();
        C133771b bVar2 = (C133771b) aVar.instance;
        bVar2.f364371b = a2.f163762v;
        bVar2.f364370a |= 1;
        long j2 = lVar.f380013c;
        aVar.copyOnWrite();
        C133771b bVar3 = (C133771b) aVar.instance;
        bVar3.f364370a |= 4;
        bVar3.f364373d = j2;
        C139823j jVar2 = lVar.f380012b;
        if (jVar2 == null) {
            jVar2 = C139823j.f380066m;
        }
        long j3 = jVar2.f380071d;
        aVar.copyOnWrite();
        C133771b bVar4 = (C133771b) aVar.instance;
        bVar4.f364370a |= 2;
        bVar4.f364372c = j3;
        C133771b bVar5 = (C133771b) aVar.build();
        C139823j jVar3 = lVar.f380012b;
        if (jVar3 == null) {
            jVar3 = C139823j.f380066m;
        }
        C139851q a3 = C139851q.m227396a(jVar3.f380069b);
        if (a3 == null) {
            a3 = C139851q.UNKNOWN;
        }
        if (a3.equals(C139851q.AMP_SRP) || a3.equals(C139851q.AMP_DISCOVER)) {
            z = true;
        }
        C133758a aVar2 = (C133758a) C133759b.f364312i.createBuilder();
        aVar2.copyOnWrite();
        C133759b bVar6 = (C133759b) aVar2.instance;
        bVar5.getClass();
        bVar6.f364315b = bVar5;
        bVar6.f364314a |= 1;
        C139823j jVar4 = lVar.f380012b;
        if (jVar4 == null) {
            jVar4 = C139823j.f380066m;
        }
        String str2 = jVar4.f380074g;
        aVar2.copyOnWrite();
        C133759b bVar7 = (C133759b) aVar2.instance;
        str2.getClass();
        bVar7.f364314a |= 2;
        bVar7.f364316c = str2;
        aVar2.copyOnWrite();
        C133759b bVar8 = (C133759b) aVar2.instance;
        bVar8.f364314a |= 8;
        bVar8.f364318e = z;
        int i = bVar.f364107i;
        aVar2.copyOnWrite();
        C133759b bVar9 = (C133759b) aVar2.instance;
        bVar9.f364314a |= 4;
        bVar9.f364317d = i;
        boolean l = m227334l(uri, lVar);
        aVar2.copyOnWrite();
        C133759b bVar10 = (C133759b) aVar2.instance;
        bVar10.f364314a |= 16;
        bVar10.f364319f = l;
        long j4 = lVar.f380016f;
        aVar2.copyOnWrite();
        C133759b bVar11 = (C133759b) aVar2.instance;
        bVar11.f364314a |= 32;
        bVar11.f364320g = j4;
        C139823j jVar5 = lVar.f380012b;
        if (jVar5 == null) {
            jVar5 = C139823j.f380066m;
        }
        boolean z3 = jVar5.f380079l;
        aVar2.copyOnWrite();
        C133759b bVar12 = (C133759b) aVar2.instance;
        bVar12.f364314a |= 64;
        bVar12.f364321h = z3;
        C133759b bVar13 = (C133759b) aVar2.build();
        C133769l lVar2 = this.f380046e;
        C133711ac acVar = (C133711ac) C133712ad.f364202d.createBuilder();
        C133771b bVar14 = bVar13.f364315b;
        if (bVar14 == null) {
            bVar14 = C133771b.f364368e;
        }
        acVar.copyOnWrite();
        C133712ad adVar = (C133712ad) acVar.instance;
        bVar14.getClass();
        adVar.f364206c = bVar14;
        adVar.f364204a |= 2;
        String uri2 = g.toString();
        acVar.copyOnWrite();
        C133712ad adVar2 = (C133712ad) acVar.instance;
        uri2.getClass();
        adVar2.f364204a = 1 | adVar2.f364204a;
        adVar2.f364205b = uri2;
        C133712ad adVar3 = (C133712ad) acVar.build();
        C133739y a4 = lVar2.f364349d.mo111383a();
        if (a4 != null) {
            qVar = a4.mo111372a(adVar3);
        } else {
            qVar = null;
        }
        if (qVar != null) {
            cxVar = C60856cj.m92900i(qVar);
        } else {
            C47633f g2 = C47633f.m84733g(C60922j.m93045h(lVar2.f364349d.mo111384b(), C47810es.m84966f(new C133767j(lVar2, adVar3)), lVar2.f364356k));
            if (!lVar2.f364365t.isZero()) {
                j = lVar2.f364365t.toMillis();
            } else {
                j = (long) bVar13.f364317d;
            }
            cxVar = g2.mo51517j(j, TimeUnit.MILLISECONDS, lVar2.f364356k).mo51513e(TimeoutException.class, C133763f.f364336a, lVar2.f364356k).mo51513e(C133710ab.class, C133764g.f364337a, lVar2.f364356k).mo51513e(C133705a.class, C133765h.f364338a, lVar2.f364356k);
        }
        return C47633f.m84733g(C60922j.m93045h(cxVar, C47810es.m84966f(new C133768k(lVar2, g, bVar13)), lVar2.f364356k)).mo51515h(new C139819t(lVar, rxVar, bVar13), C60826bg.f164896a);
    }

    /* renamed from: j */
    private final C60870cx m227332j(Uri uri, String str, boolean z, C135465k kVar, C133699u uVar, C139811l lVar, C133674b bVar) {
        C139811l lVar2 = lVar;
        try {
            if ("intent".equals(uri.getScheme())) {
                Intent parseUri = Intent.parseUri(uri.toString(), 1);
                parseUri.addCategory("android.intent.category.BROWSABLE");
                parseUri.setComponent((ComponentName) null);
                Intent selector = parseUri.getSelector();
                if (selector != null) {
                    selector.addCategory("android.intent.category.BROWSABLE");
                    selector.setComponent((ComponentName) null);
                    selector.setSelector((Intent) null);
                }
                List<ResolveInfo> queryIntentActivities = this.f380049h.queryIntentActivities(parseUri, 65536);
                m227326d(parseUri, lVar2);
                for (ResolveInfo next : queryIntentActivities) {
                    if (!next.activityInfo.exported) {
                        C58528ij ijVar = f380044c;
                        if (!((C58759qy) ijVar).f156534a.equals(next.activityInfo.name)) {
                            ((C59052c) ((C59052c) f380043b.mo56226d()).mo56372aa(41453)).mo56389s("Trying to launch a non-exported activity %s, aborting...", next.activityInfo.name);
                            return C60856cj.m92899h(new C139801c("Aborting launch of non-exported activity."));
                        }
                    }
                }
                if (queryIntentActivities.isEmpty()) {
                    String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                    if (stringExtra != null) {
                        return mo115289c(Uri.parse(stringExtra), str, z, kVar, uVar, lVar, bVar);
                    } else if (parseUri.getPackage() != null) {
                        String str2 = parseUri.getPackage();
                        C58893dc.m90996a(str2);
                        String stringExtra2 = parseUri.getStringExtra("market_referrer");
                        if (TextUtils.isEmpty(stringExtra2)) {
                            stringExtra2 = this.f380052k.getPackageName();
                        }
                        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str2).appendQueryParameter("referrer", Uri.decode(stringExtra2)).build());
                        intent.addCategory("android.intent.category.BROWSABLE");
                        intent.setPackage("com.android.vending");
                        intent.addFlags(268435456);
                        m227326d(intent, lVar2);
                        C139821v m = UrlIntentResult.m227288m();
                        ProtoParsers.InternalDontUse internalDontUse = new ProtoParsers.InternalDontUse((byte[]) null, lVar2);
                        C139799a aVar = (C139799a) m;
                        aVar.f379960a = internalDontUse;
                        m.mo115290j(intent);
                        m.mo115291k(C60492rx.NO_NON_BROWSER_APP_DEFAULT);
                        aVar.f379964e = 3;
                        return C60856cj.m92900i(m.mo115270a());
                    } else {
                        C139821v m2 = UrlIntentResult.m227288m();
                        ProtoParsers.InternalDontUse internalDontUse2 = new ProtoParsers.InternalDontUse((byte[]) null, lVar2);
                        C139799a aVar2 = (C139799a) m2;
                        aVar2.f379960a = internalDontUse2;
                        m2.mo115290j(parseUri);
                        m2.mo115291k(C60492rx.NO_UNRESOLVED_INTENT);
                        aVar2.f379964e = 3;
                        return C60856cj.m92900i(m2.mo115270a());
                    }
                } else {
                    C139821v m3 = UrlIntentResult.m227288m();
                    ProtoParsers.InternalDontUse internalDontUse3 = new ProtoParsers.InternalDontUse((byte[]) null, lVar2);
                    C139799a aVar3 = (C139799a) m3;
                    aVar3.f379960a = internalDontUse3;
                    m3.mo115291k(C60492rx.NO_INTENT_URL);
                    m3.mo115290j(parseUri);
                    aVar3.f379964e = 3;
                    return C60856cj.m92900i(m3.mo115270a());
                }
            } else {
                throw new URISyntaxException(uri.toString(), "The provided Uri must have the intent scheme");
            }
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f380043b.mo56226d()).mo56382g(e)).mo56372aa(41454)).mo56386p("Unable to parse intent URI");
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: k */
    private static C60870cx m227333k(Uri uri, C60492rx rxVar, C139811l lVar) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        m227326d(intent, lVar);
        intent.addFlags(268435456);
        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        C139821v m = UrlIntentResult.m227288m();
        ProtoParsers.InternalDontUse internalDontUse = new ProtoParsers.InternalDontUse((byte[]) null, lVar);
        C139799a aVar = (C139799a) m;
        aVar.f379960a = internalDontUse;
        m.mo115290j(intent);
        m.mo115291k(rxVar);
        aVar.f379964e = 3;
        return C60856cj.m92900i(m.mo115270a());
    }

    /* renamed from: l */
    private final boolean m227334l(Uri uri, C139811l lVar) {
        C139823j jVar = lVar.f380012b;
        if (jVar == null) {
            jVar = C139823j.f380066m;
        }
        C139851q a = C139851q.m227396a(jVar.f380069b);
        if (a == null) {
            a = C139851q.UNKNOWN;
        }
        return (this.f380062u || this.f380061t || ((a.equals(C139851q.AMP_DISCOVER) || a.equals(C139851q.DISCOVER)) && this.f380063v)) && (!this.f380055n.mo113401g(uri) || !"1".equals(uri.getQueryParameter("dd")));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C60870cx mo115287a(C60870cx cxVar, C60870cx cxVar2) {
        try {
            Uri uri = (Uri) C60856cj.m92909r(cxVar);
            try {
                C139811l lVar = (C139811l) C60856cj.m92909r(cxVar2);
                C60870cx b = this.f380045d.f364126e.mo50395b();
                C60870cx a = this.f380048g.mo115249a();
                C60870cx a2 = this.f380054m.mo112358a();
                C60870cx c = this.f380047f.mo111335c(C133691m.f364149b);
                C60870cx a3 = this.f380065x.mo103972a();
                return C47638k.m84753d(b, a, a2, c, a3).mo51521b(new C139818s(this, b, a, a2, c, a3, uri, lVar), this.f380050i);
            } catch (CancellationException | ExecutionException e) {
                return C60856cj.m92899h(new C58894dd("Failed to get URL params", e));
            }
        } catch (CancellationException | ExecutionException e2) {
            return C60856cj.m92899h(new C139804f(e2));
        }
    }

    /* renamed from: b */
    public final C60870cx mo115288b(C60870cx cxVar, C60870cx cxVar2) {
        return C47638k.m84751b(cxVar, cxVar2).mo51521b(new C139815p(this, cxVar, cxVar2), this.f380051j);
    }

    /* renamed from: c */
    public final C60870cx mo115289c(Uri uri, String str, boolean z, C135465k kVar, C133699u uVar, C139811l lVar, C133674b bVar) {
        C60492rx rxVar;
        C60492rx rxVar2;
        Uri uri2 = uri;
        String str2 = str;
        C135465k kVar2 = kVar;
        C133699u uVar2 = uVar;
        C139811l lVar2 = lVar;
        if (kVar2.f369075a) {
            return C60856cj.m92900i(m227330h(uri2, lVar2));
        }
        if (!this.f380060s || !C139883a.m227491c(uri2, this.f380055n)) {
            if ("intent".equals(uri.getScheme())) {
                C139823j jVar = lVar2.f380012b;
                if (jVar == null) {
                    jVar = C139823j.f380066m;
                }
                if (!jVar.f380078k) {
                    return C60856cj.m92899h(new C139801c("intent:// URIs are not allowed"));
                }
                return m227332j(uri, str, z, kVar, uVar, lVar, bVar);
            } else if (!z) {
                return m227333k(uri2, C60492rx.NO_USER_OPTED_OUT, lVar2);
            } else {
                if (str2 != null || kVar2.f369076b) {
                    C133697s a = C133697s.m216929a(uVar2.f364175b);
                    if (a == null) {
                        a = C133697s.UNKNOWN;
                    }
                    C133697s sVar = a;
                    boolean z2 = true;
                    if (sVar.equals(C133697s.AVAILABLE) || kVar2.f369076b) {
                        Intent intent = new Intent("android.intent.action.VIEW", uri2);
                        intent.addCategory("android.intent.category.BROWSABLE");
                        List<ResolveInfo> queryIntentActivities = this.f380049h.queryIntentActivities(intent, 65536);
                        if (!queryIntentActivities.isEmpty()) {
                            List<ResolveInfo> queryIntentActivities2 = this.f380058q.f379973a.queryIntentActivities(new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", BuildConfig.FLAVOR, (String) null)), C89885b.S3REQUEST_VALUE);
                            C58526ih ihVar = new C58526ih();
                            for (ResolveInfo resolveInfo : queryIntentActivities2) {
                                ihVar.mo55373c(resolveInfo.activityInfo.packageName);
                            }
                            C58528ij f = ihVar.mo55486f();
                            if (!kVar2.f369076b) {
                                C58893dc.m90996a(str);
                                if (!f.contains(str2)) {
                                    return m227333k(uri2, C60492rx.NO_NO_CUSTOM_TABS_BROWSERS, lVar2);
                                }
                            }
                            ResolveInfo resolveActivity = this.f380049h.resolveActivity(intent, 65536);
                            C58893dc.m90996a(resolveActivity);
                            C58893dc.m90996a(resolveActivity.activityInfo);
                            if (resolveActivity.match > 0 && m227327e(resolveActivity, f)) {
                                if (str2 == null || !str2.equals(resolveActivity.activityInfo.packageName)) {
                                    rxVar = C60492rx.YES_OVERRIDE;
                                } else {
                                    rxVar = C60492rx.YES_USER_DEFAULT;
                                }
                                return m227331i(uri, str, kVar, rxVar, lVar, sVar, bVar);
                            } else if (resolveActivity.match != 0) {
                                if (resolveActivity.match <= 0) {
                                    z2 = false;
                                }
                                C58893dc.m90997b(z2);
                                return m227333k(uri2, C60492rx.NO_NON_BROWSER_APP_DEFAULT, lVar2);
                            } else if (!Collection.EL.stream(queryIntentActivities).allMatch(new C139817r(f))) {
                                return m227333k(uri2, C60492rx.NO_MULTIPLE_APPS_NO_DEFAULT, lVar2);
                            } else {
                                return m227331i(uri, str, kVar, C60492rx.YES_IMPLICIT, lVar, sVar, bVar);
                            }
                        } else if (kVar2.f369076b) {
                            return C60856cj.m92900i(m227330h(uri2, lVar2));
                        } else {
                            return m227333k(uri2, C60492rx.NO_UNRESOLVED_INTENT, lVar2);
                        }
                    } else {
                        C133697s a2 = C133697s.m216929a(uVar2.f364175b);
                        if (a2 == null) {
                            a2 = C133697s.UNKNOWN;
                        }
                        int ordinal = a2.ordinal();
                        if (ordinal == 0) {
                            rxVar2 = C60492rx.NO_NO_CUSTOM_TABS_BROWSERS;
                        } else if (ordinal == 1) {
                            throw new IllegalArgumentException("Not expecting outcome AVAILABLE");
                        } else if (ordinal == 2) {
                            rxVar2 = C60492rx.NO_ACCOUNT_MISMATCH_TOAST_NOT_SUPPORTED;
                        } else if (ordinal == 3) {
                            rxVar2 = C60492rx.NO_BROWSER_FIRST_RUN_NOT_DONE;
                        } else {
                            throw new AssertionError("Unhandled availability outcome value");
                        }
                        ((C59052c) ((C59052c) f380043b.mo56224b()).mo56372aa(41446)).mo56386p("Custom Tabs package is not compatible, falling back to default handler");
                        return m227333k(uri2, rxVar2, lVar2);
                    }
                } else {
                    ((C59052c) ((C59052c) f380043b.mo56224b()).mo56372aa(41447)).mo56386p("No compatible Custom Tabs package is available, falling back to default handler");
                    return m227333k(uri2, C60492rx.NO_NO_CUSTOM_TABS_BROWSERS, lVar2);
                }
            }
        } else if (!C139883a.m227491c(uri2, this.f380055n)) {
            return C60856cj.m92899h(new C58894dd("Expected Collections URL"));
        } else {
            C139821v m = UrlIntentResult.m227288m();
            ((C139799a) m).f379960a = new ProtoParsers.InternalDontUse((byte[]) null, lVar2);
            m.mo115291k(C60492rx.NO_INTERNAL_URL);
            String a3 = C139883a.m227489a(uri);
            C60870cx a4 = this.f380056o.mo112950a();
            C139816q qVar = new C139816q(m, a3);
            return C60922j.m93044g(a4, C47810es.m84963c(qVar), C60826bg.f164896a);
        }
    }
}
