package com.google.android.apps.gsa.staticplugins.opa.p8295aq;

import android.view.ViewGroup;
import androidx.lifecycle.C2333ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aq.d */
/* compiled from: PG */
public final /* synthetic */ class C107380d implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C107383g f298857a;

    public /* synthetic */ C107380d(C107383g gVar) {
        this.f298857a = gVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C107383g gVar = this.f298857a;
        Integer num = (Integer) obj;
        C107382f fVar = (C107382f) gVar.f298871h.mo3842a();
        if (fVar != C107382f.DISMISSED && fVar != C107382f.DISMISSING && num != null) {
            ((ViewGroup.MarginLayoutParams) gVar.f298866c.getLayoutParams()).bottomMargin = num.intValue();
            gVar.f298866c.requestLayout();
        }
    }
}
