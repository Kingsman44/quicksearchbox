package com.google.android.libraries.lens.view.filters;

import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.lens.view.filters.ab */
/* compiled from: PG */
public final /* synthetic */ class C25895ab implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C25898ae f70363a;

    public /* synthetic */ C25895ab(C25898ae aeVar) {
        this.f70363a = aeVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C25849a aVar;
        C25898ae aeVar = this.f70363a;
        C25980d a = C28130s.m52410a(aeVar.f70366b.mo32717v());
        if (a != C25980d.AUTO_FILTER) {
            return new C25849a(a, 3);
        }
        if (!aeVar.f70367c || !aeVar.f70365a.mo30353i().mo56113h()) {
            aVar = new C25849a(C25980d.AUTO_FILTER, 2);
        } else {
            aVar = new C25849a((C25980d) aeVar.f70365a.mo30353i().mo56107c(), 4);
        }
        return aVar;
    }
}
