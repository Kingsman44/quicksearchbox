package com.google.android.apps.gsa.shared.bisto.p7029b;

import android.accounts.Account;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.b.n */
/* compiled from: PG */
public final class C89643n {

    /* renamed from: a */
    public static final C59071e f242726a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.b.n");

    /* renamed from: a */
    public static boolean m145916a(C124548d dVar) {
        return dVar != null && dVar.mo106497ak();
    }

    /* renamed from: b */
    public static boolean m145917b(C124548d dVar) {
        return dVar.mo106495ai();
    }

    /* renamed from: c */
    public static boolean m145918c(C124548d dVar, Account account) {
        if (dVar == null) {
            return false;
        }
        if (account != null && dVar.mo106513k() == C124719q.GACS_DEVICE) {
            C124620am o = dVar.mo106517o(account);
            if ((o.f343763a & 8) != 0) {
                return o.f343767e;
            }
        }
        return dVar.mo106495ai();
    }

    /* renamed from: d */
    public static boolean m145919d(C124548d dVar) {
        return dVar != null && dVar.mo106513k().equals(C124719q.CAR_ACCESSORY);
    }

    /* renamed from: e */
    public static boolean m145920e(C124548d dVar) {
        return dVar != null && dVar.mo106497ak() && !dVar.mo106513k().equals(C124719q.CAR_ACCESSORY);
    }

    /* renamed from: f */
    public static boolean m145921f(int i) {
        return i == 0 || i == 3 || i == 4 || i == 5;
    }
}
