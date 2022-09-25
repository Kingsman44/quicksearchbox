package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139824k;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47759cx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4880aq.C63758o;
import java.net.URISyntaxException;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.ax */
/* compiled from: PG */
public final class C137095ax {

    /* renamed from: a */
    public static final C59071e f373057a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.ax");

    /* renamed from: b */
    public final Context f373058b;

    /* renamed from: c */
    public final C136969bx f373059c;

    /* renamed from: d */
    public final C137007dh f373060d;

    /* renamed from: e */
    public final C47770dh f373061e;

    /* renamed from: f */
    public final C47449e f373062f;

    /* renamed from: g */
    public final C139824k f373063g;

    /* renamed from: h */
    public final C58495hd f373064h;

    /* renamed from: i */
    public boolean f373065i = true;

    /* renamed from: j */
    private final C137089ar f373066j;

    /* renamed from: k */
    private final C137116j f373067k;

    public C137095ax(C137089ar arVar, C136969bx bxVar, C137116j jVar, Map map, C139824k kVar, C47770dh dhVar, C137007dh dhVar2, C47449e eVar) {
        this.f373066j = arVar;
        this.f373058b = arVar.getContext();
        this.f373059c = bxVar;
        this.f373067k = jVar;
        this.f373064h = C58495hd.m89898l(map);
        this.f373062f = eVar;
        this.f373061e = dhVar;
        this.f373063g = kVar;
        this.f373060d = dhVar2;
    }

    /* renamed from: a */
    public final void mo113512a() {
        if (this.f373066j.getHost() != null) {
            C47393f.m84236g(new C137117k(), this.f373066j);
        }
    }

    /* renamed from: b */
    public final void mo113513b(C63758o oVar) {
        if ((oVar.f172483a & 4) == 0) {
            try {
                this.f373067k.mo113536a(oVar);
            } catch (URISyntaxException unused) {
                this.f373059c.mo113456m(this.f373060d);
            }
            this.f373059c.mo113455l(this.f373060d);
            return;
        }
        C139824k kVar = this.f373063g;
        Uri parse = Uri.parse(oVar.f172486d);
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C139851q qVar = C139851q.PROMO_MANAGER;
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        kVar.mo115294c(parse, (C139823j) iVar.build());
    }

    /* renamed from: c */
    public final void mo113514c(int i) {
        View findViewById = this.f373066j.requireView().findViewById(R.id.googleapp_tout_promo_content_layout);
        findViewById.animate().setListener(new C47759cx(this.f373061e, new C137094aw(this, i), "slide down animation")).translationY((float) findViewById.getHeight()).setDuration(195).start();
    }
}
