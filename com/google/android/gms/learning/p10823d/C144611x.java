package com.google.android.gms.learning.p10823d;

import com.google.android.libraries.micore.learning.p2258a.C29697g;
import com.google.android.libraries.micore.learning.p2258a.C29706p;
import com.google.android.libraries.micore.learning.p2258a.C29707q;
import com.google.android.libraries.micore.learning.p2258a.C29708r;
import com.google.common.base.C58835az;

/* renamed from: com.google.android.gms.learning.d.x */
/* compiled from: PG */
public final /* synthetic */ class C144611x implements C144587ac {

    /* renamed from: a */
    public final /* synthetic */ C144588ad f391307a;

    /* renamed from: b */
    public final /* synthetic */ String f391308b;

    public /* synthetic */ C144611x(C144588ad adVar, String str) {
        this.f391307a = adVar;
        this.f391308b = str;
    }

    /* renamed from: a */
    public final C58835az mo120064a(C29708r rVar) {
        C144588ad adVar = this.f391307a;
        String str = this.f391308b;
        C29707q qVar = (C29707q) rVar.toBuilder();
        C29706p f = C144588ad.m235083f(qVar, str);
        boolean z = true;
        if (f == null) {
            return new C58835az(rVar, true);
        }
        C29708r rVar2 = (C29708r) qVar.build();
        adVar.f391253i.mo120062a(f);
        if (f.f80450a == 13) {
            z = adVar.mo120075r((C29697g) f.f80451b);
        }
        return new C58835az(rVar2, Boolean.valueOf(z));
    }
}
