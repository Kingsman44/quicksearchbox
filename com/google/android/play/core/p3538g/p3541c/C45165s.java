package com.google.android.play.core.p3538g.p3541c;

import com.google.android.play.core.p3538g.p3539a.C45114a;

/* renamed from: com.google.android.play.core.g.c.s */
/* compiled from: PG */
public final /* synthetic */ class C45165s implements C45167u {

    /* renamed from: a */
    public final /* synthetic */ C45168v f117905a;

    public /* synthetic */ C45165s(C45168v vVar) {
        this.f117905a = vVar;
    }

    /* renamed from: a */
    public final void mo49008a() {
        C45168v vVar = this.f117905a;
        for (int i = 0; i < vVar.f117908a.getAttributeCount(); i++) {
            if ("defaultErrorCode".equals(vVar.f117908a.getAttributeName(i))) {
                ((C45147a) vVar.f117909b).f117847a = Integer.valueOf(C45114a.m80305a(vVar.f117908a.getAttributeValue(i)));
            }
        }
        vVar.mo49009b("split-install-error", new C45164r(vVar));
    }
}
