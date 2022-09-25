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

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.s */
/* compiled from: PG */
public final class C137125s {

    /* renamed from: a */
    public static final C59071e f373142a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.s");

    /* renamed from: b */
    public final Context f373143b;

    /* renamed from: c */
    public final C136969bx f373144c;

    /* renamed from: d */
    public final C137007dh f373145d;

    /* renamed from: e */
    public final C47449e f373146e;

    /* renamed from: f */
    public final C139824k f373147f;

    /* renamed from: g */
    public final C58495hd f373148g;

    /* renamed from: h */
    public boolean f373149h = true;

    /* renamed from: i */
    private final C137123q f373150i;

    /* renamed from: j */
    private final C137116j f373151j;

    public C137125s(C137123q qVar, C136969bx bxVar, C137116j jVar, Map map, C139824k kVar, C137007dh dhVar, C47449e eVar) {
        this.f373150i = qVar;
        this.f373143b = qVar.getContext();
        this.f373144c = bxVar;
        this.f373151j = jVar;
        this.f373148g = C58495hd.m89898l(map);
        this.f373146e = eVar;
        this.f373147f = kVar;
        this.f373145d = dhVar;
    }

    /* renamed from: a */
    public final void mo113541a() {
        this.f373149h = false;
        if (this.f373150i.getHost() != null) {
            this.f373150i.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo113542b(C63758o oVar) {
        if ((oVar.f172483a & 4) == 0) {
            try {
                this.f373151j.mo113536a(oVar);
                mo113541a();
            } catch (URISyntaxException unused) {
                mo113541a();
                this.f373144c.mo113456m(this.f373145d);
            }
            this.f373144c.mo113455l(this.f373145d);
            return;
        }
        C139824k kVar = this.f373147f;
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
