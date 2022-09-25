package com.google.android.libraries.lens.view.main;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.filters.translation.C26129l;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.libraries.lens.view.main.cn */
/* compiled from: PG */
public final /* synthetic */ class C27351cn implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C27384dt f74843a;

    public /* synthetic */ C27351cn(C27384dt dtVar) {
        this.f74843a = dtVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C27384dt dtVar = this.f74843a;
        C26129l lVar = (C26129l) obj;
        if (!C58837ba.m90859h(lVar.mo31286b())) {
            String b = lVar.mo31286b();
            b.getClass();
            C27394eb ebVar = C27394eb.UNINITIALIZED;
            C25543z zVar = C25543z.POSTCAPTURE;
            int d = lVar.mo31288d();
            int i = d - 1;
            if (d == 0) {
                throw null;
            } else if (i == 0) {
                dtVar.mo32947ai(b, 1, 1);
            } else if (i == 1) {
                dtVar.mo32947ai(b, 2, 2);
            } else if (i == 2) {
                dtVar.mo32947ai(b, 1, 3);
            } else if (i == 3) {
                dtVar.mo32947ai(b, 1, 2);
            }
        }
    }
}
