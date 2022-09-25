package com.google.android.libraries.lens.view.p2113h.p2122e;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.google.android.libraries.lens.view.main.C27318bh;
import com.google.android.libraries.lens.view.main.C27320bj;
import com.google.android.libraries.lens.view.main.C27321bk;
import com.google.android.libraries.lens.view.main.C27327bq;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26750b;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aae;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.h.e.s */
/* compiled from: PG */
public final /* synthetic */ class C26808s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26784ai f73079a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f73080b;

    /* renamed from: c */
    public final /* synthetic */ C28097c f73081c;

    /* renamed from: d */
    public final /* synthetic */ RectF f73082d;

    public /* synthetic */ C26808s(C26784ai aiVar, Bitmap bitmap, C28097c cVar, RectF rectF) {
        this.f73079a = aiVar;
        this.f73080b = bitmap;
        this.f73081c = cVar;
        this.f73082d = rectF;
    }

    public final void run() {
        C26784ai aiVar = this.f73079a;
        Bitmap bitmap = this.f73080b;
        C28097c cVar = this.f73081c;
        RectF rectF = this.f73082d;
        C27321bk bkVar = aiVar.f72999aa;
        if (bkVar != null) {
            C26750b bVar = cVar.f76490h;
            bVar.getClass();
            C26733ab abVar = cVar.f76485c;
            aae aae = cVar.f76496n;
            aae.getClass();
            C58833ax axVar = cVar.f76495m;
            if (!bVar.mo32087h()) {
                C59071e eVar = C27327bq.f74753a;
            } else {
                C59071e eVar2 = C27327bq.f74753a;
                C60870cx b = bkVar.f74748a.f74763I.mo51512b(new C27318bh(bkVar, bVar, bitmap, rectF, abVar, aae, axVar), C60826bg.f164896a);
                C27320bj bjVar = new C27320bj();
                C60856cj.m92911t(b, C47810es.m84974n(bjVar), bkVar.f74748a.f74799d);
            }
        }
        aiVar.mo32154x(new C26797h());
    }
}
