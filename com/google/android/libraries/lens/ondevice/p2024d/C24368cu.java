package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24282h;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2034k.C24591cb;
import com.google.android.libraries.lens.ondevice.p2034k.C24601cl;
import com.google.android.libraries.lens.ondevice.p2034k.C24623dg;
import com.google.android.libraries.lens.ondevice.p2034k.C24630dn;
import com.google.android.libraries.lens.ondevice.p2034k.C24631do;
import com.google.android.libraries.lens.ondevice.p2034k.C24657en;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.lens.ondevice.d.cu */
/* compiled from: PG */
public final class C24368cu implements C24419m {

    /* renamed from: a */
    private final C24623dg f66751a;

    public C24368cu(C24623dg dgVar) {
        this.f66751a = dgVar;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        ((C58970a) ((C58970a) C24369cv.f66752b.mo56224b()).mo56372aa(48765)).mo56386p("Running PageLayout Cascade");
        C58838bb.m90884s(sVar.mo29867b().mo56113h(), "CascadeInputContext must include a LodeResourceHolder instance.");
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C24623dg dgVar = this.f66751a;
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
        C24312as asVar = new C24312as(dVar, dgVar, bitmap, lodeResourceHolder, hVar, C58495hd.m89901o(b, a, b2, c2.mo29965a()));
        C60870cx gq = asVar.f66495a.mo60297gq();
        C24366cs csVar = C24366cs.f66749a;
        C60870cx h = C60922j.m93045h(gq, C47810es.m84966f(csVar), C60826bg.f164896a);
        C60870cx gq2 = asVar.f66496b.mo60297gq();
        C24367ct ctVar = C24367ct.f66750a;
        C60870cx h2 = C60922j.m93045h(gq2, C47810es.m84966f(ctVar), C60826bg.f164896a);
        C24283a aVar = new C24283a();
        aVar.mo29852l(h);
        aVar.mo29853m(h2);
        aVar.f66332a = h;
        return aVar.mo29824a();
    }
}
