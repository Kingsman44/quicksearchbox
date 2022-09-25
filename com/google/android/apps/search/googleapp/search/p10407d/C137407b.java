package com.google.android.apps.search.googleapp.search.p10407d;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10310h.C136136q;
import com.google.android.apps.search.googleapp.p10310h.C136137r;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10407d.C137408c;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10409e.C137419h;
import com.google.android.libraries.search.logging.p3043f.C39193b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4880aq.C63721aj;
import p3186j$.util.Optional;
import p5535j.p5536a.p5545c.p5546a.C70968a;
import p5535j.p5536a.p5545c.p5546a.C70969b;

/* renamed from: com.google.android.apps.search.googleapp.search.d.b */
/* compiled from: PG */
final class C137407b implements C47506l {

    /* renamed from: a */
    final /* synthetic */ C47507m f373745a;

    /* renamed from: b */
    final /* synthetic */ C137408c f373746b;

    public C137407b(C137408c cVar, C47507m mVar) {
        this.f373746b = cVar;
        this.f373745a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo20002a() {
        return 0;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo20003b() {
        return 0;
    }

    /* renamed from: c */
    public final C58833ax mo20004c() {
        return this.f373746b.f373751e.mo37970a();
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        String str;
        C58833ax axVar;
        C137408c cVar = this.f373746b;
        if (!cVar.f373750d) {
            ((C59052c) ((C59052c) C137408c.f373747a.mo56224b()).mo56372aa(40976)).mo56386p("Gateway is disabled by flag, ignoring deeplink visit.");
            return C137408c.f373748b;
        }
        C137408c.C137409a aVar = (C137408c.C137409a) C47245e.m84045a(cVar.f373754h, C137408c.C137409a.class, kVar.f123336a);
        this.f373746b.f373753g = aVar.mo113711eT();
        this.f373746b.f373753g.mo19974a(C37182a.f98174hi);
        String dataString = this.f373745a.f123337a.getDataString();
        if (C58837ba.m90859h(dataString)) {
            ((C59052c) ((C59052c) C137408c.f373747a.mo56225c()).mo56372aa(40975)).mo56386p("Unable to extract deeplink URI from intent.");
            this.f373746b.f373753g.mo19974a(C37182a.f98175hj.mo40805c(C62722b.CANCELLED));
            return C137408c.f373749c;
        }
        Uri parse = Uri.parse(dataString);
        if (TextUtils.equals(parse.getScheme(), "https") && TextUtils.equals(parse.getHost(), "www.google.com") && TextUtils.equals(C58837ba.m90858g(parse.getPath()), "/gasearch")) {
            if (TextUtils.isEmpty(parse.getQueryParameter("q"))) {
                ((C59052c) ((C59052c) C137408c.f373747a.mo56224b()).mo56372aa(40980)).mo56386p("/gasearch deeplink URI has no query, redirecting to browser.");
            } else {
                C137408c cVar2 = this.f373746b;
                C63721aj hw = aVar.mo113712hw();
                C137419h cx = aVar.mo113710cx();
                Intent intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
                String uri = parse.toString();
                String queryParameter = parse.getQueryParameter("source");
                if (TextUtils.isEmpty(queryParameter)) {
                    str = "and.gsa.deeplink";
                } else {
                    str = C39193b.m68625b(queryParameter);
                }
                Uri parse2 = Uri.parse(uri.replaceFirst("https://www.google.com/gasearch", "https://www.google.com/search"));
                String queryParameter2 = parse2.getQueryParameter("q");
                intent.putExtra("query", queryParameter2);
                intent.putExtra("source", str);
                intent.putExtra("search_query_options", C137408c.m223267b(parse2));
                C136136q qVar = (C136136q) C136137r.f370767d.createBuilder();
                String queryParameter3 = parse2.getQueryParameter("sop");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    intent.putExtra("sop", Boolean.parseBoolean(queryParameter3));
                    boolean parseBoolean = Boolean.parseBoolean(queryParameter3);
                    qVar.copyOnWrite();
                    C136137r rVar = (C136137r) qVar.instance;
                    rVar.f370769a |= 2;
                    rVar.f370771c = parseBoolean;
                }
                String queryParameter4 = parse2.getQueryParameter("stick");
                if (TextUtils.isEmpty(queryParameter4)) {
                    axVar = C58836b.f156633a;
                } else {
                    try {
                        axVar = C58833ax.m90834k(Integer.valueOf(Integer.parseInt(queryParameter4)));
                    } catch (NumberFormatException e) {
                        ((C59052c) ((C59052c) ((C59052c) C137408c.f373747a.mo56225c()).mo56382g(e)).mo56372aa(40977)).mo56386p("Promo ID is not a number.");
                        axVar = C58836b.f156633a;
                    }
                }
                if (axVar.mo56113h()) {
                    int intValue = ((Integer) axVar.mo56107c()).intValue();
                    if (hw.mo59234a(intValue)) {
                        intent.putExtra("promo_id", intValue);
                        if (intValue != 0) {
                            qVar.copyOnWrite();
                            C136137r rVar2 = (C136137r) qVar.instance;
                            rVar2.f370769a |= 1;
                            rVar2.f370770b = intValue;
                        }
                    } else {
                        ((C59052c) ((C59052c) C137408c.f373747a.mo56226d()).mo56372aa(40979)).mo56387q("Promo %d is not supported in this version", intValue);
                        cVar2.mo113709c(C37182a.f98177hl.mo40806d(), uri, str, axVar);
                        return C137408c.f373748b;
                    }
                }
                if (cVar2.f373752f && cx.mo113716a()) {
                    C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
                    try {
                        byte[] b = C137408c.m223267b(parse2);
                        b.getClass();
                        eVar = (C137416e) ((C137418g) C62942bv.parseFrom((C62942bv) C137418g.f373767r, b, C62921ba.m95368a())).toBuilder();
                    } catch (C62974ct e2) {
                        ((C59052c) ((C59052c) ((C59052c) C137408c.f373747a.mo56225c()).mo56382g(e2)).mo56372aa(40978)).mo56386p("Error parsing QueryOptions proto");
                    }
                    if (queryParameter2 != null) {
                        eVar.copyOnWrite();
                        C137418g gVar = (C137418g) eVar.instance;
                        gVar.f373769a |= 1;
                        gVar.f373770b = queryParameter2;
                    }
                    intent.putExtra("SKIP_EXIT_ANIMATION", true);
                    C136128i l = C136129j.m221208l();
                    l.mo112776k(C139779t.SEARCH);
                    l.mo112775j(Optional.m71637of((C137418g) eVar.build()));
                    l.mo112774i(Optional.m71637of((C136137r) qVar.build()));
                    C136127h.m221196a(intent, l.mo112766a());
                }
                cVar2.mo113709c(C37182a.f98178hm.mo40806d(), uri, str, axVar);
                return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(intent));
            }
        }
        ((C59052c) ((C59052c) C137408c.f373747a.mo56225c()).mo56372aa(40974)).mo56386p("Invalid deeplink URI from intent.");
        C37215b bVar = this.f373746b.f373753g;
        C37252a c = C37182a.f98176hk.mo40805c(C62722b.CANCELLED);
        C62940bt btVar = C70969b.f189243f;
        C70968a aVar2 = (C70968a) C70969b.f189242e.createBuilder();
        String uri2 = parse.toString();
        aVar2.copyOnWrite();
        C70969b bVar2 = (C70969b) aVar2.instance;
        uri2.getClass();
        bVar2.f189245a = 1 | bVar2.f189245a;
        bVar2.f189246b = uri2;
        ((C37253b) c).mo40792p(btVar, (C70969b) aVar2.build());
        bVar.mo19974a(c);
        return C137408c.f373748b;
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}
