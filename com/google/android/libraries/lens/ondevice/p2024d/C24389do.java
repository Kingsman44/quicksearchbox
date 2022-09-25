package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24282h;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2026f.C24491t;
import com.google.android.libraries.lens.ondevice.p2034k.C24555at;
import com.google.android.libraries.lens.ondevice.p2034k.C24591cb;
import com.google.android.libraries.lens.ondevice.p2034k.C24601cl;
import com.google.android.libraries.lens.ondevice.p2034k.C24623dg;
import com.google.android.libraries.lens.ondevice.p2034k.C24630dn;
import com.google.android.libraries.lens.ondevice.p2034k.C24631do;
import com.google.android.libraries.lens.ondevice.p2034k.C24657en;
import com.google.android.libraries.lens.ondevice.p2034k.C24735hk;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.lens.ondevice.d.do */
/* compiled from: PG */
public final class C24389do implements C24419m {

    /* renamed from: a */
    private final C24555at f66790a;

    /* renamed from: b */
    private final C24735hk f66791b;

    /* renamed from: c */
    private final C24491t f66792c;

    /* renamed from: d */
    private final C24623dg f66793d;

    public C24389do(C24555at atVar, C24735hk hkVar, C24623dg dgVar, C24491t tVar) {
        this.f66790a = atVar;
        this.f66791b = hkVar;
        this.f66793d = dgVar;
        this.f66792c = tVar;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        ((C58970a) ((C58970a) C24390dp.f66794b.mo56224b()).mo56372aa(48776)).mo56386p("Running Translate Full Cascade");
        C24555at atVar = this.f66790a;
        atVar.getClass();
        C24735hk hkVar = this.f66791b;
        hkVar.getClass();
        C24491t tVar = this.f66792c;
        tVar.getClass();
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C24623dg dgVar = this.f66793d;
        dgVar.getClass();
        LodeResourceHolder lodeResourceHolder = (LodeResourceHolder) sVar.mo29867b().mo56107c();
        lodeResourceHolder.getClass();
        C24282h hVar = (C24282h) fVar.mo29811c().mo56109e(C24282h.f66331a);
        hVar.getClass();
        String b = C24657en.m45762b(C24601cl.class);
        C24630dn c = C24631do.m45725c();
        c.mo29966b(true);
        C24631do a = c.mo29965a();
        String b2 = C24657en.m45762b(C24591cb.class);
        C24630dn c2 = C24631do.m45725c();
        c2.mo29967c(true);
        C24324bd bdVar = new C24324bd(dVar, atVar, hkVar, dgVar, bitmap, lodeResourceHolder, tVar, hVar, C58495hd.m89901o(b, a, b2, c2.mo29965a()));
        C60870cx gq = bdVar.f66595b.mo60297gq();
        C60870cx gq2 = bdVar.f66594a.mo60297gq();
        C60870cx gq3 = bdVar.f66596c.mo60297gq();
        C24387dm dmVar = C24387dm.f66788a;
        C60870cx h = C60922j.m93045h(gq3, C47810es.m84966f(dmVar), C60826bg.f164896a);
        C60870cx gq4 = bdVar.f66597d.mo60297gq();
        C24388dn dnVar = C24388dn.f66789a;
        C60870cx h2 = C60922j.m93045h(gq4, C47810es.m84966f(dnVar), C60826bg.f164896a);
        C24283a aVar = new C24283a();
        aVar.mo29849i(gq);
        aVar.mo29854n(gq2);
        aVar.mo29853m(h);
        aVar.mo29852l(h2);
        aVar.mo29825b(gq2);
        return aVar.mo29824a();
    }
}
