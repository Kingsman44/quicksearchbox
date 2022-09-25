package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89321y;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4985f.p4988b.p4992c.C64756d;
import com.google.protos.p4985f.p4988b.p4992c.C64761i;
import com.google.protos.p4985f.p4988b.p4992c.C64763k;
import com.google.protos.p4985f.p4988b.p4992c.C64765m;
import com.google.protos.p4985f.p4988b.p4992c.C64767o;
import com.google.protos.p4985f.p4988b.p4992c.C64768p;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.cm */
/* compiled from: PG */
public final /* synthetic */ class C115270cm implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C115273cp f319839a;

    /* renamed from: b */
    public final /* synthetic */ C64768p f319840b;

    /* renamed from: c */
    public final /* synthetic */ C89321y f319841c;

    public /* synthetic */ C115270cm(C115273cp cpVar, C64768p pVar, C89321y yVar) {
        this.f319839a = cpVar;
        this.f319840b = pVar;
        this.f319841c = yVar;
    }

    public final void run() {
        C115273cp cpVar = this.f319839a;
        C64768p pVar = this.f319840b;
        C89321y yVar = this.f319841c;
        C23251a aVar = (C23251a) cpVar.f319846a.f319849c.mo102001e();
        int i = yVar.f242162a;
        int i2 = yVar.f242163b;
        C58480gp e = C58485gu.m89837e();
        int i3 = 0;
        for (C64761i iVar : pVar.f175566a) {
            C64763k kVar = iVar.f175551d;
            if (kVar == null) {
                kVar = C64763k.f175552b;
            }
            for (C64767o oVar : kVar.f175554a) {
                C64765m mVar = oVar.f175562b;
                if (mVar == null) {
                    mVar = C64765m.f175555b;
                }
                int i4 = mVar.f175557a + i3;
                if (i4 >= i && i4 <= i2) {
                    C64756d dVar = oVar.f175561a;
                    if (dVar == null) {
                        dVar = C64756d.f175537f;
                    }
                    e.mo55395g(dVar);
                }
            }
            i3++;
        }
        aVar.mo28730f(e.mo55394f(), false);
    }
}
