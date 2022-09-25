package com.google.android.libraries.lens.view.gleam;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.p2087ay.C25617a;
import com.google.android.libraries.lens.view.p2087ay.C25624ag;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.gleam.dp */
/* compiled from: PG */
public final /* synthetic */ class C26538dp implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26540dr f72328a;

    public /* synthetic */ C26538dp(C26540dr drVar) {
        this.f72328a = drVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C58833ax axVar;
        C26540dr drVar = this.f72328a;
        C26583fc fcVar = (C26583fc) obj;
        C26559ej ejVar = drVar.f72355v;
        ejVar.f72388G.f72086i = fcVar.mo31847b();
        C26463av avVar = ejVar.f72388G;
        avVar.f72082e.set(fcVar.mo31846a());
        avVar.f72083f.left = avVar.f72082e.left + avVar.f72081d;
        avVar.f72083f.top = avVar.f72082e.top + avVar.f72081d;
        avVar.f72083f.right = avVar.f72082e.right - avVar.f72081d;
        avVar.f72083f.bottom = avVar.f72082e.bottom - avVar.f72081d;
        ejVar.f72388G.f72085h = fcVar.mo31848c();
        C26447af afVar = ejVar.f72390I;
        if (afVar != null) {
            afVar.mo31682z(afVar.f71963a.f68853n);
        }
        ejVar.f72390I = null;
        ejVar.mo31827f();
        C26526dd ddVar = drVar.f72338e;
        if (fcVar.mo31847b()) {
            axVar = C58833ax.m90834k(drVar.f72342i.mo31851c());
        } else {
            axVar = C58836b.f156633a;
        }
        C25624ag agVar = ddVar.f72297g;
        if (agVar.f69702e.f70642a.f70649b != C25980d.OUTDOOR || !axVar.mo56113h() || agVar.f69708k == null) {
            agVar.f69709l = null;
        } else {
            Rect b = agVar.f69707j.mo30733b();
            RectF rectF = (RectF) axVar.mo56107c();
            float f = (float) (b.right - b.left);
            float f2 = (float) (b.bottom - b.top);
            Rect rect = new Rect((int) (rectF.left * f), (int) (rectF.top * f2), (int) (rectF.right * f), (int) (rectF.bottom * f2));
            C25617a aVar = new C25617a();
            if (b != null) {
                aVar.f69680a = b;
                aVar.f69682c = 2;
                aVar.f69681b = rect;
                agVar.f69707j = aVar.mo30728a();
                agVar.mo30735f(agVar.f69707j);
            } else {
                throw new NullPointerException("Null imageRegion");
            }
        }
        drVar.mo31814g((C26447af) null);
    }
}
