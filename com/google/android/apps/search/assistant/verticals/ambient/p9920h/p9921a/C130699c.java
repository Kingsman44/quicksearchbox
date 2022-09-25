package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9921a;

import com.google.assistant.p3860as.C49738aa;
import com.google.assistant.p3860as.C49806t;
import com.google.assistant.p3860as.C49807u;
import com.google.assistant.p3860as.C49809w;
import com.google.assistant.p3860as.C49812z;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.a.c */
/* compiled from: PG */
public final class C130699c {

    /* renamed from: a */
    private final C130700d f357870a;

    public C130699c(C130700d dVar) {
        this.f357870a = dVar;
    }

    /* renamed from: a */
    public final boolean mo109790a(C49807u uVar) {
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
                if (!mo109790a(a2)) {
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
                if (mo109790a(a3)) {
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
                if (!mo109790a((C49807u) wVar5.f128659a.get(0))) {
                    return true;
                }
            }
            return false;
        } else if (i2 != 3) {
            return false;
        } else {
            C130700d dVar = this.f357870a;
            if (i == 4) {
                aaVar = (C49738aa) uVar.f128656b;
            } else {
                aaVar = C49738aa.f128428b;
            }
            C49812z a4 = C49812z.m85716a(aaVar.f128430a);
            if (a4 == null) {
                a4 = C49812z.UNKNOWN;
            }
            return dVar.f357871a.contains(a4);
        }
    }
}
