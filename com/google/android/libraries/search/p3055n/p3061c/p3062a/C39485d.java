package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3065c.C39455e;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.search.n.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C39485d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39633o f103999a;

    public /* synthetic */ C39485d(C39633o oVar) {
        this.f103999a = oVar;
    }

    public final Object apply(Object obj) {
        C39633o oVar = this.f103999a;
        C39455e eVar = (C39455e) obj;
        if (eVar == C39455e.SUCCESS) {
            return oVar.mo41961a();
        }
        if (eVar == C39455e.RETRY_REQUIRED) {
            C39394aj c = C39395ak.m68799c();
            C39638t tVar = new C39638t();
            tVar.mo41807b(C39392ah.DSP_MODEL_NOT_READY_RETRY_REQUIRED);
            tVar.f104350a = "DSP hotword model is not enrolled. Retry!";
            ((C39640v) c).f104354a = C58833ax.m90834k(tVar.mo41806a());
            return c.mo41810a();
        }
        C39394aj c2 = C39395ak.m68799c();
        C39638t tVar2 = new C39638t();
        tVar2.mo41807b(C39392ah.DSP_MODEL_NOT_SUPPORTED);
        tVar2.f104350a = "DSP is not supported or model cannot be enroll!";
        ((C39640v) c2).f104354a = C58833ax.m90834k(tVar2.mo41806a());
        return c2.mo41810a();
    }
}
