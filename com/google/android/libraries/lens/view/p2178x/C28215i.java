package com.google.android.libraries.lens.view.p2178x;

import com.google.android.libraries.lens.view.gleam.C26460as;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.x.i */
/* compiled from: PG */
public final /* synthetic */ class C28215i implements C28208b {

    /* renamed from: a */
    public final /* synthetic */ C28221o f76826a;

    public /* synthetic */ C28215i(C28221o oVar) {
        this.f76826a = oVar;
    }

    /* renamed from: a */
    public final void mo33722a(int i, List list, List list2, C58480gp gpVar, C58480gp gpVar2) {
        float f = this.f76826a.f76832a;
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C26460as asVar = (C26460as) G.next();
            if (asVar.mo31706a() > 256) {
                asVar.f72058d = Math.max(0.0f, asVar.f72058d - ((0.002688172f * f) * ((float) i)));
            }
        }
    }
}
