package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.common.p2000c.C24105b;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24282h;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2026f.C24491t;
import com.google.android.libraries.lens.ondevice.p2034k.C24551ap;
import com.google.android.libraries.lens.ondevice.p2034k.C24591cb;
import com.google.android.libraries.lens.ondevice.p2034k.C24601cl;
import com.google.android.libraries.lens.ondevice.p2034k.C24623dg;
import com.google.android.libraries.lens.ondevice.p2034k.C24630dn;
import com.google.android.libraries.lens.ondevice.p2034k.C24631do;
import com.google.android.libraries.lens.ondevice.p2034k.C24657en;
import com.google.android.libraries.lens.ondevice.p2034k.C24735hk;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.lens.ondevice.d.bv */
/* compiled from: PG */
public final class C24342bv implements C24419m {

    /* renamed from: a */
    private final C24735hk f66707a;

    /* renamed from: b */
    private final C24551ap f66708b;

    /* renamed from: c */
    private final C24491t f66709c;

    /* renamed from: d */
    private final C24623dg f66710d;

    /* renamed from: e */
    private final C58833ax f66711e;

    public C24342bv(C24735hk hkVar, C24551ap apVar, C24623dg dgVar, C24491t tVar, C58833ax axVar) {
        this.f66707a = hkVar;
        this.f66708b = apVar;
        this.f66710d = dgVar;
        this.f66709c = tVar;
        this.f66711e = axVar;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        ((C58970a) ((C58970a) C24343bw.f66712b.mo56224b()).mo56372aa(48763)).mo56386p("Running Ganslate Cascade");
        C24735hk hkVar = this.f66707a;
        hkVar.getClass();
        C24551ap apVar = this.f66708b;
        apVar.getClass();
        this.f66709c.getClass();
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C24623dg dgVar = this.f66710d;
        dgVar.getClass();
        LodeResourceHolder lodeResourceHolder = (LodeResourceHolder) sVar.mo29867b().mo56107c();
        lodeResourceHolder.getClass();
        C58833ax axVar = this.f66711e;
        axVar.getClass();
        C24282h hVar = (C24282h) fVar.mo29811c().mo56109e(C24282h.f66331a);
        hVar.getClass();
        String b = C24657en.m45762b(C24601cl.class);
        C24630dn c = C24631do.m45725c();
        c.mo29966b(true);
        C24631do a = c.mo29965a();
        String b2 = C24657en.m45762b(C24591cb.class);
        C24630dn c2 = C24631do.m45725c();
        c2.mo29967c(true);
        C24295ab abVar = new C24295ab(dVar, hkVar, apVar, dgVar, bitmap, lodeResourceHolder, axVar, hVar, C58495hd.m89901o(b, a, b2, c2.mo29965a()));
        if (this.f66711e.mo56113h()) {
            ((C24105b) this.f66711e.mo56107c()).mo29501d();
        }
        C60870cx gq = abVar.f66377b.mo60297gq();
        C60870cx gq2 = abVar.f66376a.mo60297gq();
        C60870cx gq3 = abVar.f66378c.mo60297gq();
        C24340bt btVar = C24340bt.f66705a;
        C60870cx h = C60922j.m93045h(gq3, C47810es.m84966f(btVar), C60826bg.f164896a);
        C60870cx h2 = C60922j.m93045h(abVar.f66379d.mo60297gq(), C24341bu.f66706a, C60826bg.f164896a);
        C60870cx gq4 = abVar.f66380e.mo60297gq();
        C24283a aVar = new C24283a();
        aVar.mo29849i(gq);
        aVar.mo29854n(gq2);
        aVar.mo29853m(h);
        aVar.mo29852l(h2);
        aVar.f66334c = new C24286d(gq4);
        aVar.mo29825b(gq2);
        return aVar.mo29824a();
    }
}
