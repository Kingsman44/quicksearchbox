package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138032ax;
import java.util.Comparator;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.v */
/* compiled from: PG */
public final /* synthetic */ class C138004v implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C138004v f375451a = new C138004v();

    private /* synthetic */ C138004v() {
    }

    public final int compare(Object obj, Object obj2) {
        C138032ax axVar = (C138032ax) obj;
        C138032ax axVar2 = (C138032ax) obj2;
        Comparator comparator = C137915aa.f375238a;
        int compareTo = axVar.compareTo(axVar2);
        if (compareTo == 0) {
            return 0;
        }
        if (!axVar.equals(C138032ax.APP_STRIP)) {
            if (!axVar2.equals(C138032ax.APP_STRIP)) {
                if (!axVar.equals(C138032ax.IN_CONTEXT_CONTROL_GROUP)) {
                    if (!axVar2.equals(C138032ax.IN_CONTEXT_CONTROL_GROUP)) {
                        if (axVar.equals(C138032ax.PROACTIVE_ZPS_GROUP)) {
                            if (axVar2.compareTo(C138032ax.TRENDING) >= 0) {
                                return -1;
                            }
                            return 1;
                        } else if (!axVar2.equals(C138032ax.PROACTIVE_ZPS_GROUP)) {
                            return compareTo;
                        } else {
                            if (axVar.compareTo(C138032ax.TRENDING) >= 0) {
                                return 1;
                            }
                            return -1;
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
