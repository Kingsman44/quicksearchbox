package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.opaonboarding.C83871ae;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ht */
/* compiled from: PG */
public final /* synthetic */ class C96278ht implements C83871ae {

    /* renamed from: a */
    public final /* synthetic */ C96283hy f269443a;

    public /* synthetic */ C96278ht(C96283hy hyVar) {
        this.f269443a = hyVar;
    }

    /* renamed from: a */
    public final void mo77211a(C83907bm bmVar) {
        int i;
        C96283hy hyVar = this.f269443a;
        if (Boolean.TRUE.equals(((C96266hh) bmVar).f269032f)) {
            if (hyVar.f269449a != null) {
                ((C89492cd) hyVar.f269450b.mo27525b()).mo83368J(hyVar.f269449a, C124707e.INPUT_ONLY_MODE);
                C60103kw kwVar = ((C95299e) hyVar.f269451c.mo27525b()).f266647b;
                kwVar.copyOnWrite();
                C60106kz kzVar = (C60106kz) kwVar.instance;
                C60106kz kzVar2 = C60106kz.f162531p;
                kzVar.f162533a |= 128;
                kzVar.f162539g = "BISTO_CONNECTION_MODE_DATA_ONLY";
            }
            i = 7;
        } else {
            i = 3;
        }
        hyVar.mo90046a(i);
    }
}
