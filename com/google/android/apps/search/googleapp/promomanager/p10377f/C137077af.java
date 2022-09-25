package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139824k;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4880aq.C63758o;
import java.net.URISyntaxException;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.af */
/* compiled from: PG */
public final class C137077af {

    /* renamed from: a */
    public static final C59071e f373022a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.af");

    /* renamed from: b */
    public final Context f373023b;

    /* renamed from: c */
    public final C136969bx f373024c;

    /* renamed from: d */
    public final C137007dh f373025d;

    /* renamed from: e */
    public final C47449e f373026e;

    /* renamed from: f */
    public final C139824k f373027f;

    /* renamed from: g */
    public final C58495hd f373028g;

    /* renamed from: h */
    public boolean f373029h = true;

    /* renamed from: i */
    private final C137075ad f373030i;

    /* renamed from: j */
    private final C137116j f373031j;

    public C137077af(C137075ad adVar, C136969bx bxVar, C137116j jVar, Map map, C139824k kVar, C137007dh dhVar, C47449e eVar) {
        this.f373030i = adVar;
        this.f373023b = adVar.getContext();
        this.f373024c = bxVar;
        this.f373031j = jVar;
        this.f373028g = C58495hd.m89898l(map);
        this.f373026e = eVar;
        this.f373027f = kVar;
        this.f373025d = dhVar;
    }

    /* renamed from: a */
    public final void mo113493a() {
        this.f373029h = false;
        if (this.f373030i.getHost() != null) {
            this.f373030i.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo113494b(C63758o oVar) {
        if ((oVar.f172483a & 4) == 0) {
            try {
                this.f373031j.mo113536a(oVar);
                mo113493a();
            } catch (URISyntaxException unused) {
                mo113493a();
                this.f373024c.mo113456m(this.f373025d);
            }
            this.f373024c.mo113455l(this.f373025d);
            mo113493a();
            return;
        }
        C139824k kVar = this.f373027f;
        Uri parse = Uri.parse(oVar.f172486d);
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C139851q qVar = C139851q.PROMO_MANAGER;
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        kVar.mo115294c(parse, (C139823j) iVar.build());
    }
}
