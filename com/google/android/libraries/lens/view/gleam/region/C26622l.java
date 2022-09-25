package com.google.android.libraries.lens.view.gleam.region;

import android.graphics.RectF;
import com.google.android.libraries.lens.view.p2078at.C25498ad;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60901do;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.gleam.region.l */
/* compiled from: PG */
final class C26622l implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C26620k f72598a;

    public C26622l(C26620k kVar) {
        this.f72598a = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C26610a aVar = (C26610a) bVar;
        C26620k kVar = this.f72598a;
        RectF rectF = aVar.f72567a;
        RegionView regionView = kVar.f72593f;
        C26613d f = C26614e.m49159f(rectF);
        ((C26611b) f).f72570c = 1;
        f.mo31894c(false);
        regionView.mo31886m(f.mo31892a());
        kVar.f72589b.mo30528a(C25498ad.REGION);
        C60872cz czVar = kVar.f72594g;
        if (czVar != null) {
            czVar.cancel(false);
        }
        kVar.f72594g = kVar.f72590c.mo29164d(C60901do.f165001a, 2, TimeUnit.SECONDS);
        kVar.f72591d.mo50445g(C46438d.m82810b(kVar.f72594g), new C46436b(aVar.f72567a), kVar.f72592e);
        return C47392e.f123115a;
    }
}
