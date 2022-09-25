package com.google.android.libraries.lens.view.gleam;

import android.graphics.PointF;
import com.google.android.libraries.lens.view.gleam.C26559ej;
import com.google.android.libraries.lens.view.livingsurfaces.C27259r;
import com.google.android.libraries.lens.view.p2069am.C25293aa;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.gleam.dt */
/* compiled from: PG */
final class C26542dt implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C26540dr f72361a;

    public C26542dt(C26540dr drVar) {
        this.f72361a = drVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C26559ej.C26561b bVar2 = (C26559ej.C26561b) bVar;
        C26540dr drVar = this.f72361a;
        C26441a aVar = bVar2.f72421a;
        C25349y a = C25349y.m46667a(aVar.f71963a.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        drVar.f72338e.mo31801u(C58833ax.m90834k(Integer.valueOf(aVar.f71963a.f68845f)), bVar2.f72422b, false);
        if (a == C25349y.TEXT_GLEAM) {
            String str = (String) ((C26491bw) aVar).mo31742E(new PointF(bVar2.f72422b.x * ((float) drVar.f72356w.getWidth()), bVar2.f72422b.y * ((float) drVar.f72356w.getHeight()))).mo56111f();
            if (str != null) {
                drVar.f72345l.mo31873e(str);
            }
        } else if (aVar instanceof C26492bx) {
            C27259r rVar = ((C26492bx) aVar).f72173g;
            if (rVar != null) {
                rVar.mo32768h();
            }
        } else if ((a == C25349y.OUTDOOR_GLEAM || a == C25349y.GLEAM || a == C25349y.OBJECT_REGION_GLEAM || a == C25349y.BARCODE_GLEAM || a == C25349y.MATH_GLEAM) && (aVar instanceof C26447af)) {
            C25293aa aaVar = ((C26447af) aVar).f71963a.f68855p;
            if (aaVar == null) {
                aaVar = C25293aa.f68800c;
            }
            drVar.f72345l.mo31873e(aaVar.f68802a);
        }
        return C47392e.f123115a;
    }
}
