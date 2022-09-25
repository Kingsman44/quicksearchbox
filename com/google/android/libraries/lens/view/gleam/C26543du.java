package com.google.android.libraries.lens.view.gleam;

import android.graphics.PointF;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.gleam.ObjectLayerView;
import com.google.android.libraries.lens.view.gleam.region.C26611b;
import com.google.android.libraries.lens.view.gleam.region.C26613d;
import com.google.android.libraries.lens.view.gleam.region.C26614e;
import com.google.android.libraries.lens.view.gleam.region.C26615f;
import com.google.android.libraries.lens.view.gleam.region.C26616g;
import com.google.android.libraries.lens.view.gleam.region.C26620k;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.gleam.du */
/* compiled from: PG */
final class C26543du implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C26540dr f72362a;

    public C26543du(C26540dr drVar) {
        this.f72362a = drVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C58833ax axVar;
        ObjectLayerView.C26440a aVar = (ObjectLayerView.C26440a) bVar;
        C26540dr drVar = this.f72362a;
        C26441a aVar2 = aVar.f71945a;
        C25349y a = C25349y.m46667a(aVar2.f71963a.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        if (drVar.f72350q && a != C25349y.NONE) {
            drVar.f72338e.mo31801u(C58833ax.m90834k(Integer.valueOf(aVar2.f71963a.f68845f)), aVar.f71946b, true);
        } else if (drVar.f72351r) {
            C26526dd ddVar = drVar.f72338e;
            int i = aVar2.f71963a.f68845f;
            PointF pointF = aVar.f71946b;
            C58833ax c = ddVar.f72296f.mo30769c(i);
            if (c.mo56113h()) {
                ddVar.f72296f.mo30777k();
                C26615f fVar = ddVar.f72302l;
                fVar.getClass();
                C26613d f = C26614e.m49159f(((C26504ci) c.mo56107c()).mo31759c());
                if (ddVar.f72280C) {
                    axVar = C58833ax.m90834k(pointF);
                } else {
                    axVar = C58836b.f156633a;
                }
                ((C26611b) f).f72569b = axVar;
                C26614e a2 = f.mo31892a();
                C24231w wVar = C24231w.OBJECT;
                C26620k kVar = (C26620k) fVar;
                kVar.mo31905c(a2);
                C47393f.m84236g(new C26616g(wVar), kVar.f72588a);
                ((C26504ci) c.mo56107c()).f72224r = true;
                ddVar.mo31805y();
            }
        }
        return C47392e.f123115a;
    }
}
