package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23227x;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ay */
/* compiled from: PG */
final class C102325ay implements C23227x {

    /* renamed from: a */
    final /* synthetic */ C102328ba f285574a;

    public C102325ay(C102328ba baVar) {
        this.f285574a = baVar;
    }

    /* renamed from: a */
    public final void mo28670a(int i, C22939d dVar) {
        if (dVar instanceof C102378t) {
            C102378t tVar = (C102378t) dVar;
            C102328ba baVar = this.f285574a;
            C102358cd cdVar = baVar.f285584h;
            C102374p pVar = tVar.f285706h;
            pVar.f285688j = cdVar;
            pVar.f285687i = baVar.f285582f;
            baVar.f285589m.put(Integer.valueOf(tVar.f285707i), tVar);
            this.f285574a.mo93131e();
        }
    }

    /* renamed from: b */
    public final void mo28671b(int i, int i2, C22939d dVar) {
    }

    /* renamed from: c */
    public final void mo28672c(int i, C22939d dVar) {
        if (dVar instanceof C102378t) {
            this.f285574a.f285589m.remove(Integer.valueOf(((C102378t) dVar).f285707i));
        }
    }
}
