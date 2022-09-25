package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.dl */
/* compiled from: PG */
public final class C95415dl {

    /* renamed from: a */
    public static final C59071e f266972a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.dl");

    /* renamed from: b */
    public final C21370a f266973b;

    /* renamed from: c */
    public final ArrayList f266974c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f266975d = new ArrayList();

    /* renamed from: e */
    C95413dj f266976e = C95413dj.EMPTY;

    public C95415dl(C21370a aVar) {
        this.f266973b = aVar;
    }

    /* renamed from: a */
    public final C95413dj mo89352a() {
        C95413dj djVar;
        C95413dj djVar2 = this.f266976e;
        if (djVar2 == C95413dj.SINGLE_TAP || (djVar = this.f266976e) == C95413dj.DOUBLE_TAP || djVar == C95413dj.TRIPLE_TAP || djVar == C95413dj.LONG_PRESS || djVar == C95413dj.LONGER_PRESS) {
            mo89354c();
        }
        return djVar2;
    }

    /* renamed from: b */
    public final void mo89353b() {
        long j;
        long j2;
        C95414dk[] dkVarArr = new C95414dk[3];
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= 3) {
                break;
            }
            int size = this.f266974c.size();
            if (i >= this.f266975d.size()) {
                z = false;
            }
            if (i >= size) {
                dkVarArr[i] = C95414dk.EMPTY;
            } else {
                if (z) {
                    j2 = ((Long) this.f266975d.get(i)).longValue();
                    j = ((Long) this.f266974c.get(i)).longValue();
                } else {
                    j2 = this.f266973b.mo26870b();
                    j = ((Long) this.f266974c.get(i)).longValue();
                }
                long j3 = j2 - j;
                if (j3 > 1750) {
                    dkVarArr[i] = z ? C95414dk.LONGER : C95414dk.INCOMPLETE_LONGER;
                } else if (j3 > 350) {
                    dkVarArr[i] = z ? C95414dk.LONG : C95414dk.INCOMPLETE_LONG;
                } else {
                    dkVarArr[i] = z ? C95414dk.SHORT : C95414dk.INCOMPLETE_SHORT;
                }
            }
            i++;
        }
        long b = this.f266975d.isEmpty() ? 0 : this.f266973b.mo26870b() - ((Long) C58557jl.m90131l(this.f266975d)).longValue();
        int size2 = this.f266974c.size();
        boolean z2 = dkVarArr[0] == C95414dk.SHORT || dkVarArr[0] == C95414dk.INCOMPLETE_SHORT;
        if (size2 == 1) {
            if (z2) {
                this.f266976e = b > 550 ? C95413dj.SINGLE_TAP : C95413dj.INCOMPLETE_SINGLE_TAP;
                return;
            }
            size2 = 1;
        }
        C95414dk dkVar = dkVarArr[1];
        boolean z3 = dkVar == C95414dk.SHORT || dkVar == C95414dk.INCOMPLETE_SHORT;
        if (size2 == 2) {
            if (!z2 || !z3) {
                size2 = 2;
            } else {
                this.f266976e = b > 550 ? C95413dj.DOUBLE_TAP : C95413dj.INCOMPLETE_DOUBLE_TAP;
                return;
            }
        }
        C95414dk dkVar2 = C95414dk.INCOMPLETE_LONG;
        boolean z4 = dkVar == dkVar2 || dkVar == C95414dk.INCOMPLETE_LONGER || dkVar == C95414dk.LONG || dkVar == C95414dk.LONGER;
        if (size2 == 2 && z2 && z4) {
            this.f266976e = C95413dj.DOUBLE_TAP_HOLD;
        } else if (!z2 || !z3 || size2 != 3) {
            C95414dk dkVar3 = dkVarArr[0];
            if (dkVar3 == dkVar2) {
                this.f266976e = C95413dj.INCOMPLETE_LONG_PRESS;
            } else if (dkVar3 == C95414dk.LONG) {
                this.f266976e = C95413dj.LONG_PRESS;
            } else if (dkVar3 == C95414dk.INCOMPLETE_LONGER) {
                this.f266976e = C95413dj.INCOMPLETE_LONGER_PRESS;
            } else if (dkVar3 == C95414dk.LONGER) {
                this.f266976e = C95413dj.LONGER_PRESS;
            } else {
                C59104x b2 = f266972a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "SingleKeyGestureRec");
                ((C59052c) ((C59052c) b2).mo56372aa(15024)).mo56359L("Reset with %s : %s : %s", dkVarArr[0], dkVarArr[1], dkVarArr[2]);
                mo89354c();
            }
        } else {
            this.f266976e = C95413dj.TRIPLE_TAP;
        }
    }

    /* renamed from: c */
    public final void mo89354c() {
        this.f266974c.clear();
        this.f266975d.clear();
        this.f266976e = C95413dj.EMPTY;
    }
}
