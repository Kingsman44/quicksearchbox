package com.google.android.apps.search.googleapp.homescreen.p10311a;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.search.googleapp.homescreen.p10312b.C136148a;
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
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4880aq.C63721aj;
import p5535j.p5536a.p5545c.p5546a.C70968a;
import p5535j.p5536a.p5545c.p5546a.C70969b;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.a.c */
/* compiled from: PG */
final class C136144c implements GatewayHandler {

    /* renamed from: a */
    public static final C59071e f370780a = C59071e.m91332i("com.google.android.apps.search.googleapp.homescreen.a.c");

    /* renamed from: b */
    public static final C60870cx f370781b = C60856cj.m92900i(GatewayHandler.GatewayDestination.m84517e());

    /* renamed from: c */
    public static final C60870cx f370782c = C60856cj.m92900i(GatewayHandler.GatewayDestination.m84513a("Unsupported URL"));

    /* renamed from: d */
    public final boolean f370783d;

    /* renamed from: e */
    public final C32158h f370784e;

    /* renamed from: f */
    public final Context f370785f;

    /* renamed from: g */
    public C37215b f370786g;

    /* renamed from: com.google.android.apps.search.googleapp.homescreen.a.c$a */
    /* compiled from: PG */
    interface C136145a {
        /* renamed from: cl */
        C136148a mo112798cl();

        /* renamed from: eT */
        C37215b mo112799eT();

        /* renamed from: hw */
        C63721aj mo112800hw();

        /* renamed from: nG */
        boolean mo112801nG();
    }

    public C136144c(Context context, C32158h hVar, boolean z) {
        this.f370784e = hVar;
        this.f370783d = z;
        this.f370785f = context;
    }

    /* renamed from: b */
    public static String m221240b(String str) {
        return C58890d.m90988c(str).startsWith("www.") ? str.substring(4) : str;
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        return new C136143b(this, mVar);
    }

    /* renamed from: c */
    public final void mo112797c(C37259h hVar, Uri uri, String str, C58833ax axVar) {
        C70968a aVar = (C70968a) C70969b.f189242e.createBuilder();
        String uri2 = uri.toString();
        aVar.copyOnWrite();
        C70969b bVar = (C70969b) aVar.instance;
        uri2.getClass();
        bVar.f189245a |= 1;
        bVar.f189246b = uri2;
        aVar.copyOnWrite();
        C70969b bVar2 = (C70969b) aVar.instance;
        bVar2.f189245a |= 2;
        bVar2.f189247c = str;
        if (axVar.mo56113h()) {
            int intValue = ((Integer) axVar.mo56107c()).intValue();
            aVar.copyOnWrite();
            C70969b bVar3 = (C70969b) aVar.instance;
            bVar3.f189245a |= 4;
            bVar3.f189248d = intValue;
        }
        int i = hVar.mo40778b().f98906a;
        int i2 = C37182a.f98130gr.f99010a.f98876a.f98906a;
        C37215b bVar4 = this.f370786g;
        bVar4.getClass();
        C37252a e = hVar.mo40781e(i == i2 ? C62722b.OK : C62722b.CANCELLED);
        ((C37253b) e).mo40792p(C70969b.f189243f, (C70969b) aVar.build());
        bVar4.mo19974a(e);
    }
}
