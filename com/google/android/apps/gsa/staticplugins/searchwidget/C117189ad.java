package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.shared.service.p6935b.aav;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaw;
import com.google.android.apps.gsa.search.shared.service.p6935b.aax;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6995aq.C89267j;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.base.C58827ar;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.ad */
/* compiled from: PG */
public final /* synthetic */ class C117189ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C117204as f325311a;

    /* renamed from: b */
    public final /* synthetic */ boolean f325312b;

    /* renamed from: c */
    public final /* synthetic */ C89267j f325313c;

    /* renamed from: d */
    public final /* synthetic */ boolean f325314d;

    /* renamed from: e */
    public final /* synthetic */ long f325315e;

    /* renamed from: f */
    public final /* synthetic */ List f325316f;

    public /* synthetic */ C117189ad(C117204as asVar, boolean z, C89267j jVar, boolean z2, long j, List list) {
        this.f325311a = asVar;
        this.f325312b = z;
        this.f325313c = jVar;
        this.f325314d = z2;
        this.f325315e = j;
        this.f325316f = list;
    }

    public final C60870cx apply(Object obj) {
        C117204as asVar = this.f325311a;
        boolean z = this.f325312b;
        C89267j jVar = this.f325313c;
        boolean z2 = this.f325314d;
        long j = this.f325315e;
        List list = this.f325316f;
        Void voidR = (Void) obj;
        if (z) {
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.HINT_TEXT_RENDER_FINISH;
            if (jVar != null) {
                C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
                String str = jVar.f242043c;
                ajVar.copyOnWrite();
                C59687cb cbVar = (C59687cb) ajVar.instance;
                str.getClass();
                cbVar.f160122c |= 33554432;
                cbVar.f160065aC = str;
                fVar.f246203c = (C59687cb) ajVar.build();
            }
            ((C89859i) asVar.f325358l.mo27525b()).mo74236a(fVar.mo83699a());
        }
        if (z2) {
            asVar.mo103190i();
        } else if (jVar != null) {
            C86337q b = asVar.f325349c.mo80076b();
            b.mo80068c("search_widget_hint_text_update_context", jVar.toByteArray());
            b.mo80072g("search_widget_hint_text_update_timestamp", TimeUnit.MILLISECONDS.toSeconds(asVar.f325356j.mo26870b()));
            b.apply();
            String d = new C58827ar(",").mo56097d(list);
            C118561t tVar = (C118561t) asVar.f325359m.mo27525b();
            tVar.mo103752c(C118522by.CLEAR_SEARCHBOX_WIDGET);
            C118522by byVar = C118522by.CLEAR_SEARCHBOX_WIDGET;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            long millis = TimeUnit.SECONDS.toMillis(j);
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 1;
            agVar.f328822b = millis;
            long millis2 = TimeUnit.MINUTES.toMillis(1);
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328821a |= 2;
            agVar2.f328823c = millis2;
            C118475aj ajVar2 = (C118475aj) C118476ak.f328838a.createBuilder();
            C62940bt btVar = aax.f237113a;
            aav aav = (aav) aaw.f237108d.createBuilder();
            aav.copyOnWrite();
            aaw aaw = (aaw) aav.instance;
            aaw.f237110a |= 1;
            aaw.f237111b = d;
            aav.copyOnWrite();
            aaw aaw2 = (aaw) aav.instance;
            aaw2.f237112c = jVar;
            aaw2.f237110a |= 2;
            ajVar2.mo58885m(btVar, (aaw) aav.build());
            afVar.copyOnWrite();
            C118472ag agVar3 = (C118472ag) afVar.instance;
            C118476ak akVar = (C118476ak) ajVar2.build();
            akVar.getClass();
            agVar3.f328827g = akVar;
            agVar3.f328821a |= 32;
            tVar.mo103754e(byVar, (C118472ag) afVar.build());
        }
        return C60866ct.f164955a;
    }
}
