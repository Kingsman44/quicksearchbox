package com.google.android.libraries.lens.view.gleam;

import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gleam.region.C26620k;
import com.google.android.libraries.lens.view.p2069am.C25310ar;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.render.C27661c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.libraries.lens.view.gleam.dn */
/* compiled from: PG */
public final /* synthetic */ class C26536dn implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26540dr f72326a;

    public /* synthetic */ C26536dn(C26540dr drVar) {
        this.f72326a = drVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26540dr drVar = this.f72326a;
        C25497ac acVar = (C25497ac) obj;
        C26620k c = drVar.mo31810c();
        if (c != null) {
            if (acVar.mo30525b()) {
                c.f72593f.setVisibility(0);
                c.f72593f.invalidate();
            } else {
                c.f72593f.mo31884j();
                c.f72593f.setVisibility(4);
            }
        }
        C26559ej ejVar = drVar.f72355v;
        boolean b = acVar.mo30525b();
        ejVar.f72382A = b;
        ObjectLayerView objectLayerView = (ObjectLayerView) ejVar.f72403i.findViewById(R.id.object_layer_view);
        objectLayerView.getClass();
        objectLayerView.f71942b = b;
        ejVar.f72420z = ejVar.f72404j.mo33727a();
        ejVar.f72420z.mo33726c();
        ScrimView scrimView = ejVar.f72411q;
        if (scrimView != null) {
            scrimView.f71948b = ejVar.f72382A;
            scrimView.mo31648a();
        }
        if (!b) {
            ejVar.f72384C = C25310ar.f68865c;
            C58485gu guVar = ejVar.f72398d.f72053b;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                ((C26447af) guVar.get(i2)).mo31679w();
            }
            ejVar.f72398d.f72053b = C58485gu.m89845m();
            ejVar.mo31827f();
        }
        C27661c cVar = drVar.f72353t;
        if (cVar != null) {
            cVar.mo33157d(acVar.mo30525b());
        }
        C26586ff ffVar = drVar.f72342i;
        ffVar.f72476c = acVar;
        ffVar.mo31853e();
        int ordinal = acVar.ordinal();
        if (ordinal == 0) {
            drVar.f72356w.setAlpha(0.0f);
            C27661c cVar2 = drVar.f72353t;
            if (cVar2 != null) {
                cVar2.mo33155b();
            }
        } else if (ordinal == 1 || ordinal == 2) {
            drVar.f72356w.animate().alpha(1.0f).setDuration(400);
        }
    }
}
