package com.google.android.apps.gsa.searchbox.p6944c;

import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;

/* renamed from: com.google.android.apps.gsa.searchbox.c.v */
/* compiled from: PG */
public final /* synthetic */ class C88618v implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C88621y f239566a;

    /* renamed from: b */
    public final /* synthetic */ Suggestion f239567b;

    public /* synthetic */ C88618v(C88621y yVar, Suggestion suggestion) {
        this.f239566a = yVar;
        this.f239567b = suggestion;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C88621y yVar = this.f239566a;
        Suggestion suggestion = this.f239567b;
        boolean z = false;
        if (!yVar.f239571b) {
            return false;
        }
        C58801sm G = ((C58485gu) yVar.f239576g).listIterator(0);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean z4 = true;
            if (!G.hasNext()) {
                break;
            }
            int k = ((C88582c) G.next()).mo82234k(suggestion);
            z2 |= k == 2;
            if (k != 1) {
                z4 = false;
            }
            z3 |= z4;
        }
        if (z2 && !z3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
