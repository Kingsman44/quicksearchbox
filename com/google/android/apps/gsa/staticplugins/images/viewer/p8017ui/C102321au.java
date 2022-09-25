package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.graphics.drawable.ColorDrawable;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64631b;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.au */
/* compiled from: PG */
public final /* synthetic */ class C102321au implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C102328ba f285570a;

    public /* synthetic */ C102321au(C102328ba baVar) {
        this.f285570a = baVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C60321oe oeVar;
        C102328ba baVar = this.f285570a;
        C64631b bVar = (C64631b) obj;
        if (C28295m.m52915a(baVar.f285581e) == null) {
            C28295m.m52919e(baVar.f285581e, new C28292j(21307));
            try {
                C60321oe a = C28285c.m52874a(baVar.f285581e, 472);
                if (a == null) {
                    oeVar = null;
                } else {
                    C60320od odVar = (C60320od) a.toBuilder();
                    if (!bVar.f175204f.isEmpty()) {
                        C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
                        C60220t b = C28294l.m52912b(bVar.f175204f);
                        qVar.copyOnWrite();
                        C60218r rVar = (C60218r) qVar.instance;
                        b.getClass();
                        rVar.f162928b = b;
                        rVar.f162927a |= 1;
                        odVar.copyOnWrite();
                        C60321oe oeVar2 = (C60321oe) odVar.instance;
                        C60218r rVar2 = (C60218r) qVar.build();
                        rVar2.getClass();
                        oeVar2.f163229d = rVar2;
                        oeVar2.f163226a |= 2;
                    }
                    if (!bVar.f175203e.isEmpty()) {
                        aql aql = (aql) aqm.f159760n.createBuilder();
                        String str = bVar.f175203e;
                        aql.copyOnWrite();
                        aqm aqm = (aqm) aql.instance;
                        str.getClass();
                        aqm.f159762a |= 2;
                        aqm.f159764c = str;
                        odVar.copyOnWrite();
                        C60321oe oeVar3 = (C60321oe) odVar.instance;
                        aqm aqm2 = (aqm) aql.build();
                        aqm2.getClass();
                        oeVar3.f163230e = aqm2;
                        oeVar3.f163226a |= 16;
                    }
                    if (bVar.f175211m && !bVar.f175204f.isEmpty() && !bVar.f175203e.isEmpty()) {
                        odVar.copyOnWrite();
                        C60321oe oeVar4 = (C60321oe) odVar.instance;
                        oeVar4.f163231f = 3;
                        oeVar4.f163226a |= 32;
                    }
                    oeVar = (C60321oe) odVar.build();
                }
                baVar.f285580d.mo93137d(oeVar);
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C102328ba.f285577a.mo56226d()).mo56382g(e)).mo56372aa(20770)).mo56386p("Could not log rootView with proper parenting.");
                baVar.f285580d.mo93135b(baVar.f285581e);
            }
            baVar.f285587k = true;
            baVar.mo93131e();
        }
        C65926d dVar = bVar.f175200b;
        if (dVar == null) {
            dVar = C65926d.f179289b;
        }
        baVar.f285586j = dVar;
        baVar.mo93131e();
        C102320at atVar = baVar.f285583g;
        if (atVar != null) {
            atVar.f285563c = baVar.f285586j;
            atVar.mo9178n();
        }
        baVar.f285582f.mo9162p(new ColorDrawable(bVar.f175207i ? baVar.f285579c.getResources().getColor(R.color.monet_viewer_fullscreen_background) : -1));
    }
}
