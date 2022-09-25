package com.google.android.apps.search.googleapp.search.p10407d;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10409e.C137419h;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4880aq.C63721aj;
import p5535j.p5536a.p5545c.p5546a.C70968a;
import p5535j.p5536a.p5545c.p5546a.C70969b;

/* renamed from: com.google.android.apps.search.googleapp.search.d.c */
/* compiled from: PG */
final class C137408c implements GatewayHandler {

    /* renamed from: a */
    public static final C59071e f373747a = C59071e.m91332i("com.google.android.apps.search.googleapp.search.d.c");

    /* renamed from: b */
    public static final C60870cx f373748b = C60856cj.m92900i(GatewayHandler.GatewayDestination.m84517e());

    /* renamed from: c */
    public static final C60870cx f373749c = C60856cj.m92900i(GatewayHandler.GatewayDestination.m84513a("Unsupported URL"));

    /* renamed from: d */
    public final boolean f373750d;

    /* renamed from: e */
    public final C32158h f373751e;

    /* renamed from: f */
    public final boolean f373752f;

    /* renamed from: g */
    public C37215b f373753g;

    /* renamed from: h */
    public final Context f373754h;

    /* renamed from: com.google.android.apps.search.googleapp.search.d.c$a */
    /* compiled from: PG */
    interface C137409a {
        /* renamed from: cx */
        C137419h mo113710cx();

        /* renamed from: eT */
        C37215b mo113711eT();

        /* renamed from: hw */
        C63721aj mo113712hw();
    }

    public C137408c(Context context, C32158h hVar, boolean z, boolean z2) {
        this.f373751e = hVar;
        this.f373754h = context;
        this.f373750d = z;
        this.f373752f = z2;
    }

    /* renamed from: b */
    public static byte[] m223267b(Uri uri) {
        String queryParameter;
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        for (String next : uri.getQueryParameterNames()) {
            if (!"q".equals(next) && !"source".equals(next) && (queryParameter = uri.getQueryParameter(next)) != null) {
                eVar.mo113714b(next, queryParameter);
            }
        }
        return ((C137418g) eVar.build()).toByteArray();
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        return new C137407b(this, mVar);
    }

    /* renamed from: c */
    public final void mo113709c(C37259h hVar, String str, String str2, C58833ax axVar) {
        C62722b bVar;
        C70968a aVar = (C70968a) C70969b.f189242e.createBuilder();
        aVar.copyOnWrite();
        C70969b bVar2 = (C70969b) aVar.instance;
        str.getClass();
        bVar2.f189245a |= 1;
        bVar2.f189246b = str;
        aVar.copyOnWrite();
        C70969b bVar3 = (C70969b) aVar.instance;
        bVar3.f189245a |= 2;
        bVar3.f189247c = str2;
        if (axVar.mo56113h()) {
            int intValue = ((Integer) axVar.mo56107c()).intValue();
            aVar.copyOnWrite();
            C70969b bVar4 = (C70969b) aVar.instance;
            bVar4.f189245a |= 4;
            bVar4.f189248d = intValue;
        }
        if (hVar.mo40778b().f98906a == C37182a.f98178hm.f99010a.f98876a.f98906a) {
            bVar = C62722b.OK;
        } else {
            bVar = C62722b.CANCELLED;
        }
        C37215b bVar5 = this.f373753g;
        bVar5.getClass();
        C37252a e = hVar.mo40781e(bVar);
        ((C37253b) e).mo40792p(C70969b.f189243f, (C70969b) aVar.build());
        bVar5.mo19974a(e);
    }
}
