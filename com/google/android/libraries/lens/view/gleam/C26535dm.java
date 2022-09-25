package com.google.android.libraries.lens.view.gleam;

import androidx.lifecycle.C2333ah;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.gleam.dm */
/* compiled from: PG */
public final /* synthetic */ class C26535dm implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26540dr f72325a;

    public /* synthetic */ C26535dm(C26540dr drVar) {
        this.f72325a = drVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26540dr drVar = this.f72325a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C26559ej ejVar = drVar.f72355v;
        boolean z = drVar.f72348o.mo30907k() && booleanValue;
        if (ejVar.f72383B && !z) {
            C58485gu j = C58485gu.m89842j(ejVar.f72385D);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                ((C26460as) j.get(i)).f72060f = true;
            }
        }
        ejVar.f72383B = z;
    }
}
