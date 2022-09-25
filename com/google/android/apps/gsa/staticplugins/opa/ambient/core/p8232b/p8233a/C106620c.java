package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8233a;

import com.google.assistant.p3860as.C49738aa;
import com.google.assistant.p3860as.C49806t;
import com.google.assistant.p3860as.C49807u;
import com.google.assistant.p3860as.C49809w;
import com.google.assistant.p3860as.C49812z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.a.c */
/* compiled from: PG */
public final class C106620c {

    /* renamed from: a */
    private final C106621d f297261a;

    public C106620c(C106621d dVar) {
        this.f297261a = dVar;
    }

    /* renamed from: a */
    public final boolean mo95602a(C49807u uVar) {
        C49809w wVar;
        C49809w wVar2;
        C49809w wVar3;
        C49809w wVar4;
        C49809w wVar5;
        C49738aa aaVar;
        int i = uVar.f128655a;
        int a = C49806t.m85715a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                wVar = (C49809w) uVar.f128656b;
            } else {
                wVar = C49809w.f128657b;
            }
            if (wVar.f128659a.size() == 0) {
                return false;
            }
            if (uVar.f128655a == 1) {
                wVar2 = (C49809w) uVar.f128656b;
            } else {
                wVar2 = C49809w.f128657b;
            }
            for (C49807u a2 : wVar2.f128659a) {
                if (!mo95602a(a2)) {
                    return false;
                }
            }
            return true;
        } else if (i2 == 1) {
            if (i == 2) {
                wVar3 = (C49809w) uVar.f128656b;
            } else {
                wVar3 = C49809w.f128657b;
            }
            for (C49807u a3 : wVar3.f128659a) {
                if (mo95602a(a3)) {
                    return true;
                }
            }
            return false;
        } else if (i2 == 2) {
            if (i == 3) {
                wVar4 = (C49809w) uVar.f128656b;
            } else {
                wVar4 = C49809w.f128657b;
            }
            if (wVar4.f128659a.size() == 1) {
                if (uVar.f128655a == 3) {
                    wVar5 = (C49809w) uVar.f128656b;
                } else {
                    wVar5 = C49809w.f128657b;
                }
                if (!mo95602a((C49807u) wVar5.f128659a.get(0))) {
                    return true;
                }
            }
            return false;
        } else if (i2 != 3) {
            return false;
        } else {
            C106621d dVar = this.f297261a;
            if (i == 4) {
                aaVar = (C49738aa) uVar.f128656b;
            } else {
                aaVar = C49738aa.f128428b;
            }
            C49812z a4 = C49812z.m85716a(aaVar.f128430a);
            if (a4 == null) {
                a4 = C49812z.UNKNOWN;
            }
            return dVar.f297262a.contains(a4);
        }
    }
}
