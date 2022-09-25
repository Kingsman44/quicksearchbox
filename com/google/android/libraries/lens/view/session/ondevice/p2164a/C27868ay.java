package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import android.graphics.Bitmap;
import android.util.Size;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.view.session.ondevice.C27970h;
import com.google.android.libraries.lens.view.session.ondevice.C27971i;
import com.google.android.libraries.lens.view.session.ondevice.C28014w;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62331d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.ay */
/* compiled from: PG */
final class C27868ay implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C56244ay f75951a;

    /* renamed from: b */
    final /* synthetic */ Bitmap f75952b;

    /* renamed from: c */
    final /* synthetic */ C27877bg f75953c;

    public C27868ay(C27877bg bgVar, C56244ay ayVar, Bitmap bitmap) {
        this.f75953c = bgVar;
        this.f75951a = ayVar;
        this.f75952b = bitmap;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C27877bg.f75975a.mo56226d()).mo56382g(th)).mo56372aa(50020)).mo56388r("Failed to process request %d", this.f75951a.f149805b);
        C28014w wVar = this.f75953c.f75981g;
        C56244ay ayVar = this.f75951a;
        C27970h n = C27971i.m52077n();
        n.mo33308b(true);
        wVar.mo33463b(ayVar, n.mo33307a());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C60870cx cxVar;
        C24288f fVar = (C24288f) obj;
        C27877bg bgVar = this.f75953c;
        C56244ay ayVar = this.f75951a;
        Size size = new Size(this.f75952b.getWidth(), this.f75952b.getHeight());
        if (!bgVar.f75980f.mo56113h()) {
            ((C58970a) ((C58970a) C27877bg.f75975a.mo56226d()).mo56372aa(50039)).mo56386p("Ignoring result since currentCascadeConfig is null");
            return;
        }
        C62331d d = ((C27891h) bgVar.f75980f.mo56107c()).mo33347d();
        if (d == C62331d.TRANSLATE_OCR_CASCADE || d == C62331d.SPLIT_OCR_CASCADE || d == C62331d.STANDALONE_OCR_CASCADE || d == C62331d.PAGE_LAYOUT_CASCADE) {
            C24286d h = fVar.mo29840h();
            C24286d i = fVar.mo29842i();
            if (h == null || i == null) {
                ((C58970a) ((C58970a) C27877bg.f75975a.mo56226d()).mo56372aa(50041)).mo56386p("No TextImage or TextimageStats results returned from engine");
                C28014w wVar = bgVar.f75981g;
                C27970h n = C27971i.m52077n();
                n.mo33308b(true);
                wVar.mo33463b(ayVar, n.mo33307a());
            } else {
                C60870cx a = C47638k.m84751b(h.mo29848a(), i.mo29848a()).mo51520a(new C27858ao(h, i), C60826bg.f164896a);
                C27873bc bcVar = new C27873bc(bgVar, ayVar);
                C60856cj.m92911t(a, C47810es.m84974n(bcVar), C60826bg.f164896a);
            }
        }
        if (d == C62331d.SPLIT_OCR_CASCADE) {
            C24286d a2 = fVar.mo29832a();
            if (a2 == null) {
                ((C58970a) ((C58970a) C27877bg.f75975a.mo56226d()).mo56372aa(50038)).mo56386p("No DetectionBoxes result returned from engine");
            } else {
                C60870cx a3 = a2.mo29848a();
                C27875be beVar = new C27875be(bgVar, ayVar);
                C60856cj.m92911t(a3, C47810es.m84974n(beVar), C60826bg.f164896a);
            }
        }
        if (d == C62331d.HINT_CASCADE || d == C62331d.HINT_WITH_RECONCILIATION_CASCADE || d == C62331d.HINT_WITH_REGION_CASCADE) {
            C24286d b = fVar.mo29833b();
            C24286d k = fVar.mo29844k();
            C24286d g = fVar.mo29839g();
            C60870cx l = fVar.mo29845l();
            C27871ba baVar = new C27871ba(bgVar, ayVar, b, k, g, size);
            C60856cj.m92911t(l, C47810es.m84974n(baVar), C60826bg.f164896a);
        }
        if (d == C62331d.TRANSLATE_FULL_PAGE_LAYOUT_CASCADE || d == C62331d.GANSLATE_CASCADE) {
            C24286d e = fVar.mo29836e();
            C24286d j = fVar.mo29843j();
            C24286d d2 = fVar.mo29835d();
            C24286d i2 = fVar.mo29842i();
            if (e == null || j == null || i2 == null) {
                ((C58970a) ((C58970a) C27877bg.f75975a.mo56226d()).mo56372aa(50040)).mo56386p("No ParagraphList or TranslateResult or TextImageStats returned from engine");
                C28014w wVar2 = bgVar.f75981g;
                C27970h n2 = C27971i.m52077n();
                n2.mo33308b(true);
                wVar2.mo33463b(ayVar, n2.mo33307a());
            } else {
                C60870cx[] cxVarArr = new C60870cx[4];
                cxVarArr[0] = e.mo29848a();
                cxVarArr[1] = j.mo29848a();
                cxVarArr[2] = i2.mo29848a();
                if (d2 != null) {
                    cxVar = d2.mo29848a();
                } else {
                    cxVar = C60866ct.f164955a;
                }
                cxVarArr[3] = cxVar;
                C60870cx a4 = C47638k.m84751b(cxVarArr).mo51520a(new C27864au(e, j, i2, d2), C60826bg.f164896a);
                C27874bd bdVar = new C27874bd(bgVar, ayVar);
                C60856cj.m92911t(a4, C47810es.m84974n(bdVar), C60826bg.f164896a);
            }
        }
        if (d == C62331d.EMBEDDING_CASCADE) {
            C24286d c = fVar.mo29834c();
            C60870cx l2 = fVar.mo29845l();
            C27872bb bbVar = new C27872bb(bgVar, ayVar, c);
            C60856cj.m92911t(l2, C47810es.m84974n(bbVar), C60826bg.f164896a);
        }
    }
}
