package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.widget.ImageView;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.C109037fg;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109211a;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109245s;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109246t;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109248v;
import com.google.android.apps.gsa.staticplugins.opa.util.C113870cy;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.assistant.p3897e.p3921j.C52152hd;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.bg */
/* compiled from: PG */
public final /* synthetic */ class C113961bg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C114071eg f315591a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f315592b;

    public /* synthetic */ C113961bg(C114071eg egVar, ImageView imageView) {
        this.f315591a = egVar;
        this.f315592b = imageView;
    }

    public final void run() {
        C109037fg fgVar;
        C114071eg egVar = this.f315591a;
        ImageView imageView = this.f315592b;
        if (egVar.f315982r.mo79746e(C90014bt.f247300eZ)) {
            egVar.mo101014cD(false, true);
            C109037fg fgVar2 = egVar.f315911bu;
            if (fgVar2 != null) {
                fgVar2.f303205a.mo97498bH(false, true, false, 18);
                fgVar2.f303205a.mo97452aN(true);
                C52152hd a = ((C113870cy) fgVar2.f303205a.f303374cf.mo27525b()).mo100735a();
                C113870cy cyVar = (C113870cy) fgVar2.f303205a.f303374cf.mo27525b();
                C113870cy.m188506b(a, fgVar2.f303205a.f303454s);
                return;
            }
            return;
        }
        if (!egVar.f315844ab && (fgVar = egVar.f315911bu) != null && !fgVar.f303205a.f303450o.mo95399aj()) {
            fgVar.f303205a.f303323bd.mo97611c();
            fgVar.f303205a.mo97499bI(true, 12);
        }
        imageView.setImageResource(egVar.mo100987aJ());
        C91097g gVar = egVar.f315799I;
        C109248v vVar = egVar.f315804N;
        C109245s j = C109246t.m181811j();
        j.mo97671b(true);
        ((C109211a) j).f304119f = (C50638an) egVar.f315836aT.build();
        j.mo97672c(egVar.f315832aP);
        gVar.mo65089a(vVar.mo97704a(j.mo97670a()));
    }
}
