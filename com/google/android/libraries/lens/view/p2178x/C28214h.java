package com.google.android.libraries.lens.view.p2178x;

import com.google.android.libraries.lens.view.gleam.C26460as;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.x.h */
/* compiled from: PG */
public final /* synthetic */ class C28214h implements C28208b {

    /* renamed from: a */
    public final /* synthetic */ C28221o f76825a;

    public /* synthetic */ C28214h(C28221o oVar) {
        this.f76825a = oVar;
    }

    /* renamed from: a */
    public final void mo33722a(int i, List list, List list2, C58480gp gpVar, C58480gp gpVar2) {
        float f = this.f76825a.f76832a;
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C26460as asVar = (C26460as) G.next();
            if (asVar.mo31706a() <= 256) {
                asVar.f72058d = Math.min(asVar.f72058d + (0.015625f * f * ((float) i)), f);
            }
        }
    }
}
