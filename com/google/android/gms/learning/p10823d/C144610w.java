package com.google.android.gms.learning.p10823d;

import com.google.android.libraries.micore.learning.p2258a.C29697g;
import com.google.android.libraries.micore.learning.p2258a.C29706p;
import com.google.android.libraries.micore.learning.p2258a.C29707q;
import com.google.android.libraries.micore.learning.p2258a.C29708r;
import com.google.common.base.C58835az;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.learning.d.w */
/* compiled from: PG */
public final /* synthetic */ class C144610w implements C144587ac {

    /* renamed from: a */
    public final /* synthetic */ C144588ad f391305a;

    /* renamed from: b */
    public final /* synthetic */ int f391306b;

    public /* synthetic */ C144610w(C144588ad adVar, int i) {
        this.f391305a = adVar;
        this.f391306b = i;
    }

    /* renamed from: a */
    public final C58835az mo120064a(C29708r rVar) {
        C144588ad adVar = this.f391305a;
        int i = this.f391306b;
        C29707q qVar = (C29707q) rVar.toBuilder();
        List<C29706p> arrayList = new ArrayList<>();
        boolean z = true;
        if (i == 0) {
            arrayList = C144588ad.m235085n(qVar, C144593f.f391261a);
        } else if (i == 1) {
            arrayList = C144588ad.m235085n(qVar, C144594g.f391262a);
        } else if (i == 2) {
            arrayList = C144588ad.m235085n(qVar, C144595h.f391263a);
        } else if (i == 3) {
            arrayList = C144588ad.m235085n(qVar, C144596i.f391264a);
        }
        for (C29706p a : arrayList) {
            adVar.f391253i.mo120062a(a);
        }
        for (C29706p pVar : arrayList) {
            if (pVar.f80450a == 13) {
                z &= adVar.mo120074q((C29697g) pVar.f80451b);
            }
        }
        if (!z) {
            adVar.f391251g.mo120056h(1134);
        }
        return new C58835az((C29708r) qVar.build(), Boolean.valueOf(z));
    }
}
