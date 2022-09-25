package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import com.google.android.libraries.gsa.monet.service.FeatureSubtreeSnapshot;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.t */
/* compiled from: PG */
public final /* synthetic */ class C102281t implements C102285x {

    /* renamed from: a */
    public final /* synthetic */ C102286y f285395a;

    public /* synthetic */ C102281t(C102286y yVar) {
        this.f285395a = yVar;
    }

    /* renamed from: a */
    public final void mo93058a() {
        C102286y yVar = this.f285395a;
        if (!yVar.mo93060f().mo28631l()) {
            yVar.f285400d.mo80935a();
            return;
        }
        yVar.mo93060f().mo28627h();
        C23251a aVar = ((C102265d) yVar.f285397a).f285345g;
        aVar.mo28730f(Boolean.valueOf(!((Boolean) aVar.f63720e).booleanValue()), false);
        C58485gu guVar = (C58485gu) ((C102265d) yVar.f285397a).f285346h.f63720e;
        if (!guVar.isEmpty()) {
            ((C102265d) yVar.f285397a).f285346h.mo28730f(guVar.subList(0, guVar.size() - 1), false);
            yVar.mo93059e().mo28628i((FeatureSubtreeSnapshot) guVar.get(guVar.size() - 1));
        }
        if (!((C102265d) yVar.f285397a).f285344f.mo28631l() && !((C102265d) yVar.f285397a).f285347i.mo28631l()) {
            yVar.f285400d.mo80935a();
        }
    }
}
