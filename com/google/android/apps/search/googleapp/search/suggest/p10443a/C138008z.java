package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138032ax;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import java.util.Comparator;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.z */
/* compiled from: PG */
public final /* synthetic */ class C138008z implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C138008z f375455a = new C138008z();

    private /* synthetic */ C138008z() {
    }

    public final int compare(Object obj, Object obj2) {
        C138030av avVar = (C138030av) obj;
        C138030av avVar2 = (C138030av) obj2;
        Comparator comparator = C137915aa.f375238a;
        C138034az a = C138034az.m224336a(avVar.f375545i);
        if (a == null) {
            a = C138034az.NONE;
        }
        if (a == C138034az.COMPLETE_SERVER) {
            C138034az a2 = C138034az.m224336a(avVar2.f375545i);
            if (a2 == null) {
                a2 = C138034az.NONE;
            }
            return a2 != C138034az.COMPLETE_SERVER ? -1 : 0;
        }
        C138034az a3 = C138034az.m224336a(avVar2.f375545i);
        if (a3 == null) {
            a3 = C138034az.NONE;
        }
        if (a3 == C138034az.COMPLETE_SERVER) {
            return 1;
        }
        C138032ax a4 = C138032ax.m224334a(avVar.f375547k);
        if (a4 == null) {
            a4 = C138032ax.INVALID;
        }
        C138032ax a5 = C138032ax.m224334a(avVar2.f375547k);
        if (a5 == null) {
            a5 = C138032ax.INVALID;
        }
        int compareTo = a4.compareTo(a5);
        return compareTo == 0 ? avVar2.f375546j - avVar.f375546j : compareTo;
    }
}
