package com.google.android.apps.search.p8936a.p8937a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137415d;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2879g.C37191a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.silk.p3205a.p3224m.C41727a;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4308m.C56740a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4308m.C56741b;
import com.google.protobuf.C62940bt;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5535j.p5536a.p5558e.C71172a;
import p5535j.p5536a.p5558e.C71174c;

/* renamed from: com.google.android.apps.search.a.a.r */
/* compiled from: PG */
public final class C119182r implements GatewayHandler {

    /* renamed from: a */
    public static final C59071e f332376a = C59071e.m91332i("com.google.android.apps.search.a.a.r");

    /* renamed from: b */
    public final C37215b f332377b;

    /* renamed from: c */
    private final Context f332378c;

    /* renamed from: d */
    private final C21370a f332379d;

    /* renamed from: e */
    private final C41727a f332380e;

    /* renamed from: f */
    private final boolean f332381f;

    public C119182r(Context context, C41727a aVar, C21370a aVar2, C38780c cVar, boolean z) {
        this.f332378c = context;
        this.f332380e = aVar;
        this.f332379d = aVar2;
        this.f332377b = cVar.mo41619a(C38828b.HSI);
        this.f332381f = z;
    }

    /* renamed from: b */
    public static C71174c m197879b(C119168d dVar) {
        C71172a aVar = (C71172a) C71174c.f189885e.createBuilder();
        int i = dVar.f332354e;
        aVar.copyOnWrite();
        C71174c cVar = (C71174c) aVar.instance;
        cVar.f189888a |= 1;
        cVar.f189889b = i;
        if ((dVar.f332350a & 512) != 0) {
            int i2 = dVar.f332360k;
            aVar.copyOnWrite();
            C71174c cVar2 = (C71174c) aVar.instance;
            cVar2.f189888a |= 4;
            cVar2.f189891d = i2;
        }
        return (C71174c) aVar.build();
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        Intent intent;
        this.f332377b.mo19974a(C37191a.f98397a);
        Uri data = mVar.f123337a.getData();
        if (data != null) {
            try {
                if (!"https".equals(data.getScheme()) || !"www.google.com".equals(data.getHost()) || !"/hsi".equals(data.getPath())) {
                    throw new IllegalArgumentException("Deeplink URL is not of the expected pattern.");
                }
                C119165a aVar = (C119165a) C119168d.f332348m.createBuilder();
                Optional a = C119180p.m197878a("name", data);
                Objects.requireNonNull(aVar);
                a.ifPresent(new C119169e(aVar));
                Optional a2 = C119180p.m197878a("query", data);
                Objects.requireNonNull(aVar);
                a2.ifPresent(new C119172h(aVar));
                Optional a3 = C119180p.m197878a("icon", data);
                Objects.requireNonNull(aVar);
                a3.ifPresent(new C119173i(aVar));
                C119180p.m197878a("ve", data).ifPresent(new C119174j(aVar));
                Optional a4 = C119180p.m197878a("stick", data);
                Objects.requireNonNull(aVar);
                a4.ifPresent(new C119175k(aVar));
                Optional a5 = C119180p.m197878a("kgmid", data);
                Objects.requireNonNull(aVar);
                a5.ifPresent(new C119176l(aVar));
                Optional a6 = C119180p.m197878a("source", data);
                Objects.requireNonNull(aVar);
                a6.ifPresent(new C119177m(aVar));
                Optional a7 = C119180p.m197878a("ibp", data);
                Objects.requireNonNull(aVar);
                a7.ifPresent(new C119178n(aVar));
                C119180p.m197878a("tve", data).ifPresent(new C119179o(aVar));
                int intValue = ((Integer) C119180p.m197878a("hv", data).map(C119170f.f332363a).orElse(1)).intValue();
                aVar.copyOnWrite();
                C119168d dVar = (C119168d) aVar.instance;
                dVar.f332350a |= 128;
                dVar.f332358i = intValue;
                aVar.copyOnWrite();
                C119168d dVar2 = (C119168d) aVar.instance;
                dVar2.f332359j = ((C119167c) C119180p.m197878a("dest", data).map(C119171g.f332364a).orElse(C119167c.DEFAULT)).f332347d;
                dVar2.f332350a |= 256;
                C119168d dVar3 = (C119168d) aVar.build();
                if (dVar3.f332351b.isEmpty()) {
                    throw new IllegalArgumentException("Deeplink is missing 'name' param.");
                } else if (dVar3.f332353d.isEmpty()) {
                    throw new IllegalArgumentException("Deeplink is missing 'icon' param.");
                } else if (!"ssl.gstatic.com".equals(Uri.parse(dVar3.f332353d).getHost())) {
                    throw new IllegalArgumentException("Icon URL must be hosted in ssl.gstatic.com.");
                } else if (dVar3.f332354e > 0) {
                    ((C59052c) ((C59052c) f332376a.mo56224b()).mo56372aa(41466)).mo56389s("Installing HSI for deeplink: %s.", data);
                    this.f332377b.mo19974a(C37191a.f98399c.mo40812e(C71174c.f189886f, m197879b(dVar3)));
                    String str = dVar3.f332351b + "_" + this.f332379d.mo26870b();
                    Context context = this.f332378c;
                    Intent intent2 = new Intent("android.intent.action.MAIN");
                    intent2.addCategory("android.intent.category.HOME");
                    intent2.setFlags(268435456);
                    context.startActivity(intent2);
                    C41727a aVar2 = this.f332380e;
                    C56740a aVar3 = (C56740a) C56741b.f151431f.createBuilder();
                    aVar3.copyOnWrite();
                    C56741b bVar = (C56741b) aVar3.instance;
                    bVar.f151433a |= 8;
                    bVar.f151437e = str;
                    String str2 = dVar3.f332351b;
                    aVar3.copyOnWrite();
                    C56741b bVar2 = (C56741b) aVar3.instance;
                    str2.getClass();
                    bVar2.f151433a |= 1;
                    bVar2.f151434b = str2;
                    C119167c a8 = C119167c.m197876a(dVar3.f332359j);
                    if (a8 == null) {
                        a8 = C119167c.DEFAULT;
                    }
                    int ordinal = a8.ordinal();
                    C41727a aVar4 = aVar2;
                    if (ordinal == 0 || ordinal == 1) {
                        if (this.f332381f) {
                            intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
                            intent.putExtra("id", str);
                            if ((dVar3.f332350a & 32) != 0) {
                                intent.putExtra("source", dVar3.f332356g);
                            }
                            C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
                            String str3 = dVar3.f332352c;
                            eVar.copyOnWrite();
                            C137418g gVar = (C137418g) eVar.instance;
                            str3.getClass();
                            gVar.f373769a |= 1;
                            gVar.f373770b = str3;
                            int a9 = C137415d.m223276a(dVar3.f332358i);
                            if (a9 != 0) {
                                eVar.copyOnWrite();
                                C137418g gVar2 = (C137418g) eVar.instance;
                                gVar2.f373774f = a9 - 1;
                                gVar2.f373769a |= 8;
                            }
                            C58490gz gzVar = new C58490gz(4);
                            if ((dVar3.f332350a & 16) != 0) {
                                gzVar.mo55429h("stick", dVar3.f332355f);
                            }
                            int i = dVar3.f332354e;
                            if (i > 0) {
                                gzVar.mo55429h("ved", "1t:" + i);
                            }
                            if ((dVar3.f332350a & 64) != 0) {
                                gzVar.mo55429h("ibp", dVar3.f332357h);
                            }
                            if ((dVar3.f332350a & 1024) != 0) {
                                gzVar.mo55429h("kgmid", dVar3.f332361l);
                            }
                            eVar.mo113713a(gzVar.mo55427f(false));
                            C136128i l = C136129j.m221208l();
                            l.mo112776k(C139779t.SEARCH);
                            l.mo112775j(Optional.m71637of((C137418g) eVar.build()));
                            C136127h.m221196a(intent, l.mo112766a());
                            intent.setClassName(this.f332378c, "com.google.android.googlequicksearchbox.HomescreenIconEntrypoint");
                        } else {
                            intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH").setClassName(this.f332378c, e.b()).putExtra("id", str).putExtra("query", dVar3.f332352c).putExtra("query-header-visibility", dVar3.f332358i);
                            if ((dVar3.f332350a & 16) != 0) {
                                intent.putExtra("search-stick", dVar3.f332355f);
                            }
                            if ((dVar3.f332350a & 32) != 0) {
                                intent.putExtra("source", dVar3.f332356g);
                            }
                            int i2 = dVar3.f332354e;
                            if (i2 > 0) {
                                intent.putExtra("ved", "1t:" + i2);
                            }
                            if ((dVar3.f332350a & 64) != 0) {
                                intent.putExtra("search_immersive_base_page", dVar3.f332357h);
                            }
                            if ((dVar3.f332350a & 1024) != 0) {
                                intent.putExtra("kg-mid", dVar3.f332361l);
                            }
                        }
                    } else if (ordinal != 2) {
                        C119167c a10 = C119167c.m197876a(dVar3.f332359j);
                        if (a10 == null) {
                            a10 = C119167c.DEFAULT;
                        }
                        throw new UnsupportedOperationException("Unsupported HSI destination value: ".concat(String.valueOf(a10.name())));
                    } else {
                        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("www.google.com").path("/search").appendQueryParameter("q", dVar3.f332352c);
                        if ((dVar3.f332350a & 16) != 0) {
                            appendQueryParameter.appendQueryParameter("stick", dVar3.f332355f);
                        }
                        if ((dVar3.f332350a & 32) != 0) {
                            appendQueryParameter.appendQueryParameter("source", dVar3.f332356g);
                        }
                        int i3 = dVar3.f332354e;
                        if (i3 > 0) {
                            appendQueryParameter.appendQueryParameter("ved", "1t:" + i3);
                        }
                        if ((dVar3.f332350a & 64) != 0) {
                            appendQueryParameter.appendQueryParameter("ibp", dVar3.f332357h);
                        }
                        if ((dVar3.f332350a & 1024) != 0) {
                            appendQueryParameter.appendQueryParameter("kgmid", dVar3.f332361l);
                        }
                        intent = new Intent("android.intent.action.VIEW").setData(appendQueryParameter.build()).putExtra("id", str);
                    }
                    String uri = intent.toUri(0);
                    aVar3.copyOnWrite();
                    C56741b bVar3 = (C56741b) aVar3.instance;
                    uri.getClass();
                    bVar3.f151433a |= 2;
                    bVar3.f151435c = uri;
                    String str4 = dVar3.f332353d;
                    aVar3.copyOnWrite();
                    C56741b bVar4 = (C56741b) aVar3.instance;
                    str4.getClass();
                    bVar4.f151433a |= 4;
                    bVar4.f151436d = str4;
                    C60870cx a11 = aVar4.mo42542a((C56741b) aVar3.build());
                    a11.mo4106b(C47810es.m84977q(new C119181q(this, a11, dVar3)), C60826bg.f164896a);
                    return null;
                } else {
                    throw new IllegalArgumentException("Visual element must be a positive integer.");
                }
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f332376a.mo56225c()).mo56382g(e)).mo56372aa(41467)).mo56386p("Deeplink is invalid and cannot be used to create an HSI.");
                C37215b bVar5 = this.f332377b;
                C37252a c = C37191a.f98398b.mo40805c(C62722b.INVALID_ARGUMENT);
                C62940bt btVar = C71174c.f189886f;
                C71172a aVar5 = (C71172a) C71174c.f189885e.createBuilder();
                aVar5.copyOnWrite();
                C71174c cVar = (C71174c) aVar5.instance;
                cVar.f189890c = 3;
                cVar.f189888a |= 2;
                ((C37253b) c).mo40792p(btVar, (C71174c) aVar5.build());
                bVar5.mo19974a(c);
                return null;
            }
        } else {
            ((C59052c) ((C59052c) f332376a.mo56225c()).mo56372aa(41468)).mo56386p("Unable to extract deeplink URI from intent.");
            C37215b bVar6 = this.f332377b;
            C37252a c2 = C37191a.f98398b.mo40805c(C62722b.INVALID_ARGUMENT);
            C62940bt btVar2 = C71174c.f189886f;
            C71172a aVar6 = (C71172a) C71174c.f189885e.createBuilder();
            aVar6.copyOnWrite();
            C71174c cVar2 = (C71174c) aVar6.instance;
            cVar2.f189890c = 2;
            cVar2.f189888a = 2 | cVar2.f189888a;
            ((C37253b) c2).mo40792p(btVar2, (C71174c) aVar6.build());
            bVar6.mo19974a(c2);
            return null;
        }
    }
}
