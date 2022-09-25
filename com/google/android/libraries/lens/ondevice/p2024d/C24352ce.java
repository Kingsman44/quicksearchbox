package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2034k.C24670f;
import com.google.android.libraries.lens.ondevice.p2034k.C24697g;
import com.google.android.libraries.lens.ondevice.p2034k.C24748r;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;

/* renamed from: com.google.android.libraries.lens.ondevice.d.ce */
/* compiled from: PG */
public final class C24352ce implements C24419m {

    /* renamed from: a */
    private final C24748r f66727a;

    /* renamed from: b */
    private final C24670f f66728b;

    /* renamed from: c */
    private final C24697g f66729c;

    public C24352ce(C24670f fVar, C24697g gVar, C24748r rVar) {
        this.f66728b = fVar;
        this.f66729c = gVar;
        this.f66727a = rVar;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C24670f fVar2 = this.f66728b;
        C24697g gVar = this.f66729c;
        C24748r rVar = this.f66727a;
        rVar.getClass();
        C56220aa aaVar = (C56220aa) fVar.mo29813e().mo56108d(C24351cd.f66726a);
        aaVar.getClass();
        C60870cx gq = new C24301ah(dVar, fVar2, gVar, rVar, bitmap, aaVar).f66422a.mo60297gq();
        C24283a aVar = new C24283a();
        aVar.mo29851k(gq);
        aVar.mo29825b(gq);
        return aVar.mo29824a();
    }
}
