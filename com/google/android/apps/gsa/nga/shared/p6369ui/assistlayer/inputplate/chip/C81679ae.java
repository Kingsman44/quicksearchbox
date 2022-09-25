package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28294l;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.ae */
/* compiled from: PG */
final class C81679ae implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ String f223390a;

    /* renamed from: b */
    final /* synthetic */ RecyclerView f223391b;

    /* renamed from: c */
    final /* synthetic */ C81682ah f223392c;

    public C81679ae(C81682ah ahVar, String str, RecyclerView recyclerView) {
        this.f223392c = ahVar;
        this.f223390a = str;
        this.f223391b = recyclerView;
    }

    public final void onGlobalLayout() {
        C60321oe b;
        C81681ag agVar = this.f223392c.f223401b;
        String str = this.f223390a;
        if (!agVar.f223397e) {
            agVar.f223397e = true;
            C81714t tVar = ((C81678ad) agVar.f223394b).f223389a.f223373c;
            if (tVar != null) {
                int i = agVar.f223393a;
                C58480gp e = C58485gu.m89837e();
                for (int i2 = 0; i2 < tVar.f223462a.size(); i2++) {
                    e.mo55395g(tVar.mo75233a(i2));
                }
                agVar.f223398f = C28293k.m52907d(new C28292j(i), e.mo55394f());
                ((C59052c) ((C59052c) C81682ah.f223400a.mo56224b()).mo56372aa(6211)).mo56389s("ve parent id is: %s", str);
                if (str == null) {
                    C28293k kVar = agVar.f223398f;
                    View view = (View) agVar.f223396d.get();
                    if (kVar != null) {
                        agVar.mo75234e(C28285c.m52876c(kVar, view));
                    }
                } else {
                    C28293k kVar2 = agVar.f223398f;
                    ((C59052c) ((C59052c) C81682ah.f223400a.mo56224b()).mo56372aa(6200)).mo56354G("logGraftInsert, veTreeNode: %s, veParentId: %s", kVar2, str);
                    if (!(kVar2 == null || (b = C28285c.m52875b(kVar2, 472)) == null)) {
                        try {
                            C60320od odVar = (C60320od) b.toBuilder();
                            C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
                            C60220t b2 = C28294l.m52912b(str);
                            qVar.copyOnWrite();
                            C60218r rVar = (C60218r) qVar.instance;
                            b2.getClass();
                            rVar.f162928b = b2;
                            rVar.f162927a |= 1;
                            C60218r rVar2 = (C60218r) qVar.build();
                            odVar.copyOnWrite();
                            C60321oe oeVar = (C60321oe) odVar.instance;
                            rVar2.getClass();
                            oeVar.f163229d = rVar2;
                            oeVar.f163226a |= 2;
                            aql aql = (aql) aqm.f159760n.createBuilder();
                            aql.copyOnWrite();
                            aqm aqm = (aqm) aql.instance;
                            aqm.f159762a |= 16;
                            aqm.f159767f = 0;
                            aql.copyOnWrite();
                            aqm aqm2 = (aqm) aql.instance;
                            aqm2.f159762a |= 8;
                            aqm2.f159766e = 0;
                            aql.copyOnWrite();
                            aqm aqm3 = (aqm) aql.instance;
                            aqm3.f159762a |= 4;
                            aqm3.f159765d = 23263;
                            odVar.copyOnWrite();
                            C60321oe oeVar2 = (C60321oe) odVar.instance;
                            aqm aqm4 = (aqm) aql.build();
                            aqm4.getClass();
                            oeVar2.f163230e = aqm4;
                            oeVar2.f163226a |= 16;
                            odVar.copyOnWrite();
                            C60321oe oeVar3 = (C60321oe) odVar.instance;
                            oeVar3.f163231f = 3;
                            oeVar3.f163226a |= 32;
                            agVar.mo75234e((C60321oe) odVar.build());
                        } catch (IOException e2) {
                            ((C59052c) ((C59052c) ((C59052c) C81682ah.f223400a.mo56226d()).mo56382g(e2)).mo56372aa(6201)).mo56386p("Failed to graft chip container into assistant server query root");
                        }
                    }
                }
            }
        }
        this.f223391b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
