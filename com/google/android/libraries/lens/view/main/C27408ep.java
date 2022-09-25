package com.google.android.libraries.lens.view.main;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.gleam.C26441a;
import com.google.android.libraries.lens.view.gleam.C26540dr;
import com.google.android.libraries.lens.view.gleam.C26559ej;
import com.google.android.libraries.lens.view.gleam.region.C26614e;
import com.google.android.libraries.lens.view.gleam.region.C26616g;
import com.google.android.libraries.lens.view.gleam.region.C26620k;
import com.google.android.libraries.lens.view.gleam.region.C26625o;
import com.google.android.libraries.lens.view.gleam.region.RegionView;
import com.google.android.libraries.lens.view.p2066aj.C25190b;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2078at.C25516av;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.lens.view.main.ep */
/* compiled from: PG */
final class C27408ep implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27384dt f75045a;

    public C27408ep(C27384dt dtVar) {
        this.f75045a = dtVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C25516av avVar = (C25516av) bVar;
        C27384dt dtVar = this.f75045a;
        C25190b x = dtVar.mo32958x();
        if (dtVar.f74995o.mo31462g(C26239a.THINKING_GLEAMS_LOADING_STATE) && x != null && x.mo17754z().f68614d) {
            ((C59052c) ((C59052c) C27384dt.f74877a.mo56224b()).mo56372aa(49757)).mo56386p("Screen tapped during thinking gleams loading state");
        } else if (dtVar.f74919aO != null) {
            if (dtVar.f74892N.mo31203a().mo31194k()) {
                C26540dr a = dtVar.f74919aO.mo17754z();
                PointF pointF = avVar.f69478a;
                C26620k c = a.mo31810c();
                if (c != null) {
                    a.f72338e.mo31804x();
                    C26559ej ejVar = a.f72355v;
                    PointF pointF2 = new PointF(pointF.x * ((float) ejVar.f72403i.getWidth()), pointF.y * ((float) ejVar.f72403i.getHeight()));
                    C58833ax e = ejVar.mo31826e(pointF2.x, pointF2.y);
                    if (a.f72343j.mo31462g(C26239a.EDUCATION_PARAGRAPH_SELECTION_ENABLED) && a.f72340g.f70642a.f70649b.equals(C25980d.EDUCATION) && e.mo56113h()) {
                        C25349y a2 = C25349y.m46667a(((C26441a) e.mo56107c()).f71963a.f68848i);
                        if (a2 == null) {
                            a2 = C25349y.UNRECOGNIZED;
                        }
                        if (a2 == C25349y.TEXT_GLEAM) {
                            a.f72356w.performHapticFeedback(1);
                            RectF rectF = new RectF(((C26441a) e.mo56107c()).mo31654d(0.0f));
                            c.mo31904b(C58833ax.m90834k(new RectF(rectF.left / ((float) a.f72356w.getWidth()), rectF.top / ((float) a.f72356w.getHeight()), rectF.right / ((float) a.f72356w.getWidth()), rectF.bottom / ((float) a.f72356w.getHeight()))));
                        }
                    }
                    RegionView regionView = c.f72593f;
                    c.mo31905c(C26614e.m49159f(C26625o.m49192b(pointF, regionView.f72547f, regionView.getContext())).mo31892a());
                    C47393f.m84236g(new C26616g(false), c.f72588a);
                }
            } else if (!dtVar.f74995o.mo31462g(C26239a.SELECTION_STATE_ENABLED) || !dtVar.f74995o.mo31462g(C26239a.SELECTION_STATE_SCREEN_TAP_DISABLED)) {
                C26540dr a3 = dtVar.f74919aO.mo17754z();
                a3.f72338e.mo31801u(C58836b.f156633a, avVar.f69478a, false);
            }
        }
        return C47392e.f123115a;
    }
}
